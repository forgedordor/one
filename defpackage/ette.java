package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ette extends evsn implements evui {
    public static final ette a;
    private static volatile evuo b;
    private int c;
    private ettq d;
    private boolean e;
    private eyaz f;

    static {
        ette etteVar = new ette();
        a = etteVar;
        evsn.registerDefaultInstance(ette.class, etteVar);
    }

    private ette() {
    }

    public static /* synthetic */ void a(ette etteVar, eyaz eyazVar) {
        eyazVar.getClass();
        etteVar.f = eyazVar;
        etteVar.c |= 2;
    }

    public static /* synthetic */ void b(ette etteVar, ettq ettqVar) {
        ettqVar.getClass();
        etteVar.d = ettqVar;
        etteVar.c |= 1;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ette();
        }
        if (iOrdinal == 4) {
            return new ettd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ette.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
