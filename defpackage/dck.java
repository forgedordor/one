package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dck extends fdbr implements fdap {
    final /* synthetic */ ixp a;
    final /* synthetic */ dcf b;
    final /* synthetic */ iyl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dck(ixp ixpVar, dcf dcfVar, iyl iylVar) {
        super(1);
        this.a = ixpVar;
        this.b = dcfVar;
        this.c = iylVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iyk iykVar = (iyk) obj;
        ivy ivyVarB = iykVar.b();
        if (ivyVarB != null) {
            if (this.a.ev()) {
                this.b.g = ivyVarB;
            } else {
                this.b.f = ivyVarB;
            }
        }
        iykVar.s(this.c, 0, 0, 0.0f);
        return fctx.a;
    }
}
