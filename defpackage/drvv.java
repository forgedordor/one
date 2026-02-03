package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drvv implements drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter");
    public static final drvr b = new drvr() { // from class: drvv.1
        @Override // defpackage.drvq
        public final /* synthetic */ void a() {
        }
    };
    private static volatile drvv f;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public drvv() {
        drlx.a.a(this);
    }

    public static drvv a() {
        drvv drvvVar;
        drvv drvvVar2 = f;
        if (drvvVar2 != null) {
            return drvvVar2;
        }
        synchronized (drvv.class) {
            drvvVar = f;
            if (drvvVar == null) {
                drvvVar = new drvv();
                f = drvvVar;
            }
        }
        return drvvVar;
    }

    public static drxt b(String str) {
        return new drxt(drxu.b(str));
    }
}
