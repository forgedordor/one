package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejie extends evsn implements evui {
    public static final ejie a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ejie ejieVar = new ejie();
        a = ejieVar;
        evsn.registerDefaultInstance(ejie.class, ejieVar);
    }

    private ejie() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new ejie();
        }
        if (iOrdinal == 4) {
            return new ejid();
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
        synchronized (ejie.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
