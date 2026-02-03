package defpackage;

import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdl implements afyw {
    private final afgk a;

    public agdl(afgk afgkVar) {
        afgkVar.getClass();
        this.a = afgkVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agdk agdkVar = (agdk) afzvVar;
        SpannableString spannableString = new SpannableString(agdkVar.a.subSequence(agdkVar.c, agdkVar.d).toString());
        ClickableSpan clickableSpan = agdkVar.b;
        spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
        float f = agdkVar.e;
        float f2 = agdkVar.f;
        ecem.c();
        afgk afgkVar = this.a;
        afgkVar.a();
        Activity activity = afgkVar.a;
        AppCompatTextView appCompatTextView = new AppCompatTextView(activity);
        appCompatTextView.setAlpha(0.0f);
        appCompatTextView.setTextSize(0, 1.0f);
        appCompatTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        appCompatTextView.setX(f);
        appCompatTextView.setY(f2);
        appCompatTextView.setFocusable(true);
        appCompatTextView.setFocusableInTouchMode(true);
        appCompatTextView.requestFocus();
        activity.addContentView(appCompatTextView, afgkVar.b);
        afgkVar.c = appCompatTextView;
        TextView textView = afgkVar.c;
        textView.getClass();
        clickableSpan.onClick(textView);
        return fctx.a;
    }
}
