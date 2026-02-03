package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adez implements View.OnClickListener {
    final /* synthetic */ adel a;
    final /* synthetic */ adfc b;

    public adez(adel adelVar, adfc adfcVar) {
        this.a = adelVar;
        this.b = adfcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((adeh) this.a).e();
        adfc adfcVar = this.b;
        auvw.k(lvk.a(adfcVar.c), null, null, new adey(adfcVar, null), 3);
    }
}
