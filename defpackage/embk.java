package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class embk extends evsn implements evui {
    public static final embk a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public evtg e = evsn.emptyProtobufList();

    static {
        embk embkVar = new embk();
        a = embkVar;
        evsn.registerDefaultInstance(embk.class, embkVar);
    }

    private embk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001a", new Object[]{"b", "c", aioi.a, "d", aioh.a, "e"});
        }
        if (iOrdinal == 3) {
            return new embk();
        }
        if (iOrdinal == 4) {
            return new embj();
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
        synchronized (embk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
