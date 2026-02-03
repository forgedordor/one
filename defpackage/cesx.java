package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesx extends evsn implements evui {
    public static final cesx a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public evqs d = evqs.b;
    public long e;
    public cetq f;
    public cetq g;
    public long h;

    static {
        cesx cesxVar = new cesx();
        a = cesxVar;
        evsn.registerDefaultInstance(cesx.class, cesxVar);
    }

    private cesx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cesx();
        }
        if (iOrdinal == 4) {
            return new cesw();
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
        synchronized (cesx.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
