package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.PrintWriter;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgcs implements dfyx {
    private static final dfny d = dfod.a(169805025);
    private static final dfny e = dfod.a(176892952);
    private static final dfny f = dfod.a(187751924);
    public final dhip a;
    final dgfi b;
    dgfg c;

    @Deprecated
    private final dgit g;
    private final dgim h;

    @Deprecated
    private final fcsu i;
    private final eosc j;
    private final dgfn l;
    private dgfl m;
    private int k = -1;
    private final dfyl n = new dgcr(this);

    public dgcs(dgit dgitVar, dgim dgimVar, fcsu fcsuVar, dgfi dgfiVar, dgfn dgfnVar, eosc eoscVar, dhip dhipVar) {
        this.g = dgitVar;
        this.h = dgimVar;
        this.i = fcsuVar;
        this.b = dgfiVar;
        this.l = dgfnVar;
        this.j = eoscVar;
        this.a = dhipVar;
    }

    @Override // defpackage.dfyx
    public final dfyl a() {
        return this.n;
    }

    @Override // defpackage.dfyx
    public final synchronized dfyu b() {
        dgfg dgfgVar = this.c;
        if (Objects.isNull(dgfgVar)) {
            return null;
        }
        return dgfgVar.w;
    }

    @Override // defpackage.dfyx
    public final Optional c() {
        Optional optionalEmpty;
        dgfg dgfgVar = this.c;
        if (dgfgVar == null) {
            return Optional.empty();
        }
        dfzs dfzsVar = dgfgVar.B;
        if (dfzsVar == null || !dgfgVar.l) {
            optionalEmpty = Optional.empty();
        } else {
            try {
                optionalEmpty = Optional.of(dfyt.d(((dfzw) dgfgVar.s.b()).c.c, dfzsVar.a(), true));
            } catch (IllegalStateException unused) {
                dhja.h(dgfgVar.m, "RegistrationContext is not found.", new Object[0]);
                optionalEmpty = Optional.empty();
            }
        }
        return optionalEmpty.isEmpty() ? Optional.ofNullable(b()).map(new Function() { // from class: dfyv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dfyu dfyuVar = (dfyu) obj;
                return dfyt.d(dfyuVar.e.a, dfyuVar.g, false);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }) : optionalEmpty;
    }

    @Override // defpackage.dfyx
    public final String d() {
        dgfg dgfgVar = this.c;
        if (!Objects.isNull(dgfgVar)) {
            String str = dgfgVar.y;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return (dfog.J() ? this.h.a.m() : this.g.a).w();
    }

    @Override // defpackage.dfyx
    public final synchronized void e() {
        dgfg dgfgVar = this.c;
        dhja.l(this.a, "Destroying RegistrationEngine.", new Object[0]);
        if (Objects.isNull(dgfgVar)) {
            return;
        }
        dgfgVar.B(dezf.SHUTDOWN);
        dgfgVar.m();
        this.c = null;
    }

    @Override // defpackage.dfyx
    public final void f(PrintWriter printWriter) {
        dhip dhipVar = this.a;
        dgfg dgfgVar = this.c;
        printWriter.println("    - RegistrationEngine: ".concat(String.valueOf(String.valueOf(dhipVar))));
        if (Objects.isNull(dgfgVar)) {
            return;
        }
        printWriter.println("     - RegistrationStateMachine ".concat(String.valueOf(String.valueOf(dgfgVar.m))));
        dgdq dgdqVar = (dgdq) dgfgVar.d();
        printWriter.println("       state: ".concat(dgdqVar != null ? dgdqVar.a() : "UnknownState"));
        printWriter.println("       expirePeriod: " + dgfgVar.F + "s");
        if (dgfgVar.ak.equals(dgfgVar.d())) {
            printWriter.println("       next retry in " + (dgfgVar.H - dhkl.a().longValue()) + "ms");
            printWriter.println("       retryDelayCalculator: ".concat(String.valueOf(String.valueOf(dgfgVar.G))));
        }
        printWriter.println("       publicIdentity: ".concat(String.valueOf(dhiz.URI_SIP.c(dgfgVar.y))));
        printWriter.println("       P-CSCF: ".concat(dgfgVar.I.q()));
        printWriter.println("       ConfigVersion: " + dgfgVar.J);
        printWriter.println("       useNetworkCallback: " + dgfgVar.l);
        dgfs dgfsVar = dgfgVar.L;
        printWriter.println("    - Keep Alive Manager -");
        printWriter.println("      mKeepAlivePeriod: " + dgfsVar.d);
        printWriter.println("      mLastKeepAlive: " + dgfsVar.f);
        printWriter.println("      Keep alive scheduled: " + dgfsVar.a.e());
    }

    @Override // defpackage.dfyx
    public final void g(dezf dezfVar) {
        if (dezfVar == dezf.DISABLED || dezfVar == dezf.SHUTDOWN || dezfVar == dezf.CANCELED) {
            dhja.r(this.a, "Unexpected reason for restarting. reason=%s", dezfVar);
            return;
        }
        dhja.l(this.a, "RegistrationEngineStateMachine restarts after deregistration. reason=%s", dezfVar);
        int i = this.k;
        j(dezfVar);
        i(i);
    }

    @Override // defpackage.dfyx
    public final /* synthetic */ void h(dezf dezfVar, int i) {
        g(dezfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03d3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: all -> 0x03d5, TryCatch #1 {, blocks: (B:4:0x0005, B:36:0x00bd, B:38:0x00c5, B:39:0x00cc, B:41:0x00d2, B:43:0x00e5, B:44:0x00ef, B:46:0x00fe, B:48:0x010b, B:50:0x0112, B:52:0x011b, B:57:0x0130, B:63:0x02f5, B:65:0x02fb, B:69:0x0306, B:71:0x030e, B:74:0x0329, B:76:0x035a, B:84:0x0376, B:86:0x037e, B:88:0x0384, B:89:0x038c, B:83:0x036c, B:75:0x0338, B:92:0x0394, B:94:0x039a, B:96:0x03a8, B:98:0x03ae, B:101:0x03b9, B:58:0x013c, B:60:0x01fd, B:62:0x020c, B:61:0x0206, B:55:0x012b, B:51:0x0117, B:47:0x0107, B:7:0x001b, B:9:0x001f, B:10:0x0034, B:12:0x0042, B:14:0x0048, B:16:0x0051, B:18:0x0055, B:15:0x004d, B:19:0x0069, B:21:0x006f, B:23:0x007c, B:25:0x0084, B:26:0x008c, B:28:0x0092, B:30:0x00a1, B:35:0x00b4, B:29:0x009b, B:22:0x0078), top: B:109:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039a A[Catch: all -> 0x03d5, TryCatch #1 {, blocks: (B:4:0x0005, B:36:0x00bd, B:38:0x00c5, B:39:0x00cc, B:41:0x00d2, B:43:0x00e5, B:44:0x00ef, B:46:0x00fe, B:48:0x010b, B:50:0x0112, B:52:0x011b, B:57:0x0130, B:63:0x02f5, B:65:0x02fb, B:69:0x0306, B:71:0x030e, B:74:0x0329, B:76:0x035a, B:84:0x0376, B:86:0x037e, B:88:0x0384, B:89:0x038c, B:83:0x036c, B:75:0x0338, B:92:0x0394, B:94:0x039a, B:96:0x03a8, B:98:0x03ae, B:101:0x03b9, B:58:0x013c, B:60:0x01fd, B:62:0x020c, B:61:0x0206, B:55:0x012b, B:51:0x0117, B:47:0x0107, B:7:0x001b, B:9:0x001f, B:10:0x0034, B:12:0x0042, B:14:0x0048, B:16:0x0051, B:18:0x0055, B:15:0x004d, B:19:0x0069, B:21:0x006f, B:23:0x007c, B:25:0x0084, B:26:0x008c, B:28:0x0092, B:30:0x00a1, B:35:0x00b4, B:29:0x009b, B:22:0x0078), top: B:109:0x0005 }] */
    @Override // defpackage.dfyx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i(int r34) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgcs.i(int):void");
    }

    @Override // defpackage.dfyx
    public final synchronized void j(dezf dezfVar) {
        dhja.l(this.a, "Unregistering from IMS network. reason=%s", dezfVar);
        dgfg dgfgVar = this.c;
        if (Objects.isNull(dgfgVar)) {
            return;
        }
        dgfgVar.B(dezfVar);
    }

    @Override // defpackage.dfyx
    public final boolean k() {
        dgfg dgfgVar = this.c;
        if (Objects.isNull(dgfgVar)) {
            return false;
        }
        if (l()) {
            return true;
        }
        dfmy dfmyVarD = dgfgVar.d();
        return (dfmyVarD == null || dfmyVarD.equals(dgfgVar.W) || dfmyVarD.equals(dgfgVar.ai) || dfmyVarD.equals(dgfgVar.al)) ? false : true;
    }

    @Override // defpackage.dfyx
    public final boolean l() {
        dgfg dgfgVar = this.c;
        if (Objects.isNull(dgfgVar)) {
            return false;
        }
        return dgfgVar.P();
    }

    @Override // defpackage.dfyx
    public final boolean m() {
        dgfg dgfgVar = this.c;
        if (Objects.isNull(dgfgVar)) {
            return false;
        }
        return dgfgVar.Q();
    }

    @Override // defpackage.dfyx
    public final boolean n() {
        dfyu dfyuVar;
        dgfg dgfgVar = this.c;
        return (Objects.isNull(dgfgVar) || (dfyuVar = dgfgVar.w) == null || dfyuVar.c() != 1) ? false : true;
    }
}
