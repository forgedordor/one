package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auey extends evsn implements evui {
    public static final auey a;
    private static volatile evuo n;
    public int b;
    public String c = "";
    public aucr d;
    public auen e;
    public aucn f;
    public auev g;
    public audr h;
    public auer i;
    public aucx j;
    public audz k;
    public aubq l;
    public audg m;

    static {
        auey aueyVar = new auey();
        a = aueyVar;
        evsn.registerDefaultInstance(auey.class, aueyVar);
    }

    private auey() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0005\u000bဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "h", "m"});
        }
        if (iOrdinal == 3) {
            return new auey();
        }
        if (iOrdinal == 4) {
            return new auex();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auey.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
