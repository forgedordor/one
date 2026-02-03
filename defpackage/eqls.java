package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqls extends evsn implements evui {
    public static final eqls a;
    private static volatile evuo h;
    public int b;
    public eqny c;
    public evvp d;
    public String e;
    public String f;
    public boolean g;
    private int i;

    static {
        eqls eqlsVar = new eqls();
        a = eqlsVar;
        evsn.registerDefaultInstance(eqls.class, eqlsVar);
    }

    private eqls() {
        emptyIntList();
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0000\u0000\u0001ဉ\u0001\u0006\u0004\u0007Ȉ\bȈ\u000b\u0007ϧဉ\u0000", new Object[]{"b", "d", "i", "e", "f", "g", "c"});
        }
        if (iOrdinal == 3) {
            return new eqls();
        }
        if (iOrdinal == 4) {
            return new eqlr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqls.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
