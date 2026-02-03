package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhaz extends dgwm {
    public dhaz(dgvq dgvqVar, fcsu fcsuVar, String str, dhjt dhjtVar) {
        super(dgvqVar.a, fcsuVar, str, "presence", dgvqVar.d, dgvqVar.e, dhjtVar);
        this.g = "";
        this.e = b(fcsuVar);
        this.e.x = true;
    }

    @Override // defpackage.dgwm
    public final void h(ebqr ebqrVar) {
        try {
            j(ebqrVar);
            String strS = s(ebqrVar);
            String strH = ebqrVar.h();
            if (strH == null) {
                t(null, new byte[0]);
            } else {
                t(strH, ebqrVar.a.k);
            }
            e(strS);
        } catch (Exception e) {
            dhja.i(e, "Error while processing notify: %s", e.getMessage());
        }
    }

    @Override // defpackage.dgwm
    public final void k(ebqr ebqrVar) throws ebmn {
        super.k(ebqrVar);
    }
}
