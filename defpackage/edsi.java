package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edsi extends edsa {
    public dtau ah;
    public eduu ai;
    public eddy aj;
    public dswb ak;
    public dsvh al;
    public edds am;
    public edmz an;
    public edgv ao;
    public edgm ap;
    public eduy aq;
    public dtar ar;
    public ejwi as;
    public adj at;
    public adj au;
    public iv av;
    private TextView aw;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.photo_picker_chooser_fragment, viewGroup, false);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) throws Resources.NotFoundException {
        ejwi ejwiVarJ;
        super.ae(bundle);
        TextView textView = (TextView) this.Q.findViewById(R.id.photo_picker_chooser_google_photos_title);
        eddy eddyVar = this.aj;
        Context contextZ = z();
        Uri uri = Uri.parse(fbgv.f());
        edea edeaVar = new edea();
        int dimensionPixelSize = z().getResources().getDimensionPixelSize(R.dimen.photo_picker_placeholder_icon_size);
        ((rbr) eddyVar.a(contextZ, uri, edeaVar).S(z().getResources().getDrawable(R.drawable.photo_picker_placeholder_icon))).w(new edsh(dimensionPixelSize, dimensionPixelSize, textView));
        textView.setOnClickListener(new View.OnClickListener() { // from class: edsd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edsi edsiVar = this.a;
                edsiVar.al.a(dsvg.e(), view);
                edsiVar.hh();
                edsiVar.ai.h();
            }
        });
        ((TextView) this.Q.findViewById(R.id.photo_picker_chooser_device_photos_title)).setOnClickListener(new View.OnClickListener() { // from class: edse
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edsi edsiVar = this.a;
                edsiVar.al.a(dsvg.e(), view);
                edsiVar.hh();
                edsiVar.ai.g();
            }
        });
        this.aw = (TextView) this.Q.findViewById(R.id.photo_picker_chooser_camera_title);
        ejwi ejwiVarI = ejwi.i(this.am.a("camera_image.jpg"));
        this.as = ejwiVarI;
        if (ejwiVarI.g()) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Parcelable) this.as.c());
            ejwiVarJ = ejwi.j(intent);
        } else {
            if (Log.isLoggable("PhotoSourceChooser", 5)) {
                Log.w("PhotoSourceChooser", "Uri for camera photo camera_image.jpg is not present");
            }
            ejwiVarJ = ejud.a;
        }
        if (ejwiVarJ.g() && this.ap.a((Intent) ejwiVarJ.c())) {
            this.aw.setOnClickListener(new View.OnClickListener() { // from class: edsf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edsi edsiVar = this.a;
                    edsiVar.al.a(dsvg.e(), view);
                    edsiVar.aq.b();
                    if (edmr.b(edsiVar.z(), "android.permission.CAMERA")) {
                        edsiVar.au.c("android.permission.CAMERA");
                    } else {
                        edsiVar.at.c((Uri) edsiVar.as.c());
                    }
                }
            });
        } else {
            this.aw.setVisibility(8);
        }
    }

    @Override // defpackage.edsa, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((edsa) this).ag) {
            return;
        }
        eygl.a(this);
    }

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) throws Resources.NotFoundException {
        Dialog dialogGK = super.gK(bundle);
        eefa eefaVar = (eefa) dialogGK;
        eefaVar.a().E(3);
        eefaVar.setOnShowListener(new dtas(this, new DialogInterface.OnShowListener() { // from class: edsc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                edsi edsiVar = this.a;
                edsiVar.ar.b(109423).a();
                edsiVar.ak.b.a(109424).b(edsiVar.Q.findViewById(R.id.photo_picker_chooser_google_photos_title));
                edsiVar.ak.b.a(109425).b(edsiVar.Q.findViewById(R.id.photo_picker_chooser_device_photos_title));
                edsiVar.ak.b.a(109426).b(edsiVar.Q.findViewById(R.id.photo_picker_chooser_camera_title));
                dtat.c(edsiVar);
            }
        }));
        return dialogGK;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ar = this.ah.a(this);
        this.av = edmr.a(z());
        this.at = O(new aeq(), new adi() { // from class: edsg
            @Override // defpackage.adi
            public final void a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                edsi edsiVar = this.a;
                if (zBooleanValue) {
                    edsiVar.an.c = 7;
                    edsiVar.ai.m((Uri) edsiVar.as.c());
                }
                edsiVar.hh();
            }
        });
        this.au = O(new aen(), new adi() { // from class: edsb
            @Override // defpackage.adi
            public final void a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                edsi edsiVar = this.a;
                if (zBooleanValue) {
                    edgv edgvVar = edsiVar.ao;
                    euqu euquVar = (euqu) euqv.a.createBuilder();
                    euquVar.copyOnWrite();
                    euqv euqvVar = (euqv) euquVar.instance;
                    euqvVar.c = 122;
                    euqvVar.b |= 1;
                    edgvVar.a((euqv) euquVar.build());
                    edsiVar.at.c((Uri) edsiVar.as.c());
                    return;
                }
                if (edsiVar.aN("android.permission.CAMERA")) {
                    edgv edgvVar2 = edsiVar.ao;
                    euqu euquVar2 = (euqu) euqv.a.createBuilder();
                    euquVar2.copyOnWrite();
                    euqv euqvVar2 = (euqv) euquVar2.instance;
                    euqvVar2.c = 123;
                    euqvVar2.b |= 1;
                    edgvVar2.a((euqv) euquVar2.build());
                    return;
                }
                edgv edgvVar3 = edsiVar.ao;
                euqu euquVar3 = (euqu) euqv.a.createBuilder();
                euquVar3.copyOnWrite();
                euqv euqvVar3 = (euqv) euquVar3.instance;
                euqvVar3.c = 124;
                euqvVar3.b |= 1;
                edgvVar3.a((euqv) euquVar3.build());
                edsiVar.av.show();
            }
        });
    }
}
