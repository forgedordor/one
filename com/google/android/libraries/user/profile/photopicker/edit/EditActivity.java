package com.google.android.libraries.user.profile.photopicker.edit;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.cg;
import defpackage.dsuy;
import defpackage.dsva;
import defpackage.dsvb;
import defpackage.dsvg;
import defpackage.dsvh;
import defpackage.dswb;
import defpackage.dtaa;
import defpackage.dtak;
import defpackage.eddq;
import defpackage.eddy;
import defpackage.edea;
import defpackage.edni;
import defpackage.ednj;
import defpackage.ednl;
import defpackage.ednn;
import defpackage.ednu;
import defpackage.edod;
import defpackage.eduq;
import defpackage.eygj;
import defpackage.eygk;
import defpackage.fbgv;
import defpackage.im;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;
import defpackage.lvz;
import defpackage.lxo;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class EditActivity extends ednu implements eygk {
    public EditablePhotoView A;
    public LinearProgressIndicator B;
    public FullscreenErrorView C;
    public BottomSheetBehavior D;
    public lxo n;
    public eduq o;
    public eddy p;
    public dswb q;
    public dsvh r;
    public dsva s;
    public ednl t;
    public dsvb u;
    public eygj v;
    public dtak w;
    public edod x;
    public MaterialButton y;
    public AppCompatImageButton z;

    public final void B() {
        this.y.setEnabled(false);
        this.z.setEnabled(false);
    }

    public final void C() {
        this.y.setEnabled(true);
        this.z.setEnabled(true);
    }

    public final void D() {
        this.B.setVisibility(8);
        this.D.E(5);
        this.A.setVisibility(8);
        this.C.setVisibility(8);
    }

    public final void E(Uri uri) {
        this.t.c();
        int iC = (int) fbgv.a.get().c();
        eddy eddyVar = this.p;
        edea edeaVar = new edea();
        edeaVar.b();
        edeaVar.d();
        eddyVar.e(this, uri, edeaVar, new edni(this, iC, iC), new ednj(this));
    }

    @Override // defpackage.eygk
    public final eygj ab() {
        return this.v;
    }

    @Override // defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        this.t.f(2);
        super.onBackPressed();
    }

    @Override // defpackage.ednu, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        eddq.a(this);
        super.onCreate(bundle);
        this.t.a();
        if (!this.o.a() || getIntent().getData() == null) {
            this.t.f(4);
            finish();
            return;
        }
        setContentView(R.layout.photo_picker_edit_activity);
        dsuy dsuyVarA = this.q.b.a(89757);
        dsuyVarA.g(this.u);
        dsuyVarA.g(dtaa.b());
        dsuyVarA.f(this.s);
        dsuyVarA.d(this);
        if (fbgv.l()) {
            this.q.b.a(89741).b(findViewById(R.id.photo_picker_edit_page));
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.photo_picker_toolbar);
        n(toolbar);
        im imVarK = k();
        imVarK.getClass();
        imVarK.setDisplayHomeAsUpEnabled(true);
        imVarK.setHomeActionContentDescription(R.string.abc_action_bar_up_description);
        imVarK.setTitle(R.string.op3_edit_crop_and_rotate);
        dtak dtakVar = new dtak(this.q.b.a(92715).b(toolbar));
        this.w = dtakVar;
        dtakVar.c(89729).a(Integer.valueOf(R.id.photo_picker_navigation_button));
        if (fbgv.n()) {
            this.w.c(89740).a(Integer.valueOf(R.id.photo_picker_edit_info_menu_item));
        }
        toolbar.t(new View.OnClickListener() { // from class: ednb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity editActivity = this.a;
                editActivity.r.b(dsvg.e(), editActivity.w.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                editActivity.onBackPressed();
            }
        });
        this.y = (MaterialButton) findViewById(R.id.photo_picker_accept_button);
        if (fbgv.n()) {
            this.y.setText(getIntent().getIntExtra("photo_accept_button_string", R.string.op3_edit_save));
        }
        this.z = (AppCompatImageButton) findViewById(R.id.photo_picker_edit_rotate_button);
        this.A = (EditablePhotoView) findViewById(R.id.photo_picker_photo_edit_view);
        this.B = (LinearProgressIndicator) findViewById(R.id.photo_picker_loading_view);
        this.C = (FullscreenErrorView) findViewById(R.id.photo_picker_error_view);
        this.q.b.a(97816).b(this.A);
        BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v((ConstraintLayout) findViewById(R.id.photo_picker_edit_bottom_sheet));
        this.D = bottomSheetBehaviorV;
        bottomSheetBehaviorV.w = false;
        bottomSheetBehaviorV.C(true);
        this.D.E(5);
        this.x = (edod) this.n.a(edod.class);
        E(getIntent().getData());
        this.q.b.a(89765).b(this.y);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: ednc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Bitmap bitmapCreateBitmap;
                EditActivity editActivity = this.a;
                editActivity.t.e();
                final edod edodVar = editActivity.x;
                EditablePhotoView editablePhotoView = editActivity.A;
                float intrinsicHeight = editablePhotoView.a.getIntrinsicHeight();
                float intrinsicWidth = editablePhotoView.a.getIntrinsicWidth();
                Rect rect = editablePhotoView.c;
                int i = -rect.left;
                int i2 = -rect.top;
                float fB = editablePhotoView.b();
                float fMin = Math.min(intrinsicWidth / fB, intrinsicHeight / fB);
                if (fMin > fbgv.a()) {
                    bitmapCreateBitmap = Bitmap.createBitmap((int) fbgv.a(), (int) fbgv.a(), Bitmap.Config.ARGB_8888);
                } else {
                    int i3 = (int) fMin;
                    bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Matrix matrix = new Matrix(editablePhotoView.b);
                if (i + i2 != 0) {
                    matrix.postTranslate(i, i2);
                }
                float fA = editablePhotoView.a();
                if (fA != 0.0f) {
                    float f = 1.0f / fA;
                    matrix.postScale(f, f);
                }
                if (fMin > fbgv.a()) {
                    matrix.postScale(fbgv.a() / fMin, fbgv.a() / fMin);
                }
                canvas.concat(matrix);
                editablePhotoView.a.draw(canvas);
                if (edodVar.i.compareAndSet(false, true)) {
                    ejxm ejxmVar = edodVar.g;
                    ejxmVar.e();
                    ejxmVar.f();
                    lvy lvyVar = edodVar.h;
                    edny ednyVar = new edny();
                    ednyVar.a = 2;
                    lvyVar.j(ednyVar.a());
                    Callable callable = new Callable() { // from class: edob
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            edod edodVar2 = edodVar;
                            edds eddsVar = edodVar2.e;
                            eddo eddoVar = edodVar2.c;
                            Bitmap bitmap = bitmapCreateBitmap;
                            Uri uriA = eddsVar.a("edited_photo.png");
                            eddoVar.b(bitmap, uriA);
                            return uriA;
                        }
                    };
                    eosc eoscVar = edodVar.d;
                    eork.r(eork.m(callable, eoscVar), new edoc(edodVar), eoscVar);
                }
                editActivity.r.a(dsvg.e(), editActivity.y);
            }
        });
        this.q.b.a(89764).b(this.z);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: ednd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity editActivity = this.a;
                final EditablePhotoView editablePhotoView = editActivity.A;
                ValueAnimator valueAnimator = editablePhotoView.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    final Matrix matrix = new Matrix(editablePhotoView.b);
                    editablePhotoView.m = ValueAnimator.ofFloat(0.0f, -90.0f);
                    editablePhotoView.m.setInterpolator(new lud());
                    editablePhotoView.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: edno
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            EditablePhotoView editablePhotoView2 = editablePhotoView;
                            Matrix matrix2 = editablePhotoView2.b;
                            matrix2.set(matrix);
                            Rect rect = editablePhotoView2.c;
                            matrix2.postRotate(fFloatValue, rect.centerX(), rect.centerY());
                            editablePhotoView2.invalidate();
                            editablePhotoView2.f();
                        }
                    });
                    editablePhotoView.m.addListener(new ednr(editablePhotoView, matrix));
                    editablePhotoView.m.setDuration(fbgv.c());
                    editablePhotoView.m.start();
                }
                editActivity.r.a(dsvg.e(), editActivity.z);
            }
        });
        this.C.b(new View.OnClickListener() { // from class: edne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity editActivity = this.a;
                editActivity.E(editActivity.getIntent().getData());
            }
        });
        this.x.h.f(this, new lvz() { // from class: ednf
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edof edofVar = (edof) obj;
                int iC = edofVar.c() - 1;
                EditActivity editActivity = this.a;
                if (iC == 1) {
                    editActivity.B();
                    return;
                }
                if (iC != 3) {
                    if (iC != 4) {
                        return;
                    }
                    editActivity.t.d((eure) edofVar.a().c());
                    editActivity.C();
                    return;
                }
                editActivity.t.d((eure) edofVar.a().c());
                editActivity.setResult(-1, new Intent().setData((Uri) edofVar.b().c()));
                editActivity.t.f(1);
                editActivity.finish();
            }
        });
        View viewFindViewById = findViewById(R.id.photo_picker_edit_page);
        ldn ldnVar = new ldn() { // from class: edng
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
        };
        int[] iArr = ley.a;
        len.k(viewFindViewById, ldnVar);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_edit_menu, menu);
        if (fbgv.n()) {
            return true;
        }
        this.w.c(89740).a(Integer.valueOf(R.id.photo_picker_edit_info_menu_item));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.photo_picker_edit_info_menu_item) {
            return false;
        }
        this.r.b(dsvg.e(), this.w.b(Integer.valueOf(R.id.photo_picker_edit_info_menu_item)));
        cg cgVar = new cg(a());
        cgVar.u(new ednn(), null);
        cgVar.c();
        return true;
    }
}
