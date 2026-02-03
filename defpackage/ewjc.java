package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewjc extends evsn implements evui {
    public static final ewjc a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        ewjc ewjcVar = new ewjc();
        a = ewjcVar;
        evsn.registerDefaultInstance(ewjc.class, ewjcVar);
    }

    private ewjc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", ewja.a, "d", ewiy.a, "e"});
        }
        if (iOrdinal == 3) {
            return new ewjc();
        }
        if (iOrdinal == 4) {
            return new ewjb();
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
        synchronized (ewjc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
