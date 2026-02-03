package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvra extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvra(fcxy fcxyVar, bvsb bvsbVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvra) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            return fcylVar;
        }
        if (i != 1) {
            return obj;
        }
        bvqr bvqrVar = (bvqr) obj;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(bvqrVar.i);
        Object objE = bvfd.a.e();
        objE.getClass();
        Instant instantPlusMillis = instantOfEpochMilli.plusMillis(((Number) objE).longValue());
        bvqq bvqqVarB = bvqq.b(bvqrVar.c);
        if (bvqqVarB == null) {
            bvqqVarB = bvqq.UNRECOGNIZED;
        }
        Object obj2 = bvqrVar;
        if (bvqqVarB != bvqq.ERROR_TIME_OUT) {
            long j = bvqrVar.i;
            obj2 = bvqrVar;
            if (j > 0) {
                bvsb bvsbVar = this.b;
                obj2 = bvqrVar;
                if (instantPlusMillis.isBefore(((cogw) bvsbVar.i.b()).f())) {
                    bvsb.a.n().q("Timeout while gaia pairing prompt is on the background.");
                    ((cecr) bvsbVar.g.b()).b(cecq.g);
                    cmfo cmfoVarN2 = bvsbVar.n();
                    bvrc bvrcVar = bvrc.a;
                    this.a = 2;
                    Object objD = cmfoVarN2.d(bvrcVar, this);
                    obj2 = objD;
                    if (objD == fcylVar) {
                        return fcylVar;
                    }
                }
            }
        }
        return obj2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvra bvraVar = new bvra(fcxyVar, this.b);
        bvraVar.c = obj;
        return bvraVar;
    }
}
