package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etti extends evsn implements evui {
    public static final etti a;
    private static volatile evuo b;
    private int c;
    private ettg d;
    private ettg e;
    private ettg f;
    private etst g;

    static {
        etti ettiVar = new etti();
        a = ettiVar;
        evsn.registerDefaultInstance(etti.class, ettiVar);
    }

    private etti() {
    }

    public static /* synthetic */ void a(etti ettiVar, ettg ettgVar) {
        ettgVar.getClass();
        ettiVar.f = ettgVar;
        ettiVar.c |= 4;
    }

    public static /* synthetic */ void b(etti ettiVar, ettg ettgVar) {
        ettgVar.getClass();
        ettiVar.e = ettgVar;
        ettiVar.c |= 2;
    }

    public static /* synthetic */ void c(etti ettiVar, etst etstVar) {
        etstVar.getClass();
        ettiVar.g = etstVar;
        ettiVar.c |= 8;
    }

    public static /* synthetic */ void d(etti ettiVar, ettg ettgVar) {
        ettgVar.getClass();
        ettiVar.d = ettgVar;
        ettiVar.c |= 1;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new etti();
        }
        if (iOrdinal == 4) {
            return new etth();
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
        synchronized (etti.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
