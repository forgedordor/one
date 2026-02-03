package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tar extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ dbws c;
    final /* synthetic */ fcsf d;
    final /* synthetic */ Duration e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tar(tbe tbeVar, dbws dbwsVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tbeVar;
        this.c = dbwsVar;
        this.d = fcsfVar;
        this.e = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tar) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            tbe tbeVar = this.b;
            dbws dbwsVar = this.c;
            fcsf fcsfVar = this.d;
            Duration duration = this.e;
            ayrq ayrqVar = ayrq.a;
            taq taqVar = new taq(tbeVar, dbwsVar, fcsfVar, duration, null);
            this.a = 1;
            obj = ayrqVar.a("CustomD2DSourceServiceImpl#getMetadata", taqVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        tbe tbeVar2 = this.b;
        tbeVar2.l.h("CustomD2DSourceServiceImpl#getMetadata time: [%s]ms", new Long(fdhi.g(((fdhi) obj).c)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tar(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
