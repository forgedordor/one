package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enfc extends evsn implements evui {
    public static final enfc a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        enfc enfcVar = new enfc();
        a = enfcVar;
        evsn.registerDefaultInstance(enfc.class, enfcVar);
    }

    private enfc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002ဈ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", endy.class, "e", enee.class, endy.class, eneb.class, eneg.class, enei.class, enek.class, enfs.class, eneq.class, enem.class, enev.class, enff.class, enfa.class, enfq.class});
        }
        if (iOrdinal == 3) {
            return new enfc();
        }
        if (iOrdinal == 4) {
            return new enfb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enfc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
