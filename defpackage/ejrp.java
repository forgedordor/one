package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrp extends evsn implements evui {
    public static final ejrp a;
    private static volatile evuo i;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();
    public int e;
    public String f;
    public ejrj g;
    public evtg h;
    private int j;

    static {
        ejrp ejrpVar = new ejrp();
        a = ejrpVar;
        evsn.registerDefaultInstance(ejrp.class, ejrpVar);
    }

    private ejrp() {
        emptyIntList();
        this.f = "";
        this.h = emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0004\u0019\u0007\u0000\u0002\u0000\u0004\u000b\u0005\f\n\f\u000bဉ\u0001\f\u001b\u0010\u001b\u0019Ȉ", new Object[]{"j", "b", "c", "e", "g", "h", ejsi.class, "d", ejrn.class, "f"});
        }
        if (iOrdinal == 3) {
            return new ejrp();
        }
        if (iOrdinal == 4) {
            return new ejrh();
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
        synchronized (ejrp.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
