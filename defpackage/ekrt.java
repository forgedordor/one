package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekrt {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected ekrt() {
    }

    protected abstract Object a();

    public final Object b(ekrr ekrrVar, ekte ekteVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(ekrrVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ekrrVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((ekrm) ekteVar).b;
        ekrs ekrsVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (ekrl.f.equals(ekteVar.c(i2))) {
                Object objE = ekteVar.e(i2);
                if (objE instanceof ekrx) {
                    if (ekrsVar == null) {
                        ekrsVar = new ekrs(this, ekrrVar);
                    }
                    ((ekrx) objE).a();
                }
            }
        }
        return objA;
    }
}
