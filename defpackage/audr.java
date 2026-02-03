package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audr extends evsn implements evui {
    public static final audr a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public boolean d;
    public aufb e;
    public boolean f;

    static {
        audr audrVar = new audr();
        a = audrVar;
        evsn.registerDefaultInstance(audr.class, audrVar);
    }

    private audr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new audr();
        }
        if (iOrdinal == 4) {
            return new audq();
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
        synchronized (audr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
