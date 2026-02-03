package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzz extends evsn implements evui {
    public static final dzzz a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        dzzz dzzzVar = new dzzz();
        a = dzzzVar;
        evsn.registerDefaultInstance(dzzz.class, dzzzVar);
    }

    private dzzz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new dzzz();
        }
        if (iOrdinal == 4) {
            return new dzzx();
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
        synchronized (dzzz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
