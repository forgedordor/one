package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugb extends evsn implements evui {
    public static final eugb a;
    private static volatile evuo n;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        eugb eugbVar = new eugb();
        a = eugbVar;
        evsn.registerDefaultInstance(eugb.class, eugbVar);
    }

    private eugb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\t\bဈ\n\tဈ\u0001\nဈ\u0007\u000bဈ\b", new Object[]{"b", "c", "e", "f", "g", "h", "i", "l", "m", "d", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new eugb();
        }
        if (iOrdinal == 4) {
            return new euga();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eugb.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
