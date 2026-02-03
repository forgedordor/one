package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvm extends evsn implements evui {
    public static final emvm a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        emvm emvmVar = new emvm();
        a = emvmVar;
        evsn.registerDefaultInstance(emvm.class, emvmVar);
    }

    private emvm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001g\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001e<\u0000f<\u0000g<\u0000", new Object[]{"d", "c", "b", "e", emvk.a, "f", emvu.class, emvi.class, emvs.class});
        }
        if (iOrdinal == 3) {
            return new emvm();
        }
        if (iOrdinal == 4) {
            return new emvj();
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
        synchronized (emvm.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
