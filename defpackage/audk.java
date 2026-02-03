package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audk extends evsn implements evui {
    public static final evsy a = new audi();
    public static final audk b;
    private static volatile evuo q;
    public int c;
    public awso e;
    public aubq f;
    public auet i;
    public audo j;
    public audw k;
    public aucv l;
    public aubq m;
    public aueb n;
    public auid o;
    public audg p;
    public String d = "";
    public evsx g = emptyIntList();
    public evtg h = emptyProtobufList();

    static {
        audk audkVar = new audk();
        b = audkVar;
        evsn.registerDefaultInstance(audk.class, audkVar);
    }

    private audk() {
    }

    public final void a() {
        evsx evsxVar = this.g;
        if (evsxVar.c()) {
            return;
        }
        this.g = evsn.mutableCopy(evsxVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဉ\u0003\u0003ࠞ\u0004\u001b\u0005ဉ\u0004\u0006ဉ\u0007\u0007ဉ\b\bဉ\t\tဉ\u0005\u000bဉ\n\fဉ\u000b\rဉ\u0002\u000eဉ\u0006", new Object[]{"c", "d", "f", "g", auco.a, "h", auek.class, "i", "l", "m", "n", "j", "o", "p", "e", "k"});
        }
        if (iOrdinal == 3) {
            return new audk();
        }
        if (iOrdinal == 4) {
            return new audj();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = q;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (audk.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}
