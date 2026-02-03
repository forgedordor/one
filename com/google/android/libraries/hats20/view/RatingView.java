package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.csq;
import defpackage.drjc;
import defpackage.ekgp;
import defpackage.erwy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RatingView extends LinearLayout {
    private static final ekgp b;
    public drjc a;
    private erwy c;

    static {
        csq csqVar = new csq();
        csqVar.put(0, Integer.valueOf(R.drawable.ic_sentiment_very_dissatisfied_grey600_36dp));
        csqVar.put(1, Integer.valueOf(R.drawable.ic_sentiment_dissatisfied_grey600_36dp));
        csqVar.put(2, Integer.valueOf(R.drawable.ic_sentiment_neutral_grey600_36dp));
        csqVar.put(3, Integer.valueOf(R.drawable.ic_sentiment_satisfied_grey600_36dp));
        csqVar.put(4, Integer.valueOf(R.drawable.ic_sentiment_very_satisfied_grey600_36dp));
        b = ekgp.j(csqVar);
    }

    public RatingView(Context context) {
        super(context);
        c(context);
    }

    private final void c(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.hats_survey_rating_smiley_star, (ViewGroup) this, true);
        context.getSystemService("accessibility");
    }

    private static final void d(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, int i, int i2) {
        String str = String.format("%d of %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            str = str + " " + ((String) this.c.c.get(0));
        } else if (i == i2) {
            str = str + " " + ((String) this.c.c.get(1));
        }
        view.setContentDescription(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.erwy r9, boolean r10) {
        /*
            r8 = this;
            r8.c = r9
            r0 = 2131428556(0x7f0b04cc, float:1.847876E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            evtg r1 = r9.c
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            d(r0, r1)
            r0 = 2131428553(0x7f0b04c9, float:1.8478754E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            evtg r1 = r9.c
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            d(r0, r1)
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 2131428543(0x7f0b04bf, float:1.8478733E38)
            android.view.View r1 = r8.findViewById(r1)
            com.google.android.libraries.hats20.ui.StarRatingBar r1 = (com.google.android.libraries.hats20.ui.StarRatingBar) r1
            if (r10 == 0) goto Lba
            r0.setVisibility(r2)
            android.content.Context r9 = r8.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = r2
        L4c:
            r1 = 5
            if (r10 >= r1) goto Lb9
            r3 = 2131624380(0x7f0e01bc, float:1.8875938E38)
            android.view.View r3 = r9.inflate(r3, r0, r2)
            r4 = 2131428554(0x7f0b04ca, float:1.8478756E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r5 = r8.getResources()
            ekgp r6 = com.google.android.libraries.hats20.view.RatingView.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = 0
            pop r5 = defpackage.pop.b(r5, r6, r7)
            r4.setImageDrawable(r5)
            int r4 = r10 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.setTag(r5)
            r8.a(r3, r4, r1)
            drja r1 = new drja
            r1.<init>(r8, r0, r4)
            r3.setOnClickListener(r1)
            if (r10 == 0) goto L96
            r1 = 4
            if (r10 == r1) goto L95
            goto Lb4
        L95:
            r10 = r1
        L96:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r10 != 0) goto La8
            int r10 = r1.topMargin
            int r5 = r1.rightMargin
            int r6 = r1.bottomMargin
            r1.setMargins(r2, r10, r5, r6)
            goto Lb1
        La8:
            int r10 = r1.leftMargin
            int r5 = r1.topMargin
            int r6 = r1.bottomMargin
            r1.setMargins(r10, r5, r2, r6)
        Lb1:
            r3.setLayoutParams(r1)
        Lb4:
            r0.addView(r3)
            r10 = r4
            goto L4c
        Lb9:
            return
        Lba:
            r1.setVisibility(r2)
            int r10 = r9.b
            r0 = 3
            if (r10 < r0) goto Lcf
            r1.a = r10
            r1.requestLayout()
            drjb r10 = new drjb
            r10.<init>(r8, r1, r9)
            r1.b = r10
            return
        Lcf:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "numStars must be at least 3"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.view.RatingView.b(erwy, boolean):void");
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public RatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    public RatingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context);
    }
}
