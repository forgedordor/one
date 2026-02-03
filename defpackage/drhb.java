package defpackage;

import android.view.View;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhb implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ drhg d;

    public drhb(drhg drhgVar, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = drhgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        drhg drhgVar = this.d;
        drhf drhfVar = drhgVar.a;
        SurveyPromptActivity.H(drhfVar.a(), this.a, drhgVar.f, drhgVar.g, drhgVar.e, Integer.valueOf(this.b), drhgVar.i, drhgVar.j, this.c);
        drhgVar.m = true;
        drhfVar.dismissAllowingStateLoss();
    }
}
