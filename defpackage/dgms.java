package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.net.MalformedURLException;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgms extends dgmn {
    String a;
    final /* synthetic */ dgng b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgms(dgng dgngVar) {
        super(dgngVar);
        this.b = dgngVar;
    }

    private final void o(MalformedURLException malformedURLException) {
        dgng dgngVar = this.b;
        dgngVar.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar.k);
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE;
        dgngVar.H(ewrpVar);
        dgngVar.z.e("Failed to verify OTP. When building query %s", dhiz.URI.c(malformedURLException));
        dgngVar.G(ewrpVar);
    }

    private final void s() {
        dgng dgngVar = this.b;
        dgngVar.u.w(dgngVar.h, cjty.a);
    }

    private final void t(String str) {
        try {
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE;
            dgng dgngVar = this.b;
            ckiz ckizVarI = ckja.i(ewrpVar, Optional.ofNullable(dgngVar.l));
            dgngVar.at(27);
            String strS = dgngVar.s();
            dgngVar.D(strS);
            Optional optionalOf = Optional.of(ckizVarI);
            dhja.o("Using OTP authenticated config server query", new Object[0]);
            ckiz ckizVar = (ckiz) optionalOf.orElse(dgtk.a());
            Uri.Builder builderBuildUpon = Uri.parse(strS).buildUpon();
            ewlg ewlgVarB = ckizVar.b();
            ewlgVarB.copyOnWrite();
            ewlp ewlpVar = (ewlp) ewlgVarB.instance;
            ewlp ewlpVar2 = ewlp.a;
            strS.getClass();
            ewlpVar.b |= 2;
            ewlpVar.d = strS;
            String str2 = (String) dhhb.e.d();
            if (!TextUtils.isEmpty(str2)) {
                builderBuildUpon.appendQueryParameter("provision_id", str2);
                ckizVar.l("provision_id", str2);
            }
            builderBuildUpon.appendQueryParameter("OTP", str);
            ckizVar.l("OTP", str);
            ckizVar.f(dgtk.b(builderBuildUpon.build().toString()));
            List listT = dgngVar.t();
            if (listT.isEmpty()) {
                dgngVar.n.b(dgngVar.m, ewrpVar, dgngVar.l, new dggp(dgngVar.h));
                dgngVar.T(dgngVar.am);
                return;
            }
            ckizVarI.k("Cookie", dgif.a(listT));
            if (dgngVar.Y.c(dgngVar.h).N) {
                dgjw dgjwVarI = dgjx.i();
                ((dgjr) dgjwVarI).e = Optional.ofNullable(dgngVar.l);
                dgng.an(dgjwVarI, listT);
                dgngVar.F.b(dgjwVarI.a(), ckizVarI);
            }
            fcsu fcsuVar = dgngVar.Z;
            String str3 = "";
            if (((dflr) fcsuVar.b()).a()) {
                Optional optionalFindFirst = Collection.EL.stream(listT).filter(new Predicate() { // from class: dgko
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
                        dfny dfnyVar = dgng.a;
                        return ((dgif) obj).a.equals("JIBE_ACS_COOKIE");
                    }
                }).findFirst();
                if (optionalFindFirst.isPresent()) {
                    str3 = ((dgif) optionalFindFirst.get()).b;
                }
            }
            if (((dflr) fcsuVar.b()).a() && !TextUtils.isEmpty(str3)) {
                auvh.h(dgngVar.i(emey.RCS_MLS_PROVISIONING_START_FROM_OTP, str3, ckizVarI).h(new ejvr() { // from class: dgmr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.n((ckiz) obj);
                        return null;
                    }
                }, eoqg.a));
            } else if (!((dflr) fcsuVar.b()).a() || !TextUtils.isEmpty(str3)) {
                dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
            } else {
                dgngVar.ar(2, 3);
                dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
            }
        } catch (MalformedURLException e) {
            dgng dgngVar2 = this.b;
            if (((dflr) dgngVar2.Z.b()).a()) {
                o(e);
                return;
            }
            dgngVar2.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar2.k);
            ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE;
            dgngVar2.H(ewrpVar2);
            dgngVar2.z.e("Failed to verify OTP. When building query %s", dhiz.URI.c(e));
            dgngVar2.G(ewrpVar2);
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "VerifyOtpState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        dgng dgngVar = this.b;
        dgsz dgszVar = (dgsz) dgngVar.L.b();
        String str = dgngVar.h;
        this.a = dgszVar.l(str);
        super.b();
        dgngVar.A(ewps.VERIFY_OTP_STAGE);
        String str2 = this.a;
        if (str2 == null || !str2.equals("ReadyState")) {
            return;
        }
        cjty cjtyVarC = dgngVar.u.c(str);
        if ((cjtyVarC.b & 1) != 0) {
            t(cjtyVarC.c);
        }
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_VERIFY_OTP;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    @Override // defpackage.dgop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.os.Message r7, defpackage.dgib r8) {
        /*
            r6 = this;
            dgng r0 = r6.b
            java.lang.String r1 = "VerifyOtpState"
            r0.F(r1, r7)
            dgib r1 = defpackage.dgng.al(r7)
            int r1 = r1.ordinal()
            r2 = 4
            r3 = 0
            if (r1 == r2) goto L68
            r2 = 22
            r4 = 0
            if (r1 == r2) goto L50
            r2 = 24
            if (r1 == r2) goto L55
            r2 = 29
            r5 = 1
            if (r1 == r2) goto L48
            switch(r1) {
                case 41: goto L50;
                case 42: goto L2e;
                case 43: goto L50;
                case 44: goto L2a;
                case 45: goto L29;
                case 46: goto L50;
                case 47: goto L50;
                case 48: goto L50;
                case 49: goto L50;
                case 50: goto L50;
                case 51: goto L50;
                case 52: goto L50;
                default: goto L24;
            }
        L24:
            boolean r7 = super.q(r7, r8)
            return r7
        L29:
            return r3
        L2a:
            r6.s()
            goto L50
        L2e:
            r6.s()
            fcsu r8 = r0.L
            java.lang.Object r8 = r8.b()
            dgsz r8 = (defpackage.dgsz) r8
            java.lang.String r1 = r0.h
            r8.x(r1, r4)
            java.lang.Object r8 = r7.obj
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            int r7 = r7.arg2
            r0.J(r8, r7, r6)
            return r5
        L48:
            java.lang.String r7 = defpackage.dgng.q(r7)
            r6.t(r7)
            return r5
        L50:
            r7 = 34
            r0.at(r7)
        L55:
            r7 = 32
            r0.at(r7)
            fcsu r7 = r0.L
            java.lang.Object r7 = r7.b()
            dgsz r7 = (defpackage.dgsz) r7
            java.lang.String r8 = r0.h
            r7.x(r8, r4)
            return r3
        L68:
            int r7 = r7.arg1
            r0.ax(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgms.k(android.os.Message, dgib):boolean");
    }

    public final /* synthetic */ void n(ckiz ckizVar) {
        try {
            this.b.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVar.j());
        } catch (MalformedURLException e) {
            o(e);
        }
    }
}
