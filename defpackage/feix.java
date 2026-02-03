package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feix extends evsn implements evui {
    private static volatile evuo C;
    public static final feix a;
    public feeg A;
    public fehi B;
    private fehn D;
    public int b;
    public long c;
    public feep f;
    public feiz g;
    public fefb h;
    public fehu i;
    public feim j;
    public fecu k;
    public feig l;
    public fefo m;
    public fejw n;
    public fegm o;
    public fejg p;
    public fecm q;
    public feiv r;
    public fedn s;
    public fehf t;
    public evtg u;
    public feia v;
    public evtg w;
    public fehl x;
    public feit y;
    public feic z;
    private byte E = 2;
    public String d = "";
    public String e = "";

    static {
        feix feixVar = new feix();
        a = feixVar;
        evsn.registerDefaultInstance(feix.class, feixVar);
    }

    private feix() {
        emptyIntList();
        this.u = emptyProtobufList();
        this.w = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.E);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001(\u001b\u0000\u0002\f\u0001ဉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fᐉ\n\u000eᐉ\u001a\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0013\u001eဉ\u0015\u001fဉ\u0016 ᐉ\u0011!ဉ\u0012#ဉ\r$ᐉ\u000e%Л&\u001b'ဉ\u0014(ᐉ\f", new Object[]{"b", "f", "c", "d", "g", "x", "h", "i", "y", "j", "k", "l", "A", "m", "e", VCardConstants.PARAM_ENCODING_B, "z", "D", "t", "v", "q", "r", "o", "p", "u", feji.class, "w", feii.class, "s", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new feix();
            case NEW_BUILDER:
                return new feiw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = C;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feix.class) {
                    evsgVar = C;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        C = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
