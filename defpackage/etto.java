package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etto extends evsn implements evui {
    public static final etto a;
    private static volatile evuo i;
    public long f;
    public boolean g;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String h = "";

    static {
        etto ettoVar = new etto();
        a = ettoVar;
        evsn.registerDefaultInstance(etto.class, ettoVar);
    }

    private etto() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\u0007\u0007Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new etto();
        }
        if (iOrdinal == 4) {
            return new ettn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etto.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
