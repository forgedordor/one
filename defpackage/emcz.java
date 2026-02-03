package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcz extends evsn implements evui {
    public static final emcz a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public long e;
    public double f;
    public int g;
    public boolean h;

    static {
        emcz emczVar = new emcz();
        a = emczVar;
        evsn.registerDefaultInstance(emcz.class, emczVar);
    }

    private emcz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဃ\u0002\u0004က\u0003\u0005᠌\u0004\u0006ဇ\u0005", new Object[]{"b", "c", emcl.a, "d", "e", "f", "g", emeb.a, "h"});
        }
        if (iOrdinal == 3) {
            return new emcz();
        }
        if (iOrdinal == 4) {
            return new emcy();
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
        synchronized (emcz.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
