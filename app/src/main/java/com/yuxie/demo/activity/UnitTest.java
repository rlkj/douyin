package com.yuxie.demo.activity;

import android.content.Context;

import com.baselib.basebean.BaseRespose;
import com.baselib.baserx.RxSchedulers;
import com.baselib.baserx.RxSubscriber;
import com.yuxie.demo.api.ServerApiService;
import com.yuxie.demo.api.server.HostType;
import com.yuxie.demo.api.server.ServerApi;
import com.yuxie.wechat_pay_lib.utils.WechatPayUtils;
import com.yuxie.wechat_pay_lib.utils.WxBean;

/**
 * @author llk
 * @time 2018/6/13 13:46
 * @class describe
 */
public class UnitTest {

    public static void test() {

        //        long maxMemory=Runtime.getRuntime().maxMemory();
//        LruCache<String,Bitmap> mLruCache=new LruCache<String,Bitmap>((int)maxMemory){
//            @Override
//            protected int sizeOf(String key, Bitmap value) {
//                int size=value.getByteCount()*value.getHeight();
//                return super.sizeOf(key, value);
//            }
//        };

//        NdkJniUtils NdkJniUtils = new NdkJniUtils();
//        NdkJniUtils.getCLanguageString();

//        Utils.getInstance().getSignature();
//
//        String packageName="com.b3ad.marketing";
//
//        String md5=Utils.signatureMD5(Utils.getSignature(packageName));
//        Log.i("TAG","md5:"+md5);
//
//        String sha1=Utils.signatureSHA1(Utils.getSignature(packageName));
//        Log.i("TAG","sha1:"+sha1);
//
//        String sha256=Utils.signatureSHA256(Utils.getSignature(packageName));
//        Log.i("TAG","sha256:"+sha256);

//        List<String> list=new ArrayList<String>();
//        list.add("123");
//        list.add("789");
//        list.add("456");
//        list.add("000");
//        Log.i("TAG","---list:"+list.toString());
//
////        Collections.sort(list);
//
//        Log.i("TAG","---list---:"+list.toString());
//
//        Collections.reverse(list);
//
//        Log.i("TAG","reverse---list---:"+list.toString());

//        BaseDao baseDao= BaseDaoFactory.getInstall().getDataHelper(UserDao.class, User.class);
//        User user=new User("admin","123456");
//        baseDao.insert(user);

//        BaseDao baseDao= BaseDaoFactory.getInstall().getDataHelper(FileDao.class, FileBean.class);
//
//        FileBean fileBean=new FileBean();
//        fileBean.setTime("2017-09-11");
//        fileBean.setPath("cd:");
//        fileBean.setDecripte("今天天气真好!");
//
//        baseDao.insert(fileBean);

//        String url = "http://v.juhe.cn/toutiao/index?type=top&key=29da5e8be9ba88b932394b7261092f71";
//
//        for (int i = 0; i < 10; i++) {
//            News news = new News();
//            Volley.sendRequest(null, url, News.class, new IDataListener<News>() {
//                @Override
//                public void onSuccess(News news) {
//                    Log.i("TAG", news.toString());
//                }
//
//                @Override
//                public void onFail() {
//
//                }
//            });
//        }

//        UserDao userDao = EntityManager.getInstance().getUserDao();
//        userDao.insertOrReplace(new User(1l, "小明", "123", "北京"));
//
//        List<User> list = userDao.loadAll();
//
//        Log.d("TAG", "list:" + list.toString());
//        Log.d("TAG", "list:" + list.toString());

//        update();

//        Intent intent = new Intent(MainActivity.this, UpdateActivity.class);
//        startActivity(intent);
//        Intent intent = new Intent(MainActivity.this, DfuActivity.class);
//        startActivity(intent);

//        PerfectPopWindow popWindow = new PerfectPopWindow(MainActivity.this, MainActivity.class);
//        popWindow.showPopupWindow();

//        testWxPay();
    }

//    private static class InnerHandler extends Handler{
//        WeakReference<MainActivity> weakReference=null;
//        //非静态内部类隐式,持有外部类的引用
//        //使用弱引用持有activity对象的引用,避免handler引起的内存泄露
//        public InnerHandler( MainActivity activity) {
//            weakReference=new WeakReference<MainActivity>(activity);
//        }
//        @Override
//        public void handleMessage(Message msg) {
//            MainActivity activity=weakReference.get();
//            if (activity!=null){
//                if (msg.what==0){
//                    activity.mContext.getApplicationContext();
//                }
//            }
//        }
//    }

    private void testWxPay() {

//        WxBean bean = new WxBean();
//        bean.setPackageX("Sign=WXPay");
////        bean.setAppid("wx9d55a4dc0d12ccc5");
//        bean.setAppid("wxb75b4f3e17073cc8");
//        bean.setSign("AB8FF82DB8C55C57E339962B837916F8");
//        bean.setPartnerid("1501867921");
//        bean.setPrepayid("wx071618078933228e16960f883772874534");
//        bean.setNoncestr("EoNO7N1m907lLz2N");
//        bean.setTimestamp("1525681089");
//
//        WechatPayUtils.wxPay(context, bean);

    }

    public static void add(int a, int b) {

        System.out.print("a+b=" + a + b);

    }

    public static void test(Context context) {

        testUrl(context);

    }

    public static void testUrl(Context context) {


        String accountId = "1248119110873466880";
        String token = "158949eb3716484bb1bee84149c02f1a";
        String Authorization = "MTI0ODExOTExMDg3MzQ2Njg4MCFAIyQlVWlLbF4mKigpXyo5OUNCYGAwMD8/Ljw+";
        String app = "1.0.0";

        ServerApi.getInstance(HostType.HOST_TYPE_WEIXIN_FLAG).getApiService()
                .vehicleList(accountId, token, Authorization, app)
                .compose(RxSchedulers.io_main())
                .subscribe(new RxSubscriber<BaseRespose>(context) {
                    @Override
                    protected void _onNext(BaseRespose baseRespose) {

                    }

                    @Override
                    protected void _onError(String message) {

                    }
                });

    }

}
