package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgva extends evsn implements evui {
    public static final cgva a;
    private static volatile evuo h;
    public int b;
    public aubq c;
    public aubq d;
    public boolean e;
    public cidi f;
    public awky g;

    static {
        cgva cgvaVar = new cgva();
        a = cgvaVar;
        evsn.registerDefaultInstance(cgva.class, cgvaVar);
    }

    private cgva() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007\u0006ဉ\u0003", new Object[]{"b", "f", "c", "d", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new cgva();
        }
        if (iOrdinal == 4) {
            return new cguz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cgva.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
