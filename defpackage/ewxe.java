package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewxe extends evsn implements evui {
    public static final ewxe a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;

    static {
        ewxe ewxeVar = new ewxe();
        a = ewxeVar;
        evsn.registerDefaultInstance(ewxe.class, ewxeVar);
    }

    private ewxe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", ewxb.a, "d", ewxa.a, "e", ewxd.a, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ewxe();
        }
        if (iOrdinal == 4) {
            return new ewxc();
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
        synchronized (ewxe.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
