package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgxo implements eblu {
    final /* synthetic */ dgxp a;
    private final dgwx b;
    private final ebky c;
    private final String d;
    private boolean e;
    private final long f;

    public dgxo(dgxp dgxpVar, long j, dgwx dgwxVar, ebky ebkyVar, String str) {
        this.a = dgxpVar;
        this.f = j;
        this.b = dgwxVar;
        this.c = ebkyVar;
        this.d = str;
    }

    private final void d() {
        try {
            dgxp dgxpVar = this.a;
            long j = this.f;
            String str = this.d;
            dgxpVar.m.remove(str);
            Iterator it = dgxpVar.g.iterator();
            while (it.hasNext()) {
                ((dgxg) it.next()).l(j, str);
            }
        } catch (Exception e) {
            dhja.i(e, "Error while calling listeners: %s", e.getMessage());
        }
    }

    @Override // defpackage.eblu
    public final void a(eblm eblmVar) {
        dhja.k("OPTIONS response aborted", new Object[0]);
        d();
    }

    @Override // defpackage.eblu
    public final void b(eblm eblmVar) {
        int iA = eblmVar.a();
        if (iA == 200 || iA == 202) {
            ebqq ebqqVar = eblmVar.b;
            dgxp dgxpVar = this.a;
            dgwx dgwxVarB = dgxpVar.p.b(ebqqVar, dgxpVar.r());
            dgxp.u(dgwxVarB, eblmVar);
            if (((Boolean) dgxp.i.a()).booleanValue() && ebqqVar != null) {
                ebkr ebkrVar = dhjv.a;
                eboc ebocVarE = ebqqVar.a.e("P-Asserted-Identity");
                String strSubstring = null;
                if (ebocVarE != null) {
                    Iterator it = ebocVarE.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ebob ebobVar = (ebob) it.next();
                        try {
                            String strA = ebobVar.a();
                            String str = ebobVar.c;
                            strA.getClass();
                            ebma ebmaVar = ebkr.b(strA).b;
                            if (ebmaVar != null && ebmaVar.l()) {
                                String string = ebmaVar.toString();
                                if (dhjv.v(string)) {
                                    strSubstring = string.substring(4);
                                    break;
                                }
                            }
                        } catch (ebml e) {
                            dhja.j(e, dhjv.b, "Error while parsing remote uri for bot: %s", e.getMessage());
                        }
                    }
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    dgwxVarB.j = Optional.of(strSubstring);
                }
            }
            if (ebqqVar != null) {
                boolean zW = ebqqVar.w();
                dgwxVarB.d = true;
                boolean z = (dgwxVarB.y() || dgwxVarB.B() || dgwxVarB.J()) && !zW;
                dgwxVarB.c = z;
                if (z) {
                    dgwxVarB.e = dhkl.a().longValue();
                }
            }
            this.a.v(this.f, this.d, dgwxVarB);
            return;
        }
        if (iA != 404) {
            if (iA != 480) {
                if (iA != 604) {
                    if (iA == 407) {
                        if (this.e) {
                            d();
                            return;
                        }
                        this.e = true;
                        dgxp dgxpVar2 = this.a;
                        ebqs ebqsVarB = eblmVar.b();
                        dhfw dhfwVar = dgxpVar2.k;
                        dhfwVar.a(ebqsVarB);
                        ebky ebkyVar = this.c;
                        ebkyVar.a();
                        try {
                            eblf eblfVar = ((eblg) dgxpVar2.l).a;
                            ebqr ebqrVarS = dgxpVar2.f.s(eblfVar, ebkyVar);
                            ebnr ebnrVarB = ebqrVarS.b();
                            dgwx dgwxVar = this.b;
                            dgxd.d(ebnrVarB, dgwxVar, dgxpVar2.r());
                            dgxd.c(ebqrVarS, dgwxVar, dgxpVar2.r());
                            dhfwVar.b(ebqrVarS);
                            eblfVar.k(ebqrVarS, this);
                            return;
                        } catch (ebmn e2) {
                            dhja.i(e2, "Error while sending SIP message", new Object[0]);
                            d();
                            return;
                        }
                    }
                    if (iA != 408) {
                        dhja.q("Received unknown response status to OPTIONS call: %d", Integer.valueOf(iA));
                        d();
                        return;
                    }
                }
            }
            dgxp dgxpVar3 = this.a;
            dgwx dgwxVarB2 = dgxpVar3.p.b(eblmVar.b, dgxpVar3.r());
            if (dgwxVarB2.i.isEmpty()) {
                dgwxVarB2 = new ImsCapabilities(dgxpVar3.n.c(this.d));
            }
            dgwxVarB2.c = false;
            dgwxVarB2.d = true;
            if (!dgxpVar3.a.d().mImCapAlwaysOn) {
                dhja.c("480 received with IM_CAP_ALWAYS_ON disabled!", new Object[0]);
                dgwxVarB2 = dgxpVar3.o.a();
                dgwxVarB2.c = false;
                dgwxVarB2.d = false;
            }
            dgxp.u(dgwxVarB2, eblmVar);
            dgxpVar3.v(this.f, this.d, dgwxVarB2);
            return;
        }
        dgxp dgxpVar4 = this.a;
        dgwx dgwxVarA = dgxpVar4.o.a();
        dgwxVarA.c = false;
        dgwxVarA.d = false;
        dgxp.u(dgwxVarA, eblmVar);
        dgxpVar4.v(this.f, this.d, dgwxVarA);
    }

    @Override // defpackage.eblu
    public final void c(eblm eblmVar) {
        dhja.k("OPTIONS response timeout", new Object[0]);
        d();
    }
}
