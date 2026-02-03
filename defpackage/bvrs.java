package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvrs extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvrs(bvsb bvsbVar, long j, int i, int i2, int i3, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvrs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmfo cmfoVarN = this.b.n();
            this.a = 1;
            obj = cmfoVarN.c(this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        bvqq bvqqVarB = bvqq.b(((bvqr) obj).c);
        if (bvqqVarB == null) {
            bvqqVarB = bvqq.UNRECOGNIZED;
        }
        bvqqVarB.getClass();
        if (bvqqVarB == bvqq.VERIFICATION_CODES_LOADING || bvqqVarB == bvqq.VERIFICATION_CODES_LOADED) {
            bvsb.a.n().q("got new request when existing request waiting for user action");
            ((cecr) this.b.g.b()).b(cecq.i);
        }
        final bvsb bvsbVar = this.b;
        bvsbVar.q();
        final long j = this.c;
        final int i2 = this.d;
        final int i3 = this.e;
        final int i4 = this.f;
        cmfo cmfoVarN2 = bvsbVar.n();
        fdap fdapVar = new fdap() { // from class: bvrr
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                bvqp bvqpVar = (bvqp) bvqr.a.createBuilder();
                bvqpVar.getClass();
                bvqpVar.copyOnWrite();
                ((bvqr) bvqpVar.instance).i = j;
                bvqs.f(bvqq.VERIFICATION_CODES_LOADING, bvqpVar);
                bvqs.d(true, bvqpVar);
                bvqpVar.copyOnWrite();
                ((bvqr) bvqpVar.instance).m = i2;
                bvqpVar.copyOnWrite();
                bvqr bvqrVar = (bvqr) bvqpVar.instance;
                int i5 = i3;
                bvqrVar.o = i5;
                bvsb bvsbVar2 = bvsbVar;
                ((ains) bvsbVar2.e.b()).e("Bugle.Gaia.Key.Derivation.Revision", i5);
                if (bvsbVar2.k.a()) {
                    int iA = ewyc.a(i4);
                    bvqpVar.copyOnWrite();
                    ((bvqr) bvqpVar.instance).p = iA;
                }
                return bvqs.b(bvqpVar);
            }
        };
        this.a = 2;
        Object objD = cmfoVarN2.d(fdapVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvrs(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
