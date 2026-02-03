package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbs extends evsi<egbs, egbr> implements evsj {
    public static final egbs a;
    private static volatile evuo l;
    public int b;
    public boolean i;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        egbs egbsVar = new egbs();
        a = egbsVar;
        evsn.registerDefaultInstance(egbs.class, egbsVar);
    }

    private egbs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b\bဈ\u0002\tဈ\u0003", new Object[]{"b", "c", "d", "g", "h", "i", "j", "k", "e", "f"});
            case 3:
                return new egbs();
            case 4:
                return new egbr();
            case 5:
                return a;
            case 6:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (egbs.class) {
                    evsgVar = l;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        l = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
