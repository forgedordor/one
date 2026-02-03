package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnj extends evsn implements evui {
    public static final etnj a;
    private static volatile evuo i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public int g;
    public int h;

    static {
        etnj etnjVar = new etnj();
        a = etnjVar;
        evsn.registerDefaultInstance(etnj.class, etnjVar);
    }

    private etnj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003\b᠌\u0001\tဇ\u0002\n᠌\u0004\u000b<\u0000", new Object[]{"d", "c", "b", etly.class, etnx.class, etkb.class, etoh.class, etna.class, "g", etnf.a, "e", etnh.a, "f", "h", etnc.a, etma.class});
        }
        if (iOrdinal == 3) {
            return new etnj();
        }
        if (iOrdinal == 4) {
            return new etnb();
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
        synchronized (etnj.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
