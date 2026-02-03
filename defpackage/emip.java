package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emip extends evsn implements evui {
    public static final emip a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int f;
    public double h;
    public evtg d = evsn.emptyProtobufList();
    public String e = "";
    public String g = "";

    static {
        emip emipVar = new emip();
        a = emipVar;
        evsn.registerDefaultInstance(emip.class, emipVar);
    }

    private emip() {
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u000b\u0006\u0000\u0001\u0000\u0003\u001a\u0005ဈ\u0004\u0006᠌\u0005\tဈ\b\n᠌\u0001\u000bက\t", new Object[]{"b", "d", "e", "f", ezak.a, "g", "c", ezam.a, "h"});
        }
        if (iOrdinal == 3) {
            return new emip();
        }
        if (iOrdinal == 4) {
            return new emio();
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
        synchronized (emip.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
