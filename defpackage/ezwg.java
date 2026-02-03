package defpackage;

import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezwg extends evsn implements evui {
    public static final ezwg a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public TachyonCommon$PublicPreKeySets d;

    static {
        ezwg ezwgVar = new ezwg();
        a = ezwgVar;
        evsn.registerDefaultInstance(ezwg.class, ezwgVar);
    }

    private ezwg() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezwg();
        }
        if (iOrdinal == 4) {
            return new ezwf();
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
        synchronized (ezwg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
