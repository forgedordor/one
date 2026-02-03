package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzt extends evsn implements evui {
    public static final etzt a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evub d = evub.a;

    static {
        etzt etztVar = new etzt();
        a = etztVar;
        evsn.registerDefaultInstance(etzt.class, etztVar);
    }

    private etzt() {
    }

    public final evub a() {
        evub evubVar = this.d;
        if (!evubVar.b) {
            this.d = evubVar.a();
        }
        return this.d;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", etzs.a});
        }
        if (iOrdinal == 3) {
            return new etzt();
        }
        if (iOrdinal == 4) {
            return new etzr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etzt.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
