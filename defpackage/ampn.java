package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampn extends evsn implements evui {
    public static final ampn a;
    private static volatile evuo i;
    public int b;
    public double c;
    public double d;
    public float e;
    public double f;
    public float g;
    public evvp h;

    static {
        ampn ampnVar = new ampn();
        a = ampnVar;
        evsn.registerDefaultInstance(ampn.class, ampnVar);
    }

    private ampn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0001\u0004က\u0000\u0005ခ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ampn();
        }
        if (iOrdinal == 4) {
            return new ampm();
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
        synchronized (ampn.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
