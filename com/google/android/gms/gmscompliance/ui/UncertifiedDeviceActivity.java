package com.google.android.gms.gmscompliance.ui;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.eebt;
import defpackage.efte;
import defpackage.efth;
import defpackage.efti;
import defpackage.efus;
import defpackage.efut;
import defpackage.iy;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UncertifiedDeviceActivity extends iy {
    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (TextUtils.isEmpty("glif_v3_light")) {
            i = 0;
        } else {
            if (efut.a == null) {
                efus efusVar = new efus();
                efusVar.a = R.style.SudThemeGlif_DayNight;
                efusVar.b();
                efut.a = efusVar.a();
            }
            efus efusVar2 = new efus(efut.a);
            efusVar2.a = 0;
            efusVar2.b();
            i = true != efusVar2.a().d ? R.style.SudThemeGlifV3_Light : R.style.SudThemeGlifV3_DayNight;
        }
        if (i != 0) {
            setTheme(i);
        }
        Window window = getWindow();
        efte efteVar = efti.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= -5635;
        window.setAttributes(attributes);
        efth efthVar = new efth();
        efthVar.b = window;
        efthVar.c = 3;
        efthVar.d.run();
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new int[]{android.R.attr.statusBarColor, android.R.attr.navigationBarColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        typedArrayObtainStyledAttributes.recycle();
        setContentView(R.layout.auth_uncertified_activity_v2);
        if (Build.VERSION.SDK_INT >= 35 && getApplicationInfo().targetSdkVersion >= 35) {
            View decorView = getWindow().getDecorView();
            ldn ldnVar = new ldn() { // from class: ddca
                @Override // defpackage.ldn
                public final lgt ez(View view, lgt lgtVar) {
                    view.setPadding(0, lgtVar.f(1).c, 0, lgtVar.f(64).e);
                    return lgt.a;
                }
            };
            int[] iArr = ley.a;
            len.k(decorView, ldnVar);
        }
        if (getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            getWindow().setNavigationBarColor(getColor(R.color.play_protect_auth_navigation_bar_color));
        }
        eebt.d((TextView) findViewById(R.id.play_protect_body_text), LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.goToWebsiteButton);
        if (button != null) {
            String stringExtra = getIntent().getStringExtra("customCtaText");
            final Intent intent = (Intent) getIntent().getParcelableExtra("ctaIntent");
            if (TextUtils.isEmpty(stringExtra) || intent == null) {
                button.setVisibility(4);
            } else {
                final Bundle bundleExtra = getIntent().getBundleExtra("ctaIntentOptions");
                button.setText(stringExtra);
                button.setOnClickListener(new View.OnClickListener() { // from class: ddbz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.startActivity(intent, bundleExtra);
                    }
                });
            }
        }
        TextView textView = (TextView) findViewById(R.id.play_protect_custom_body_text);
        if (textView != null) {
            String stringExtra2 = getIntent().getStringExtra("customBodyText");
            if (TextUtils.isEmpty(stringExtra2)) {
                textView.setVisibility(4);
            } else {
                textView.setText(Html.fromHtml(stringExtra2, 63));
                eebt.d(textView, LinkMovementMethod.getInstance());
                final Intent intent2 = (Intent) getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: ddcc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.startActivity(intent2);
                        }
                    });
                }
            }
        }
        Button button2 = (Button) findViewById(R.id.finishButton);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: ddcb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.finish();
                }
            });
        }
    }
}
