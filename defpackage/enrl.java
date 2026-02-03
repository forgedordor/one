package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enrl extends evsn implements evui {
    public static final evsy a = new enrj();
    public static final enrl b;
    private static volatile evuo f;
    public int c;
    public int d;
    public evsx e = emptyIntList();

    static {
        enrl enrlVar = new enrl();
        b = enrlVar;
        evsn.registerDefaultInstance(enrl.class, enrlVar);
    }

    private enrl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002᠌\u0000\u0003ࠬ", new Object[]{"c", "d", eahl.a, "e", eaic.a});
        }
        if (iOrdinal == 3) {
            return new enrl();
        }
        if (iOrdinal == 4) {
            return new enrk();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enrl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
