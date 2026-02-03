package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enbu extends evsn implements evui {
    public static final enbu a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public int g;
    public int h;
    public int i;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        enbu enbuVar = new enbu();
        a = enbuVar;
        evsn.registerDefaultInstance(enbu.class, enbuVar);
    }

    private enbu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003᠌\u0004\u0004<\u0000\u0005ဈ\u0001\u0006င\u0002\u0007င\u0003\b<\u0000", new Object[]{"d", "c", "b", "e", enbt.class, "i", enaz.a, enay.class, "f", "g", "h", enaq.class});
        }
        if (iOrdinal == 3) {
            return new enbu();
        }
        if (iOrdinal == 4) {
            return new emzy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enbu.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
