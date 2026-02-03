package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feia extends evsn implements evui {
    public static final feia a;
    private static volatile evuo h;
    public evta b = emptyLongList();
    public evta c = emptyLongList();
    public evsx d = emptyIntList();
    public evsx e = emptyIntList();
    public evsx f = emptyIntList();
    public evtg g = evsn.emptyProtobufList();

    static {
        feia feiaVar = new feia();
        a = feiaVar;
        evsn.registerDefaultInstance(feia.class, feiaVar);
    }

    private feia() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new feia();
        }
        if (iOrdinal == 4) {
            return new fehz();
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
        synchronized (feia.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
