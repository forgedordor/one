package com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.abl;
import defpackage.ains;
import defpackage.asgr;
import defpackage.bvur;
import defpackage.bwbt;
import defpackage.bwdo;
import defpackage.bxeq;
import defpackage.cg;
import defpackage.cpch;
import defpackage.czdj;
import defpackage.czdl;
import defpackage.czdp;
import defpackage.czdt;
import defpackage.czdu;
import defpackage.czdv;
import defpackage.czeb;
import defpackage.czec;
import defpackage.czef;
import defpackage.czej;
import defpackage.daje;
import defpackage.dajf;
import defpackage.dakl;
import defpackage.dclh;
import defpackage.dcnf;
import defpackage.ddqe;
import defpackage.ddqf;
import defpackage.ddqg;
import defpackage.ddqh;
import defpackage.ddqi;
import defpackage.ddqj;
import defpackage.ddqo;
import defpackage.ddqp;
import defpackage.ddqq;
import defpackage.ddqx;
import defpackage.ddre;
import defpackage.ddrp;
import defpackage.ddrw;
import defpackage.eehg;
import defpackage.ekrg;
import defpackage.emsl;
import defpackage.emsp;
import defpackage.fcsu;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationAttachmentPickerActivity extends czdl implements ddqq, czeb {
    public static final ekrg K = ekrg.c("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerActivity");
    TextView L;
    TextView M;
    ImageView N;
    View O;
    public cpch P;
    public ains Q;
    public czec R;
    public bvur S;
    public fcsu T;
    public bwdo U;
    private czef W;
    private czdj X;
    private RecyclerView Y;
    private ImageView Z;
    private TextView aa;
    private View ab;
    private View ac;
    private View ad;
    private MenuItem ae;
    private int af;
    private TextView ag;

    private final void ar() {
        MenuItem menuItem = this.ae;
        if (menuItem != null) {
            menuItem.setVisible(false);
            this.ae.setEnabled(false);
        }
        this.ab.setVisibility(0);
        this.ad.setVisibility(8);
        this.Y.setVisibility(8);
    }

    @Override // defpackage.czeb
    public final void D() {
        MenuItem menuItem = this.ae;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            return;
        }
        this.ae.collapseActionView();
    }

    @Override // defpackage.czeb
    public final void F() {
        if (this.ab.getVisibility() == 0) {
            MenuItem menuItem = this.ae;
            if (menuItem != null) {
                menuItem.setVisible(true);
                this.ae.setEnabled(true);
            }
            this.ab.setVisibility(8);
            this.Y.setVisibility(8);
            this.ad.setVisibility(0);
        }
    }

    @Override // defpackage.ddqq
    public final void H(ddqj ddqjVar) {
        czdj czdjVar = new czdj(ddqjVar);
        this.X = czdjVar;
        ddqj ddqjVar2 = czdjVar.a;
        try {
            if (this.R == null) {
                ddqjVar2.a.setLocationSource(null);
            } else {
                ddqjVar2.a.setLocationSource(new ddqh());
            }
            try {
                this.X.a.a().a.setCompassEnabled(false);
                try {
                    this.X.a.a().a.setRotateGesturesEnabled(false);
                    try {
                        this.X.a.a().a.setMyLocationButtonEnabled(false);
                        if (this.P.g()) {
                            czdj czdjVar2 = this.X;
                            Parcelable.Creator<MapStyleOptions> creator = MapStyleOptions.CREATOR;
                            try {
                                try {
                                    czdjVar2.a.a.setMapStyle(new MapStyleOptions(new String(dcnf.b(getResources().openRawResource(R.raw.mapstyle_night)), "UTF-8")));
                                } catch (RemoteException e) {
                                    throw new ddrw(e);
                                }
                            } catch (IOException e2) {
                                throw new Resources.NotFoundException("Failed to read resource 2132017210: ".concat(e2.toString()));
                            }
                        }
                        try {
                            this.X.a.a.setOnMapClickListener(new ddqi(new czdp(this)));
                            try {
                                this.X.a.a.setOnMarkerDragListener(new ddqg(new czdv(this)));
                                try {
                                    this.X.a.a.setOnMarkerClickListener(new ddqf());
                                    this.R.g();
                                    af(emsl.LOADED);
                                } catch (RemoteException e3) {
                                    throw new ddrw(e3);
                                }
                            } catch (RemoteException e4) {
                                throw new ddrw(e4);
                            }
                        } catch (RemoteException e5) {
                            throw new ddrw(e5);
                        }
                    } catch (RemoteException e6) {
                        throw new ddrw(e6);
                    }
                } catch (RemoteException e7) {
                    throw new ddrw(e7);
                }
            } catch (RemoteException e8) {
                throw new ddrw(e8);
            }
        } catch (RemoteException e9) {
            throw new ddrw(e9);
        }
    }

    @Override // defpackage.cyvb
    protected final emsp M() {
        return emsp.LOCATION;
    }

    @Override // defpackage.cyvb
    protected final Class N() {
        return LocationContentItem.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    @Override // defpackage.czeb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ag(defpackage.bxeq r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity.ag(bxeq):void");
    }

    @Override // defpackage.czeb
    public final void ah() {
        finish();
    }

    @Override // defpackage.czeb
    public final void ai() {
        this.ag.setText(R.string.location_attachment_picker_location_error);
    }

    @Override // defpackage.czeb
    public final void aj() {
        czef czefVar = this.W;
        if (czefVar.d != 3) {
            czefVar.d = 3;
            czefVar.p();
        }
    }

    @Override // defpackage.czeb
    public final void ak() {
        ar();
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: czdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.startActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"));
            }
        });
    }

    @Override // defpackage.czeb
    public final void al() {
        czef czefVar = this.W;
        if (czefVar.d != 1) {
            czefVar.d = 1;
            czefVar.p();
        }
    }

    @Override // defpackage.czeb
    public final void am() {
        ar();
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: czdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        });
    }

    @Override // defpackage.czeb
    public final void an(LatLng latLng) {
        if (this.X != null) {
            ddre ddreVar = new ddre();
            ddreVar.b(latLng);
            ddreVar.a = 17.0f;
            ddreVar.c = 0.0f;
            ddreVar.b = 0.0f;
            CameraPosition cameraPositionA = ddreVar.a();
            ddqj ddqjVar = this.X.a;
            try {
                ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = ddqe.a;
                dclh.n(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                IObjectWrapper iObjectWrapperNewCameraPosition = iCameraUpdateFactoryDelegate.newCameraPosition(cameraPositionA);
                dclh.m(iObjectWrapperNewCameraPosition);
                try {
                    ddqjVar.a.moveCamera(iObjectWrapperNewCameraPosition);
                } catch (RemoteException e) {
                    throw new ddrw(e);
                }
            } catch (RemoteException e2) {
                throw new ddrw(e2);
            }
        }
    }

    @Override // defpackage.czeb
    public final void ao(LatLng latLng) {
        czdj czdjVar = this.X;
        if (czdjVar != null) {
            try {
                czdjVar.a.a.clear();
                MarkerOptions markerOptions = new MarkerOptions();
                if (latLng == null) {
                    throw new IllegalArgumentException("latlng cannot be null - a position is required.");
                }
                markerOptions.a = latLng;
                markerOptions.b = getString(R.string.location_attachment_picker_marker_title);
                try {
                    IMarkerDelegate iMarkerDelegateAddMarker = this.X.a.a.addMarker(markerOptions);
                    if (iMarkerDelegateAddMarker != null) {
                        if (markerOptions.o == 1) {
                            new ddrp(iMarkerDelegateAddMarker);
                        } else {
                            new ddrp(iMarkerDelegateAddMarker);
                        }
                    }
                } catch (RemoteException e) {
                    throw new ddrw(e);
                }
            } catch (RemoteException e2) {
                throw new ddrw(e2);
            }
        }
    }

    @Override // defpackage.czeb
    public final void ap(String str, Bitmap bitmap, int i) {
        czef czefVar = this.W;
        if (i > 0) {
            List list = czefVar.a;
            if (i < list.size()) {
                bxeq bxeqVar = (bxeq) list.get(i - 1);
                if (TextUtils.equals(bxeqVar.b.ae(), str)) {
                    bxeqVar.c = bitmap;
                    czefVar.q(i);
                }
            }
        }
    }

    @Override // defpackage.czeb
    public final void aq(bxeq bxeqVar, boolean z) {
        String string;
        this.ag.setText(R.string.location_attachment_picker_send_location);
        dakl.h(this.M, bxeqVar.d());
        dakl.h(this.L, bxeqVar.c());
        int iD = eehg.d(this, R.attr.colorOnSurfaceVariant, "LocationAttachmentPickerActivity");
        this.Z.setImageResource(R.drawable.quantum_gm_ic_location_on_grey600_24);
        this.Z.setImageTintList(ColorStateList.valueOf(iD));
        int i = this.af;
        ArrayList arrayList = new ArrayList();
        CharSequence charSequenceD = bxeqVar.d();
        if (!TextUtils.isEmpty(charSequenceD)) {
            arrayList.add(charSequenceD);
        }
        CharSequence charSequenceC = bxeqVar.c();
        if (!TextUtils.isEmpty(charSequenceC)) {
            arrayList.add(charSequenceC);
        }
        String strJoin = TextUtils.join(" ", arrayList);
        View view = this.O;
        if (i == 10) {
            string = getString(R.string.location_attachment_picker_send_sms_content_description, new Object[]{strJoin});
        } else if (i != 20) {
            bwdo bwdoVar = this.U;
            string = getString(R.string.location_attachment_picker_send_content_description, new Object[]{strJoin});
            if (i == 40 && bwbt.e()) {
                string = bwdoVar.a.getString(R.string.location_attachment_picker_send_encrypted_content_description, strJoin);
            }
        } else {
            string = getString(R.string.location_attachment_picker_send_mms_content_description, new Object[]{strJoin});
        }
        view.setContentDescription(string);
        if (z) {
            this.O.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.cyvb, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.af = getIntent().getIntExtra("message_type", -1);
        if (((asgr) this.T.b()).a()) {
            abl.a(this);
        }
        setContentView(R.layout.location_attachment_picker_activity_m2_nearby_hidden);
        czef czefVar = new czef(getApplicationContext(), this.R);
        new czej(this.R);
        this.R.d = new WeakReference(this);
        this.W = czefVar;
        int i = this.af;
        this.ad = findViewById(R.id.main_container);
        this.ag = (TextView) findViewById(R.id.select_location_bar_label);
        this.L = (TextView) findViewById(R.id.select_location_bar_subtitle);
        this.M = (TextView) findViewById(R.id.select_location_bar_title);
        this.N = (ImageView) findViewById(R.id.my_location_button);
        this.O = findViewById(R.id.select_location_bar_container);
        this.Z = (ImageView) findViewById(R.id.select_location_bar_info_icon);
        TextView textView = (TextView) findViewById(R.id.select_location_bar_send_text);
        this.aa = textView;
        dakl.h(textView, (i == 10 || i == 11) ? getString(R.string.sms_text) : i != 20 ? "" : getString(R.string.mms_text));
        this.O.setOnClickListener(new View.OnClickListener() { // from class: czdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czec czecVar = this.a.R;
                if (czecVar.f == null) {
                    return;
                }
                czeb czebVar = (czeb) czecVar.d.get();
                int i2 = czecVar.f.f;
                czecVar.g.c("Bugle.Share.LocationAttachmentPicker.CurrentLocationSent");
                if (czebVar != null) {
                    czebVar.ag(czecVar.f);
                }
            }
        });
        this.N.setOnClickListener(new View.OnClickListener() { // from class: czds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.R.e();
            }
        });
        this.Y = (RecyclerView) findViewById(R.id.search_results_list);
        this.ab = findViewById(R.id.location_permissions_needed_container);
        this.ac = findViewById(R.id.location_permissions_needed_button);
        if (this.S.n()) {
            ((ImageView) findViewById(R.id.select_location_bar_send_icon)).setImageDrawable(i == -2 ? getDrawable(R.drawable.gs_done_vd_theme_24) : this.U.a(i));
        }
        ddqx ddqxVar = new ddqx();
        cg cgVar = new cg(a());
        cgVar.s(R.id.map_container, ddqxVar);
        cgVar.k();
        ddqp.b(getApplicationContext(), ddqo.LATEST, new czdt(this, ddqxVar));
        View viewFindViewById = findViewById(R.id.activity_location_browser);
        if (!((asgr) this.T.b()).a()) {
            viewFindViewById.setSystemUiVisibility(1792);
        }
        viewFindViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: czdn
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                return windowInsets;
            }
        });
        this.ad.setOnApplyWindowInsetsListener(new dajf(new daje() { // from class: czdo
            @Override // defpackage.daje
            public final void a(View view, WindowInsets windowInsets) {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
            }
        }));
        c().b(this, new czdu(this));
    }

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.location_attachment_picker_menu_m2, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.location_attachment_picker_menu_search);
        this.ae = menuItemFindItem;
        menuItemFindItem.setVisible(false);
        return true;
    }

    @Override // defpackage.cukp, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        czec czecVar = this.R;
        czecVar.b.d(czecVar);
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    public final void onPause() {
        super.onPause();
        czec czecVar = this.R;
        czecVar.b.d(czecVar);
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.R.g();
    }
}
