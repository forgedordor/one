package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edso extends edsj {
    public lxo ah;
    public dtau ai;
    public eddy aj;
    public eduu ak;
    public dtar al;
    public edtf am;
    private iv an;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(z()).inflate(R.layout.profile_picture_remove_dialog, viewGroup);
        this.an.a.b(viewInflate);
        this.an.setTitle(R.string.op3_remove_dialog_title);
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        this.am.a().f(Q(), new lvz() { // from class: edsk
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edhm edhmVar = (edhm) obj;
                if (edhmVar.d() == 4) {
                    edso edsoVar = this.a;
                    String strB = ((edml) edhmVar.b().c()).b();
                    ImageView imageView = (ImageView) edsoVar.Q.findViewById(R.id.photo_picker_remove_monogram);
                    eddy eddyVar = edsoVar.aj;
                    Uri uri = Uri.parse(strB);
                    edea edeaVar = new edea();
                    edeaVar.a.add(eddz.FORCE_MONOGRAM);
                    edeaVar.c();
                    edeaVar.a();
                    eddyVar.f(uri, edeaVar, imageView);
                }
            }
        });
    }

    @Override // defpackage.edsj, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((edsj) this).ag) {
            return;
        }
        eygl.a(this);
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        eeji eejiVar = new eeji(z(), R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        eejiVar.r(R.string.op3_preview_remove, new DialogInterface.OnClickListener() { // from class: edsl
            /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.content.DialogInterface r4, int r5) {
                /*
                    r3 = this;
                    edso r4 = r3.a
                    dtar r0 = r4.al
                    r0.c(r5)
                    edtf r5 = r4.am
                    edmj r5 = r5.b
                    java.util.concurrent.atomic.AtomicBoolean r0 = r5.g
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L57
                    edhm r0 = r5.j
                    edhd r0 = (defpackage.edhd) r0
                    int r1 = r0.b
                    r2 = 4
                    if (r1 != r2) goto L34
                    ejwi r0 = r0.a
                    boolean r1 = r0.g()
                    if (r1 == 0) goto L34
                    java.lang.Object r0 = r0.c()
                    edml r0 = (defpackage.edml) r0
                    edhm r0 = defpackage.edhm.e(r0)
                    r5.c(r0)
                    goto L3b
                L34:
                    edhm r0 = defpackage.edhm.h()
                    r5.c(r0)
                L3b:
                    exwf r0 = defpackage.exwf.OBAKE_MDI_REMOVE_PHOTO
                    r5.e(r0)
                    edmi r0 = r5.i
                    exwf r1 = defpackage.exwf.OBAKE_MDI_DELETE_PERSON_PHOTO_ME
                    r0.c(r1)
                    dvdf r0 = r5.d
                    com.google.common.util.concurrent.ListenableFuture r0 = r0.a()
                    edmh r1 = new edmh
                    r1.<init>(r5)
                    eosc r5 = r5.c
                    defpackage.eork.r(r0, r1, r5)
                L57:
                    eduu r4 = r4.ak
                    r4.o()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.edsl.onClick(android.content.DialogInterface, int):void");
            }
        });
        eejiVar.m(R.string.op3_remove_dialog_cancel_button, new DialogInterface.OnClickListener() { // from class: edsm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                edso edsoVar = this.a;
                edsoVar.al.c(i);
                edsoVar.hh();
            }
        });
        iv ivVarCreate = eejiVar.create();
        this.an = ivVarCreate;
        ivVarCreate.setOnShowListener(new dtas(this, new DialogInterface.OnShowListener() { // from class: edsn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                edso edsoVar = this.a;
                edsoVar.al.b(89760).a();
                edsoVar.al.a(-1, 89761).a();
                edsoVar.al.a(-2, 89762).a();
                dtat.c(edsoVar);
            }
        }));
        return this.an;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.al = this.ai.a(this);
        this.am = (edtf) this.ah.a(edtf.class);
    }
}
