package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epew extends evsn implements evui {
    public static final epew a;
    private static volatile evuo i;
    public int b;
    public epep c;
    public epev d;
    public boolean e;
    public epdq f;
    public String g = "";
    public String h = "";

    static {
        epew epewVar = new epew();
        a = epewVar;
        evsn.registerDefaultInstance(epew.class, epewVar);
    }

    private epew() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0003\t\u0006\u0000\u0000\u0000\u0003ဉ\u0001\u0005ဉ\u0000\u0006\u0007\u0007ဉ\u0002\bȈ\tȈ", new Object[]{"b", "d", "c", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new epew();
        }
        if (iOrdinal == 4) {
            return new epet();
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
        synchronized (epew.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
