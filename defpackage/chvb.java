package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chvb extends evsn implements evui {
    public static final chvb a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public chuo f;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        chvb chvbVar = new chvb();
        a = chvbVar;
        evsn.registerDefaultInstance(chvb.class, chvbVar);
    }

    private chvb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0005Ȉ\u0006ဉ\u0000\u0007ለ\u0001", new Object[]{"d", "c", "b", chuz.class, chux.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new chvb();
        }
        if (iOrdinal == 4) {
            return new chva();
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
        synchronized (chvb.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
