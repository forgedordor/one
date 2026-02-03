package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhc implements View.OnClickListener {
    final /* synthetic */ drhg a;

    public drhc(drhg drhgVar) {
        this.a = drhgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        drhg drhgVar = this.a;
        drhgVar.b();
        drhgVar.a.dismissAllowingStateLoss();
    }
}
