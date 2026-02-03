package defpackage;

import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlj extends evsn implements evui {
    public static final ezlj a;
    private static volatile evuo s;
    public int b;
    public Object d;
    public ezog e;
    public evqs g;
    public String h;
    public ezpb i;
    public String j;
    public evsx k;
    public ezuu l;
    public eznz m;
    public evqs n;
    public ezoc o;
    public TachyonCommon$PublicPreKeySets p;
    public String q;
    public String r;
    public int c = 0;
    public String f = "";

    static {
        ezlj ezljVar = new ezlj();
        a = ezljVar;
        evsn.registerDefaultInstance(ezlj.class, ezljVar);
    }

    private ezlj() {
        evqs evqsVar = evqs.b;
        this.g = evqsVar;
        this.h = "";
        this.j = "";
        this.k = emptyIntList();
        this.n = evqsVar;
        this.q = "";
        this.r = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0010\u0001\u0001\u0001$\u0010\u0000\u0001\u0000\u0001ဉ\u0000\u0003Ȉ\u0004\n\u0005Ȉ\u0006ဉ\u0002\u0007Ȼ\u0000\bȈ\t'\u0010ဉ\u0007\u001cဉ\n\u001eဉ\u0003\u001fဉ\u0004!Ȉ\"Ȉ#Ȼ\u0000$ည\u0005", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "o", "p", "l", "m", "q", "r", "n"});
        }
        if (iOrdinal == 3) {
            return new ezlj();
        }
        if (iOrdinal == 4) {
            return new ezli();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezlj.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
