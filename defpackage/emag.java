package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emag extends evsn implements evui {
    public static final emag a;
    private static volatile evuo l;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;

    static {
        emag emagVar = new emag();
        a = emagVar;
        evsn.registerDefaultInstance(emag.class, emagVar);
    }

    private emag() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b", new Object[]{"b", "c", emae.a, "d", "e", "f", "g", "h", emad.a, "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new emag();
        }
        if (iOrdinal == 4) {
            return new emac();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emag.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
