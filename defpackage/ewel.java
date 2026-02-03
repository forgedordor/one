package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewel extends evsn implements evui {
    public static final ewel a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public long f;

    static {
        ewel ewelVar = new ewel();
        a = ewelVar;
        evsn.registerDefaultInstance(ewel.class, ewelVar);
    }

    private ewel() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဃ\u0002\u0004ဃ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ewel();
        }
        if (iOrdinal == 4) {
            return new ewek();
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
        synchronized (ewel.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
