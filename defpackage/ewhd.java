package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewhd extends evsn implements evui {
    public static final ewhd a;
    private static volatile evuo f;
    public int b;
    public evsx c;
    public int d;
    public int e;

    static {
        ewhd ewhdVar = new ewhd();
        a = ewhdVar;
        evsn.registerDefaultInstance(ewhd.class, ewhdVar);
    }

    private ewhd() {
        evsn.emptyProtobufList();
        this.c = emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002᠌\u0000\u0003᠌\u0001\u0004ࠞ", new Object[]{"b", "d", ewhc.a, "e", ewhb.a, "c", ewgo.a});
        }
        if (iOrdinal == 3) {
            return new ewhd();
        }
        if (iOrdinal == 4) {
            return new ewha();
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
        synchronized (ewhd.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
