package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyga extends evsn implements evui {
    public static final eyga a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        eyga eygaVar = new eyga();
        a = eygaVar;
        evsn.registerDefaultInstance(eyga.class, eygaVar);
    }

    private eyga() {
    }

    public final evub a() {
        evub evubVar = this.b;
        if (!evubVar.b) {
            this.b = evubVar.a();
        }
        return this.b;
    }

    public final boolean b(String str) {
        str.getClass();
        return this.b.containsKey(str);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", eyfz.a});
        }
        if (iOrdinal == 3) {
            return new eyga();
        }
        if (iOrdinal == 4) {
            return new eyfy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyga.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
