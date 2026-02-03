package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auer extends evsn implements evui {
    public static final auer a;
    private static volatile evuo g;
    public int b;
    public int c;
    public aufb d;
    public aubq e;
    public String f = "";

    static {
        auer auerVar = new auer();
        a = auerVar;
        evsn.registerDefaultInstance(auer.class, auerVar);
    }

    private auer() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", auep.a, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new auer();
        }
        if (iOrdinal == 4) {
            return new aueo();
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
        synchronized (auer.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
