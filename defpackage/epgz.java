package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgz extends evsn implements evui {
    public static final epgz a;
    private static volatile evuo l;
    public Object c;
    public long d;
    public long e;
    public long f;
    public long h;
    public int i;
    public int b = 0;
    public String g = "";
    public String j = "";
    public String k = "";

    static {
        epgz epgzVar = new epgz();
        a = epgzVar;
        evsn.registerDefaultInstance(epgz.class, epgzVar);
    }

    private epgz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\f\u0007<\u0000\bȈ\t<\u0000\n<\u0000\u000bȈ", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", epgl.class, "j", epgn.class, epgp.class, "k"});
        }
        if (iOrdinal == 3) {
            return new epgz();
        }
        if (iOrdinal == 4) {
            return new epgy();
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
        synchronized (epgz.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
