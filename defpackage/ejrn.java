package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrn extends evsn implements evui {
    public static final ejrn a;
    private static volatile evuo d;
    public evub b;
    public int c;
    private evub e;

    static {
        ejrn ejrnVar = new ejrn();
        a = ejrnVar;
        evsn.registerDefaultInstance(ejrn.class, ejrnVar);
    }

    private ejrn() {
        evub evubVar = evub.a;
        this.b = evubVar;
        this.e = evubVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0002\u0000\u0000\u00022\u0003\u000b\u00052", new Object[]{"b", ejrm.a, "c", "e", ejrl.a});
        }
        if (iOrdinal == 3) {
            return new ejrn();
        }
        if (iOrdinal == 4) {
            return new ejrk();
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
        synchronized (ejrn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
