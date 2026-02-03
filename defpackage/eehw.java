package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eehw implements View.OnClickListener {
    final /* synthetic */ eeiw a;
    final /* synthetic */ eeih b;

    public eehw(eeih eeihVar, eeiw eeiwVar) {
        this.a = eeiwVar;
        this.b = eeihVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.e(this.a.F(r3.b().M() - 1));
    }
}
