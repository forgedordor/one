package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xke extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ xks c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xke(xks xksVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = xksVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xke xkeVar = new xke(this.c, (fcxy) obj3);
        xkeVar.a = zBooleanValue;
        xkeVar.b = (Integer) obj2;
        return xkeVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (z) {
            Object objE = aonl.c.e();
            objE.getClass();
            return eoob.g(((Number) objE).intValue());
        }
        if (((Boolean) aonl.a.e()).booleanValue()) {
            Object objE2 = aonl.b.e();
            objE2.getClass();
            return eoob.g(((Number) objE2).intValue());
        }
        if (obj2 == null) {
            return null;
        }
        Duration durationG = eoob.g((((Number) obj2).intValue() * 8) / this.c.c);
        if (durationG.compareTo(eoob.e(1)) >= 0) {
            Duration durationA = xks.a(durationG, eoob.e(1));
            durationA.getClass();
            return durationA;
        }
        Duration durationA2 = xks.a(durationG, eoob.g(10));
        durationA2.getClass();
        return durationA2;
    }
}
