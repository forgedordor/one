package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejha extends evsn implements evui {
    public static final ejha a;
    private static volatile evuo e;
    public int b;
    public ejhc c;
    public String d = "";

    static {
        ejha ejhaVar = new ejha();
        a = ejhaVar;
        evsn.registerDefaultInstance(ejha.class, ejhaVar);
    }

    private ejha() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejha();
        }
        if (iOrdinal == 4) {
            return new ejgz();
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
        synchronized (ejha.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
