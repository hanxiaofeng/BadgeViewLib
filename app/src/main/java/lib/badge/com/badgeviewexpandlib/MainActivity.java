package lib.badge.com.badgeviewexpandlib;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import lib.badge.com.badgeviewlib.BadgeView;

// import com.jauker.widget.BadgeView;

public class MainActivity extends Activity
{
    private ImageView ivMainHome, ivMainMsg, ivMainMy;

    private BadgeView mainHomeBadge;

    private BadgeView mainMsgBadge;

    private BadgeView mainMyBadge;

    private Button btnOne, btnTwo, btnThree, btnFour, btnFive;

    private BadgeView tvTextOneBadge;
    private BadgeView tvTextTwoBadge;
    private BadgeView tvTextThreeBadge;
    private BadgeView btnFourBadge;
    private BadgeView btnFiveBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        ivMainHome = (ImageView) findViewById(R.id.iv_main_home);
        ivMainMsg = (ImageView) findViewById(R.id.iv_main_msg);
        ivMainMy = (ImageView) findViewById(R.id.iv_main_my);

        btnOne = (Button) findViewById(R.id.tv_one);
        btnTwo = (Button) findViewById(R.id.tv_two);
        btnThree = (Button) findViewById(R.id.btn_three);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnFive = (Button) findViewById(R.id.btn_five);


        tvTextOneBadge = new BadgeView(MainActivity.this);
        tvTextOneBadge.setmShowPoint(true);
        tvTextOneBadge.setTextSize(16f);
        tvTextOneBadge.setBadgeCount(5);
        tvTextOneBadge.setBadgeGravity(Gravity.LEFT | Gravity.BOTTOM);
        tvTextOneBadge.setBackgroundResource(R.mipmap.badge_orange);
        tvTextOneBadge.setTargetView(btnOne);


        tvTextTwoBadge = new BadgeView(MainActivity.this);
        tvTextTwoBadge.setmShowPoint(true);
        tvTextTwoBadge.setBadgeCount(111);
        tvTextTwoBadge.setTargetView(btnTwo);


        tvTextThreeBadge = new BadgeView(MainActivity.this);
        tvTextThreeBadge.setmShowPoint(true);
        tvTextThreeBadge.setBadgeCount(5);
        tvTextThreeBadge.setTextSize(14f);
        tvTextThreeBadge.setTargetView(btnThree);


        btnFourBadge = new BadgeView(MainActivity.this);
        btnFourBadge.setmShowPoint(true);
        btnFourBadge.setBadgeCount(0);
        btnFourBadge.setTargetView(btnFour);

        btnFiveBadge = new BadgeView(MainActivity.this);
        btnFiveBadge.setmShowPoint(true);
        btnFiveBadge.setBadgeCount(12);
        btnFiveBadge.setBadgeGravity(Gravity.LEFT | Gravity.BOTTOM);
        btnFiveBadge.setTargetView(btnFive);


        // 设置消息数量为0,显示红点，底部左侧首页按钮
        mainHomeBadge = new BadgeView(MainActivity.this);
        mainHomeBadge.setmShowPoint(true);
        mainHomeBadge.setBadgeCount(0);
        mainHomeBadge.setBackgroundResource(R.mipmap.badge_orange);
        mainHomeBadge.setTargetView(ivMainHome);

        // 设置消息数量为0,不显示红点，底部消息按钮
        mainMsgBadge = new BadgeView(MainActivity.this);
        mainMsgBadge.setmShowPoint(false);
        mainMsgBadge.setBadgeCount(0);
        mainMsgBadge.setTargetView(ivMainMsg);

        // 设置消息数量,底部右侧我的按钮
        mainMyBadge = new BadgeView(MainActivity.this);
        mainMyBadge.setBadgeCount(55);
        mainMyBadge.setBackIconColor(Color.parseColor("#FF5809"));
        mainMyBadge.setTargetView(ivMainMy);
    }
}
