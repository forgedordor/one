package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyl extends evsn implements evui {
    public static final ckyl a;
    private static volatile evuo i;
    public int b;
    public ezgd f;
    public long g;
    public String c = "";
    public String d = "";
    public String e = "";
    public String h = "";

    static {
        ckyl ckylVar = new ckyl();
        a = ckylVar;
        evsn.registerDefaultInstance(ckyl.class, ckylVar);
    }

    private ckyl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u0002\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ckyl();
        }
        if (iOrdinal == 4) {
            return new ckyk();
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
        synchronized (ckyl.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
