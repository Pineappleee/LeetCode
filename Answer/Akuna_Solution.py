#! /usr/bin/python

from trading_system import TradingSystem
import sys
import numpy as np


""" The stock objest is passed with an attribute symbol and one method get_edge"""


class Stock:

    def __init__(self, symbol):
        self.stock_symbol = symbol

    def get_edge(self, current_price):
        """ Calulated the differences between the current price and the close price for each of the last ten days """
        ten_day_prices = []
        temp = []

        for i in range(10):   # calling the data from past ten days
            # limit the calling times to ten, even if the return results are
            # bad
            for j in range(10):
                bad_times = 0
                while(bad_times <= 5):
                    dict_return = trd_sys.get_stock_data_backup(
                        self.stock_symbol, int(datetime_list_cleaned[i].strftime("%Y%m%d")))
                    # check if the result is the desired one
                    if (TradingSystem.is_valid_symbol(dict_return['exchange'], self.stock_symbol)):
                        # valid the data if it is bad
                        if (dict_return['low'] > dict_return['high']):
                            bad_times += 1
                            if (bad_times == 5):
                                # trigger the condition to break the loop
                                bad_times += 1
                                # bad data happens for five times, use the last
                                # call data
                                ten_day_prices.append(
                                    current_price - dict_return['close'])
                        else:
                            ten_day_prices.append(
                                current_price - dict_return['close'])
                    else:
                        # store data if the return is desired
                        temp.append(current_price - dict_return['close'])

        arr = np.array(temp)
        mean = np.mean(arr)
        std = np.std(arr)
        return (mean, std)


""" Goal #1 """
exchange = sys.argv[1]  # exchange string is passed as the second command line argument

trd_sys = TradingSystem()

datetime_list = trd_sys.get_days(exchange)
datetime_list_cleaned = []
for dt in datetime_list:
    if dt.weekday() in range(5):  # remove weekends
        datetime_list_cleaned.append(dt)

datetime_list_cleaned.sort(reverse=True)
day = datetime_list_cleaned[0]  # select the most recent available day

stock_tuple = trd_sys.get_stocks(day)
stock_tuple_cleaned = []

for t in stock_tuple:
    # only keep the stocks are available on the given exchange
    if (t[1] is exchange):
        stock_tuple_cleaned.append(t[0])

stocks = list(set(stock_tuple_cleaned))  # eliminate the duplicates
# all of the stocks on the given exchange that exist on the most recent
# available day are passed
trd_sys.set_stock(stocks)

""" Goal #3 """
construct_objs = []
for s in stocks:
    construct_objs.append(Stock(s)) # construct objects for each stock

""" Goal #2 """
all_edges = []
for obj in construct_objs:
    try:
        current_price = trd_sys.get_stock_data_backup(obj, int((datetime.today()).strftime("%Y%m%d")))
    except RuntimeError e:
        raise e
    
    # current price might be not defined, but there is no other way to get 
    # the current price than when get_edge is called
    all_edges.append(obj.get_edge(current_price)) 


""" Goal #4 """
trd_sys.set_total_edge(
    all_edges)  # all_edges is a list of all the edges are calculated above



