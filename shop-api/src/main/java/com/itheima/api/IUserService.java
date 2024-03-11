package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeUser;
import com.itheima.shop.pojo.TradeUserMoneyLog;

public interface IUserService {
    TradeUser findOne(Long userId);

    /**
     * 扣减余额
     * @param userMoneyLog
     * @return
     */
    Result updateMoneyPaid(TradeUserMoneyLog userMoneyLog);
}
