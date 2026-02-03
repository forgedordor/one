package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtap implements lun {
    final /* synthetic */ Dialog a;
    final /* synthetic */ dn b;
    final /* synthetic */ dtaq c;
    final /* synthetic */ edaf d;
    private boolean e = false;

    public dtap(dtaq dtaqVar, edaf edafVar, Dialog dialog, dn dnVar) {
        this.d = edafVar;
        this.a = dialog;
        this.b = dnVar;
        this.c = dtaqVar;
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        if (this.e) {
            return;
        }
        edaf edafVar = this.d;
        Dialog dialog = this.a;
        dn dnVar = this.b;
        View viewB = dtat.b(dnVar);
        edag edagVar = edafVar.a;
        edagVar.aj.b(viewB, edagVar.ak.a(134405));
        iv ivVar = (iv) dialog;
        edagVar.aj.b(ivVar.b(-1), edagVar.ak.a(134407));
        edagVar.aj.b(ivVar.b(-2), edagVar.ak.a(134406));
        try {
            dsvd dsvdVarC = dsvu.c(dtat.b(dnVar));
            dsvdVarC.getClass();
            dsvd dsvdVarC2 = dsvu.c(dtat.a(dnVar, true));
            dsvdVarC2.getClass();
            dtam.a(dsvdVarC, dsvdVarC2);
            this.e = true;
        } catch (RuntimeException e) {
            this.c.b.a(e);
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
