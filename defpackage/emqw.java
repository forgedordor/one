package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqw extends evsn implements evui {
    public static final emqw a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        emqw emqwVar = new emqw();
        a = emqwVar;
        evsn.registerDefaultInstance(emqw.class, emqwVar);
    }

    private emqw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", emrc.a, emrb.class, emqy.class});
        }
        if (iOrdinal == 3) {
            return new emqw();
        }
        if (iOrdinal == 4) {
            return new emqv();
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
        synchronized (emqw.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
