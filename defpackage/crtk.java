package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtk extends evsn implements evui {
    public static final evsy a = new crth();
    public static final evsy b = new crti();
    public static final crtk c;
    private static volatile evuo h;
    public evtg d = evsn.emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();
    public evsx f = emptyIntList();
    public evsx g = emptyIntList();

    static {
        crtk crtkVar = new crtk();
        c = crtkVar;
        evsn.registerDefaultInstance(crtk.class, crtkVar);
    }

    private crtk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(c, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001Ț\u0002Ț\u0003,\u0004,", new Object[]{"d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new crtk();
        }
        if (iOrdinal == 4) {
            return new crtj();
        }
        if (iOrdinal == 5) {
            return c;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crtk.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(c);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
