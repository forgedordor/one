package com.google.android.libraries.user.profile.photopicker.fragment.devicephotos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import defpackage.adi;
import defpackage.adj;
import defpackage.aen;
import defpackage.aeo;
import defpackage.dsvh;
import defpackage.dsvx;
import defpackage.dswb;
import defpackage.edds;
import defpackage.eddy;
import defpackage.edgm;
import defpackage.edgv;
import defpackage.edla;
import defpackage.edlb;
import defpackage.edmr;
import defpackage.edmz;
import defpackage.edpa;
import defpackage.edph;
import defpackage.edpi;
import defpackage.edpj;
import defpackage.eduu;
import defpackage.ejud;
import defpackage.ejwi;
import defpackage.ejxm;
import defpackage.ekgb;
import defpackage.ekoe;
import defpackage.eurb;
import defpackage.eurc;
import defpackage.eurj;
import defpackage.eurk;
import defpackage.eurl;
import defpackage.eurm;
import defpackage.eurn;
import defpackage.euro;
import defpackage.eygl;
import defpackage.fbgv;
import defpackage.fcsu;
import defpackage.iv;
import defpackage.kxj;
import defpackage.lvz;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class DevicePhotosFragment extends edpj {
    public edlb a;
    public dsvh ag;
    public edds ah;
    public edmz ai;
    public edgv aj;
    public edgm ak;
    public fcsu al;
    public ejwi am;
    public adj an;
    public adj ao;
    public edph ap;
    public iv aq;
    public ejwi ar;
    private adj at;
    private adj au;
    private MaterialTextView av;
    private View aw;
    private MaterialButton ax;
    private RecyclerView ay;
    private boolean az = false;
    public edpi b;
    public eduu c;
    public dswb d;
    public dsvx e;

    private final void aV(boolean z) {
        if (kxj.c(z(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            q();
            r(0);
        } else if (aN("android.permission.READ_EXTERNAL_STORAGE")) {
            r(1);
            f(ejud.a);
        } else if (z) {
            b();
        } else {
            r(2);
            f(ejud.a);
        }
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(true != fbgv.i() ? R.layout.photo_picker_device_photos_fragment : R.layout.photo_picker_device_photos_fragment_art_style, viewGroup, false);
        this.d.b.a(110513).b(viewInflate);
        return viewInflate;
    }

    public final void a() {
        ejwi ejwiVarJ;
        if (this.ar.g()) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Parcelable) this.ar.c());
            ejwiVarJ = ejwi.j(intent);
        } else {
            if (Log.isLoggable("DevicePhotosFragment", 5)) {
                Log.w("DevicePhotosFragment", "Uri for camera photo camera_image.jpg is not present");
            }
            ejwiVarJ = ejud.a;
        }
        if (ejwiVarJ.g()) {
            this.au.c(ejwiVarJ.c());
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        this.ay = (RecyclerView) this.Q.findViewById(R.id.photo_picker_device_photos_grid);
        this.d.b.a(89737).b(this.ay);
        z();
        this.ay.ao(new GridLayoutManager(this.ay.getResources().getInteger(R.integer.photo_picker_num_columns)));
        edpi edpiVar = this.b;
        edpa edpaVar = new edpa(this);
        eddy eddyVar = (eddy) edpiVar.a.b();
        eddyVar.getClass();
        dsvh dsvhVar = (dsvh) edpiVar.b.b();
        dsvhVar.getClass();
        dswb dswbVar = (dswb) edpiVar.c.b();
        dswbVar.getClass();
        edmz edmzVar = (edmz) edpiVar.d.b();
        edmzVar.getClass();
        edgm edgmVar = (edgm) edpiVar.e.b();
        edgmVar.getClass();
        edph edphVar = new edph(eddyVar, dsvhVar, dswbVar, edmzVar, edgmVar, edpaVar);
        this.ap = edphVar;
        this.ay.al(edphVar);
        edph edphVar2 = this.ap;
        int i = ekgb.d;
        edphVar2.l(ekoe.a);
        this.av = (MaterialTextView) this.Q.findViewById(R.id.photo_picker_device_photos_permissions_message);
        this.aw = this.Q.findViewById(R.id.photo_picker_device_photos_permission_buttons_container);
        MaterialButton materialButton = (MaterialButton) this.Q.findViewById(R.id.photo_picker_device_photos_permission_button);
        this.ax = materialButton;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: edox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevicePhotosFragment devicePhotosFragment = this.a;
                devicePhotosFragment.ag.a(dsvg.e(), view);
                devicePhotosFragment.b();
            }
        });
        this.d.b.a(89728).b(this.ax);
        this.ar = ejwi.i(this.ah.a("camera_image.jpg"));
        ejxm ejxmVar = (ejxm) this.al.b();
        ejxmVar.e();
        ejxmVar.f();
        this.am = ejwi.j(ejxmVar);
        edgv edgvVar = this.aj;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 22;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        final Snackbar snackbarP = Snackbar.p(this.Q, R.string.op3_something_went_wrong, -2);
        this.a.a.f(Q(), new lvz() { // from class: edoz
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edla edlaVar = (edla) obj;
                boolean zG = edlaVar.a().g();
                DevicePhotosFragment devicePhotosFragment = this.a;
                if (zG) {
                    snackbarP.i();
                } else {
                    devicePhotosFragment.ap.l(edlaVar.b());
                }
                devicePhotosFragment.f(ejwi.j(edlaVar));
            }
        });
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        boolean z = this.az;
        this.az = false;
        aV(z);
    }

    public final void b() {
        this.at.c("android.permission.READ_EXTERNAL_STORAGE");
    }

    public final void f(ejwi ejwiVar) {
        if (this.am.g()) {
            eurn eurnVar = (eurn) euro.a.createBuilder();
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            euroVar.c = 22;
            euroVar.b |= 1;
            long jA = ((ejxm) this.am.c()).a(TimeUnit.MICROSECONDS);
            eurnVar.copyOnWrite();
            euro euroVar2 = (euro) eurnVar.instance;
            euroVar2.b |= 2;
            euroVar2.d = jA;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            if (ejwiVar.g()) {
                edla edlaVar = (edla) ejwiVar.c();
                if (edlaVar.a().g()) {
                    eurb eurbVar = (eurb) eurc.a.createBuilder();
                    eurbVar.copyOnWrite();
                    eurc eurcVar = (eurc) eurbVar.instance;
                    eurcVar.d = 0;
                    eurcVar.b |= 2;
                    eurnVar.copyOnWrite();
                    euro euroVar3 = (euro) eurnVar.instance;
                    eurc eurcVar2 = (eurc) eurbVar.build();
                    eurcVar2.getClass();
                    euroVar3.e = eurcVar2;
                    euroVar3.b |= 4;
                }
                eurjVar.c(edlaVar.c());
            }
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar4 = (euro) eurnVar.build();
            euroVar4.getClass();
            eurkVar.d = euroVar4;
            eurkVar.b |= 1;
            this.aj.c((eurk) eurjVar.build());
            ((ejxm) this.am.c()).e();
        }
    }

    @Override // defpackage.edpj, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.as) {
            return;
        }
        eygl.a(this);
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.aq = edmr.a(z());
        this.at = O(new aen(), new adi() { // from class: edow
            @Override // defpackage.adi
            public final void a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                DevicePhotosFragment devicePhotosFragment = this.a;
                if (zBooleanValue) {
                    devicePhotosFragment.r(0);
                    if (fbgv.a.get().t()) {
                        devicePhotosFragment.am = ejud.a;
                    }
                    devicePhotosFragment.q();
                    return;
                }
                if (devicePhotosFragment.aN("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment.r(1);
                } else {
                    devicePhotosFragment.r(2);
                }
            }
        });
        this.an = O(new aen(), new adi() { // from class: edou
            @Override // defpackage.adi
            public final void a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                DevicePhotosFragment devicePhotosFragment = this.a;
                if (zBooleanValue) {
                    edgv edgvVar = devicePhotosFragment.aj;
                    euqu euquVar = (euqu) euqv.a.createBuilder();
                    euquVar.copyOnWrite();
                    euqv euqvVar = (euqv) euquVar.instance;
                    euqvVar.c = 122;
                    euqvVar.b |= 1;
                    edgvVar.a((euqv) euquVar.build());
                    devicePhotosFragment.a();
                    return;
                }
                if (devicePhotosFragment.aN("android.permission.CAMERA")) {
                    edgv edgvVar2 = devicePhotosFragment.aj;
                    euqu euquVar2 = (euqu) euqv.a.createBuilder();
                    euquVar2.copyOnWrite();
                    euqv euqvVar2 = (euqv) euquVar2.instance;
                    euqvVar2.c = 123;
                    euqvVar2.b |= 1;
                    edgvVar2.a((euqv) euquVar2.build());
                    return;
                }
                edgv edgvVar3 = devicePhotosFragment.aj;
                euqu euquVar3 = (euqu) euqv.a.createBuilder();
                euquVar3.copyOnWrite();
                euqv euqvVar3 = (euqv) euquVar3.instance;
                euqvVar3.c = 124;
                euqvVar3.b |= 1;
                edgvVar3.a((euqv) euquVar3.build());
                devicePhotosFragment.aq.show();
            }
        });
        this.ao = O(new aeo(), new adi() { // from class: edov
            @Override // defpackage.adi
            public final void a(Object obj) {
                adh adhVar = (adh) obj;
                if (adhVar.a == -1) {
                    Intent intent = adhVar.b;
                    if (intent == null && fbgv.a.get().m()) {
                        return;
                    }
                    DevicePhotosFragment devicePhotosFragment = this.a;
                    devicePhotosFragment.ai.c = 8;
                    devicePhotosFragment.c.m(intent.getData());
                }
            }
        });
        this.au = O(new aeo(), new adi() { // from class: edoy
            @Override // defpackage.adi
            public final void a(Object obj) {
                if (((adh) obj).a == -1) {
                    DevicePhotosFragment devicePhotosFragment = this.a;
                    if (devicePhotosFragment.ar.g()) {
                        devicePhotosFragment.ai.c = 7;
                        devicePhotosFragment.c.m((Uri) devicePhotosFragment.ar.c());
                    }
                }
            }
        });
    }

    public final void p() {
        if (aI()) {
            aV(true);
        } else {
            this.az = true;
        }
    }

    public final void q() {
        this.a.c();
    }

    public final void r(int i) {
        if (i == 0) {
            this.av.setVisibility(8);
            this.aw.setVisibility(8);
            this.ax.setVisibility(8);
            this.ay.setVisibility(0);
            return;
        }
        if (i == 1) {
            this.e.d(this.av, this.d.a(118676));
            this.av.setVisibility(0);
            this.aw.setVisibility(0);
            this.av.setText(R.string.op3_allow_access_to_photos);
            this.ax.setVisibility(0);
            return;
        }
        this.e.d(this.av, this.d.a(118677));
        this.ax.setVisibility(8);
        if (!edmr.b(z(), "android.permission.READ_EXTERNAL_STORAGE")) {
            this.av.setVisibility(8);
            this.aw.setVisibility(8);
        } else {
            this.av.setVisibility(0);
            this.aw.setVisibility(0);
            this.av.setText(R.string.op3_allow_access_to_photos_in_settings);
        }
    }
}
