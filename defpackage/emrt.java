package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrt extends evsn implements evui {
    public static final emrt a;
    private static volatile evuo j;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public String h = "";
    public int i;

    static {
        emrt emrtVar = new emrt();
        a = emrtVar;
        evsn.registerDefaultInstance(emrt.class, emrtVar);
    }

    private emrt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007᠌\u0006", new Object[]{"b", "c", emrr.a, "d", emrm.a, "e", emrp.a, "f", "g", "h", "i", emro.a});
        }
        if (iOrdinal == 3) {
            return new emrt();
        }
        if (iOrdinal == 4) {
            return new emrl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emrt.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
