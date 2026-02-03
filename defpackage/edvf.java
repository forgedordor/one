package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edvf implements adf {
    final /* synthetic */ edvg a;

    public edvf(edvg edvgVar) {
        this.a = edvgVar;
    }

    @Override // defpackage.adf
    public final void a() {
        edvg edvgVar = this.a;
        if (edvg.D(edvgVar.C()) && !edvgVar.n) {
            edvgVar.n = true;
            Object objBb = edvgVar.bb();
            PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = (PhotoPickerWebViewIntentActivity) edvgVar;
            ahhk ahhkVar = (ahhk) objBb;
            photoPickerWebViewIntentActivity.p = (eddo) ahhkVar.bP.b();
            photoPickerWebViewIntentActivity.q = (eddy) ahhkVar.bR.b();
            photoPickerWebViewIntentActivity.r = (drjk) ahhkVar.b.cW.b();
        }
    }
}
