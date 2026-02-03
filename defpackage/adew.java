package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adew implements View.OnClickListener {
    final /* synthetic */ adel a;
    final /* synthetic */ adfc b;

    public adew(adel adelVar, adfc adfcVar) {
        this.a = adelVar;
        this.b = adfcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((adek) this.a).e();
        adfc adfcVar = this.b;
        auvw.k(lvk.a(adfcVar.c), null, null, new adev(adfcVar, null), 3);
    }
}
