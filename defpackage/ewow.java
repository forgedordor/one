package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewow extends evsn implements evui {
    public static final ewow a;
    private static volatile evuo h;
    public int b;
    public evtg c = emptyProtobufList();
    public ewpg d;
    public evvp e;
    public evvp f;
    public int g;

    static {
        ewow ewowVar = new ewow();
        a = ewowVar;
        evsn.registerDefaultInstance(ewow.class, ewowVar);
    }

    private ewow() {
    }

    public final void a() {
        evtg evtgVar = this.c;
        if (evtgVar.c()) {
            return;
        }
        this.c = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005᠌\u0003", new Object[]{"b", "c", ewpu.class, "d", "e", "f", "g", ewov.a});
        }
        if (iOrdinal == 3) {
            return new ewow();
        }
        if (iOrdinal == 4) {
            return new ewou();
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
        synchronized (ewow.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
