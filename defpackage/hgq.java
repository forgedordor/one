package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgq extends fcyz implements fdat {
    int a;
    final /* synthetic */ hgr b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgq(hgr hgrVar, float f, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hgrVar;
        this.c = f;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hgq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        final hgr hgrVar;
        ddp ddpVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (ddpVar = (hgrVar = this.b).j) != null) {
            float f = this.c;
            Float f2 = new Float(f);
            float f3 = f + 1.0f;
            Float f4 = new Float(f3);
            fdap fdapVar = ddpVar.f.a;
            deh dehVar = (deh) fdapVar.invoke(f2);
            if (dehVar == null) {
                dehVar = ddpVar.b;
            }
            deh dehVar2 = (deh) fdapVar.invoke(f4);
            if (dehVar2 == null) {
                dehVar2 = ddpVar.c;
            }
            int iB = dehVar.b();
            for (int i2 = 0; i2 < iB; i2++) {
                if (dehVar.a(i2) > dehVar2.a(i2)) {
                    dgd.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + dehVar + " is greater than upper bound " + dehVar2 + " on index " + i2);
                }
            }
            ddpVar.d = dehVar;
            ddpVar.e = dehVar2;
            if (!ddpVar.j()) {
                Object objB = ddpVar.b(ddpVar.d());
                if (!fdbq.f(objB, ddpVar.d())) {
                    ddpVar.a.c(objB);
                }
            }
            Float f5 = new Float(f3);
            dff dffVarD = dea.d(dea.c(this.d, 0, dev.d, 2), 1, 0L, 4);
            fdap fdapVar2 = new fdap() { // from class: hgp
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    hgrVar.m.h(((Number) ((ddp) obj2).d()).floatValue() % 1.0f);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (ddp.k(ddpVar, f5, dffVarD, fdapVar2, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hgq(this.b, this.c, this.d, fcxyVar);
    }
}
