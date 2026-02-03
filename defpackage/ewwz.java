package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewwz extends evsn implements evui {
    public static final ewwz a;
    private static volatile evuo e;
    public int b;
    public evrj c;
    public int d;

    static {
        ewwz ewwzVar = new ewwz();
        a = ewwzVar;
        evsn.registerDefaultInstance(ewwz.class, ewwzVar);
    }

    private ewwz() {
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
            return new ewwz();
        }
        if (iOrdinal == 4) {
            return new ewwy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewwz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
