package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjl extends fcyz implements fdat {
    int a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmjl(CameraActivity cameraActivity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmjl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            obj = dnhbVarL.a(list, true, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Map) obj).values().contains(false)) {
            final CameraActivity cameraActivity = this.b;
            ComposeView composeView = cameraActivity.s;
            if (composeView == null) {
                fdbq.c("cameraComposeView");
                composeView = null;
            }
            composeView.setVisibility(8);
            dpxm.c(cameraActivity.m(), null, new Integer(R.string.access_fullscreen_camera_permission_description), null, new Integer(R.string.open_settings), new View.OnClickListener() { // from class: dmjj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CameraActivity cameraActivity2 = cameraActivity;
                    fdil.d(cameraActivity2.n(), null, null, new dmjk(cameraActivity2, null), 3);
                }
            }, 1);
        } else {
            this.b.o();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmjl(this.b, fcxyVar);
    }
}
