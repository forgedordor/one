package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import j$.util.Optional;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmb extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmb(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void s(MalformedURLException malformedURLException) {
        dgng dgngVar = this.a;
        dgngVar.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar.k);
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
        dgngVar.H(ewrpVar);
        dgngVar.z.e("Failed to request with msisdn token when building query. %s", dhiz.URI.c(malformedURLException));
        dgngVar.G(ewrpVar);
    }

    private final void t(String str) {
        dgng dgngVar = this.a;
        dgngVar.z.d("Building config request with MSISDN token", new Object[0]);
        dgngVar.at(27);
        try {
            String strS = dgngVar.s();
            dgiq dgiqVarG = dgngVar.g();
            dgnj dgnjVar = dgngVar.q;
            Context context = dgngVar.m;
            String str2 = dgngVar.j;
            String str3 = dgngVar.h;
            dgti dgtiVarA = dgnjVar.a(context, str2, str3);
            dgtk dgtkVar = dgnjVar.a;
            dhja.o("Using MSISDN Token authenticated config server query", new Object[0]);
            final ckiz ckizVarA = dgtk.a();
            ewlg ewlgVarB = ckizVarA.b();
            ewlgVarB.copyOnWrite();
            ewlp ewlpVar = (ewlp) ewlgVarB.instance;
            ewlp ewlpVar2 = ewlp.a;
            strS.getClass();
            ewlpVar.b |= 2;
            ewlpVar.d = strS;
            ((ckio) ckizVarA).a = Optional.of("provision");
            ckizVarA.m(3);
            ckizVarA.k("rcs_msisdn_token", str);
            ckizVarA.f(dgtk.b(dgtk.f(strS, dgiqVarG, dgtiVarA, new dgtj(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), ckizVarA).build().toString()));
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
            ckizVarA.i(ewrpVar);
            String str4 = dgngVar.l;
            if (str4 != null) {
                ckizVarA.g(str4);
            }
            dgjw dgjwVarI = dgjx.i();
            dgngVar.u(this, ckizVarA, Optional.of(dgjwVarI));
            String strC = dgnjVar.c(str2, str3);
            ((dgjr) dgjwVarI).a = str;
            dgjwVarI.c(strC);
            ((dgjr) dgjwVarI).e = Optional.ofNullable(dgngVar.l);
            ((dgjr) dgjwVarI).d = dgnjVar.b(context, str3);
            dgjy dgjyVar = dgngVar.F;
            dgjx dgjxVarA = dgjwVarI.a();
            int iA = ewll.a(((ewlp) ckizVarA.b().instance).c);
            ejwl.a(iA != 0 && iA == 3);
            String strA = dgjyVar.a(dgjxVarA);
            epia epiaVar = (epia) epib.a.createBuilder();
            epiaVar.copyOnWrite();
            epib epibVar = (epib) epiaVar.instance;
            epibVar.b |= 1;
            epibVar.c = 1;
            epiaVar.copyOnWrite();
            epib epibVar2 = (epib) epiaVar.instance;
            strA.getClass();
            epibVar2.b |= 2;
            epibVar2.d = strA;
            String str5 = ((dgjs) dgjxVarA).f;
            epiaVar.copyOnWrite();
            epib epibVar3 = (epib) epiaVar.instance;
            epibVar3.b |= 4;
            epibVar3.e = str5;
            String str6 = ((dgjs) dgjxVarA).e;
            if (!str6.isEmpty()) {
                epiaVar.copyOnWrite();
                epib epibVar4 = (epib) epiaVar.instance;
                epibVar4.b |= 128;
                epibVar4.j = str6;
            }
            String str7 = ((dgjs) dgjxVarA).d;
            if (!str7.isEmpty()) {
                epiaVar.copyOnWrite();
                epib epibVar5 = (epib) epiaVar.instance;
                epibVar5.b |= 256;
                epibVar5.k = str7;
            }
            String str8 = ((dgjs) dgjxVarA).a;
            if (!str8.isEmpty()) {
                epiaVar.copyOnWrite();
                epib epibVar6 = (epib) epiaVar.instance;
                epibVar6.b |= 8;
                epibVar6.f = str8;
            }
            String str9 = ((dgjs) dgjxVarA).g;
            if (!str9.isEmpty()) {
                epiaVar.copyOnWrite();
                epib epibVar7 = (epib) epiaVar.instance;
                epibVar7.b |= 16;
                epibVar7.g = str9;
            }
            String str10 = ((dgjs) dgjxVarA).b;
            if (!str10.isEmpty()) {
                epiaVar.copyOnWrite();
                epib epibVar8 = (epib) epiaVar.instance;
                epibVar8.b |= 32;
                epibVar8.h = str10;
            }
            String str11 = ((dgjs) dgjxVarA).c;
            if (!str11.isEmpty()) {
                epiaVar.copyOnWrite();
                epib epibVar9 = (epib) epiaVar.instance;
                epibVar9.b |= 64;
                epibVar9.i = str11;
            }
            Optional optional = ((dgjs) dgjxVarA).h;
            if (optional.isPresent()) {
                String str12 = (String) optional.get();
                epiaVar.copyOnWrite();
                epib epibVar10 = (epib) epiaVar.instance;
                epibVar10.b |= 512;
                epibVar10.l = str12;
            }
            ((ckio) ckizVarA).b = Optional.of((epib) epiaVar.build());
            fcsu fcsuVar = dgngVar.Z;
            if (((dflr) fcsuVar.b()).a() && !((dflt) dgngVar.ab.b()).a()) {
                auvh.h(dgngVar.i(emey.RCS_MLS_PROVISIONING_START_FROM_UPI, str, ckizVarA).h(new ejvr() { // from class: dgma
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.n(ckizVarA);
                        return null;
                    }
                }, eoqg.a));
                return;
            }
            if (!((dflr) fcsuVar.b()).a() || !((dflt) dgngVar.ab.b()).a()) {
                dgngVar.z.a("Msisdn token config request ready. Scheduling config request message", new Object[0]);
                dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarA.j());
                return;
            }
            List listT = dgngVar.t();
            if (listT.isEmpty()) {
                dgngVar.z.b("Cookies were not found while requesting UPI with attestation.", new Object[0]);
                dgngVar.n.b(context, ewrpVar, dgngVar.l, new dggp(str3));
                dgngVar.ar(3, 3);
                dgngVar.T(dgngVar.am);
                return;
            }
            ckizVarA.k("Cookie", dgif.a(listT));
            dgrs dgrsVar = dgngVar.u;
            String strP = dgrsVar.p(str3);
            if (!TextUtils.isEmpty(strP)) {
                auvh.h(dgngVar.j(emey.RCS_MLS_PROVISIONING_START_FROM_UPI, strP, ckizVarA).h(new ejvr() { // from class: dglz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.o(ckizVarA);
                        return null;
                    }
                }, eoqg.a));
                dgrsVar.v(str3, "");
            } else {
                dgngVar.z.b("Nonce was not found while requesting UPI with attestation.", new Object[0]);
                dgngVar.ar(3, 4);
                dgngVar.T(dgngVar.am);
            }
        } catch (MalformedURLException e) {
            dgng dgngVar2 = this.a;
            if (((dflr) dgngVar2.Z.b()).a()) {
                s(e);
                return;
            }
            dgngVar2.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar2.k);
            ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
            dgngVar2.H(ewrpVar2);
            dgngVar2.z.e("Failed to request with msisdn token when building query. %s", dhiz.URI.c(e));
            dgngVar2.G(ewrpVar2);
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestWithMsisdnTokenState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.REQUEST_WITH_MSISDN_TOKEN_STAGE);
        dgngVar.z.a("Waiting for message with msisdn token", new Object[0]);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN_TOKEN;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    @Override // defpackage.dgop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.os.Message r10, defpackage.dgib r11) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgmb.k(android.os.Message, dgib):boolean");
    }

    public final /* synthetic */ void n(ckiz ckizVar) {
        dgng dgngVar = this.a;
        dgngVar.z.a("Msisdn token config request ready with MLS. Scheduling config request message", new Object[0]);
        try {
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVar.j());
        } catch (MalformedURLException e) {
            s(e);
        }
    }

    public final /* synthetic */ void o(ckiz ckizVar) {
        dgng dgngVar = this.a;
        dgngVar.z.a("Msisdn token config request ready with MLS. Scheduling config request message", new Object[0]);
        try {
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVar.j());
        } catch (MalformedURLException e) {
            s(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.dgmn
    public final boolean y() {
        dgng dgngVar = this.a;
        Optional optionalH = dgngVar.u.h(dgngVar.h);
        if (!optionalH.isPresent()) {
            dgngVar.z.a("Not replaying UPI request. Token not set", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(optionalH.get())) {
            dgngVar.z.e("Not replaying UPI request. Token exists, but is empty", new Object[0]);
            return false;
        }
        dgngVar.z.d("Replaying UPI request with existing token", new Object[0]);
        dgngVar.y(dgib.MSG_VERIFY_NUMBER_SUCCESS, optionalH.get());
        return true;
    }
}
