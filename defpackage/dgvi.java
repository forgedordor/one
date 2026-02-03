package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgvi implements eblu {
    final /* synthetic */ dgvj a;

    public dgvi(dgvj dgvjVar) {
        this.a = dgvjVar;
    }

    private final void d(int i, String str) {
        dgvj dgvjVar = this.a;
        dgvjVar.a();
        dhau dhauVar = dgvjVar.j;
        dhauVar.getClass();
        dhauVar.a(i, str);
    }

    @Override // defpackage.eblu
    public final void a(eblm eblmVar) {
        dgvj dgvjVar = this.a;
        dgvjVar.a();
        dhau dhauVar = dgvjVar.j;
        dhauVar.getClass();
        dhauVar.a(400, "Aborted");
    }

    @Override // defpackage.eblu
    public final void b(eblm eblmVar) {
        if (eblmVar.g()) {
            int iA = eblmVar.a();
            ebqs ebqsVarB = eblmVar.b();
            if (ebqsVarB == null) {
                dhja.g("SIP response is null.", new Object[0]);
                return;
            }
            if (iA != 200) {
                if (iA == 412) {
                    String strA = ebqsVarB.A();
                    dgvj dgvjVar = this.a;
                    dhja.g("Invalid entity-tag found in Publish request: %s", dgvjVar.g);
                    dgvjVar.a();
                    dhau dhauVar = dgvjVar.j;
                    dhauVar.getClass();
                    dhauVar.a(412, strA);
                    return;
                }
                if (iA != 423) {
                    d(iA, ebqsVarB.A());
                    return;
                }
                dgvj dgvjVar2 = this.a;
                dhja.c("Interval in Publish request is too small: %s", Integer.valueOf(dgvjVar2.e));
                ebqs ebqsVarB2 = eblmVar.b();
                if (ebqsVarB2 == null) {
                    dhja.g("SIP response is null.", new Object[0]);
                    return;
                }
                int iA2 = dhjv.a(ebqsVarB2);
                if (iA2 >= 0) {
                    dgvjVar2.f = iA2;
                    dhja.c("Setting Publish min expires to %s.", Integer.valueOf(iA2));
                } else {
                    dgvjVar2.f = 0;
                    dhja.c("min expires value not set in headers.", new Object[0]);
                }
                dgvjVar2.a();
                String strC = eblmVar.c();
                if (strC != null) {
                    d(423, strC);
                    return;
                }
                return;
            }
            dgvj dgvjVar3 = this.a;
            dhja.k("PublicationImpl.methodDelivered(): publication to %s successful.", dgvjVar3.c);
            String strJ = ebqsVarB.j("SIP-ETag");
            if (strJ == null) {
                dhja.k("Getting 2xx PUBLISH response without SIP-ETag header!", new Object[0]);
                dgvjVar3.g = null;
            } else {
                dgvjVar3.g = strJ;
            }
            dhja.k("etag value is %s", dgvjVar3.g);
            ebny ebnyVar = (ebny) ebqsVarB.a.d("Expires");
            int iB = ebnyVar != null ? ebnyVar.b() : 0;
            dhja.k("Expires value is %s", Integer.valueOf(iB));
            if (iB <= 0) {
                dgvjVar3.a();
                dhja.k("publication state is inactive", new Object[0]);
                dhau dhauVar2 = dgvjVar3.j;
                if (dhauVar2 != null) {
                    dhaw dhawVar = dhauVar2.a;
                    Iterator it = dhawVar.g.iterator();
                    while (it.hasNext()) {
                        ((dhay) it.next()).d();
                    }
                    dhawVar.j = null;
                    return;
                }
                return;
            }
            dgvjVar3.e = iB;
            dgvjVar3.i = 2;
            dhja.k("publication state is active", new Object[0]);
            dhau dhauVar3 = dgvjVar3.j;
            if (dhauVar3 != null) {
                dhaw dhawVar2 = dhauVar3.a;
                dhmb dhmbVar = dhawVar2.k;
                Iterator it2 = dhawVar2.g.iterator();
                while (it2.hasNext()) {
                    ((dhay) it2.next()).b(strJ, dhmbVar);
                }
            }
        }
    }

    @Override // defpackage.eblu
    public final void c(eblm eblmVar) {
        dhja.c("Capabilities publication timed out.", new Object[0]);
        this.a.i = 3;
    }
}
