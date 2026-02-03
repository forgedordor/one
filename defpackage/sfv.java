package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfv extends evsn implements evui {
    public static final sfv a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public int d;
    public sfx e;
    private int g;

    static {
        sfv sfvVar = new sfv();
        a = sfvVar;
        evsn.registerDefaultInstance(sfv.class, sfvVar);
    }

    private sfv() {
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
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"g", "b", "c", "d", sft.a, "e"});
        }
        if (iOrdinal == 3) {
            return new sfv();
        }
        if (iOrdinal == 4) {
            return new sfs();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (sfv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
