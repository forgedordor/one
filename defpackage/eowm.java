package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowm extends evsn implements evui {
    private static volatile evuo G;
    public static final eowm a;
    public boolean A;
    public epqd B;
    public epew C;
    public eozo D;
    public epqh F;
    public int b;
    public eowl e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;
    public int k;
    public boolean l;
    public boolean m;
    public int p;
    public epep q;
    public int t;
    public boolean u;
    public epeg v;
    public boolean w;
    public epdq x;
    public long y;
    public boolean z;
    public String c = "";
    public String d = "";
    public String j = "";
    public String n = "";
    public String o = "";
    public evtg r = emptyProtobufList();
    public evtg s = evsn.emptyProtobufList();
    public String E = "";

    static {
        eowm eowmVar = new eowm();
        a = eowmVar;
        evsn.registerDefaultInstance(eowm.class, eowmVar);
    }

    private eowm() {
    }

    public final void a() {
        evtg evtgVar = this.s;
        if (evtgVar.c()) {
            return;
        }
        this.s = evsn.mutableCopy(evtgVar);
    }

    public final void b() {
        evtg evtgVar = this.r;
        if (evtgVar.c()) {
            return;
        }
        this.r = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u001e\u0000\u0001\u0001#\u001e\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0004ဉ\u0000\u0005\u0002\u0006\u0004\u0007\u0007\n\u0007\u000bȈ\f\f\r\u0007\u000e\u0007\u000fȈ\u0011Ȉ\u0012\f\u0013ဉ\u0002\u0014\u001b\u0015Ț\u0016\f\u0018\u0007\u0019ဉ\u0003\u001a\u0007\u001bဉ\u0004\u001c\u0002\u001d\u0007\u001e\u0007\u001fဉ\u0005 ဉ\u0006!ဉ\u0007\"Ȉ#ဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", epcj.class, "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F"});
        }
        if (iOrdinal == 3) {
            return new eowm();
        }
        if (iOrdinal == 4) {
            return new eowi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = G;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eowm.class) {
            evsgVar = G;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                G = evsgVar;
            }
        }
        return evsgVar;
    }
}
