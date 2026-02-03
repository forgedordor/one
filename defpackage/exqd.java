package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exqd extends evsn implements evui {
    public static final exqd a;
    private static volatile evuo l;
    public int b;
    public Object d;
    public int e;
    public int i;
    public boolean j;
    public exqb k;
    public int c = 0;
    public String f = "";
    public String g = "";
    public evtg h = emptyProtobufList();

    static {
        exqd exqdVar = new exqd();
        a = exqdVar;
        evsn.registerDefaultInstance(exqd.class, exqdVar);
    }

    private exqd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b\u000bဉ\u0000", new Object[]{"d", "c", "b", "e", "f", "i", exqz.class, expm.class, exqi.class, expo.class, "j", "g", "h", exre.class, "k"});
        }
        if (iOrdinal == 3) {
            return new exqd();
        }
        if (iOrdinal == 4) {
            return new expz();
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
        synchronized (exqd.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
