package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyg extends fcyz implements fdat {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ dyk e;
    final /* synthetic */ fdch f;
    final /* synthetic */ long g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyg(dyk dykVar, fdch fdchVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dykVar;
        this.f = fdchVar;
        this.g = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyg) c((dyh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dyk dykVar;
        long j;
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            j = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            dykVar = (dyk) this.h;
            fctl.b(obj);
            obj3 = obj4;
            obj2 = obj5;
        } else {
            fctl.b(obj);
            dyh dyhVar = (dyh) this.h;
            dyk dykVar2 = this.e;
            dyf dyfVar = new dyf(dykVar2, dyhVar);
            fdch fdchVar = this.f;
            long j2 = this.g;
            dvj dvjVar = dykVar2.c;
            long j3 = fdchVar.a;
            float fB = dykVar2.b(dykVar2.d == dwm.b ? kjo.a(j2) : kjo.b(j2));
            this.h = dykVar2;
            this.a = dykVar2;
            this.b = fdchVar;
            this.c = j3;
            this.d = 1;
            obj = dvjVar.a(dyfVar, fB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            dykVar = dykVar2;
            j = j3;
            obj3 = fdchVar;
            obj2 = dykVar2;
        }
        float fB2 = dykVar.b(((Number) obj).floatValue());
        ((fdch) obj3).a = ((dyk) obj2).d == dwm.b ? kjo.g(j, fB2, 0.0f, 2) : kjo.g(j, 0.0f, fB2, 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dyg dygVar = new dyg(this.e, this.f, this.g, fcxyVar);
        dygVar.h = obj;
        return dygVar;
    }
}
