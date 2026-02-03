package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewae extends evsn implements evui {
    public static final ewae a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ewae ewaeVar = new ewae();
        a = ewaeVar;
        evsn.registerDefaultInstance(ewae.class, ewaeVar);
    }

    private ewae() {
    }

    public static /* synthetic */ void a(ewae ewaeVar) {
        ewaeVar.c = 4;
        ewaeVar.d = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004:\u0000\u0005ဈ\u0000\u0006<\u0000", new Object[]{"d", "c", "b", evzz.class, ewad.class, "e", ewab.class});
        }
        if (iOrdinal == 3) {
            return new ewae();
        }
        if (iOrdinal == 4) {
            return new evzx();
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
        synchronized (ewae.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
