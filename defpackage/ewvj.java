package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewvj extends evsn implements evui {
    public static final ewvj a;
    private static volatile evuo h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g = "";

    static {
        ewvj ewvjVar = new ewvj();
        a = ewvjVar;
        evsn.registerDefaultInstance(ewvj.class, ewvjVar);
    }

    private ewvj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", ewve.a, "f", ewvg.a, "g"});
        }
        if (iOrdinal == 3) {
            return new ewvj();
        }
        if (iOrdinal == 4) {
            return new ewvi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewvj.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
