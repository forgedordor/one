package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exag extends evsn implements evui {
    public static final exag a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        exag exagVar = new exag();
        a = exagVar;
        evsn.registerDefaultInstance(exag.class, exagVar);
    }

    private exag() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bለ\u0001", new Object[]{"d", "c", "b", "e", exao.class, exai.class, exak.class, exam.class, exae.class, exaq.class, "f"});
        }
        if (iOrdinal == 3) {
            return new exag();
        }
        if (iOrdinal == 4) {
            return new exaf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exag.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
