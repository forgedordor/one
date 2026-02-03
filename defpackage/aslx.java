package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aslx extends evsn implements evui {
    public static final aslx a;
    private static volatile evuo g;
    public boolean b;
    public boolean c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        aslx aslxVar = new aslx();
        a = aslxVar;
        evsn.registerDefaultInstance(aslx.class, aslxVar);
    }

    private aslx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aslx();
        }
        if (iOrdinal == 4) {
            return new aslw();
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
        synchronized (aslx.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
