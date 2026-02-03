package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdh extends evsn implements evui {
    public static final etdh a;
    private static volatile evuo k;
    public int b;
    public String c = "";
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        etdh etdhVar = new etdh();
        a = etdhVar;
        evsn.registerDefaultInstance(etdh.class, etdhVar);
    }

    private etdh() {
        emptyProtobufList();
        this.d = true;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\n\b\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new etdh();
        }
        if (iOrdinal == 4) {
            return new etdg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etdh.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
