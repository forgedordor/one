package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emff extends evsn implements evui {
    public static final emff a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public emeu g;
    public int h;
    public elzz i;
    public enpl j;

    static {
        emff emffVar = new emff();
        a = emffVar;
        evsn.registerDefaultInstance(emff.class, emffVar);
    }

    private emff() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဉ\u0007\tဉ\b", new Object[]{"b", "c", emfb.a, "d", emfd.a, "e", "f", "g", "h", cjry.a, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new emff();
        }
        if (iOrdinal == 4) {
            return new emfa();
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
        synchronized (emff.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
