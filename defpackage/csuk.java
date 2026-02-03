package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuk extends evsn implements evui {
    public static final csuk a;
    private static volatile evuo g;
    public long c;
    public int f;
    public evtg b = emptyProtobufList();
    public evqs d = evqs.b;
    public String e = "";

    static {
        csuk csukVar = new csuk();
        a = csukVar;
        evsn.registerDefaultInstance(csuk.class, csukVar);
    }

    private csuk() {
    }

    public final void a() {
        evtg evtgVar = this.b;
        if (evtgVar.c()) {
            return;
        }
        this.b = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003\n\u0004Ȉ\u0005\f", new Object[]{"b", csvg.class, "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new csuk();
        }
        if (iOrdinal == 4) {
            return new csui();
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
        synchronized (csuk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
