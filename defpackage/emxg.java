package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxg extends evsn implements evui {
    public static final emxg a;
    private static volatile evuo i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        emxg emxgVar = new emxg();
        a = emxgVar;
        evsn.registerDefaultInstance(emxg.class, emxgVar);
    }

    private emxg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", elob.a, "e", elkd.a, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new emxg();
        }
        if (iOrdinal == 4) {
            return new emxf();
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
        synchronized (emxg.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
