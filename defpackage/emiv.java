package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emiv extends evsn implements evui {
    public static final emiv a;
    private static volatile evuo f;
    public int b;
    public evtg c = emptyProtobufList();
    public evtg d = emptyProtobufList();
    public int e;

    static {
        emiv emivVar = new emiv();
        a = emivVar;
        evsn.registerDefaultInstance(emiv.class, emivVar);
    }

    private emiv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"b", "c", emhp.class, "d", emjo.class, "e"});
        }
        if (iOrdinal == 3) {
            return new emiv();
        }
        if (iOrdinal == 4) {
            return new emiu();
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
        synchronized (emiv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
