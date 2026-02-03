package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryf extends evsi implements evsj {
    public static final eryf a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        eryf eryfVar = new eryf();
        a = eryfVar;
        evsn.registerDefaultInstance(eryf.class, eryfVar);
    }

    private eryf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new eryf();
            case 4:
                return new erye();
            case 5:
                return a;
            case 6:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eryf.class) {
                    evsgVar = b;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        b = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
