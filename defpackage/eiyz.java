package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyz extends evsn implements evui {
    public static final eiyz a;
    private static volatile evuo f;
    public String b = "";
    public evtg c = emptyProtobufList();
    public int d;
    public int e;
    private int g;

    static {
        eiyz eiyzVar = new eiyz();
        a = eiyzVar;
        evsn.registerDefaultInstance(eiyz.class, eiyzVar);
    }

    private eiyz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u0005ဌ\u0000\u0006ဌ\u0001", new Object[]{"g", "b", "c", eiyv.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eiyz();
        }
        if (iOrdinal == 4) {
            return new eiyt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eiyz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
