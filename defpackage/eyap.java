package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyap extends evsn implements evui {
    public static final eyap a;
    private static volatile evuo h;
    public Object c;
    public int d;
    public int f;
    public int b = 0;
    public String e = "";
    public String g = "";

    static {
        eyap eyapVar = new eyap();
        a = eyapVar;
        evsn.registerDefaultInstance(eyap.class, eyapVar);
    }

    private eyap() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0001\u0000\u0001\u000f\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005\f\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000\u000b<\u0000\f<\u0000\rȈ\u000f<\u0000", new Object[]{"c", "b", "d", "e", eyaa.class, eyam.class, "f", eyao.class, exzx.class, eyai.class, eyac.class, eyae.class, eyag.class, "g", eyak.class});
        }
        if (iOrdinal == 3) {
            return new eyap();
        }
        if (iOrdinal == 4) {
            return new exzy();
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
        synchronized (eyap.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
