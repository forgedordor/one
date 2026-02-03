package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjr extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmjr(CameraActivity cameraActivity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmjr) c((dmnr) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!(((dmnr) this.a) instanceof dmnr)) {
            throw new fctg();
        }
        this.b.j().finish();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmjr dmjrVar = new dmjr(this.b, fcxyVar);
        dmjrVar.a = obj;
        return dmjrVar;
    }
}
