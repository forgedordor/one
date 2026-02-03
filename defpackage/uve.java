package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uve implements uvd {
    private final ea a;
    private final fcsu b;

    public uve(ea eaVar, fcsu fcsuVar) {
        this.a = eaVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.uvd
    public final void a() {
        ((achu) this.b.b()).h(this.a.z(), false);
    }

    @Override // defpackage.uvd
    public final void b() {
        ea eaVar = this.a;
        ea eaVarH = eaVar.I().h("MagicComposeInfoDialogFragment");
        if (eaVarH != null) {
            cg cgVar = new cg(eaVar.I());
            cgVar.q(eaVarH);
            cgVar.c();
        } else {
            uvi uviVar = new uvi();
            eyhj.e(uviVar);
            uviVar.p(true);
            uviVar.t(eaVar.I(), "MagicComposeInfoDialogFragment");
        }
    }
}
