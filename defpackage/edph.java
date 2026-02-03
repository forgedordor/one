package defpackage;

import android.content.ContentUris;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edph extends vo {
    public final dsvh a;
    public final edmz d;
    public final edpa e;
    private ekgb f;
    private final ekgb g;
    private final eddy h;
    private final dswb i;

    public edph(eddy eddyVar, dsvh dsvhVar, dswb dswbVar, edmz edmzVar, edgm edgmVar, edpa edpaVar) {
        int i = ekgb.d;
        this.f = ekoe.a;
        this.h = eddyVar;
        this.a = dsvhVar;
        this.i = dswbVar;
        this.d = edmzVar;
        this.e = edpaVar;
        ekfw ekfwVar = new ekfw();
        if (!edgmVar.a.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 65536).isEmpty()) {
            ekfwVar.h(0);
        }
        if (edgmVar.a(new Intent("android.intent.action.GET_CONTENT").setType("image/*"))) {
            ekfwVar.h(1);
        }
        this.g = ekfwVar.g();
    }

    @Override // defpackage.vo
    public final int a() {
        return this.f.size() + ((ekoe) this.g).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final int dF(int i) {
        ekgb ekgbVar = this.g;
        if (i < ((ekoe) ekgbVar).c) {
            return ((Integer) ekgbVar.get(i)).intValue();
        }
        return 2;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            edpe edpeVar = new edpe(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false));
            View view = edpeVar.s;
            MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.photo_picker_button_text);
            materialTextView.setText(R.string.op3_picker_camera);
            materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(materialTextView.getContext(), R.drawable.quantum_gm_ic_photo_camera_vd_theme_24), (Drawable) null, (Drawable) null);
            this.i.b.a(89730).b(view);
            view.setOnClickListener(new View.OnClickListener() { // from class: edpb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    edph edphVar = this.a;
                    edphVar.a.a(dsvg.e(), view2);
                    DevicePhotosFragment devicePhotosFragment = edphVar.e.a;
                    if (edmr.b(devicePhotosFragment.z(), "android.permission.CAMERA")) {
                        devicePhotosFragment.an.c("android.permission.CAMERA");
                    } else {
                        devicePhotosFragment.a();
                    }
                }
            });
            return edpeVar;
        }
        if (i != 1) {
            return new edpg(fbgv.i() ? SquareImageView.a(viewGroup.getContext()) : new SquareImageView(viewGroup.getContext()));
        }
        edpf edpfVar = new edpf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false));
        View view2 = edpfVar.s;
        MaterialTextView materialTextView2 = (MaterialTextView) view2.findViewById(R.id.photo_picker_button_text);
        materialTextView2.setText(R.string.op3_picker_gallery);
        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(materialTextView2.getContext(), R.drawable.quantum_gm_ic_camera_roll_vd_theme_24), (Drawable) null, (Drawable) null);
        this.i.b.a(89743).b(view2);
        view2.setOnClickListener(new View.OnClickListener() { // from class: edpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                edph edphVar = this.a;
                edphVar.a.a(dsvg.e(), view3);
                Intent type = new Intent("android.intent.action.GET_CONTENT").setType("image/*");
                DevicePhotosFragment devicePhotosFragment = edphVar.e.a;
                if (devicePhotosFragment.ak.a(type)) {
                    devicePhotosFragment.ao.c(type);
                }
            }
        });
        return edpfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = ((ekoe) this.g).c;
        if (i >= i2) {
            edkz edkzVar = (edkz) this.f.get(i - i2);
            int i3 = edpg.t;
            SquareImageView squareImageView = ((edpg) wvVar).s;
            if (edkzVar.b().g()) {
                squareImageView.setContentDescription(squareImageView.getContext().getString(R.string.op3_picker_accessibility_photo, eddj.a((evvp) edkzVar.b().c())));
            }
            final Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, edkzVar.a());
            eddy eddyVar = this.h;
            edea edeaVar = new edea();
            edeaVar.a();
            eddyVar.g(uriWithAppendedId, edeaVar, squareImageView);
            this.i.b.a(89756).c(squareImageView);
            squareImageView.setOnClickListener(new View.OnClickListener() { // from class: edpd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edph edphVar = this.a;
                    edphVar.a.a(dsvg.e(), view);
                    edphVar.d.c = 8;
                    edphVar.e.a.c.m(uriWithAppendedId);
                }
            });
        }
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        if (wvVar instanceof edpg) {
            dswb dswbVar = this.i;
            int i = edpg.t;
            dswbVar.b.c(((edpg) wvVar).s);
        }
    }

    public final void l(ekgb ekgbVar) {
        this.f = ekgbVar;
        p();
    }
}
