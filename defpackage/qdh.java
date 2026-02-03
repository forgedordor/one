package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qdh extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public qdh(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        qdh qdhVar = new qdh((fcxy) obj4);
        qdhVar.b = (Throwable) obj2;
        qdhVar.c = jLongValue;
        return qdhVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            qas.c();
            Log.e(qdj.a, "Cannot check for unfinished work", (Throwable) obj2);
            long jMin = Math.min(j * 30000, qdj.b);
            this.a = 1;
            if (fdkj.c(jMin, this) == fcylVar) {
                return fcylVar;
            }
        }
        return true;
    }
}
