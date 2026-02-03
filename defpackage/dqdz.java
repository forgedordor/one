package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqdz extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public dqdz(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqdz dqdzVar = new dqdz((fcxy) obj3);
        dqdzVar.a = (dqdp) obj;
        dqdzVar.b = (Duration) obj2;
        return dqdzVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof dqdn;
        Object obj3 = this.b;
        if (!z) {
            return obj2;
        }
        obj3.getClass();
        return new dqdn((Duration) obj3);
    }
}
