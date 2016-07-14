<h3>Android BadgeViewLib</h3>

This library is an extension of badgeview.

<a href="https://github.com/jgilfelt/android-viewbadger">View BadgeView links</a>

A simple way to "badge" any given Android view at runtime without having to cater for it in layout.

![image](BadgeViewLib/app/src/main/res/drawable/device-2016-07-14-210846.png)

Simple example:

tvTextOneBadge = new BadgeView(MainActivity.this);
tvTextOneBadge.setmShowPoint(true);
tvTextOneBadge.setTextSize(16f);
tvTextOneBadge.setBadgeCount(5);
tvTextOneBadge.setBadgeGravity(Gravity.LEFT | Gravity.BOTTOM);
tvTextOneBadge.setBackgroundResource(R.mipmap.badge_orange);
tvTextOneBadge.setTargetView(btnOne);

Author: hanxiaofeng

The code in this project is licensed under the Apache Software License 2.0. 
Copyright (c) 2016 readyState Software Ltd.
