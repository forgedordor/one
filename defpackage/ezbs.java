package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezbs extends evsn implements evui {
    public static final ezbs a;
    private static volatile evuo i;
    public int b;
    public ezbq c;
    public int d;
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        ezbs ezbsVar = new ezbs();
        a = ezbsVar;
        evsn.registerDefaultInstance(ezbs.class, ezbsVar);
    }

    private ezbs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\n\f\u000bȈ\fȈ\rȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ezbs();
        }
        if (iOrdinal == 4) {
            return new ezbr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezbs.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
