package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwo extends evsn implements evui {
    public static final etwo a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public etul e;
    public etww g;
    public int c = 0;
    public String f = "";

    static {
        etwo etwoVar = new etwo();
        a = etwoVar;
        evsn.registerDefaultInstance(etwo.class, etwoVar);
    }

    private etwo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004:\u0000\u0005ဉ\u0002", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new etwo();
        }
        if (iOrdinal == 4) {
            return new etwn();
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
        synchronized (etwo.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
