package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejih extends evsn implements evui {
    public static final ejih a;
    private static volatile evuo k;
    public int b;
    public ejha c;
    public int f;
    public ejij h;
    public int i;
    public boolean j;
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();
    public int g = 1;

    static {
        ejih ejihVar = new ejih();
        a = ejihVar;
        evsn.registerDefaultInstance(ejih.class, ejihVar);
    }

    private ejih() {
    }

    public final void a() {
        evtg evtgVar = this.e;
        if (evtgVar.c()) {
            return;
        }
        this.e = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001\u0005᠌\u0002\u0006ဉ\u0003\bင\u0005\tဇ\u0006", new Object[]{"b", "c", "d", ejie.class, "e", ejig.class, "f", "g", ejik.a, "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ejih();
        }
        if (iOrdinal == 4) {
            return new ejic();
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
        synchronized (ejih.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
