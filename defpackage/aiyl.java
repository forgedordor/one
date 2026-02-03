package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiyl extends evsn implements evui {
    public static final aiyl a;
    private static volatile evuo k;
    public int b;
    public int g;
    public int c = -1;
    public int d = -2;
    public int e = -2;
    public int f = -2;
    public evtg h = emptyProtobufList();
    public int i = -1;
    public int j = -2;

    static {
        aiyl aiylVar = new aiyl();
        a = aiylVar;
        evsn.registerDefaultInstance(aiyl.class, aiylVar);
    }

    private aiyl() {
    }

    public final void a() {
        evtg evtgVar = this.h;
        if (evtgVar.c()) {
            return;
        }
        this.h = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဏ\u0003\u0005᠌\u0004\u0006\u001b\u0007ဏ\u0005\bဏ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", ewdg.a, "h", aiyd.class, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new aiyl();
        }
        if (iOrdinal == 4) {
            return new aiyk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aiyl.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
