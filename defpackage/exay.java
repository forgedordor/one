package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exay extends evsn implements evui {
    public static final exay a;
    private static volatile evuo f;
    public int b;
    public long c;
    public String d;
    public evtg e;

    static {
        exay exayVar = new exay();
        a = exayVar;
        evsn.registerDefaultInstance(exay.class, exayVar);
    }

    private exay() {
        emptyProtobufList();
        emptyProtobufList();
        this.d = "";
        this.e = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0001\u0000\u0007ဃ\u0004\bဈ\u0005\t\u001b", new Object[]{"b", "c", "d", "e", exax.class});
        }
        if (iOrdinal == 3) {
            return new exay();
        }
        if (iOrdinal == 4) {
            return new exav();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exay.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
