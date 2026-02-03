package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbx extends evsn implements evui {
    public static final epbx a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;
    public epbw h;

    static {
        epbx epbxVar = new epbx();
        a = epbxVar;
        evsn.registerDefaultInstance(epbx.class, epbxVar);
    }

    private epbx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new epbx();
        }
        if (iOrdinal == 4) {
            return new epbu();
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
        synchronized (epbx.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
