package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dieo extends evsn implements evui {
    public static final dieo a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;
    public dien h;
    private boolean j;

    static {
        dieo dieoVar = new dieo();
        a = dieoVar;
        evsn.registerDefaultInstance(dieo.class, dieoVar);
    }

    private dieo() {
        emptyProtobufList();
        this.f = "";
        this.g = "";
    }

    public static /* synthetic */ void a(dieo dieoVar) {
        dieoVar.b |= 4096;
        dieoVar.j = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0000\u0000\u0001ဈ\u0002\u0004ဂ\u0004\u0005ဂ\u0005\bဇ\f\tဈ\u0007\nဈ\b\u0012ဉ\u000e", new Object[]{"b", "c", "d", "e", "j", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new dieo();
        }
        if (iOrdinal == 4) {
            return new diel();
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
        synchronized (dieo.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
