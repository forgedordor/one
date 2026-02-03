package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjd extends evsn implements evui {
    public static final ezjd a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public eyya f;

    static {
        ezjd ezjdVar = new ezjd();
        a = ezjdVar;
        evsn.registerDefaultInstance(ezjd.class, ezjdVar);
    }

    private ezjd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001n\b\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"d", "c", "b", "e", "f", ezqx.class, ezqh.class, ezru.class, ezqr.class, ezqp.class, ezqn.class});
        }
        if (iOrdinal == 3) {
            return new ezjd();
        }
        if (iOrdinal == 4) {
            return new ezjb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezjd.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
