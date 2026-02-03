package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxu extends evsn implements evui {
    public static final eyxu a;
    private static volatile evuo h;
    public ezpr b;
    public eyxw c;
    public evtg d = emptyProtobufList();
    public int e;
    public long f;
    public evqs g;
    private int i;

    static {
        eyxu eyxuVar = new eyxu();
        a = eyxuVar;
        evsn.registerDefaultInstance(eyxu.class, eyxuVar);
    }

    private eyxu() {
        emptyProtobufList();
        this.g = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u0003\u0004ဉ\u0002\u0005\u001b\u0006\n", new Object[]{"i", "b", "e", "f", "c", "d", ezol.class, "g"});
        }
        if (iOrdinal == 3) {
            return new eyxu();
        }
        if (iOrdinal == 4) {
            return new eyxt();
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
        synchronized (eyxu.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
