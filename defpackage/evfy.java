package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evfy extends evsn implements evui {
    public static final evfy a;
    private static volatile evuo i;
    public int b;
    public evhj d;
    public int e;
    public evfj g;
    public String c = "";
    public evtg f = emptyProtobufList();
    public String h = "";

    static {
        evfy evfyVar = new evfy();
        a = evfyVar;
        evsn.registerDefaultInstance(evfy.class, evfyVar);
    }

    private evfy() {
    }

    public final void a() {
        evtg evtgVar = this.f;
        if (evtgVar.c()) {
            return;
        }
        this.f = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0005᠌\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"b", "c", "d", "f", evfx.class, "e", evjy.a, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new evfy();
        }
        if (iOrdinal == 4) {
            return new evfv();
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
        synchronized (evfy.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
