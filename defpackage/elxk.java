package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxk extends evsn implements evui {
    public static final elxk a;
    private static volatile evuo l;
    public int b;
    public int c;
    public int e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public String d = "";
    public String k = "";

    static {
        elxk elxkVar = new elxk();
        a = elxkVar;
        evsn.registerDefaultInstance(elxk.class, elxkVar);
    }

    private elxk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b", new Object[]{"b", "c", elxj.a, "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new elxk();
        }
        if (iOrdinal == 4) {
            return new elxi();
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
        synchronized (elxk.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
