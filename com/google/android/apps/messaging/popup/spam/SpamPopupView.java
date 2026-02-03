package com.google.android.apps.messaging.popup.spam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ahal;
import defpackage.ahar;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpamPopupView extends ahal {
    public static final cczi a = cdag.g(cdag.b, "spam_promo_popup_learn_more_url", "https://support.google.com/messages?p=spamdetection");
    static final cczi b = cdag.g(cdag.b, "spam_promo_popup_learn_more_help_and_feedback_topic", "spamdetection");
    public fcsu c;
    public fcsu d;
    public ahar e;

    public SpamPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinishInflate() throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onFinishInflate()
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131430514(0x7f0b0c72, float:1.8482731E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r7.getContext()
            java.lang.String r2 = defpackage.cpef.a(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 2132087721(0x7f1513a9, float:1.9815705E38)
            java.lang.String r0 = r0.getString(r4, r3)
            cczi r3 = com.google.android.apps.messaging.popup.spam.SpamPopupView.b
            java.lang.Object r3 = r3.e()
            java.lang.String r3 = (java.lang.String) r3
            cczi r4 = com.google.android.apps.messaging.popup.spam.SpamPopupView.a
            java.lang.Object r4 = r4.e()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L52
        L45:
            android.content.Context r5 = r7.getContext()
            ahao r6 = new ahao
            r6.<init>()
            android.text.SpannableStringBuilder r0 = defpackage.dajs.e(r5, r0, r2, r6)
        L52:
            r1.setText(r0)
            defpackage.eebt.b(r1)
            defpackage.eebt.c(r1)
            r0 = 2131427904(0x7f0b0240, float:1.8477437E38)
            android.view.View r0 = r7.findViewById(r0)
            ahap r1 = new ahap
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2131427903(0x7f0b023f, float:1.8477435E38)
            android.view.View r0 = r7.findViewById(r0)
            ahaq r1 = new ahaq
            r1.<init>()
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.popup.spam.SpamPopupView.onFinishInflate():void");
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), (int) (getResources().getDisplayMetrics().heightPixels * 0.5d)), Integer.MIN_VALUE));
    }
}
