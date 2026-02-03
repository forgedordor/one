package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckkz extends evsn implements evui {
    public static final ckkz a;
    private static volatile evuo e;
    public int b;
    public int c;
    public String d = "";

    static {
        ckkz ckkzVar = new ckkz();
        a = ckkzVar;
        evsn.registerDefaultInstance(ckkz.class, ckkzVar);
    }

    private ckkz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ckkz();
        }
        if (iOrdinal == 4) {
            return new ckky();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ckkz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
