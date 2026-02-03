package defpackage;

import android.os.Message;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dges extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dges(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    private final String j(dgis dgisVar) {
        String strO = dgisVar.o();
        dhja.d(this.b.m, "Using URI format: %s", strO);
        return strO;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public String a() {
        return "RegisteringState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        this.b.F(new Runnable() { // from class: dger
            @Override // java.lang.Runnable
            public final void run() {
                dgfg dgfgVar = this.a.b;
                if (dgfgVar.x == null) {
                    dhja.h(dgfgVar.m, "SIP transport is not available", new Object[0]);
                    dgfgVar.w(dgfgVar.Y);
                } else if (!dgfgVar.t.a.v()) {
                    dgfgVar.q(1);
                } else {
                    dhja.h(dgfgVar.m, "SipStack is not available", new Object[0]);
                    dgfgVar.w(dgfgVar.Y);
                }
            }
        });
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void c() {
        super.c();
        this.b.E = 0;
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) throws ebmn {
        String str;
        int iH;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    dgfg dgfgVar = this.b;
                    dhja.h(dgfgVar.m, "Registration timeout.", new Object[0]);
                    dgfgVar.w(dgfgVar.ak);
                    return true;
                }
                if (i == 8) {
                    dgfg dgfgVar2 = this.b;
                    dhja.d(dgfgVar2.m, "Cancel registration.", new Object[0]);
                    dgfgVar2.N(message.obj);
                    dgfgVar2.w(dgfgVar2.ag);
                    return true;
                }
                if (i == 17) {
                    dgfg dgfgVar3 = this.b;
                    dgfgVar3.N(dezf.SIM_REMOVED);
                    dgfgVar3.w(dgfgVar3.ag);
                    return true;
                }
                if (i != 21) {
                    return super.e(message);
                }
                dgfg dgfgVar4 = this.b;
                dhja.r(dgfgVar4.m, "Network is lost.", new Object[0]);
                dgfgVar4.O();
                dgfgVar4.w(dgfgVar4.ag);
                return true;
            }
            if (message.obj instanceof ebqs) {
                try {
                    ebqs ebqsVar = (ebqs) message.obj;
                    final dgfg dgfgVar5 = this.b;
                    dhip dhipVar = dgfgVar5.m;
                    dhja.d(dhipVar, "Got response: %s", ebqsVar);
                    ebky ebkyVar = dgfgVar5.v;
                    if (Objects.isNull(ebkyVar)) {
                        throw new ebmn("Null SipDialogPath.");
                    }
                    String str2 = ebkyVar.a;
                    if (ebqsVar.y() == 200) {
                        dhja.d(dhipVar, "Registered.", new Object[0]);
                        h(ebqsVar);
                    } else {
                        if (ebqsVar.y() == 401) {
                            dhja.d(dhipVar, "Authentication requested.", new Object[0]);
                            dgfgVar5.s(1, ebqsVar);
                        } else if (ebqsVar.y() == 403) {
                            dhja.d(dhipVar, "Forbidden. Reconfiguration Required.", new Object[0]);
                            dgfgVar5.I();
                            dgfgVar5.D(dezf.RECONFIGURATION_REQUIRED);
                            dgfgVar5.w(dgfgVar5.ai);
                            dgfgVar5.E();
                            if (!((Boolean) dgfg.e.a()).booleanValue()) {
                                dgfgVar5.R.execute(new Runnable() { // from class: dgep
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.b.Q.onForbidden(true);
                                    }
                                });
                            }
                        } else if (ebqsVar.y() == 404) {
                            dhja.d(dhipVar, "User Not Found. Reconfiguration Required.", new Object[0]);
                            dgfgVar5.I();
                            dgfgVar5.D(dezf.RECONFIGURATION_REQUIRED);
                            dgfgVar5.w(dgfgVar5.ai);
                            dgfgVar5.E();
                            if (!((Boolean) dgfg.e.a()).booleanValue()) {
                                dgfgVar5.R.execute(new Runnable() { // from class: dgeq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.b.Q.onForbidden(false);
                                    }
                                });
                            }
                        } else if (ebqsVar.y() != 423) {
                            dhja.d(dhipVar, "Received an registration error response %d %s.", Integer.valueOf(ebqsVar.y()), ebqsVar.A());
                            ebob ebobVarD = ebqsVar.z().d("Retry-After");
                            if (ebobVarD == null) {
                                iH = 0;
                            } else {
                                iH = ebobVarD.h(0);
                                if (iH > 0) {
                                    dhja.d(dhipVar, "server requested retry in %ds", Integer.valueOf(iH));
                                }
                            }
                            dgfgVar5.G.a = iH;
                            dgfgVar5.w(dgfgVar5.ak);
                            dgfgVar5.D(dezf.ERROR_RESPONSE);
                        } else {
                            int iA = dhjv.a(ebqsVar);
                            if (iA == -1) {
                                dhja.h(dhipVar, "Can't read the Min-Expires value", new Object[0]);
                                dgfgVar5.I();
                                dgfgVar5.D(dezf.ERROR_RESPONSE);
                                dgfgVar5.w(dgfgVar5.ak);
                            } else {
                                dgfgVar5.E = iA;
                                dhja.l(dhipVar, "Send new REGISTER", new Object[0]);
                                dgfgVar5.q(1);
                            }
                        }
                        if (str2 != null) {
                            dhja.d(dhipVar, "Notify SipError. CallId=%s sipError=%d(%s)", str2, Integer.valueOf(ebqsVar.y()), ebqsVar.A());
                            dgfgVar5.R.execute(new Runnable() { // from class: dgda
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Collection.EL.stream(dgfgVar5.P).forEach(new Consumer() { // from class: dgcy
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj) {
                                            dfny dfnyVar = dgfg.d;
                                            ((dfyw) obj).n();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            });
                        }
                    }
                } catch (ebmn unused) {
                    dgfg dgfgVar6 = this.b;
                    dgfgVar6.D(dezf.ERROR_RESPONSE);
                    dgfgVar6.w(dgfgVar6.ak);
                }
            } else {
                ebmn ebmnVar = (ebmn) message.obj;
                dgfg dgfgVar7 = this.b;
                dhja.j(ebmnVar, dgfgVar7.m, "Registration failed", new Object[0]);
                dgfgVar7.D(dezf.ERROR_RESPONSE);
                dgfgVar7.w(dgfgVar7.ak);
            }
        } else if (message.obj == null) {
            try {
                this.b.M();
            } catch (dfzh | ebmn e) {
                dgfg dgfgVar8 = this.b;
                dhja.j(e, dgfgVar8.m, "Registration failure.", new Object[0]);
                dgfgVar8.w(dgfgVar8.ak);
            }
            final dgfg dgfgVar9 = this.b;
            if (!Objects.isNull(dgfgVar9.v)) {
                final String strB = ejwk.b(dgfgVar9.v.a);
                dhja.d(dgfgVar9.m, "Notify Registering. CallId=%s", strB);
                dgfgVar9.R.execute(new Runnable() { // from class: dgcv
                    @Override // java.lang.Runnable
                    public final void run() {
                        Stream stream = Collection.EL.stream(dgfgVar9.P);
                        final String str3 = strB;
                        stream.forEach(new Consumer() { // from class: dgdj
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                dfny dfnyVar = dgfg.d;
                                ((dfyw) obj).k(str3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
            }
        } else {
            ebqs ebqsVar2 = (ebqs) message.obj;
            if (((Boolean) dfbx.a.a()).booleanValue()) {
                dgfg dgfgVar10 = this.b;
                eblf eblfVar = dgfgVar10.t.a;
                if (Objects.isNull(eblfVar)) {
                    dhja.g("Null SipStack. Can't register.", new Object[0]);
                    dgfg dgfgVar11 = this.b;
                    dgfgVar11.w(dgfgVar11.ak);
                } else {
                    List listP = ebqsVar2.p();
                    if (!listP.isEmpty()) {
                        ebov ebovVar = (ebov) ekis.j(listP);
                        if (ebovVar.l("rport") && (str = (String) ebovVar.e.b("rport")) != null && !str.isEmpty()) {
                            try {
                                dhja.p(dgfgVar10.m, "Updating local port to %s", str);
                                eblfVar.m().m(Integer.parseInt(str));
                            } catch (NumberFormatException unused2) {
                                dhja.r(this.b.m, "Invalid RPORT value - %s ignoring, continuing with normal registration flow", str);
                            }
                        }
                    }
                    try {
                        this.b.K.b(ebqsVar2);
                        dgfg dgfgVar12 = this.b;
                        dhja.d(dgfgVar12.m, "Send second REGISTER", new Object[0]);
                        try {
                            dgfgVar12.M();
                        } catch (dfzh | ebmn e2) {
                            dgfg dgfgVar13 = this.b;
                            dhja.j(e2, dgfgVar13.m, "Registration failure.", new Object[0]);
                            dgfgVar13.N(dezf.UNKNOWN);
                            dgfgVar13.w(dgfgVar13.ak);
                        }
                    } catch (dfzh e3) {
                        dgfg dgfgVar14 = this.b;
                        dhja.j(e3, dgfgVar14.m, "Failed to write SecurityHeader.", new Object[0]);
                        dgfgVar14.w(dgfgVar14.ak);
                    }
                }
            } else {
                this.b.K.b(ebqsVar2);
                dgfg dgfgVar122 = this.b;
                dhja.d(dgfgVar122.m, "Send second REGISTER", new Object[0]);
                dgfgVar122.M();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int g(defpackage.ebqq r13) throws java.lang.NumberFormatException {
        /*
            r12 = this;
            dgfg r0 = r12.b
            eblg r1 = r0.t
            eblf r1 = r1.a
            boolean r2 = r1.v()
            r3 = 600000(0x927c0, float:8.40779E-40)
            if (r2 == 0) goto L10
            return r3
        L10:
            java.lang.String r1 = r1.n()
            ebpc r13 = r13.a
            ebkr r2 = defpackage.dhjv.a
            ebns r2 = r13.c()
            r4 = -1
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L80
            r7 = r5
        L22:
            int r8 = r2.b()
            r9 = 0
            if (r7 >= r8) goto L73
            ebob r8 = r2.e(r7)
            ebnr r8 = (defpackage.ebnr) r8
            eblv r10 = r8.a
            ebma r10 = r10.b
            boolean r11 = r10 instanceof defpackage.eblx
            if (r11 == 0) goto L6b
            eblx r10 = (defpackage.eblx) r10
            ebmg r10 = r10.a()
            if (r10 != 0) goto L41
            r10 = r9
            goto L43
        L41:
            ebme r10 = r10.a
        L43:
            if (r10 != 0) goto L46
            goto L73
        L46:
            java.lang.String r9 = r10.a
            boolean r9 = defpackage.ebme.a(r9)
            if (r9 == 0) goto L5e
            java.lang.String r9 = r10.a
            int r10 = r9.length()
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r6, r10)
            boolean r9 = defpackage.ejwh.a(r9, r1)
            goto L64
        L5e:
            java.lang.String r9 = r10.a
            boolean r9 = defpackage.ejwh.a(r9, r1)
        L64:
            if (r9 == 0) goto L68
            r9 = r8
            goto L73
        L68:
            int r7 = r7 + 1
            goto L22
        L6b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "address is not a SipURI"
            r13.<init>(r0)
            throw r13
        L73:
            if (r9 == 0) goto L80
            java.lang.String r1 = r9.e()
            if (r1 == 0) goto L80
            int r4 = java.lang.Integer.parseInt(r1)
            goto L8e
        L80:
            java.lang.String r1 = "Expires"
            ebob r13 = r13.d(r1)
            ebny r13 = (defpackage.ebny) r13
            if (r13 == 0) goto L8e
            int r4 = r13.b()
        L8e:
            if (r4 >= 0) goto La0
            dhip r13 = r0.m
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            java.lang.String r0 = "No expires value found in response to REGISTER! Using a default period of %d seconds!"
            defpackage.dhja.h(r13, r0, r1)
            return r3
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dges.g(ebqq):int");
    }

    protected void h(ebqs ebqsVar) throws ebmn {
        String strI;
        Optional optionalOf;
        dgfg dgfgVar = this.b;
        eblf eblfVar = dgfgVar.t.a;
        if (Objects.isNull(eblfVar)) {
            throw new ebmn("Null SipStack");
        }
        dgfgVar.F = g(ebqsVar);
        i(eblfVar, ebqsVar);
        eblfVar.c = null;
        ebns ebnsVarC = ebqsVar.z().c();
        for (int i = 0; i < ebnsVarC.b(); i++) {
            ebnr ebnrVar = (ebnr) ebnsVarC.e(i);
            String strI2 = ebnrVar.i("+sip.instance");
            if (strI2 != null && strI2.contains(dgfgVar.C)) {
                eblfVar.c = ebnrVar.i("pub-gruu");
            }
        }
        dgis dgisVar = dgfgVar.I;
        String strJ = j(dgisVar);
        ebpc ebpcVar = ebqsVar.a;
        eboc ebocVarE = ebpcVar.e("P-Associated-Uri");
        String strW = dgisVar.w();
        if (ebocVarE.b() == 0) {
            dhja.d(dgfgVar.m, "Generating associated URI from config", new Object[0]);
            String strJ2 = j(dgisVar);
            strW = dgisVar.w();
            if (!strW.startsWith(strJ2)) {
                crmx crmxVar = dgfgVar.M;
                String strK = dhjv.k(strW, crmxVar);
                if (Objects.isNull(strK)) {
                    dhja.q("expected non null user name from address", new Object[0]);
                    strW = "";
                } else if ("sip".equals(strJ2)) {
                    strW = "sip:" + strK + "@" + dgisVar.n();
                } else {
                    strW = "tel:".concat(!dfog.w() ? String.valueOf(crmxVar.x(strK)) : String.valueOf(strK));
                }
            }
        } else {
            dhja.d(dgfgVar.m, "Extracting associated URIs from headers", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < ebocVarE.b(); i2++) {
                Iterator it = ejxk.b(',').g(ebocVarE.e(i2).a()).iterator();
                while (it.hasNext()) {
                    String strTrim = ((String) it.next()).trim();
                    if (strTrim.startsWith("<")) {
                        strTrim = strTrim.substring(1, strTrim.length() - 1);
                    }
                    if (strTrim.startsWith(strJ)) {
                        arrayList.add(strTrim);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                strW = (String) arrayList.get(0);
                dgfgVar.z = arrayList;
            }
        }
        if (!dhim.d(strW)) {
            dgfgVar.y = strW;
            dhja.d(dgfgVar.m, "Set associated uri: %s using URI format: %s", dhja.a(strW), strJ);
        }
        ebov ebovVarF = ebpcVar.f();
        if (ebovVarF == null || (strI = ebovVarF.i("keep")) == null) {
            optionalOf = Optional.empty();
        } else {
            dhja.d(dgfgVar.m, "Server has requested a keep-alive period of: %ss", strI);
            Optional optionalEmpty = Optional.empty();
            try {
                optionalOf = Optional.of(Integer.valueOf(Integer.parseInt(strI)));
            } catch (NumberFormatException e) {
                dhja.j(e, this.b.m, "Unable to parse keep alive value. Using default client value.", new Object[0]);
                optionalOf = optionalEmpty;
            }
        }
        if (!optionalOf.isPresent() || ((Integer) optionalOf.get()).intValue() <= 0) {
            dgfs dgfsVar = this.b.L;
            dgfsVar.c();
            dhja.l(dgfsVar.b, "Disabled keep-alives", new Object[0]);
        } else {
            dgfg dgfgVar2 = this.b;
            dfyu dfyuVar = dgfgVar2.w;
            dfzs dfzsVar = dgfgVar2.B;
            if (((dfyuVar != null && dfyuVar.c() == 1) || (dfzsVar != null && dfzsVar.f())) && dfpo.n() > 0 && ((Integer) optionalOf.get()).intValue() > dfpo.n()) {
                optionalOf = Optional.of(Integer.valueOf((int) dfpo.n()));
            }
            dgfs dgfsVar2 = dgfgVar2.L;
            int iIntValue = ((Integer) optionalOf.get()).intValue();
            if (dgfsVar2.k()) {
                dhja.d(dgfsVar2.b, "Just processed a REGISTER. Next keep-alive ping can wait a bit longer", new Object[0]);
                dgfsVar2.h();
            } else {
                dhja.c("Enabling keep-alives", new Object[0]);
                dfyu dfyuVarA = dgfsVar2.a();
                if (dfyuVarA == null) {
                    dhja.r(dgfsVar2.b, "Network interface is null", new Object[0]);
                }
                if (iIntValue <= 0 && dfyuVarA != null) {
                    iIntValue = 120;
                }
                dgfsVar2.e = iIntValue;
                dgfsVar2.d(iIntValue);
            }
        }
        dgfg dgfgVar3 = this.b;
        dgfgVar3.w(dgfgVar3.ab);
    }

    protected final void i(eblf eblfVar, ebqs ebqsVar) {
        ArrayList arrayList = new ArrayList();
        List listJ = ebqsVar.z().j("Service-Route");
        if (eblfVar != ebli.f) {
            try {
                String strO = eblfVar.o();
                int iJ = eblfVar.j();
                String str = eblfVar.d().d;
                ebkr ebkrVar = dhjv.a;
                arrayList.add(new ebon(ebkr.a(ebkr.c(strO, iJ, str))));
            } catch (ebml e) {
                dhja.j(e, this.b.m, "Failed to create RouteHeader", new Object[0]);
                return;
            }
        }
        if (!listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                String str2 = ((ebnz) ((ebob) it.next())).d;
                List<String> listI = ejxk.b(',').i(ejwk.b(str2));
                Object[] objArr = {str2};
                dhip dhipVar = this.b.m;
                dhja.d(dhipVar, "service route headers %s", objArr);
                for (String str3 : listI) {
                    try {
                        ebob ebobVarG = ebql.g("Route", str3);
                        dhja.d(dhipVar, "service route headers are %s", str3);
                        arrayList.add((ebon) ebobVarG);
                    } catch (ebml e2) {
                        dhja.j(e2, this.b.m, "Invalid ServiceRoute header: %s", str3);
                    }
                }
            }
        }
        eblfVar.t(arrayList);
    }
}
