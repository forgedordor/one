package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.PhotoPickerActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edur implements adf {
    final /* synthetic */ edus a;

    public edur(edus edusVar) {
        this.a = edusVar;
    }

    @Override // defpackage.adf
    public final void a() {
        edus edusVar = this.a;
        if (edus.D(edusVar.C()) && !edusVar.n) {
            edusVar.n = true;
            Object objBb = edusVar.bb();
            PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) edusVar;
            ahhk ahhkVar = (ahhk) objBb;
            photoPickerActivity.o = (eduq) ahhkVar.by.b();
            photoPickerActivity.p = ahhkVar.cx;
            photoPickerActivity.q = (dswb) ahhkVar.b.b.iZ.b();
            photoPickerActivity.r = ahhkVar.Z();
            photoPickerActivity.s = ahhkVar.cf;
            photoPickerActivity.t = (edmz) ahhkVar.cj.b();
            photoPickerActivity.u = ahhkVar.aa();
            ekgp ekgpVar = ekoj.a;
            photoPickerActivity.v = new eygj(ekgpVar, ekgpVar);
        }
    }
}
