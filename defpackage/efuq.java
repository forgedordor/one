package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.RichTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuq {
    public static void a(TextView textView, efup efupVar) {
        boolean z;
        String strJ;
        efsh efshVar;
        Typeface typefaceCreate;
        efsh efshVar2;
        Activity activityE;
        TemplateLayout templateLayoutB;
        int iC;
        Context context = textView.getContext();
        efsh efshVar3 = efupVar.a;
        if (efshVar3 != null && efsj.h(context).t(efshVar3) && (iC = efsj.h(context).c(context, efshVar3)) != 0) {
            textView.setTextColor(iC);
        }
        efsh efshVar4 = efupVar.b;
        if (efshVar4 != null && efsj.h(context).t(efshVar4)) {
            Context context2 = textView.getContext();
            try {
                efte efteVar = efrl.a;
                activityE = efsj.e(context2);
                templateLayoutB = efuo.b(activityE);
            } catch (ClassCastException | IllegalArgumentException unused) {
            }
            if (!(templateLayoutB instanceof GlifLayout ? ((GlifLayout) templateLayoutB).d() : efsj.v(activityE))) {
                int iC2 = efsj.h(context).c(context, efupVar.b);
                if (iC2 != 0) {
                    textView.setLinkTextColor(iC2);
                }
            }
        }
        efsh efshVar5 = efupVar.c;
        if (efshVar5 != null && efsj.h(context).t(efshVar5)) {
            float fB = efsj.h(context).b(context, efshVar5, 0.0f);
            if (fB > 0.0f) {
                textView.setTextSize(0, fB);
            }
        }
        efsh efshVar6 = efupVar.i;
        Typeface typefaceCreate2 = null;
        if (efshVar6 == null || !efsj.h(context).t(efshVar6)) {
            z = false;
            strJ = null;
        } else {
            strJ = efsj.h(context).j(context, efshVar6);
            z = c(strJ);
        }
        efsh efshVar7 = efupVar.d;
        if (efshVar7 != null && efsj.h(context).t(efshVar7) && !z) {
            typefaceCreate2 = Typeface.create(efsj.h(context).j(context, efshVar7), 0);
        }
        if (efsj.p(context) && (efshVar2 = efupVar.e) != null && efsj.h(context).t(efshVar2) && !z) {
            int iD = efsj.h(context).d(context, efshVar2, 400);
            if (typefaceCreate2 == null) {
                typefaceCreate2 = textView.getTypeface();
            }
            typefaceCreate2 = Typeface.create(typefaceCreate2, iD, false);
        }
        if (typefaceCreate2 != null) {
            textView.setTypeface(typefaceCreate2);
        }
        if (c(strJ)) {
            try {
                textView.setFontVariationSettings(strJ);
            } catch (Exception e) {
                Log.e("TextViewPartnerStyler", "Failed to set font variation settings: ".concat(String.valueOf(e.getMessage())));
            }
        }
        if ((textView instanceof RichTextView) && (efshVar = efupVar.f) != null && efsj.h(context).t(efshVar) && (typefaceCreate = Typeface.create(efsj.h(context).j(context, efshVar), 0)) != null) {
            RichTextView.a = typefaceCreate;
        }
        b(textView, efupVar);
        textView.setGravity(efupVar.j);
    }

    public static void b(TextView textView, efup efupVar) {
        efsh efshVar = efupVar.g;
        if (efshVar == null && efupVar.h == null) {
            return;
        }
        Context context = textView.getContext();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int iA = (efshVar == null || !efsj.h(context).t(efshVar)) ? layoutParams2.topMargin : (int) efsj.h(context).a(context, efshVar);
            efsh efshVar2 = efupVar.h;
            layoutParams2.setMargins(layoutParams2.leftMargin, iA, layoutParams2.rightMargin, (efshVar2 == null || !efsj.h(context).t(efshVar2)) ? layoutParams2.bottomMargin : (int) efsj.h(context).a(context, efshVar2));
            textView.setLayoutParams(layoutParams);
        }
    }

    private static boolean c(String str) {
        return (str == null || TextUtils.isEmpty(str)) ? false : true;
    }
}
