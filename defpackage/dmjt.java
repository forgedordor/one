package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjt implements fdat {
    final /* synthetic */ fctc a;

    public dmjt(fctc fctcVar) {
        this.a = fctcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dmlr.a(null, CameraActivity.k(this.a).f, hmlVar, 0, 1);
        }
        return fctx.a;
    }
}
