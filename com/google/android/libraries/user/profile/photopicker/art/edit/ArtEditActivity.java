package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity;
import com.google.android.libraries.user.profile.photopicker.art.edit.ColorPickerView;
import com.google.android.libraries.user.profile.photopicker.art.edit.ColorSwatchView;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import defpackage.cg;
import defpackage.dsuy;
import defpackage.dsva;
import defpackage.dsvb;
import defpackage.dsvg;
import defpackage.dsvh;
import defpackage.dsvx;
import defpackage.dswb;
import defpackage.dtaa;
import defpackage.dtak;
import defpackage.eczx;
import defpackage.eczy;
import defpackage.eczz;
import defpackage.edac;
import defpackage.edag;
import defpackage.edan;
import defpackage.edar;
import defpackage.edau;
import defpackage.eddq;
import defpackage.eddy;
import defpackage.edgc;
import defpackage.edgl;
import defpackage.edik;
import defpackage.edim;
import defpackage.edix;
import defpackage.edjq;
import defpackage.edkw;
import defpackage.ednl;
import defpackage.ednn;
import defpackage.eduq;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ejwl;
import defpackage.ekfn;
import defpackage.ekgb;
import defpackage.ekqg;
import defpackage.eork;
import defpackage.etul;
import defpackage.etux;
import defpackage.etuy;
import defpackage.eygj;
import defpackage.eygk;
import defpackage.fbgs;
import defpackage.fbgv;
import defpackage.im;
import defpackage.ku;
import defpackage.kyy;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;
import defpackage.lvz;
import defpackage.lxo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ArtEditActivity extends edan implements eygk {
    public dsvb A;
    public dtak B;
    public edau C;
    public MaterialButton D;
    public MaterialButton E;
    public MaterialButton F;
    public EditableArtView G;
    public LinearProgressIndicator H;
    public FullscreenErrorView I;
    public ViewAnimator J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public View.OnClickListener N;
    public HorizontalScrollView O;
    public View P;
    private ConstraintLayout R;
    private ConstraintLayout S;
    private LinearLayout T;
    private BottomSheetBehavior U;
    private BottomSheetBehavior V;
    private BottomSheetBehavior W;
    private TabLayout X;
    private ImageView Y;
    private ImageView Z;
    public lxo n;
    public eduq o;
    public eczz p;
    public dswb q;
    public dsvx r;
    public dsvh s;
    public dsva t;
    public ednl u;
    public eddy v;
    public edar w;
    public eygj x;
    public String y;
    public edgl z;

    public final int B(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_size);
        double d = getResources().getDisplayMetrics().widthPixels;
        double d2 = i + 0.5d;
        return ((double) dimensionPixelSize) * d2 <= d ? dimensionPixelSize : (int) (d / d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(final edix edixVar, final int i, final int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_padding);
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.photo_picker_skin_tone_swatches_container);
        ((MaterialTextView) findViewById(R.id.art_editor_skin_tone_layer_name)).setText(edixVar.f());
        String[] strArr = {getString(R.string.op3_art_skin_tone_dark), getString(R.string.op3_art_skin_tone_medium_dark), getString(R.string.op3_art_skin_tone_medium), getString(R.string.op3_art_skin_tone_medium_light), getString(R.string.op3_art_skin_tone_light), getString(R.string.op3_art_skin_tone_original)};
        ekgb ekgbVarE = edixVar.e();
        int size = ekgbVarE.size();
        final int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            final edjq edjqVar = (edjq) ekgbVarE.get(i4);
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.photo_picker_art_color_swatch, (ViewGroup) linearLayout, false);
            final ColorSwatchView colorSwatchView = (ColorSwatchView) viewInflate.findViewById(R.id.art_editor_color_swatch);
            colorSwatchView.a(edjqVar.a(), edjqVar.c() / 100.0f, edjqVar.b() / 100.0f);
            colorSwatchView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            colorSwatchView.setBackground(getDrawable(R.drawable.selector_circle_shape));
            colorSwatchView.setContentDescription(strArr[edjqVar.d()]);
            this.r.b(colorSwatchView, this.q.a(140427));
            colorSwatchView.setOnClickListener(new View.OnClickListener() { // from class: eczn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArtEditActivity artEditActivity = this.a;
                    artEditActivity.s.a(dsvg.e(), colorSwatchView);
                    int i5 = i;
                    artEditActivity.O(i5, i3, (ColorSwatchView) view);
                    artEditActivity.G.q(i5, edjqVar.e());
                }
            });
            arrayList.add(viewInflate);
            i4++;
            i3++;
        }
        I(arrayList, linearLayout);
        if (this.w.b(i) != -1) {
            int iB = this.w.b(i);
            O(i, iB, (ColorSwatchView) linearLayout.getChildAt(iB).findViewById(R.id.art_editor_color_swatch));
        }
        final View viewFindViewById = this.T.findViewById(R.id.art_editor_skin_tone_cancel_button);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: eczo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.s.a(dsvg.e(), viewFindViewById);
                artEditActivity.w.c();
                edar edarVar = artEditActivity.w;
                int i5 = edarVar.e;
                int i6 = i;
                edarVar.f(i6, i5);
                artEditActivity.G.q(i6, ((edjq) edixVar.e().get(artEditActivity.w.e)).e());
                artEditActivity.Q();
            }
        });
        final View viewFindViewById2 = this.T.findViewById(R.id.art_editor_skin_tone_done_button);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: eczp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.s.a(dsvg.e(), viewFindViewById2);
                artEditActivity.w.c();
                ekgb ekgbVarE2 = edixVar.e();
                edar edarVar = artEditActivity.w;
                int i5 = i;
                edjq edjqVar2 = (edjq) ekgbVarE2.get(edarVar.b(i5));
                artEditActivity.Z(i2, edjqVar2.a(), edjqVar2.c() / 100.0f, edjqVar2.b() / 100.0f);
                edar edarVar2 = artEditActivity.w;
                edarVar2.i = edarVar2.i || edarVar2.e != edarVar2.b(i5);
                edar edarVar3 = artEditActivity.w;
                edarVar3.h = edarVar3.h || edarVar3.i;
                artEditActivity.Q();
            }
        });
    }

    public final void D(ekfn ekfnVar, Map map) {
        this.w.i = false;
        ekqg ekqgVarListIterator = ekfnVar.listIterator();
        int i = 0;
        int i2 = 0;
        while (ekqgVarListIterator.hasNext()) {
            edix edixVar = (edix) ekqgVarListIterator.next();
            Integer num = (Integer) map.get(edixVar.g());
            int iIntValue = num != null ? num.intValue() : 0;
            float f = iIntValue;
            this.G.n(i, f);
            if (edixVar.i()) {
                if (!edixVar.e().isEmpty()) {
                    edar edarVar = this.w;
                    edarVar.e = 0;
                    edarVar.f(i, 0);
                    this.G.q(i, edixVar.d());
                }
                this.w.e(edixVar.g(), f);
                Y(i2, edixVar, iIntValue);
                i2++;
            }
            i++;
        }
    }

    public final void E() {
        ImageView imageView = this.Z;
        if (imageView != null) {
            this.w.d = -1;
            imageView.setSelected(false);
            this.Z = null;
        }
    }

    public final void F() {
        ImageView imageView = this.Y;
        if (imageView != null) {
            this.w.c = -1;
            imageView.setSelected(false);
            this.Y = null;
        }
    }

    public final void G() {
        this.D.setEnabled(false);
        this.E.setEnabled(false);
        this.F.setEnabled(false);
    }

    public final void H() {
        this.D.setEnabled(true);
        this.E.setEnabled(true);
        this.F.setEnabled(true);
    }

    public final void I(List list, LinearLayout linearLayout) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_color_swatch_width);
        int i = getResources().getDisplayMetrics().widthPixels;
        float fA = i / kyy.a(getResources(), R.dimen.photo_picker_edit_color_swatch_screen_columns);
        if (list.size() * dimensionPixelSize > i) {
            dimensionPixelSize = Math.max((int) fA, dimensionPixelSize);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, -2);
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next(), layoutParams);
        }
    }

    public final void J() throws Resources.NotFoundException {
        this.H.setVisibility(8);
        this.U.E(5);
        this.G.setVisibility(8);
        this.I.setVisibility(8);
    }

    public final void K() throws Resources.NotFoundException {
        View viewFindViewById = findViewById(R.id.photo_picker_toolbar);
        this.V.E(5);
        this.S.setVisibility(8);
        this.U.E(3);
        this.R.setVisibility(0);
        viewFindViewById.setVisibility(0);
        this.G.p(viewFindViewById.getLayoutParams().height);
    }

    public final void L() throws Resources.NotFoundException {
        aa();
        this.H.setVisibility(0);
        this.U.E(5);
        this.G.setVisibility(8);
        edau edauVar = this.C;
        ejwi ejwiVarB = edauVar.k.b();
        if (ejwiVarB.g()) {
            if (((edkw) ejwiVarB.c()).b() - 1 != 0) {
                edim edimVar = edauVar.h;
                Uri uriC = ((edkw) ejwiVarB.c()).c();
                edimVar.e.c();
                edimVar.a(ekgb.r(uriC), new ejvr() { // from class: edig
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Bitmap bitmap = (Bitmap) ((List) obj).get(0);
                        edkg edkgVar = new edkg();
                        edkgVar.e(0L);
                        edkgVar.h("");
                        edkgVar.b("");
                        edkgVar.f("");
                        int i = ekgb.d;
                        ekgb ekgbVar = ekoe.a;
                        edkgVar.c(ekgbVar);
                        edke edkeVar = new edke();
                        edkeVar.g("");
                        edkeVar.j("");
                        edkeVar.c(false);
                        edkeVar.d("");
                        edkeVar.e(0);
                        edkeVar.h(0);
                        edkeVar.f(0);
                        edkeVar.b(bitmap);
                        edkeVar.i(ekgbVar);
                        edkgVar.a = ekgp.l("", edkeVar.a());
                        edkgVar.g(ekgbVar);
                        edkgVar.d(ekgbVar);
                        return edkgVar.a();
                    }
                });
                return;
            }
            edim edimVar2 = edauVar.h;
            long jA = ((edkw) ejwiVarB.c()).a();
            edimVar2.e.c();
            edgc edgcVar = edimVar2.a;
            etux etuxVar = (etux) etuy.a.createBuilder();
            etul etulVar = edimVar2.c;
            etuxVar.copyOnWrite();
            etuy etuyVar = (etuy) etuxVar.instance;
            etulVar.getClass();
            etuyVar.c = etulVar;
            etuyVar.b |= 1;
            etuxVar.copyOnWrite();
            etuy etuyVar2 = (etuy) etuxVar.instance;
            etuyVar2.b |= 2;
            etuyVar2.d = jA;
            eork.r(edgcVar.c((etuy) etuxVar.build()), new edik(edimVar2), edimVar2.b);
        }
    }

    public final void M(int i, ImageView imageView) {
        this.w.d = i;
        imageView.setSelected(true);
        this.Z = imageView;
    }

    public final void N(int i, ImageView imageView) {
        this.w.c = i;
        imageView.setSelected(true);
        this.Y = imageView;
    }

    public final void O(int i, int i2, ColorSwatchView colorSwatchView) {
        if (this.w.b(i) != -1) {
            ((LinearLayout) findViewById(R.id.photo_picker_skin_tone_swatches_container)).getChildAt(this.w.b(i)).findViewById(R.id.art_editor_color_swatch).setSelected(false);
        }
        this.w.f(i, i2);
        colorSwatchView.setSelected(true);
    }

    public final void Q() throws Resources.NotFoundException {
        View viewFindViewById = findViewById(R.id.photo_picker_toolbar);
        this.G.p(viewFindViewById.getLayoutParams().height);
        this.U.E(3);
        this.R.setVisibility(0);
        this.V.E(5);
        this.S.setVisibility(8);
        this.W.E(5);
        this.T.setVisibility(8);
        viewFindViewById.setVisibility(0);
        this.G.p(viewFindViewById.getLayoutParams().height);
    }

    public final void V() throws Resources.NotFoundException {
        View viewFindViewById = findViewById(R.id.photo_picker_toolbar);
        this.U.E(5);
        this.R.setVisibility(8);
        this.V.E(3);
        this.S.setVisibility(0);
        this.W.E(5);
        this.T.setVisibility(8);
        viewFindViewById.setVisibility(8);
        this.G.p(getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_view_inset_crop_area_top));
    }

    public final void W() throws Resources.NotFoundException {
        this.U.E(5);
        this.R.setVisibility(8);
        this.V.E(5);
        this.S.setVisibility(8);
        this.W.E(3);
        this.T.setVisibility(0);
        findViewById(R.id.photo_picker_toolbar).setVisibility(8);
        this.G.p(getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_view_inset_crop_area_top));
    }

    public final void X(final edix edixVar, final int i, final int i2) {
        final ColorPickerView colorPickerView = (ColorPickerView) this.S.findViewById(R.id.art_editor_color_picker);
        colorPickerView.e = new edac() { // from class: eczg
            @Override // defpackage.edac
            public final void a(float f, Integer num) {
            }
        };
        float fA = edixVar.a();
        ejwl.f(fA >= 0.0f && fA <= 360.0f, "hue must be between 0 and 360 inclusive. actual: %s", Float.valueOf(fA));
        if (fA != colorPickerView.d) {
            colorPickerView.d = fA;
            colorPickerView.b[0] = fA;
            colorPickerView.d();
            colorPickerView.b(null);
        }
        float fC = edixVar.c() / 100.0f;
        ejwl.f(fC >= 0.0f && fC <= 1.0f, "saturation must be between 0.0 and 1.0 inclusive. actual: %s", Float.valueOf(fC));
        float[] fArr = colorPickerView.b;
        if (fC != fArr[1]) {
            fArr[1] = fC;
            colorPickerView.e(colorPickerView.getWidth(), colorPickerView.getHeight());
            colorPickerView.d();
        }
        float fB = edixVar.b() / 100.0f;
        ejwl.f(fB >= 0.0f && fB <= 1.0f, "lightness must be between 0.0 and 1.0 inclusive. actual: %s", Float.valueOf(fB));
        if (fB != fArr[2]) {
            fArr[2] = fB;
            colorPickerView.e(colorPickerView.getWidth(), colorPickerView.getHeight());
            colorPickerView.d();
        }
        float f = this.w.a;
        ejwl.f(f >= 0.0f && f <= 360.0f, "hue must be between 0 and 360 inclusive. actual: %s", Float.valueOf(f));
        float f2 = (colorPickerView.d + f) % 360.0f;
        if (f2 != fArr[0]) {
            fArr[0] = f2;
            colorPickerView.d();
            colorPickerView.b(null);
        }
        this.G.n(i, this.w.a);
        colorPickerView.c();
        colorPickerView.e = new edac() { // from class: eczh
            @Override // defpackage.edac
            public final void a(float f3, Integer num) {
                ArtEditActivity artEditActivity = this.a;
                if (num != null) {
                    ColorPickerView colorPickerView2 = colorPickerView;
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        artEditActivity.s.a(dsvg.e(), colorPickerView2);
                    } else if (iIntValue == 8) {
                        artEditActivity.s.a(new dsve(22).a(), colorPickerView2);
                    }
                }
                int i3 = i;
                edar edarVar = artEditActivity.w;
                edarVar.a = f3;
                edarVar.h = true;
                artEditActivity.G.n(i3, f3);
                artEditActivity.F();
                artEditActivity.E();
            }
        };
        ((MaterialTextView) this.S.findViewById(R.id.art_editor_layer_name)).setText(edixVar.f());
        final View viewFindViewById = this.S.findViewById(R.id.art_editor_color_picker_cancel_button);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: eczi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.s.a(dsvg.e(), viewFindViewById);
                edix edixVar2 = edixVar;
                artEditActivity.G.n(i, artEditActivity.w.a(edixVar2.g()));
                edar edarVar = artEditActivity.w;
                edarVar.a = edarVar.a(edixVar2.g());
                artEditActivity.w.c();
                artEditActivity.K();
            }
        });
        final View viewFindViewById2 = this.S.findViewById(R.id.art_editor_color_picker_done_button);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: eczj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.s.a(dsvg.e(), viewFindViewById2);
                ColorPickerView colorPickerView2 = colorPickerView;
                int iA = (int) colorPickerView2.a();
                int i3 = i2;
                edix edixVar2 = edixVar;
                artEditActivity.Y(i3, edixVar2, iA);
                edar edarVar = artEditActivity.w;
                boolean z = true;
                if (!edarVar.i && edarVar.a(edixVar2.g()) == colorPickerView2.a()) {
                    z = false;
                }
                edarVar.i = z;
                artEditActivity.w.e(edixVar2.g(), colorPickerView2.a());
                artEditActivity.w.c();
                artEditActivity.K();
            }
        });
    }

    public final void Y(int i, edix edixVar, int i2) {
        Z(i, (edixVar.a() + i2) % 360, edixVar.c() / 100.0f, edixVar.b() / 100.0f);
    }

    public final void Z(int i, float f, float f2, float f3) {
        ((ColorSwatchView) this.K.getChildAt(i).findViewById(R.id.art_editor_color_swatch)).a(f, f2, f3);
    }

    public final void aa() {
        MenuItem menuItemFindItem;
        if (!fbgs.f() || (menuItemFindItem = ((Toolbar) findViewById(R.id.photo_picker_toolbar)).h().findItem(R.id.photo_picker_undo_all_menu_item)) == null) {
            return;
        }
        menuItemFindItem.setEnabled(this.C.a().a() != null);
    }

    @Override // defpackage.eygk
    public final eygj ab() {
        return this.x;
    }

    @Override // defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        if (this.V.x == 3) {
            findViewById(R.id.art_editor_color_picker_done_button).performClick();
            return;
        }
        if (!fbgs.a.get().e() || !this.w.h) {
            this.u.f(2);
            super.onBackPressed();
        } else {
            cg cgVar = new cg(a());
            cgVar.u(new edag(), "EditDiscardDialogFragment");
            cgVar.c();
        }
    }

    @Override // defpackage.edan, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        eddq.a(this);
        super.onCreate(bundle);
        if (!this.o.a() || !this.p.b().g()) {
            this.u.a();
            this.u.f(4);
            finish();
            return;
        }
        edkw edkwVar = (edkw) this.p.b().c();
        if (edkwVar.b() == 1) {
            ednl ednlVar = this.u;
            ednlVar.a = 30;
            ednlVar.b = 31;
            ednlVar.c = 32;
        }
        this.u.a();
        setContentView(R.layout.photo_picker_art_edit_activity_with_frames);
        dsvx dsvxVar = this.r;
        dsuy dsuyVarA = this.q.a(89757);
        dsuyVarA.g(this.A);
        dsuyVarA.g(dtaa.b());
        dsuyVarA.f(this.t);
        dsvxVar.f(this, dsuyVarA);
        if (fbgv.l()) {
            this.r.b(findViewById(R.id.photo_picker_edit_page), this.q.a(89741));
        }
        this.M = (LinearLayout) findViewById(R.id.photo_picker_edit_frames_container);
        this.O = (HorizontalScrollView) findViewById(R.id.photo_picker_edit_presets_scroll_view);
        this.P = findViewById(R.id.photo_picker_edit_presets_section);
        this.D = (MaterialButton) findViewById(R.id.photo_picker_accept_button);
        if (fbgv.n()) {
            this.D.setText(getIntent().getIntExtra("photo_accept_button_string", R.string.op3_edit_save));
        }
        this.X = (TabLayout) findViewById(R.id.photo_picker_edit_menu_tabs);
        this.J = (ViewAnimator) findViewById(R.id.photo_picker_edit_controls_container);
        this.K = (LinearLayout) findViewById(R.id.photo_picker_color_swatches_container);
        this.L = (LinearLayout) findViewById(R.id.photo_picker_edit_presets_container);
        this.G = (EditableArtView) findViewById(R.id.photo_picker_photo_edit_view);
        this.H = (LinearProgressIndicator) findViewById(R.id.photo_picker_loading_view);
        this.I = (FullscreenErrorView) findViewById(R.id.photo_picker_error_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.photo_picker_edit_bottom_sheet);
        this.R = constraintLayout;
        this.U = BottomSheetBehavior.v(constraintLayout);
        this.X.getBackground().setAlpha(51);
        this.r.b(this.X.d(0).i, this.q.a(131621));
        this.r.b(this.X.d(1).i, this.q.a(131622));
        this.r.b(this.X.d(2).i, this.q.a(131623));
        this.r.b(this.G, this.q.a(97816));
        BottomSheetBehavior bottomSheetBehavior = this.U;
        bottomSheetBehavior.w = false;
        bottomSheetBehavior.C(true);
        this.U.E(5);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.photo_picker_color_picker);
        this.S = constraintLayout2;
        BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(constraintLayout2);
        this.V = bottomSheetBehaviorV;
        bottomSheetBehaviorV.w = false;
        bottomSheetBehaviorV.C(true);
        this.V.E(5);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.photo_picker_edit_skin_tones_container);
        this.T = linearLayout;
        linearLayout.addView(getLayoutInflater().inflate(R.layout.photo_picker_art_skin_tones_container, (ViewGroup) this.T, false));
        BottomSheetBehavior bottomSheetBehaviorV2 = BottomSheetBehavior.v(this.T);
        this.W = bottomSheetBehaviorV2;
        bottomSheetBehaviorV2.w = false;
        bottomSheetBehaviorV2.C(true);
        this.W.E(5);
        View viewFindViewById = this.T.findViewById(R.id.art_editor_skin_tone_done_button);
        this.r.b(this.T.findViewById(R.id.art_editor_skin_tone_cancel_button), this.q.a(140425));
        this.r.b(viewFindViewById, this.q.a(140426));
        ColorPickerView colorPickerView = (ColorPickerView) this.S.findViewById(R.id.art_editor_color_picker);
        ley.z(colorPickerView);
        View viewFindViewById2 = this.S.findViewById(R.id.art_editor_color_picker_done_button);
        View viewFindViewById3 = this.S.findViewById(R.id.art_editor_color_picker_cancel_button);
        this.r.b(colorPickerView, this.q.a(131636));
        this.r.b(viewFindViewById3, this.q.a(131634));
        this.r.b(viewFindViewById2, this.q.a(131635));
        this.C = (edau) this.n.a(edau.class);
        this.r.b(this.D, this.q.a(89765));
        this.D.setOnClickListener(new View.OnClickListener() { // from class: eczv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.u.e();
                final edau edauVar = artEditActivity.C;
                EditableArtView editableArtView = artEditActivity.G;
                float fC = editableArtView.c();
                float fD = editableArtView.d();
                Rect rect = editableArtView.c;
                int i = -rect.left;
                int i2 = -rect.top;
                float fB = editableArtView.b();
                int iMin = (int) Math.min(fD / fB, fC / fB);
                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Matrix matrix = new Matrix(editableArtView.b);
                if (i + i2 != 0) {
                    matrix.postTranslate(i, i2);
                }
                float fA = editableArtView.a();
                if (fA != 0.0f) {
                    float f = 1.0f / fA;
                    matrix.postScale(f, f);
                }
                canvas.concat(matrix);
                editableArtView.j(canvas);
                if (edauVar.j.compareAndSet(false, true)) {
                    ejxm ejxmVar = edauVar.g;
                    ejxmVar.e();
                    ejxmVar.f();
                    lvy lvyVar = edauVar.i;
                    edny ednyVar = new edny();
                    ednyVar.a = 2;
                    lvyVar.j(ednyVar.a());
                    Callable callable = new Callable() { // from class: edas
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            edau edauVar2 = edauVar;
                            edds eddsVar = edauVar2.e;
                            eddo eddoVar = edauVar2.c;
                            Bitmap bitmap = bitmapCreateBitmap;
                            Uri uriA = eddsVar.a("edited_photo.png");
                            eddoVar.b(bitmap, uriA);
                            return uriA;
                        }
                    };
                    eosc eoscVar = edauVar.d;
                    eork.r(eork.m(callable, eoscVar), new edat(edauVar), eoscVar);
                }
                artEditActivity.s.a(dsvg.e(), artEditActivity.D);
            }
        });
        this.E = (MaterialButton) findViewById(R.id.photo_picker_edit_rotate_left_button);
        this.F = (MaterialButton) findViewById(R.id.photo_picker_edit_rotate_right_button);
        this.r.b(this.E, this.q.a(89764));
        this.r.b(this.F, this.q.a(131626));
        this.E.setOnClickListener(new View.OnClickListener() { // from class: eczk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.G.m(-90.0f);
                artEditActivity.E();
                artEditActivity.F();
                artEditActivity.w.h = true;
                artEditActivity.s.a(dsvg.e(), artEditActivity.E);
            }
        });
        this.F.setOnClickListener(new View.OnClickListener() { // from class: eczm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.G.m(90.0f);
                artEditActivity.E();
                artEditActivity.F();
                artEditActivity.w.h = true;
                artEditActivity.s.a(dsvg.e(), artEditActivity.F);
            }
        });
        this.E.d(ku.a(this.J.getContext(), R.drawable.quantum_gm_ic_rotate_90_degrees_ccw_vd_theme_24));
        this.F.d(ku.a(this.J.getContext(), R.drawable.quantum_gm_ic_rotate_90_degrees_cw_vd_theme_24));
        L();
        this.I.b(new View.OnClickListener() { // from class: eczw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                this.a.L();
            }
        });
        if (edkwVar.b() == 1) {
            TabLayout tabLayout = this.X;
            tabLayout.l(tabLayout.d(this.w.b));
            this.J.setDisplayedChild(this.w.b);
            EditableArtView editableArtView = this.G;
            boolean z = this.w.b == 2;
            editableArtView.i = z;
            editableArtView.k(z);
            this.G.y = new eczx(this);
            this.X.f(new eczy(this));
        } else {
            this.X.setVisibility(8);
            this.E.setVisibility(0);
            this.F.setVisibility(0);
        }
        ejwl.a(this.p.b().g());
        Toolbar toolbar = (Toolbar) findViewById(R.id.photo_picker_toolbar);
        n(toolbar);
        im imVarK = k();
        imVarK.getClass();
        imVarK.setDisplayHomeAsUpEnabled(true);
        imVarK.setHomeActionContentDescription(R.string.abc_action_bar_up_description);
        if (((edkw) this.p.b().c()).b() == 1) {
            imVarK.setTitle((CharSequence) this.p.a().e(""));
            setTitle((CharSequence) this.p.a().e(""));
        } else {
            imVarK.setTitle(R.string.op3_edit_crop_and_rotate);
            setTitle(R.string.op3_edit_crop_and_rotate);
        }
        dtak dtakVar = new dtak(this.r.b(toolbar, this.q.a(92715)));
        this.B = dtakVar;
        dtakVar.c(89729).a(Integer.valueOf(R.id.photo_picker_navigation_button));
        if (fbgv.n()) {
            this.B.a(Integer.valueOf(R.id.photo_picker_undo_all_menu_item), this.q.a(131627));
            if (fbgs.e()) {
                this.B.a(Integer.valueOf(R.id.photo_picker_more_info_menu_item), this.q.a(132452));
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(89747));
            } else {
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(132452));
            }
            this.B.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.q.a(89742));
        }
        toolbar.t(new View.OnClickListener() { // from class: eczq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = this.a;
                artEditActivity.s.b(dsvg.e(), artEditActivity.B.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                artEditActivity.onBackPressed();
            }
        });
        this.C.a().f(this, new lvz() { // from class: eczb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lvz
            public final void a(Object obj) throws Resources.NotFoundException {
                int i;
                final ediz edizVar = (ediz) obj;
                boolean zG = edizVar.c().g();
                final ArtEditActivity artEditActivity = this.a;
                if (zG) {
                    if (!fbgv.u()) {
                        artEditActivity.G.h();
                        artEditActivity.J();
                        artEditActivity.G();
                        artEditActivity.I.g();
                        artEditActivity.I.setVisibility(0);
                        return;
                    }
                    Object objC = edizVar.c().c();
                    artEditActivity.G.h();
                    artEditActivity.J();
                    artEditActivity.G();
                    artEditActivity.I.c((edhe) objC);
                    artEditActivity.I.setVisibility(0);
                    return;
                }
                EditableArtView editableArtView2 = artEditActivity.G;
                ekgb ekgbVarG = ekeh.d(edizVar.g().values()).f(new ejvr() { // from class: eczr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ((edix) obj2).d();
                    }
                }).g();
                ekgbVarG.getClass();
                boolean z2 = false;
                for (int i2 = 0; i2 < ekgbVarG.size(); i2++) {
                    Bitmap bitmap = (Bitmap) ekgbVarG.get(i2);
                    bitmap.getClass();
                    List list = editableArtView2.a;
                    if (list.size() <= i2) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(editableArtView2.getResources(), bitmap);
                        bitmapDrawable.setCallback(editableArtView2);
                        list.add(bitmapDrawable);
                    } else {
                        Drawable drawable = (Drawable) list.get(i2);
                        if (!(drawable instanceof BitmapDrawable) || bitmap != ((BitmapDrawable) drawable).getBitmap()) {
                            drawable.setCallback(null);
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(editableArtView2.getResources(), bitmap);
                            bitmapDrawable2.setCallback(editableArtView2);
                            list.set(i2, bitmapDrawable2);
                            z2 |= (drawable.getIntrinsicWidth() == bitmap.getWidth() && drawable.getIntrinsicHeight() == bitmap.getHeight()) ? false : true;
                            editableArtView2.m = 0.0f;
                        }
                    }
                }
                editableArtView2.i(z2);
                editableArtView2.requestLayout();
                editableArtView2.invalidate();
                int dimensionPixelSize = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_size);
                int dimensionPixelSize2 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_padding);
                int dimensionPixelSize3 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_margin_end);
                int dimensionPixelSize4 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_section_bottom_margin);
                boolean zIsEmpty = edizVar.e().isEmpty();
                if (!zIsEmpty) {
                    dimensionPixelSize = artEditActivity.B(edizVar.f().size());
                }
                artEditActivity.L.removeAllViews();
                ekgb ekgbVarF = edizVar.f();
                int size = ekgbVarF.size();
                int i3 = 0;
                final int i4 = 0;
                while (i3 < size) {
                    edja edjaVar = (edja) ekgbVarF.get(i3);
                    ImageView imageView = new ImageView(artEditActivity);
                    eddy eddyVar = artEditActivity.v;
                    Uri uri = Uri.parse(edjaVar.c());
                    edea edeaVar = new edea();
                    edeaVar.e();
                    eddyVar.f(uri, edeaVar, imageView);
                    imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                    imageView.setBackground(artEditActivity.getDrawable(R.drawable.rounded_border_shape));
                    String string = i4 == 0 ? artEditActivity.getString(R.string.op3_filter_original_description) : Integer.toString(i4);
                    imageView.setContentDescription(artEditActivity.getString(R.string.op3_filter_description) + " " + string);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                    layoutParams.setMargins(0, 0, 0, dimensionPixelSize4);
                    layoutParams.setMarginEnd((zIsEmpty && i4 == edizVar.f().size() + (-1)) ? 0 : dimensionPixelSize3);
                    final HashMap map = new HashMap();
                    ekgb ekgbVarB = edjaVar.b();
                    int size2 = ekgbVarB.size();
                    int i5 = dimensionPixelSize;
                    int i6 = 0;
                    while (i6 < size2) {
                        edku edkuVar = (edku) ekgbVarB.get(i6);
                        map.put(edkuVar.b(), Integer.valueOf(edkuVar.a()));
                        i6++;
                        dimensionPixelSize2 = dimensionPixelSize2;
                    }
                    int i7 = dimensionPixelSize2;
                    artEditActivity.r.b(imageView, artEditActivity.q.a(131615));
                    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: eczt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArtEditActivity artEditActivity2 = artEditActivity;
                            artEditActivity2.F();
                            artEditActivity2.E();
                            artEditActivity2.G.l();
                            EditableArtView editableArtView3 = artEditActivity2.G;
                            editableArtView3.i = false;
                            editableArtView3.k(false);
                            artEditActivity2.D(edizVar.g().values(), map);
                            artEditActivity2.N(i4, (ImageView) view);
                            artEditActivity2.w.h = true;
                        }
                    };
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: eczu
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            artEditActivity.s.a(dsvg.e(), view);
                            onClickListener.onClick(view);
                        }
                    });
                    if (i4 == 0) {
                        artEditActivity.N = onClickListener;
                    }
                    artEditActivity.L.addView(imageView, layoutParams);
                    i3++;
                    i4++;
                    dimensionPixelSize = i5;
                    dimensionPixelSize2 = i7;
                }
                int i8 = artEditActivity.w.c;
                if (i8 != -1) {
                    artEditActivity.N(i8, (ImageView) artEditActivity.L.getChildAt(i8));
                }
                int dimensionPixelSize5 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_padding);
                int dimensionPixelSize6 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_margin_end);
                int iB = artEditActivity.B(edizVar.f().size());
                if (edizVar.e().isEmpty()) {
                    artEditActivity.findViewById(R.id.photo_picker_edit_frames_label).setVisibility(8);
                    artEditActivity.M.setVisibility(8);
                } else {
                    artEditActivity.M.removeAllViews();
                    ekgb ekgbVarE = edizVar.e();
                    int size3 = ekgbVarE.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size3) {
                        final etus etusVar = (etus) ekgbVarE.get(i9);
                        ImageView imageView2 = new ImageView(artEditActivity);
                        eddy eddyVar2 = artEditActivity.v;
                        Uri uri2 = Uri.parse(etusVar.b);
                        edea edeaVar2 = new edea();
                        edeaVar2.e();
                        eddyVar2.f(uri2, edeaVar2, imageView2);
                        imageView2.setPadding(dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
                        imageView2.setBackground(artEditActivity.getDrawable(R.drawable.rounded_border_shape));
                        int i11 = i10 + 1;
                        imageView2.setContentDescription(artEditActivity.getString(R.string.op3_frame_description) + " " + i11);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iB, iB);
                        layoutParams2.setMarginEnd(i10 != edizVar.e().size() + (-1) ? dimensionPixelSize6 : 0);
                        final HashMap map2 = new HashMap();
                        for (etvs etvsVar : etusVar.d) {
                            map2.put(etvsVar.b, Integer.valueOf(etvsVar.c));
                            dimensionPixelSize5 = dimensionPixelSize5;
                        }
                        artEditActivity.r.b(imageView2, artEditActivity.q.a(139139));
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ecze
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ArtEditActivity artEditActivity2 = artEditActivity;
                                artEditActivity2.F();
                                artEditActivity2.E();
                                artEditActivity2.s.a(dsvg.e(), view);
                                etus etusVar2 = etusVar;
                                EditableArtView editableArtView3 = artEditActivity2.G;
                                etxi etxiVar = etusVar2.c;
                                if (etxiVar == null) {
                                    etxiVar = etxi.a;
                                }
                                Map map3 = map2;
                                ediz edizVar2 = edizVar;
                                Matrix matrix = editableArtView3.b;
                                float f = -editableArtView3.s.k;
                                Rect rect = editableArtView3.c;
                                matrix.postRotate(f, rect.centerX(), rect.centerY());
                                editableArtView3.s.k = 0.0f;
                                editableArtView3.g(etxiVar);
                                artEditActivity2.M(artEditActivity2.M.indexOfChild(view), (ImageView) view);
                                artEditActivity2.D(edizVar2.g().values(), map3);
                                edar edarVar = artEditActivity2.w;
                                edarVar.h = true;
                                edarVar.j = true;
                                EditableArtView editableArtView4 = artEditActivity2.G;
                                editableArtView4.i = true;
                                editableArtView4.k(true);
                            }
                        });
                        artEditActivity.M.addView(imageView2, layoutParams2);
                        i9++;
                        i10 = i11;
                        dimensionPixelSize5 = dimensionPixelSize5;
                    }
                    int i12 = artEditActivity.w.d;
                    if (i12 != -1) {
                        artEditActivity.M(i12, (ImageView) artEditActivity.M.getChildAt(i12));
                        EditableArtView editableArtView3 = artEditActivity.G;
                        i = 1;
                        boolean z3 = artEditActivity.w.b != 1;
                        editableArtView3.i = z3;
                        editableArtView3.k(z3);
                    } else {
                        i = 1;
                    }
                    if (artEditActivity.getResources().getConfiguration().getLayoutDirection() == i) {
                        artEditActivity.O.post(new Runnable() { // from class: eczf
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArtEditActivity artEditActivity2 = artEditActivity;
                                artEditActivity2.O.scrollTo(artEditActivity2.P.getWidth(), 0);
                            }
                        });
                    }
                }
                ArrayList arrayList = new ArrayList();
                ekqg ekqgVarListIterator = edizVar.g().values().listIterator();
                final int i13 = 0;
                final int i14 = 0;
                while (ekqgVarListIterator.hasNext()) {
                    final edix edixVar = (edix) ekqgVarListIterator.next();
                    if (edixVar.i()) {
                        View viewInflate = LayoutInflater.from(artEditActivity).inflate(R.layout.photo_picker_art_color_swatch, (ViewGroup) artEditActivity.K, false);
                        final ColorSwatchView colorSwatchView = (ColorSwatchView) viewInflate.findViewById(R.id.art_editor_color_swatch);
                        colorSwatchView.a((edixVar.a() + artEditActivity.w.a(edixVar.g())) % 360.0f, edixVar.c() / 100.0f, edixVar.b() / 100.0f);
                        colorSwatchView.setContentDescription(edixVar.f());
                        artEditActivity.G.n(i14, artEditActivity.w.a(edixVar.g()));
                        artEditActivity.r.b(colorSwatchView, artEditActivity.q.a(131639));
                        ((MaterialTextView) viewInflate.findViewById(R.id.art_editor_layer_name)).setText(edixVar.f());
                        if (edixVar.e().isEmpty()) {
                            final int i15 = i14;
                            final int i16 = i13;
                            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: eczl
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) throws Resources.NotFoundException {
                                    ArtEditActivity artEditActivity2 = artEditActivity;
                                    artEditActivity2.s.a(dsvg.e(), colorSwatchView);
                                    edix edixVar2 = edixVar;
                                    edar edarVar = artEditActivity2.w;
                                    edarVar.a = edarVar.a(edixVar2.g());
                                    int i17 = i15;
                                    edar edarVar2 = artEditActivity2.w;
                                    int i18 = i16;
                                    edarVar2.d(i18, i17);
                                    artEditActivity2.X(edixVar2, i17, i18);
                                    artEditActivity2.V();
                                }
                            };
                            i13 = i16;
                            i14 = i15;
                            colorSwatchView.setOnClickListener(onClickListener2);
                        } else {
                            if (artEditActivity.w.b(i14) != -1) {
                                artEditActivity.G.q(i14, ((edjq) edixVar.e().get(artEditActivity.w.b(i14))).e());
                                colorSwatchView.a(r3.a(), r3.c() / 100.0f, r3.b() / 100.0f);
                            }
                            colorSwatchView.setOnClickListener(new View.OnClickListener() { // from class: ecza
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) throws Resources.NotFoundException {
                                    ArtEditActivity artEditActivity2 = artEditActivity;
                                    artEditActivity2.s.a(dsvg.e(), colorSwatchView);
                                    int i17 = i14;
                                    edar edarVar = artEditActivity2.w;
                                    int i18 = i13;
                                    edarVar.d(i18, i17);
                                    edar edarVar2 = artEditActivity2.w;
                                    edarVar2.e = edarVar2.b(i17);
                                    artEditActivity2.C(edixVar, i17, i18);
                                    artEditActivity2.W();
                                }
                            });
                        }
                        arrayList.add(viewInflate);
                        i13++;
                    }
                    i14++;
                }
                artEditActivity.I(arrayList, artEditActivity.K);
                artEditActivity.H.setVisibility(8);
                artEditActivity.I.setVisibility(8);
                artEditActivity.G.setVisibility(0);
                if (artEditActivity.G.getAlpha() == 0.0f) {
                    artEditActivity.G.animate().alpha(1.0f).setInterpolator(new lud()).start();
                }
                artEditActivity.H();
                if (artEditActivity.w.f == -1) {
                    artEditActivity.Q();
                } else {
                    edix edixVar2 = (edix) ekis.h(edizVar.g().values(), artEditActivity.w.g);
                    if (edixVar2.e().isEmpty()) {
                        edix edixVar3 = (edix) ekis.h(edizVar.g().values(), artEditActivity.w.g);
                        edar edarVar = artEditActivity.w;
                        artEditActivity.X(edixVar3, edarVar.g, edarVar.f);
                        artEditActivity.w.h = true;
                        artEditActivity.V();
                    } else {
                        edar edarVar2 = artEditActivity.w;
                        artEditActivity.C(edixVar2, edarVar2.g, edarVar2.f);
                        artEditActivity.W();
                    }
                }
                artEditActivity.aa();
                im imVarK2 = artEditActivity.k();
                imVarK2.getClass();
                imVarK2.setTitle(edizVar.i());
                artEditActivity.C.i.f(artEditActivity, new lvz() { // from class: eczs
                    @Override // defpackage.lvz
                    public final void a(Object obj2) {
                        if (((edof) obj2).c() != 2) {
                            artEditActivity.H();
                        }
                    }
                });
            }
        });
        this.C.i.f(this, new lvz() { // from class: eczc
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edof edofVar = (edof) obj;
                int iC = edofVar.c() - 1;
                ArtEditActivity artEditActivity = this.a;
                if (iC == 1) {
                    artEditActivity.G();
                    return;
                }
                if (iC != 3) {
                    if (iC != 4) {
                        return;
                    }
                    artEditActivity.u.d((eure) edofVar.a().c());
                    artEditActivity.H();
                    return;
                }
                artEditActivity.u.d((eure) edofVar.a().c());
                int i = true != artEditActivity.w.i ? 2 : 3;
                Object objC = edofVar.b().c();
                ejwi ejwiVarB = artEditActivity.p.b();
                boolean z2 = artEditActivity.w.j;
                Intent data = new Intent().setData((Uri) objC);
                if (ejwiVarB.g() && ((edkw) ejwiVarB.c()).b() == 1) {
                    data.putExtra("IMAGE_ID", ((edkw) ejwiVarB.c()).a());
                }
                artEditActivity.setResult(-1, data.putExtra("COLOR_CUSTOMIZATION_TYPE", i - 1).putExtra("WAS_FRAME_SELECTED", z2));
                artEditActivity.u.f(1);
                artEditActivity.finish();
            }
        });
        len.k(findViewById(R.id.photo_picker_edit_page), new ldn() { // from class: eczd
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                kzc kzcVarF = lgtVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.leftMargin = kzcVarF.b;
                marginLayoutParams.bottomMargin = kzcVarF.e;
                marginLayoutParams.rightMargin = kzcVarF.d;
                marginLayoutParams.topMargin = kzcVarF.c;
                view.setLayoutParams(marginLayoutParams);
                return lgt.a;
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_art_edit_menu, menu);
        if (!fbgv.n()) {
            this.B.a(Integer.valueOf(R.id.photo_picker_undo_all_menu_item), this.q.a(131627));
            if (fbgs.e()) {
                this.B.a(Integer.valueOf(R.id.photo_picker_more_info_menu_item), this.q.a(132452));
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(89747));
            } else {
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(132452));
                menu.findItem(R.id.photo_picker_more_info_menu_item).setVisible(false);
            }
            this.B.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.q.a(89742));
        } else if (!fbgs.e()) {
            menu.findItem(R.id.photo_picker_more_info_menu_item).setVisible(false);
        }
        aa();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.photo_picker_undo_all_menu_item) {
            this.s.b(dsvg.e(), this.B.b(Integer.valueOf(R.id.photo_picker_undo_all_menu_item)));
            if (!fbgs.f() || this.C.a().a() != null) {
                this.G.l();
                this.N.onClick(this.L.getChildAt(0));
                this.w.h = false;
                if (fbgs.g()) {
                    EditableArtView editableArtView = this.G;
                    boolean z = this.w.b == 2;
                    editableArtView.i = z;
                    editableArtView.k(z);
                }
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.photo_picker_help_menu_item) {
            this.s.b(dsvg.e(), this.B.b(Integer.valueOf(R.id.photo_picker_help_menu_item)));
            if (fbgs.e()) {
                this.z.b(this.y);
            } else {
                cg cgVar = new cg(a());
                cgVar.u(new ednn(), "EditInfoDialogFragmentTag");
                cgVar.c();
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.photo_picker_send_feedback_menu_item) {
            this.s.b(dsvg.e(), this.B.b(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item)));
            this.z.a();
            return true;
        }
        if (menuItem.getItemId() != R.id.photo_picker_more_info_menu_item || !fbgs.e()) {
            return false;
        }
        this.s.b(dsvg.e(), this.B.b(Integer.valueOf(R.id.photo_picker_more_info_menu_item)));
        cg cgVar2 = new cg(a());
        cgVar2.u(new ednn(), "EditInfoDialogFragmentTag");
        cgVar2.c();
        return true;
    }
}
