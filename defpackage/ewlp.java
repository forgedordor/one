package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewlp extends evsn implements evui {
    public static final ewlp a;
    private static volatile evuo g;
    public int b;
    public int c;
    public String d;
    public evub e;
    public evub f;

    static {
        ewlp ewlpVar = new ewlp();
        a = ewlpVar;
        evsn.registerDefaultInstance(ewlp.class, ewlpVar);
    }

    private ewlp() {
        evub evubVar = evub.a;
        this.e = evubVar;
        this.f = evubVar;
        this.d = "";
    }

    public final evub a() {
        evub evubVar = this.f;
        if (!evubVar.b) {
            this.f = evubVar.a();
        }
        return this.f;
    }

    public final evub b() {
        evub evubVar = this.e;
        if (!evubVar.b) {
            this.e = evubVar.a();
        }
        return this.e;
    }

    public final boolean c(String str) {
        return this.f.containsKey(str);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0002\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u00032\u00042", new Object[]{"b", "c", ewlk.a, "d", "e", ewlo.a, "f", ewlj.a});
        }
        if (iOrdinal == 3) {
            return new ewlp();
        }
        if (iOrdinal == 4) {
            return new ewlg();
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
        synchronized (ewlp.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
