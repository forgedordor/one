package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auip extends evsn implements evui {
    public static final auip a;
    private static volatile evuo i;
    public int b;
    public audu c;
    public aubq f;
    public auib g;
    public String d = "";
    public evqs e = evqs.b;
    public String h = "";

    static {
        auip auipVar = new auip();
        a = auipVar;
        evsn.registerDefaultInstance(auip.class, auipVar);
    }

    private auip() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new auip();
        }
        if (iOrdinal == 4) {
            return new auio();
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
        synchronized (auip.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
