package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgwt {
    public final dgwe a;
    public final dfys b;
    public final fcsu c;
    public final dhjt d;
    public int e;
    public long f;

    public dgwt(dgwe dgweVar, dfys dfysVar, fcsu fcsuVar, dhjt dhjtVar) {
        this.a = dgweVar;
        this.b = dfysVar;
        this.c = fcsuVar;
        this.d = dhjtVar;
    }

    private static final eboq d() {
        eboq eboqVar = new eboq();
        eboqVar.e(1800);
        eboqVar.f("uas");
        return eboqVar;
    }

    public final void a(ebky ebkyVar, ebqr ebqrVar) {
        dhja.k("Handling session refresh request", new Object[0]);
        try {
            eblf eblfVar = ((eblg) this.c).a;
            if (!"INVITE".equals(ebqrVar.z())) {
                if ("UPDATE".equals(ebqrVar.z())) {
                    ebqs ebqsVarH = this.d.h(ebqrVar, ebkyVar.d, BasePaymentResult.ERROR_REQUEST_FAILED);
                    c(ebkyVar, ebqrVar, ebqsVarH);
                    eblfVar.l(ebqsVarH);
                    return;
                }
                return;
            }
            ebqs ebqsVarG = this.d.g(eblfVar, ebkyVar, ebqrVar);
            dgwe dgweVar = this.a;
            dhjv.u(ebqsVarG, dgweVar.x(), dgweVar.al());
            c(ebkyVar, ebqrVar, ebqsVarG);
            eblm eblmVarL = eblfVar.l(ebqsVarG);
            eblmVarL.h(30);
            if (eblmVarL.f()) {
                dhja.k("ACK request received", new Object[0]);
            } else {
                dhja.g("No ACK received for INVITE", new Object[0]);
                dgweVar.o(new dhft(408, "Timeout"), 1, 1);
            }
        } catch (Exception e) {
            dhja.i(e, "Sending response failed: %s", e.getMessage());
            this.a.o(new dhft(408, "Timeout"), 1, 1);
        }
    }

    final void b(ebky ebkyVar, ebqs ebqsVar) {
        eboq eboqVar = (eboq) ebqsVar.a.d("Session-Expires");
        if (eboqVar == null) {
            return;
        }
        this.e = eboqVar.a;
        this.f = System.currentTimeMillis();
        String strB = eboqVar.b();
        if (!TextUtils.isEmpty(strB)) {
            ebkyVar.w = strB;
        }
        dhja.c("Starting session refresh timer! Interval: %d role: %s", Integer.valueOf(this.e), strB);
        dgwe dgweVar = this.a;
        dgvq dgvqVar = dgweVar.i;
        dgvqVar.c(dgweVar);
        if ("uac".equals(strB)) {
            dgvqVar.h(dgweVar, this.e, true);
        } else {
            dgvqVar.h(dgweVar, this.e, false);
        }
    }

    final void c(ebky ebkyVar, ebqr ebqrVar, ebqs ebqsVar) {
        eboq eboqVarD;
        eboq eboqVar;
        String strJ = ebqrVar.j("Supported");
        if (strJ == null || !strJ.contains("timer") || (eboqVar = (eboq) ebqrVar.a.d("Session-Expires")) == null) {
            eboqVarD = d();
        } else {
            eboq eboqVar2 = new eboq();
            eboqVar2.e(eboqVar.a);
            String strB = eboqVar.b();
            if (strB == null || "uas".equals(strB)) {
                eboqVar2.f("uas");
            } else {
                eboqVar2.f("uac");
            }
            eboqVarD = eboqVar2;
        }
        String strB2 = eboqVarD.b();
        if (!TextUtils.isEmpty(strB2)) {
            ebkyVar.w = strB2;
        }
        dgwe dgweVar = this.a;
        dgvq dgvqVar = dgweVar.i;
        dgvqVar.c(dgweVar);
        this.e = eboqVarD.a;
        this.f = System.currentTimeMillis();
        dhja.c("Starting session refresh timer! Interval: %d role: %s", Integer.valueOf(this.e), eboqVarD.b());
        if ("uas".equals(eboqVarD.b())) {
            dgvqVar.h(dgweVar, eboqVarD.a, true);
        } else {
            dgvqVar.h(dgweVar, eboqVarD.a, false);
        }
        ebqsVar.a.k(eboqVarD);
    }
}
