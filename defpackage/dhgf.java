package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dhgf extends Thread implements ebkz {
    public static final /* synthetic */ int e = 0;
    protected final dgwa d;
    private final fcsu g;
    private ekgb h;
    private Optional i;
    private String j;
    private final BlockingQueue k;
    private final dhjt l;
    private final Object m;
    private final dfcg n;
    private final fcsu o;
    private volatile int p;
    static final dfny a = dfnv.b("accept_messages_to_self_number");
    static final dfny b = dfnv.b("validate_called_party_number");
    static final dfny c = dfnv.b("log_recipient_verify_method");
    private static final dhip f = new dhip("ImsServiceDispatcher");

    public dhgf(dgwa dgwaVar, fcsu fcsuVar, dhjt dhjtVar, dfcg dfcgVar, final epht ephtVar) {
        super("SipDispatcher");
        int i = ekgb.d;
        this.h = ekoe.a;
        this.i = Optional.empty();
        this.k = new LinkedBlockingQueue();
        this.m = new Object();
        this.p = 1;
        this.d = dgwaVar;
        this.g = fcsuVar;
        this.l = dhjtVar;
        this.n = dfcgVar;
        fcsu fcsuVar2 = new fcsu() { // from class: dhgd
            @Override // defpackage.fcsu
            public final Object b() {
                return ephtVar.a();
            }
        };
        this.o = fcsuVar2;
        fcsuVar2.b();
        dhja.d(f, "SIP dispatcher is instantiated", new Object[0]);
    }

    public static Optional c(ebqr ebqrVar) {
        String strJ = ebqrVar.j("P-Called-Party-ID");
        if (strJ == null) {
            return Optional.empty();
        }
        try {
            ebkr ebkrVar = dhjv.a;
            return Optional.of(ebkr.b(strJ).b.c());
        } catch (ebml unused) {
            return Optional.empty();
        }
    }

    private static String j(ebqr ebqrVar) {
        ebos ebosVar = ebqrVar.y().f;
        if (ebosVar != null) {
            ebma ebmaVar = ebosVar.a.b;
            if (ebmaVar.l()) {
                return (String) Optional.ofNullable(((eblx) ebmaVar).a.b()).orElse("");
            }
            if (ebmaVar instanceof ebly) {
                return ((ebly) ebmaVar).b();
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [ephj, java.lang.Object] */
    private final boolean k(String str, String str2, String str3) {
        if (TextUtils.equals(str, str2)) {
            dhja.d(f, "matches with username in configuration.", new Object[0]);
            return true;
        }
        if (((Boolean) a.a()).booleanValue() && TextUtils.equals(str, str3)) {
            dhja.d(f, "matches with self number.", new Object[0]);
            return true;
        }
        try {
            String str4 = "+" + String.valueOf(this.o.b().n(str2, null).a());
            if (!str.startsWith(str4)) {
                return false;
            }
            String strSubstring = str2.substring(str4.length());
            String strSubstring2 = str.substring(str4.length());
            return strSubstring.length() > strSubstring2.length() ? strSubstring.endsWith(strSubstring2) : strSubstring2.endsWith(strSubstring);
        } catch (ephe e2) {
            dhja.j(e2, f, "%s", e2.getMessage());
            return false;
        }
    }

    private final boolean l(ebqr ebqrVar) {
        if (!j(ebqrVar).startsWith("anonymous")) {
            return false;
        }
        dgwa dgwaVar = this.d;
        if (dgwaVar.d(ebqrVar.d()).isPresent()) {
            return true;
        }
        return dgwaVar.c(ebqrVar.d()).isPresent();
    }

    protected abstract void a(ebqr ebqrVar);

    protected abstract void b(ebqr ebqrVar);

    @Override // defpackage.ebkz
    public final void d() {
        if (isAlive()) {
            return;
        }
        start();
    }

    @Override // defpackage.ebkz
    public final void e(List list, String str) {
        this.h = ekgb.n(list);
        this.i = Collection.EL.stream(list).map(new Function() { // from class: dhfx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                int i = dhgf.e;
                try {
                    ebkr ebkrVar = dhjv.a;
                    return ebkr.b(str2).b;
                } catch (ebml unused) {
                    return null;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dhfy
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((ebma) obj);
            }
        }).map(new Function() { // from class: dhfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ebma ebmaVar = (ebma) obj;
                ebkr ebkrVar = dhjv.a;
                if (ebmaVar instanceof eblx) {
                    return ((eblx) ebmaVar).e();
                }
                if (ebmaVar instanceof ebly) {
                    return ((ebly) ebmaVar).b();
                }
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dhga
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) obj;
                int i = dhgf.e;
                return str2 != null && str2.startsWith("+");
            }
        }).findFirst();
        this.j = str;
        dhja.d(f, "selfNumber:%s", dhiz.PHONE_NUMBER.c(this.i));
    }

    @Override // defpackage.ebkz
    public final void f(ebqr ebqrVar) {
        synchronized (this.m) {
            if (!isAlive()) {
                dhja.r(f, "ImsServiceDispatcher is not running, ignore the sip request", new Object[0]);
                return;
            }
            try {
                this.k.put(ebqrVar);
                this.p = 3;
            } catch (InterruptedException e2) {
                dhja.j(e2, f, "error buffering SIP request: %s", e2.getMessage());
            }
        }
    }

    @Override // defpackage.ebkz
    public final void g(ebqs ebqsVar) {
        synchronized (this.m) {
            if (!isAlive()) {
                dhja.r(f, "ImsServiceDispatcher is not running, ignore the sip response", new Object[0]);
                return;
            }
            try {
                this.k.put(ebqsVar);
                this.p = 3;
            } catch (InterruptedException e2) {
                dhja.j(e2, f, "error buffering SIP response: %s", e2.getMessage());
            }
        }
    }

    protected final void h(ebqr ebqrVar) {
        try {
            ((eblg) this.g).a.s(this.l.n(ebqrVar));
        } catch (ebmn e2) {
            dhja.j(e2, f, "sendFinalResponse failed to send %d response", Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
        }
    }

    public final void i(ebqr ebqrVar, int i, int i2) {
        try {
            ((eblg) this.g).a.s(this.l.o(ebqrVar, i, i2));
        } catch (ebmn e2) {
            dhja.j(e2, f, "sendFinalFailureRespons failed to send %d response", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0339 A[Catch: Exception -> 0x05a5, TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04f8 A[Catch: Exception -> 0x05a5, TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0532 A[Catch: Exception -> 0x05a5, TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0537 A[Catch: Exception -> 0x05a5, TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f A[Catch: Exception -> 0x05a5, PHI: r2
      0x017f: PHI (r2v10 boolean) = (r2v9 boolean), (r2v16 boolean) binds: [B:52:0x0160, B:58:0x017d] A[DONT_GENERATE, DONT_INLINE], TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6 A[Catch: Exception -> 0x05a5, TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202 A[Catch: Exception -> 0x05a5, TryCatch #12 {Exception -> 0x05a5, blocks: (B:27:0x007d, B:29:0x0092, B:30:0x009a, B:32:0x00ae, B:35:0x00bd, B:37:0x00ce, B:39:0x00df, B:41:0x00f9, B:43:0x00ff, B:70:0x01f6, B:72:0x0202, B:74:0x020a, B:76:0x0216, B:78:0x021e, B:80:0x023f, B:82:0x0245, B:99:0x02b0, B:98:0x02a1, B:176:0x04f8, B:186:0x0526, B:188:0x0532, B:189:0x0537, B:191:0x0543, B:193:0x0549, B:195:0x0551, B:196:0x0556, B:197:0x0565, B:199:0x0571, B:179:0x0503, B:181:0x0509, B:183:0x0511, B:185:0x0519, B:79:0x0223, B:100:0x02c5, B:102:0x02d5, B:103:0x02fe, B:105:0x0304, B:107:0x0316, B:108:0x031b, B:109:0x0330, B:110:0x0339, B:112:0x0349, B:114:0x035b, B:115:0x0364, B:117:0x0370, B:118:0x038b, B:120:0x0397, B:122:0x03a6, B:123:0x03af, B:128:0x03d9, B:129:0x03dd, B:135:0x03e6, B:127:0x03ca, B:136:0x03e7, B:138:0x03f3, B:142:0x040b, B:146:0x0419, B:149:0x0424, B:151:0x042c, B:152:0x0431, B:154:0x0441, B:156:0x0449, B:157:0x044e, B:159:0x045c, B:161:0x0460, B:162:0x0474, B:163:0x04a4, B:165:0x04aa, B:169:0x04b5, B:170:0x04bf, B:171:0x04c8, B:172:0x04d0, B:173:0x04d7, B:175:0x04e3, B:44:0x011e, B:46:0x0124, B:48:0x0141, B:50:0x014a, B:51:0x0151, B:53:0x0162, B:55:0x016b, B:57:0x0173, B:59:0x017f, B:61:0x019d, B:63:0x01a6, B:64:0x01ac, B:66:0x01b2, B:68:0x01bb, B:69:0x01c2, B:130:0x03de, B:131:0x03e1, B:124:0x03b5, B:166:0x04b0, B:84:0x0257, B:85:0x026c, B:87:0x0272, B:88:0x027c, B:90:0x0284, B:92:0x028c, B:93:0x0290, B:95:0x0296), top: B:265:0x007d, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [ebqq] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhgf.run():void");
    }
}
