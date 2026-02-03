package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedt extends evsn implements evui {
    public static final fedt a;
    public static final evsl b;
    private static volatile evuo j;
    public int c;
    public boolean d;
    public boolean e;
    public fedy f;
    public int g;
    public String h = "";
    public evtg i = emptyProtobufList();

    static {
        fedt fedtVar = new fedt();
        a = fedtVar;
        evsn.registerDefaultInstance(fedt.class, fedtVar);
        b = evsn.newSingularGeneratedExtension(feeg.a, fedtVar, fedtVar, null, 11, evwh.MESSAGE, fedt.class);
    }

    private fedt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0004\n\u0006\u0000\u0001\u0000\u0004ဇ\u0003\u0006ဉ\u0006\u0007ဇ\u0005\b᠌\u0007\tဈ\b\n\u001b", new Object[]{"c", "d", "f", "e", "g", fedr.a, "h", "i", feeb.class});
        }
        if (iOrdinal == 3) {
            return new fedt();
        }
        if (iOrdinal == 4) {
            return new fedq();
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
        synchronized (fedt.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
