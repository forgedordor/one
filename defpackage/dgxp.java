package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxp extends dgxi {
    static final dfny i = dfnv.b("enable_rbm_bot_id_in_capabilities");
    static final dfny j = dfod.a(161540993);
    public final dhfw k;
    public final fcsu l;
    public final Map m;
    public final dgxb n;
    public final dgxf o;
    public final dgxh p;
    private final crmx q;

    public dgxp(dfys dfysVar, dgwg dgwgVar, dgxm dgxmVar, fcsu fcsuVar, crmx crmxVar, dgxb dgxbVar, dgxf dgxfVar, dgxh dgxhVar, dhjt dhjtVar) {
        super(dfysVar, dgwgVar, dgxmVar, dhjtVar);
        this.m = DesugarCollections.synchronizedMap(new HashMap());
        this.l = fcsuVar;
        this.q = crmxVar;
        this.k = new dhfw(dfysVar.c());
        this.n = dgxbVar;
        this.o = dgxfVar;
        this.p = dgxhVar;
        this.f = dhjtVar;
    }

    public static final void u(dgwx dgwxVar, eblm eblmVar) {
        dgwxVar.g = eblmVar.a();
        ebqq ebqqVar = eblmVar.b;
        if (ebqqVar != null) {
            w(dgwxVar, ebqqVar);
        }
    }

    private static final void w(dgwx dgwxVar, ebqq ebqqVar) {
        String strJ = ebqqVar.j("User-Agent");
        if (strJ != null) {
            dgwxVar.h.put(dgww.a, strJ);
        }
    }

    @Override // defpackage.dgvq
    protected final void g(dezf dezfVar) {
        this.m.clear();
    }

    @Override // defpackage.dgxi
    public final void q(ebqr ebqrVar) throws ebmn {
        String strX;
        dhja.k("Receive an OPTIONS request", new Object[0]);
        crmx crmxVar = this.q;
        ebma ebmaVarB = dhjv.b(ebqrVar, crmxVar);
        String strA = null;
        if (ebmaVarB instanceof eblx) {
            strA = (String) ((eblx) ebmaVarB).a.a().map(new dhju()).orElse(null);
            if (!dhjv.w(strA)) {
                strX = dhjv.n(ebmaVarB.toString(), crmxVar);
            }
            if (strX != null || strX.isEmpty()) {
                throw new IllegalArgumentException("Invalid MSISDN in capability request");
            }
            ebqrVar.j("P-Application-ID");
            dgwx dgwxVarA = this.p.a(ebqrVar.j("Contact"), r());
            dgwxVarA.c = !ebqrVar.w();
            if (dgwxVarA.e <= 0) {
                dgwxVarA.e = System.currentTimeMillis();
            }
            w(dgwxVarA, ebqrVar);
            dgwx dgwxVar = new dgwx(this.h.a());
            Iterator it = dgwxVar.i.iterator();
            while (it.hasNext()) {
                if (!dgwxVarA.i.contains((String) it.next())) {
                    it.remove();
                }
            }
            v(0L, strX, dgwxVarA);
            try {
                eblf eblfVar = ((eblg) this.l).a;
                dhjt dhjtVar = this.f;
                try {
                    ebpe ebpeVarB = dhjt.b(BasePaymentResult.ERROR_REQUEST_FAILED, (ebpd) ebqrVar.a);
                    ebos ebosVar = (ebos) ebpeVarB.d("To");
                    if (ebosVar == null) {
                        throw new ebmn("To header is null.");
                    }
                    ebosVar.f(ebmh.a());
                    ebpeVarB.k(dhjv.e(dhjtVar.b.a()));
                    ebpeVarB.k(dhjv.F());
                    ebqs ebqsVar = new ebqs(ebpeVarB);
                    ebnr ebnrVar = new ebnr(ebkr.f(eblfVar.c, false, this.a.c().mUserName, eblfVar.n()), eblfVar.p(), eblfVar.i(), Optional.ofNullable(eblfVar.g()), new String[0]);
                    dgxd.d(ebnrVar, dgwxVar, r());
                    ebqsVar.a.k(ebnrVar);
                    eblfVar.s(ebqsVar);
                    return;
                } catch (Exception e) {
                    dhja.i(e, "Can't create SIP message", new Object[0]);
                    throw new ebmn("Can't create SIP response");
                }
            } catch (Exception e2) {
                dhja.g("Can't send 200 OK for OPTIONS: %s", e2.getMessage());
                return;
            }
        }
        if (ebmaVarB instanceof ebly) {
            ebly eblyVar = (ebly) ebmaVarB;
            strA = eblyVar.a();
            if (eblyVar.e()) {
                strA = "+".concat(String.valueOf(strA));
            }
        }
        strX = (!dhjv.w(strA) || dfog.w()) ? strA : crmxVar.x(strA);
        if (strX != null) {
        }
        throw new IllegalArgumentException("Invalid MSISDN in capability request");
    }

    @Override // defpackage.dgxi
    public final void s(String str, long j2, String str2) throws ebmn {
        if (str2 == null) {
            throw new IllegalArgumentException("MSISDN must not be null.");
        }
        if (((Boolean) j.a()).booleanValue() && this.m.containsKey(str2)) {
            dhja.c("Options Capabilities request for %s already pending", dhiz.PHONE_NUMBER.c(str2));
            return;
        }
        if (!l()) {
            throw new ebmn("Unable to request options capabilities, capability service is not started!");
        }
        dgxm dgxmVar = this.h;
        if (dgxmVar == null) {
            throw new ebmn("Failed to request options capability: no capabilities factory available");
        }
        dfys dfysVar = this.a;
        dgwx dgwxVarA = dgxmVar.a();
        if (!dfyq.a(dfysVar).isPresent()) {
            throw new ebmn("Network interface unavailable [AppId=" + str + ", id=" + j2 + ", MSISDN=" + dhiz.PHONE_NUMBER.c(str2) + "]");
        }
        dhja.c("Requesting Options capabilities for %s", dhiz.PHONE_NUMBER.c(str2));
        eblg eblgVar = (eblg) this.l;
        eblf eblfVar = eblgVar.a;
        String strL = dhjv.l(str2, dfysVar.c(), this.q);
        eblf eblfVar2 = eblgVar.a;
        if (eblfVar2.v()) {
            throw new ebmn("SipStack is null. Can't create dialog path.");
        }
        String strW = eblf.w();
        if (Objects.isNull(strW)) {
            throw new ebmn("CallId is null. Can't create dialog path.");
        }
        String strE = dfysVar.e();
        if (Objects.isNull(strE)) {
            throw new ebmn("Public User Identity is null in ImsModule. Can't create dialog path.");
        }
        ebky ebkyVar = new ebky(strW, 1, strL, strE, strL, eblfVar2.q());
        ebqr ebqrVarS = this.f.s(eblfVar, ebkyVar);
        dgxd.c(ebqrVarS, dgwxVarA, r());
        dgxd.d(ebqrVarS.b(), dgwxVarA, r());
        dgxo dgxoVar = new dgxo(this, j2, dgwxVarA, ebkyVar, str2);
        this.m.put(str2, dgxoVar);
        eblfVar.k(ebqrVarS, dgxoVar);
    }

    @Override // defpackage.dgxi
    public final void t(String str) throws ebmn {
        if (((Boolean) j.a()).booleanValue() || !this.m.containsKey(str)) {
            s(null, 0L, str);
        } else {
            dhja.c("Options Capabilities request for %s already pending", dhiz.PHONE_NUMBER.c(str));
        }
    }

    public final void v(long j2, String str, dgwx dgwxVar) {
        this.m.remove(str);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dgxg) it.next()).k(j2, str, dgwxVar);
        }
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
