package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewct extends evsn implements evui {
    public static final ewct a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        ewct ewctVar = new ewct();
        a = ewctVar;
        evsn.registerDefaultInstance(ewct.class, ewctVar);
    }

    private ewct() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0007\bဈ\u0006", new Object[]{"b", "c", ewcs.a, "d", ewcq.a, "e", "f", "g", "h", "j", "i"});
        }
        if (iOrdinal == 3) {
            return new ewct();
        }
        if (iOrdinal == 4) {
            return new ewcp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewct.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
