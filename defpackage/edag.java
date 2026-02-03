package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edag extends edao {
    public dtaq ag;
    public ednl ah;
    public dsvh ai;
    public dsvx aj;
    public dswb ak;
    private iv am;

    @Override // defpackage.edao, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((edao) this).al) {
            return;
        }
        eygl.a(this);
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        eeji eejiVar = new eeji(z(), R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        eejiVar.u(R.string.op3_art_discard_dialog_title);
        eejiVar.k(R.string.op3_art_discard_dialog_body);
        eejiVar.r(R.string.op3_art_discard_dialog_discard_button, new DialogInterface.OnClickListener() { // from class: edad
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                edag edagVar = this.a;
                edagVar.ai.a(dsvg.e(), ((iv) dialogInterface).b(i));
                edagVar.ah.f(2);
                eg egVarG = edagVar.G();
                egVarG.getClass();
                egVarG.setResult(0);
                egVarG.finish();
            }
        });
        eejiVar.m(R.string.op3_art_discard_dialog_keep_editing_button, new DialogInterface.OnClickListener() { // from class: edae
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                edag edagVar = this.a;
                edagVar.ai.a(dsvg.e(), ((iv) dialogInterface).b(i));
                edagVar.hh();
            }
        });
        iv ivVarCreate = eejiVar.create();
        this.am = ivVarCreate;
        this.Z.c(new dtap(this.ag, new edaf(this), ivVarCreate, this));
        return this.am;
    }
}
