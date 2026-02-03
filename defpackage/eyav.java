package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyav extends evsn implements evui {
    public static final eyav a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public eyau g;

    static {
        eyav eyavVar = new eyav();
        a = eyavVar;
        evsn.registerDefaultInstance(eyav.class, eyavVar);
    }

    private eyav() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004\f\u0005\f\tဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eyav();
        }
        if (iOrdinal == 4) {
            return new eyas();
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
        synchronized (eyav.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
