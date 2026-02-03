package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asos extends evsn<asos, asor> implements evui {
    public static final asos a;
    private static volatile evuo g;
    public int b;
    public aslx c;
    public boolean d;
    public String e = "";
    public boolean f;

    static {
        asos asosVar = new asos();
        a = asosVar;
        evsn.registerDefaultInstance(asos.class, asosVar);
    }

    private asos() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new asos();
        }
        if (iOrdinal == 4) {
            return new asor();
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
        synchronized (asos.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
