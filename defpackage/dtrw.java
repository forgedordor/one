package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrw extends evsn implements evui {
    public static final dtrw a;
    private static volatile evuo h;
    public int b;
    public boolean f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        dtrw dtrwVar = new dtrw();
        a = dtrwVar;
        evsn.registerDefaultInstance(dtrw.class, dtrwVar);
    }

    private dtrw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002\u0006ဈ\u0004", new Object[]{"b", "c", "d", "f", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new dtrw();
        }
        if (iOrdinal == 4) {
            return new dtrv();
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
        synchronized (dtrw.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
