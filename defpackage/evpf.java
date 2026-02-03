package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpf extends evsn implements evui {
    public static final evpf a;
    public static final evsl b;
    private static volatile evuo c;

    static {
        evpf evpfVar = new evpf();
        a = evpfVar;
        evsn.registerDefaultInstance(evpf.class, evpfVar);
        evpt evptVar = evpt.a;
        evpn evpnVar = evpn.a;
        b = evsn.newSingularGeneratedExtension(evptVar, evpnVar, evpnVar, null, 7, evwh.MESSAGE, evpn.class);
    }

    private evpf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new evpf();
        }
        if (iOrdinal == 4) {
            return new evpe();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evpf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
