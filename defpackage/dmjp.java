package defpackage;

import android.content.Intent;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjp extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmjp(CameraActivity cameraActivity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmjp) c((dojw) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dojw dojwVar = (dojw) this.a;
        eg egVarJ = this.b.j();
        Intent intent = new Intent();
        intent.putExtra("camera_capture_key", dojwVar);
        egVarJ.setResult(-1, intent);
        egVarJ.finish();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmjp dmjpVar = new dmjp(this.b, fcxyVar);
        dmjpVar.a = obj;
        return dmjpVar;
    }
}
