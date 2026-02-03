package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoju implements cqto {
    final /* synthetic */ aojv a;

    public aoju(aojv aojvVar) {
        this.a = aojvVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        aojv aojvVar = this.a;
        aojvVar.d = auvw.m(aojvVar.b, null, new aojt(aojvVar, null), 3);
    }

    @Override // defpackage.cqto
    public final void fK() {
        aojv aojvVar = this.a;
        fdlr fdlrVar = aojvVar.d;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        aojvVar.d = null;
        aojvVar.f().set(aojm.INELIGIBLE);
    }
}
