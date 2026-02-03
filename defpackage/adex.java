package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adex implements View.OnClickListener {
    final /* synthetic */ adfc a;
    final /* synthetic */ adel b;

    public adex(adfc adfcVar, adel adelVar) {
        this.a = adfcVar;
        this.b = adelVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.b);
    }
}
