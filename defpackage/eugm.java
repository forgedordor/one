package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugm extends evsn implements evui {
    public static final eugm a;
    private static volatile evuo l;
    public int b;
    public int h;
    public int i;
    public float j;
    public evtg c = evsn.emptyProtobufList();
    public evtg d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public evtg g = evsn.emptyProtobufList();
    public evtg k = emptyProtobufList();

    static {
        eugm eugmVar = new eugm();
        a = eugmVar;
        evsn.registerDefaultInstance(eugm.class, eugmVar);
    }

    private eugm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0004\u0000\u0001\u001a\u0003ဈ\u0000\u0004ဈ\u0001\u0005\u001a\u0006င\u0002\u0007င\u0003\b\u001b\tခ\u0004\n\u001b", new Object[]{"b", "c", "e", "f", "g", "h", "i", "d", exik.class, "j", "k", exif.class});
        }
        if (iOrdinal == 3) {
            return new eugm();
        }
        if (iOrdinal == 4) {
            return new eugl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eugm.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
