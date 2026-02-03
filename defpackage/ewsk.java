package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewsk extends evsn implements evui {
    public static final ewsk a;
    private static volatile evuo g;
    public int b;
    public evtg c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public ewsr f;

    static {
        ewsk ewskVar = new ewsk();
        a = ewskVar;
        evsn.registerDefaultInstance(ewsk.class, ewskVar);
    }

    private ewsk() {
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
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"b", "c", ewsi.class, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ewsk();
        }
        if (iOrdinal == 4) {
            return new ewsj();
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
        synchronized (ewsk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
