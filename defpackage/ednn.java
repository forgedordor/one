package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ednn extends ednv {
    public dtau ag;
    public dtar ah;

    @Override // defpackage.ednv, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((ednv) this).ai) {
            return;
        }
        eygl.a(this);
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        eeji eejiVar = new eeji(z(), R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        fbgv.a.get().F();
        eejiVar.k(R.string.op3_edit_shape_message);
        eejiVar.r(R.string.op3_update_got_it, null);
        iv ivVarCreate = eejiVar.create();
        ivVarCreate.setOnShowListener(new dtas(this, new DialogInterface.OnShowListener() { // from class: ednm
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ednn ednnVar = this.a;
                ednnVar.ah.b(89739).a();
                dtat.c(ednnVar);
            }
        }));
        return ivVarCreate;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ah = this.ag.a(this);
    }
}
