package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewir extends evsn implements evui {
    public static final ewir a;
    private static volatile evuo g;
    public evsx b;
    public evsx c;
    public evsx d;
    public evsx e;
    public evsx f;

    static {
        ewir ewirVar = new ewir();
        a = ewirVar;
        evsn.registerDefaultInstance(ewir.class, ewirVar);
    }

    private ewir() {
        evsn.emptyProtobufList();
        this.b = emptyIntList();
        evsn.emptyProtobufList();
        this.c = emptyIntList();
        evsn.emptyProtobufList();
        this.d = emptyIntList();
        this.e = emptyIntList();
        this.f = emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = ewgo.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0000\u0004\b\u0005\u0000\u0005\u0000\u0004ࠞ\u0005ࠞ\u0006ࠞ\u0007ࠞ\bࠞ", new Object[]{"b", evsvVar, "c", evsvVar, "d", evsvVar, "e", evsvVar, "f", evsvVar});
        }
        if (iOrdinal == 3) {
            return new ewir();
        }
        if (iOrdinal == 4) {
            return new ewiq();
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
        synchronized (ewir.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
