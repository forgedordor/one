package defpackage;

import com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edam implements adf {
    final /* synthetic */ edan a;

    public edam(edan edanVar) {
        this.a = edanVar;
    }

    @Override // defpackage.adf
    public final void a() {
        edan edanVar = this.a;
        if (edan.ae(edanVar.ad()) && !edanVar.Q) {
            edanVar.Q = true;
            Object objBb = edanVar.bb();
            ArtEditActivity artEditActivity = (ArtEditActivity) edanVar;
            ahhk ahhkVar = (ahhk) objBb;
            artEditActivity.n = (lxo) ahhkVar.ci.b();
            artEditActivity.o = (eduq) ahhkVar.by.b();
            artEditActivity.p = (eczz) ahhkVar.bT.b();
            ahng ahngVar = ahhkVar.b.b;
            artEditActivity.q = (dswb) ahngVar.iZ.b();
            artEditActivity.r = (dsvx) ahngVar.ja.b();
            artEditActivity.s = (dsvh) ahngVar.jc.b();
            artEditActivity.t = ahhkVar.Z();
            artEditActivity.u = (ednl) ahhkVar.bS.b();
            artEditActivity.v = (eddy) ahhkVar.bR.b();
            artEditActivity.w = ahhkVar.ac();
            ekgp ekgpVar = ekoj.a;
            artEditActivity.x = new eygj(ekgpVar, ekgpVar);
            artEditActivity.y = "group_profile_photo_picker";
            artEditActivity.z = (edgl) ahhkVar.cn.b();
            artEditActivity.A = ahhkVar.aa();
        }
    }
}
