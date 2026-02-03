package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwp extends evsn implements evui {
    public static final drwp a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        drwp drwpVar = new drwp();
        a = drwpVar;
        evsn.registerDefaultInstance(drwp.class, drwpVar);
    }

    private drwp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002:\u0000\u0003@\u0000\u0004A\u0000\u00054\u0000\u0006;\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", drxd.class});
        }
        if (iOrdinal == 3) {
            return new drwp();
        }
        if (iOrdinal == 4) {
            return new drwn();
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
        synchronized (drwp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
