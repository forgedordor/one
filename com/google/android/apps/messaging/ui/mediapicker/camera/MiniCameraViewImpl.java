package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import defpackage.aiqd;
import defpackage.craf;
import defpackage.crma;
import defpackage.cvjo;
import defpackage.czib;
import defpackage.czix;
import defpackage.czjh;
import defpackage.dakl;
import defpackage.eehg;
import defpackage.eifs;
import defpackage.eigp;
import defpackage.eksp;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.ldg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MiniCameraViewImpl extends czix implements czjh {
    public static final eksp b = eksp.c("BugleCamera");
    private int A;
    public crma c;
    public aiqd d;
    public czib e;
    public eosc f;
    public cvjo g;
    public dakl h;
    public eigp i;
    public fcsu j;
    public final WindowManager k;
    public CameraTextureView l;
    public View m;
    public View n;
    public View o;
    public View p;
    public ImageView q;
    public View r;
    public GradientDrawable s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public final boolean x;
    private View y;
    private View z;

    public MiniCameraViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = (WindowManager) context.getSystemService("window");
        this.x = true;
    }

    public final void c(View view) {
        PopupMenu popupMenu = new PopupMenu(getContext(), view);
        popupMenu.inflate(R.menu.device_camera_menu);
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: czjn
            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu2) {
                ((aiqr) this.a.j.b()).b(2);
            }
        });
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: czjo
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                MiniCameraViewImpl miniCameraViewImpl = this.a;
                if (itemId == R.id.take_photo) {
                    ((aiqr) miniCameraViewImpl.j.b()).b(3);
                    throw null;
                }
                if (itemId != R.id.record_video) {
                    return false;
                }
                ((aiqr) miniCameraViewImpl.j.b()).b(4);
                throw null;
            }
        });
        Menu menu = popupMenu.getMenu();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(eehg.b(this, R.attr.colorOnActionBar));
        if (colorStateListValueOf != null) {
            for (int i = 0; i < menu.size(); i++) {
                ldg.b(menu.getItem(i), colorStateListValueOf);
            }
            if (craf.c) {
                popupMenu.setForceShowIcon(true);
            }
        }
        popupMenu.show();
    }

    public final boolean d() {
        return this.q.getVisibility() == 0;
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: czjr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MiniCameraViewImpl miniCameraViewImpl = this.a;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) miniCameraViewImpl.getLayoutParams();
                int i = miniCameraViewImpl.u;
                layoutParams.width = (int) (i + i + ((miniCameraViewImpl.t - r2) * fFloatValue));
                miniCameraViewImpl.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) miniCameraViewImpl.l.getLayoutParams();
                layoutParams2.width = fFloatValue == 0.0f ? -2 : 0;
                layoutParams2.height = fFloatValue != 0.0f ? (int) (miniCameraViewImpl.a() * 0.0f) : -2;
                miniCameraViewImpl.l.setLayoutParams(layoutParams2);
                float fMin = Math.min(1.0f, fFloatValue / 0.625f);
                float f = 1.0f - fMin;
                int i2 = fMin == 1.0f ? 4 : 0;
                if (!miniCameraViewImpl.w) {
                    miniCameraViewImpl.r.setAlpha(f);
                    miniCameraViewImpl.r.setVisibility(i2);
                    return;
                }
                miniCameraViewImpl.m.setAlpha(f);
                miniCameraViewImpl.m.setVisibility(i2);
                miniCameraViewImpl.n.setAlpha(f);
                miniCameraViewImpl.n.setVisibility((miniCameraViewImpl.x && i2 == 0) ? 0 : 4);
                miniCameraViewImpl.o.setAlpha(f);
                miniCameraViewImpl.o.setVisibility(i2);
                miniCameraViewImpl.p.setAlpha(0.8f * fMin);
                miniCameraViewImpl.p.setVisibility(fMin == 0.0f ? 4 : 0);
            }
        });
        this.y = findViewById(R.id.buttons_portrait);
        this.z = findViewById(R.id.buttons_landscape);
        ImageView imageView = (ImageView) findViewById(R.id.collapsed_fullscreen_camera_button);
        this.q = imageView;
        imageView.setOnClickListener(new eifs(this.i, "com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeViews", 239, "MiniCameraView collapsedFullscreenCameraButton onClick", this.g.a(new View.OnClickListener() { // from class: czjs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean zBooleanValue = ((Boolean) czjh.sB.e()).booleanValue();
                MiniCameraViewImpl miniCameraViewImpl = this.a;
                if (zBooleanValue) {
                    miniCameraViewImpl.c(miniCameraViewImpl.q);
                } else {
                    if (!miniCameraViewImpl.c.d()) {
                        throw null;
                    }
                    throw null;
                }
            }
        })));
        this.p = findViewById(R.id.camera_scrim);
        View viewFindViewById = findViewById(R.id.camera_texture_background);
        viewFindViewById.setClipToOutline(true);
        this.s = (GradientDrawable) viewFindViewById.getBackground().mutate();
        View viewFindViewById2 = findViewById(R.id.camera_permission_view);
        this.r = viewFindViewById2;
        viewFindViewById2.setClipToOutline(true);
        this.r.setOnClickListener(new eifs(this.i, "com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeViews", 267, "MiniCameraView cameraPermissionView onClick", new View.OnClickListener() { // from class: czjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                throw null;
            }
        }));
        CameraTextureView cameraTextureView = (CameraTextureView) findViewById(R.id.camera_texture_view);
        this.l = cameraTextureView;
        int i = 4;
        cameraTextureView.a(4, 3);
        this.l.e();
        this.t = getResources().getDimensionPixelSize(R.dimen.camera_gallery_camera_item_collapsed_size);
        getResources().getDimensionPixelSize(R.dimen.c2o_content_item_corner_radius);
        getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin);
        this.u = getResources().getDimensionPixelSize(R.dimen.camera_gallery_camera_item_horizontal_margin);
        getResources().getDimension(R.dimen.category_toggle_elevation);
        this.A = getContext().getColor(R.color.google_black);
        int i2 = getResources().getConfiguration().orientation;
        this.y.setVisibility(i2 != 2 ? 0 : 8);
        this.z.setVisibility(i2 == 2 ? 0 : 8);
        final View view = i2 == 2 ? this.z : this.y;
        View viewFindViewById3 = view.findViewById(R.id.switch_camera_button);
        this.m = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new eifs(this.i, "com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeButtons", 317, "MiniCameraView switchCameraButton onClick", new View.OnClickListener() { // from class: czjj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final MiniCameraViewImpl miniCameraViewImpl = this.a;
                miniCameraViewImpl.e.p();
                if (!miniCameraViewImpl.v) {
                    miniCameraViewImpl.m.animate().rotationBy(-180.0f).setInterpolator(new lud()).withStartAction(new Runnable() { // from class: czji
                        @Override // java.lang.Runnable
                        public final void run() {
                            miniCameraViewImpl.v = true;
                        }
                    }).withEndAction(new Runnable() { // from class: czjm
                        @Override // java.lang.Runnable
                        public final void run() {
                            miniCameraViewImpl.v = false;
                        }
                    });
                }
                miniCameraViewImpl.m.setContentDescription(miniCameraViewImpl.getResources().getString(true != miniCameraViewImpl.e.u() ? R.string.camera_front_switch_button : R.string.camera_back_switch_button));
            }
        }));
        View viewFindViewById4 = view.findViewById(R.id.fullscreen_camera_button);
        this.n = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new eifs(this.i, "com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeButtons", 340, "MiniCameraView fullscreenCameraButton onClick", new View.OnClickListener() { // from class: czjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (!((Boolean) czjh.sB.e()).booleanValue()) {
                    throw null;
                }
                MiniCameraViewImpl miniCameraViewImpl = this.a;
                miniCameraViewImpl.c(miniCameraViewImpl.n);
            }
        }));
        View viewFindViewById5 = view.findViewById(R.id.shutter_button);
        this.o = viewFindViewById5;
        viewFindViewById5.setOnClickListener(new eifs(this.i, "com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeButtons", 352, "MiniCameraView shutterButton onClick", new View.OnClickListener() { // from class: czjl
            /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl r8 = r7.a
                    android.view.View r0 = r8.o
                    r1 = 0
                    r0.setEnabled(r1)
                    android.view.View r0 = r2
                    int r2 = r0.getHeight()
                    com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView r3 = r8.l
                    int r3 = r3.getHeight()
                    if (r2 >= r3) goto L22
                    int r2 = r0.getHeight()
                    float r2 = (float) r2
                    com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView r3 = r8.l
                    int r3 = r3.getHeight()
                    goto L2d
                L22:
                    com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView r2 = r8.l
                    int r2 = r2.getWidth()
                    float r2 = (float) r2
                    int r3 = r0.getWidth()
                L2d:
                    float r3 = (float) r3
                    float r2 = r2 / r3
                    czib r3 = r8.e
                    int r3 = r3.n
                    int r3 = r3 % 180
                    r4 = 1
                    if (r3 == 0) goto L3a
                    r3 = r4
                    goto L3b
                L3a:
                    r3 = r1
                L3b:
                    android.view.WindowManager r5 = r8.k
                    if (r5 == 0) goto L4d
                    android.view.Display r5 = r5.getDefaultDisplay()
                    int r5 = r5.getRotation()
                    int r5 = r5 % 180
                    if (r5 == 0) goto L4d
                    r5 = r4
                    goto L4e
                L4d:
                    r5 = r1
                L4e:
                    int r6 = r0.getWidth()
                    int r0 = r0.getHeight()
                    if (r6 <= r0) goto L59
                    r1 = r4
                L59:
                    r0 = 1065353216(0x3f800000, float:1.0)
                    if (r3 != 0) goto L62
                    if (r5 == 0) goto L62
                    if (r1 == 0) goto L69
                    goto L63
                L62:
                    r4 = r1
                L63:
                    if (r3 == 0) goto L6b
                    if (r5 != 0) goto L6b
                    if (r4 == 0) goto L6b
                L69:
                    float r2 = r0 / r2
                L6b:
                    float r1 = r0 - r2
                    float r1 = java.lang.Math.abs(r1)
                    r3 = 1008981770(0x3c23d70a, float:0.01)
                    int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r1 >= 0) goto L79
                    goto L7a
                L79:
                    r0 = r2
                L7a:
                    czib r1 = r8.e
                    eiju r0 = r1.d(r0)
                    cqob r1 = new cqob
                    czjp r2 = new czjp
                    r2.<init>()
                    czjq r3 = new czjq
                    r3.<init>()
                    r1.<init>(r2, r3)
                    eosc r8 = r8.f
                    defpackage.eika.l(r0, r1, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.czjl.onClick(android.view.View):void");
            }
        }));
        boolean zD = this.c.d();
        this.w = zD;
        this.r.setVisibility(true != zD ? 0 : 4);
        this.l.setVisibility(true != this.w ? 4 : 0);
        this.m.setVisibility((!this.w || d()) ? 4 : 0);
        this.n.setVisibility((this.w && !d() && this.x) ? 0 : 4);
        View view2 = this.o;
        if (this.w && !d()) {
            i = 0;
        }
        view2.setVisibility(i);
        this.s.setColor(this.w ? this.A : 0);
        this.q.setColorFilter(this.w ? getContext().getColor(R.color.google_white) : eehg.d(getContext(), R.attr.colorOnSurfaceVariant, "MiniCameraView"));
    }
}
