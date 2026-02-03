package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envp extends evsn implements evui {
    public static final envp a;
    private static volatile evuo d;
    public int b;
    public int c;
    private int e;
    private int f;
    private int g;
    private int h;

    static {
        envp envpVar = new envp();
        a = envpVar;
        evsn.registerDefaultInstance(envp.class, envpVar);
    }

    private envp() {
    }

    public static /* synthetic */ void a(envp envpVar) {
        envpVar.b |= 16;
        envpVar.h = 0;
    }

    public static /* synthetic */ void b(envp envpVar) {
        envpVar.b |= 1;
        envpVar.e = 0;
    }

    public static /* synthetic */ void c(envp envpVar) {
        envpVar.b |= 2;
        envpVar.f = 0;
    }

    public static /* synthetic */ void d(envp envpVar) {
        envpVar.b |= 8;
        envpVar.g = 0;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "e", "f", "c", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new envp();
        }
        if (iOrdinal == 4) {
            return new envo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (envp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
