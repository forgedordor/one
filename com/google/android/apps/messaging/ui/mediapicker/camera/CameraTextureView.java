package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.mediapipe.framework.TextureFrame;
import defpackage.cqaz;
import defpackage.cqce;
import defpackage.cqob;
import defpackage.crma;
import defpackage.czft;
import defpackage.czib;
import defpackage.czig;
import defpackage.czik;
import defpackage.cziw;
import defpackage.czka;
import defpackage.dqyy;
import defpackage.dqzc;
import defpackage.eika;
import defpackage.ejwl;
import defpackage.euwj;
import defpackage.euxq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraTextureView extends cziw implements czig {
    public static final cqce a = cqce.g("Bugle", "CameraTextureView");
    public final boolean b;
    public czib c;
    public Optional d;
    public Optional e;
    public crma f;
    public dqyy g;
    public float h;
    public czft i;
    private final WindowManager j;
    private boolean k;

    public CameraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
        this.h = 1.7777778f;
        this.j = (WindowManager) context.getSystemService("window");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, czka.a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.czig
    public final void a(int i, int i2) {
        if (i < i2 || i2 == 0) {
            return;
        }
        this.h = i / i2;
    }

    @Override // defpackage.czig
    public final void b(euwj euwjVar) {
        cqaz.f(this.b);
        this.g.f = euwjVar;
    }

    @Override // defpackage.czig
    public final boolean c() {
        return (this.g == null && getSurfaceTexture() == null) ? false : true;
    }

    final int d(boolean z, int i, int i2) {
        if (z) {
            i = (int) (i2 * this.h);
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public final void e() {
        this.k = true;
        this.c.j(this, isShown());
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.r(this);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.b) {
            setSurfaceTextureListener(new czik(this));
            return;
        }
        this.g = new dqyy();
        ejwl.l(true);
        if (this.e.isEmpty()) {
            this.c.j(this, isShown());
            return;
        }
        final dqyy dqyyVar = this.g;
        dqyyVar.b = new euxq(this.e.get());
        dqyyVar.c = new dqzc(dqyyVar.b.c, this);
        dqzc dqzcVar = dqyyVar.c;
        dqzcVar.i = new euwj() { // from class: dqyx
            @Override // defpackage.euwj
            public final void ht(TextureFrame textureFrame) {
                euwj euwjVar = dqyyVar.f;
                if (euwjVar != null) {
                    euwjVar.ht(textureFrame);
                } else {
                    textureFrame.release();
                }
            }
        };
        dqyyVar.a.a = dqzcVar;
        dqyyVar.b.c();
        eika.l(dqyyVar.c.d, new cqob(new Consumer() { // from class: czii
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CameraTextureView cameraTextureView = this.a;
                cameraTextureView.c.j(cameraTextureView, cameraTextureView.isShown());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: czij
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CameraTextureView.a.o("Failed waiting on preview manager", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.d.get());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.h >= 1.0f) {
            WindowManager windowManager = this.j;
            boolean z = false;
            if (windowManager != null && windowManager.getDefaultDisplay().getRotation() % 180 != 0) {
                z = true;
            }
            i = d(z, size, size2);
            i2 = d(true ^ z, size2, size);
        }
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        this.c.j(this, isShown());
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.k && this.f.d()) {
            this.c.j(this, isShown());
        }
    }
}
