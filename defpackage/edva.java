package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edva implements adf {
    final /* synthetic */ edvb a;

    public edva(edvb edvbVar) {
        this.a = edvbVar;
    }

    @Override // defpackage.adf
    public final void a() {
        edvb edvbVar = this.a;
        if (edvb.D(edvbVar.C()) && !edvbVar.n) {
            edvbVar.n = true;
            Object objBb = edvbVar.bb();
            PhotoPickerIntentActivity photoPickerIntentActivity = (PhotoPickerIntentActivity) edvbVar;
            ahhk ahhkVar = (ahhk) objBb;
            photoPickerIntentActivity.o = (eduq) ahhkVar.by.b();
            photoPickerIntentActivity.p = ahhkVar.cz;
            photoPickerIntentActivity.q = (dswb) ahhkVar.b.b.iZ.b();
            photoPickerIntentActivity.r = ahhkVar.Z();
            photoPickerIntentActivity.s = (eduy) ahhkVar.cp.b();
            photoPickerIntentActivity.t = (eddo) ahhkVar.bP.b();
            photoPickerIntentActivity.u = ahhkVar.an();
            photoPickerIntentActivity.v = ahhkVar.aa();
            ekgp ekgpVar = ekoj.a;
            photoPickerIntentActivity.w = new eygj(ekgpVar, ekgpVar);
        }
    }
}
