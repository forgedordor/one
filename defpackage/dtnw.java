package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnw extends evsn implements evui {
    public static final dtnw a;
    private static volatile evuo h;
    public int b;
    public long d;
    public int f;
    public dtni g;
    public String c = "";
    public String e = "";

    static {
        dtnw dtnwVar = new dtnw();
        a = dtnwVar;
        evsn.registerDefaultInstance(dtnw.class, dtnwVar);
    }

    private dtnw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", dtnu.a, "g"});
        }
        if (iOrdinal == 3) {
            return new dtnw();
        }
        if (iOrdinal == 4) {
            return new dtnt();
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
        synchronized (dtnw.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
