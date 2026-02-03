package defpackage;

import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ednt implements adf {
    final /* synthetic */ ednu a;

    public ednt(ednu ednuVar) {
        this.a = ednuVar;
    }

    @Override // defpackage.adf
    public final void a() {
        ednu ednuVar = this.a;
        if (ednu.H(ednuVar.G()) && !ednuVar.E) {
            ednuVar.E = true;
            Object objBb = ednuVar.bb();
            EditActivity editActivity = (EditActivity) ednuVar;
            ahhk ahhkVar = (ahhk) objBb;
            editActivity.n = (lxo) ahhkVar.ci.b();
            editActivity.o = (eduq) ahhkVar.by.b();
            editActivity.p = (eddy) ahhkVar.bR.b();
            ahng ahngVar = ahhkVar.b.b;
            editActivity.q = (dswb) ahngVar.iZ.b();
            editActivity.r = (dsvh) ahngVar.jc.b();
            editActivity.s = ahhkVar.Z();
            editActivity.t = (ednl) ahhkVar.bS.b();
            editActivity.u = ahhkVar.aa();
            ekgp ekgpVar = ekoj.a;
            editActivity.v = new eygj(ekgpVar, ekgpVar);
        }
    }
}
