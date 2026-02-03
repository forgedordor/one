package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjs extends fcyz implements fdat {
    int a;
    final /* synthetic */ fctc b;
    final /* synthetic */ CameraActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmjs(fctc fctcVar, CameraActivity cameraActivity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fctcVar;
        this.c = cameraActivity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmjs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fduj fdujVar = CameraActivity.k(this.b).e;
            dmjr dmjrVar = new dmjr(this.c, null);
            this.a = 1;
            if (fdpy.b(fdujVar, dmjrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmjs(this.b, this.c, fcxyVar);
    }
}
