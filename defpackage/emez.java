package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emez extends evsn implements evui {
    public static final emez a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int f;
    public String e = "";
    public String g = "";

    static {
        emez emezVar = new emez();
        a = emezVar;
        evsn.registerDefaultInstance(emez.class, emezVar);
    }

    private emez() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", emex.a, "d", emew.a, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new emez();
        }
        if (iOrdinal == 4) {
            return new emev();
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
        synchronized (emez.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
