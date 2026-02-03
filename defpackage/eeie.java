package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeie extends wg {
    final /* synthetic */ eeiw a;
    final /* synthetic */ eeih b;

    public eeie(eeih eeihVar, eeiw eeiwVar) {
        this.a = eeiwVar;
        this.b = eeihVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iL = i < 0 ? this.b.b().L() : this.b.b().M();
        eeiw eeiwVar = this.a;
        eeih eeihVar = this.b;
        eeis eeisVarF = eeiwVar.F(iL);
        eeihVar.c = eeisVarF;
        eeihVar.ai.setText(eeiwVar.F(iL).f());
        eeihVar.f(eeiwVar.l(eeisVarF));
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.ai.getText());
        }
    }
}
