package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwk extends evsn implements evui {
    public static final emwk a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public evrj e;

    static {
        emwk emwkVar = new emwk();
        a = emwkVar;
        evsn.registerDefaultInstance(emwk.class, emwkVar);
    }

    private emwk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", emwl.a, "d", emwb.a, "e"});
        }
        if (iOrdinal == 3) {
            return new emwk();
        }
        if (iOrdinal == 4) {
            return new emwj();
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
        synchronized (emwk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
