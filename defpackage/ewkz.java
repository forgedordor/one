package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewkz extends evsn implements evui {
    public static final ewkz a;
    private static volatile evuo i;
    public int b;
    public int c;
    public ewlf d;
    public int e;
    public int f;
    public int g;
    public String h = "";

    static {
        ewkz ewkzVar = new ewkz();
        a = ewkzVar;
        evsn.registerDefaultInstance(ewkz.class, ewkzVar);
    }

    private ewkz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဈ\u0005", new Object[]{"b", "c", ewkv.a, "d", "e", ewks.a, "f", ewky.a, "g", ewkw.a, "h"});
        }
        if (iOrdinal == 3) {
            return new ewkz();
        }
        if (iOrdinal == 4) {
            return new ewku();
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
        synchronized (ewkz.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
