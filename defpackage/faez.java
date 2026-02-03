package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faez extends evsn implements evui {
    public static final faez a;
    private static volatile evuo i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        faez faezVar = new faez();
        a = faezVar;
        evsn.registerDefaultInstance(faez.class, faezVar);
    }

    private faez() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0007\u0004\u0002\u0005\u0004\u0006\u0004\u0007\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new faez();
        }
        if (iOrdinal == 4) {
            return new faey();
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
        synchronized (faez.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
