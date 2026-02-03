package defpackage;

import android.view.View;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjk extends fcyz implements fdat {
    int a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmjk(CameraActivity cameraActivity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmjk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnhb dnhbVarL = this.b.l();
            List list = CameraActivity.n;
            this.a = 1;
            obj = dnhbVarL.b(list, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            CameraActivity cameraActivity = this.b;
            cameraActivity.m().a();
            View view = cameraActivity.t;
            if (view == null) {
                fdbq.c("errorPromptView");
                view = null;
            }
            view.setVisibility(8);
            cameraActivity.o();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmjk(this.b, fcxyVar);
    }
}
