package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emby extends evsn implements evui {
    public static final emby a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        emby embyVar = new emby();
        a = embyVar;
        evsn.registerDefaultInstance(emby.class, embyVar);
    }

    private emby() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", embu.class, embs.class});
        }
        if (iOrdinal == 3) {
            return new emby();
        }
        if (iOrdinal == 4) {
            return new embq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emby.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
