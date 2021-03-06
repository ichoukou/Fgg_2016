package com.yunfangdata.fgg.viewmodel;

/**
 * 委托估价
 * Created by zjt on 2015-12-18.
 */
public class EntrustEvaluateViewModel {

    /**
     * 估价目的数据源
     */
    public static final String objective[] = {"请选择","抵押评估","按揭评估","移民评估"};
    /**
     * 估价目的提示
     */
    public static final String objectiveTipes[] = {"请选择",
            "一、基本资料（*必须提供的基本资料）①房屋所有权证复印件（如是共有房产，则需提供所有共用房本复印件）* ②国有土地使用证复印件（有土地证，则必需提供）* ③房屋所有权人（借款人）身份材料复印件【身份证/军官证】* ④其他：租赁合同、买卖合同、回迁协议 二、注意事项 身份资料，还有公司产权、外籍人士的情况。公司产权，需要企业法人身份证和营业执照复印；外籍人士，需要护照和中文译本公证书。",
            "一、基本资料（*必须提供的基本资料）①房屋所有权证复印件（如是共有房产，则需提供所有共用房本复印件）* ②国有土地使用证复印件（有土地证，则必需提供）* ③房屋所有权人（卖方）身份材料复印件【身份证/军官证】* ④委托方（买方）身份材料复印件【身份证/军官证】* ⑤其他：租赁合同、买卖合同、回迁协议 二、注意事项 身份资料，还有公司产权、外籍人士的情况。公司产权，需要提供企业法人身份证和营业执照复印；外籍人士，需要提供本人护照和中文译本公证书。",
            "一、基本资料（*必须提供的基本资料）①房屋所有权证复印件* ②国有土地使用证复印件（有土地证，则必需提供）* ③房屋所有权人（借款人）身份材料复印件【身份证】*"};

    /**
     * 贷款银行数据源
     */
    public static final String banks[] = {"中国银行","中国工商银行","中国农业银行","中国建设银行","交通银行","招商银行","北京银行","北京农商银行","中国民生银行","中信银行","兴业银行","平安银行","浦发银行","中国光大银行","华夏银行","大连银行","花旗银行","上海银行","南京银行","渤海银行","江苏银行","厦门国际银行","富邦华一银行"};

    /**
     * 贷款成数
     */
    public static final String percents[] = {"1成","2成","3成","4成","5成","6成","7成","8成","9成","10成",};

    /**
     * 资料提供
     */
    public static final String informations[] = {"线上","线下"};
    /**
     * 资料提供
     */
    public static final String timeframes[] = {"上午8:00-12:00","下午13:00-17:00"};

    /**
     * 资料提供 提示
     */
    public static final String informationsTips[] = {"线上","请将准备资料拍照或扫描后打包发送至邮箱pingguziliao@crea.com.cn"};

}
