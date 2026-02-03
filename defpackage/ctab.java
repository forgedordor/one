package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctab extends evsn implements evui {
    public static final ctab a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public evrj h;

    static {
        ctab ctabVar = new ctab();
        a = ctabVar;
        evsn.registerDefaultInstance(ctab.class, ctabVar);
    }

    private ctab() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ctab();
        }
        if (iOrdinal == 4) {
            return new ctaa();
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
        synchronized (ctab.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
