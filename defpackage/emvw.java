package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvw extends evsn implements evui {
    public static final emvw a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;
    public evrj f;

    static {
        emvw emvwVar = new emvw();
        a = emvwVar;
        evsn.registerDefaultInstance(emvw.class, emvwVar);
    }

    private emvw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001e\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001e<\u0000", new Object[]{"d", "c", "b", "e", "f", emvy.class});
        }
        if (iOrdinal == 3) {
            return new emvw();
        }
        if (iOrdinal == 4) {
            return new emvv();
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
        synchronized (emvw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
