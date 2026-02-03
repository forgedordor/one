package com.google.android.libraries.smartmessaging.expressivetext.impl.opengl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import defpackage.ebtk;
import defpackage.ebtn;
import defpackage.ebto;
import defpackage.ebtq;
import defpackage.ebtr;
import defpackage.ebtt;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final ebtr a = new ebtr();
    public final WeakReference b;
    public ebtq c;
    public ebtt d;
    public ebtk e;
    public int f;
    public boolean g;
    public ebtn h;
    public ebto i;
    private boolean j;
    private boolean k;

    public GLTextureView(Context context) {
        super(context);
        this.b = new WeakReference(this);
        this.k = false;
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void b(boolean z) {
        ebtq ebtqVar;
        this.k = z;
        if (z || !this.j || (ebtqVar = this.c) == null || ebtqVar.d()) {
            return;
        }
        this.c.b();
    }

    protected final void finalize() throws Throwable {
        try {
            ebtq ebtqVar = this.c;
            if (ebtqVar != null) {
                ebtqVar.b();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        ebtq ebtqVar;
        int i;
        super.onAttachedToWindow();
        if (this.j && this.d != null && (ebtqVar = this.c) != null && ebtqVar.d()) {
            ebtq ebtqVar2 = this.c;
            if (ebtqVar2 != null) {
                synchronized (a) {
                    i = ebtqVar2.g;
                }
            } else {
                i = 1;
            }
            ebtq ebtqVar3 = new ebtq(this.b);
            this.c = ebtqVar3;
            if (i != 1) {
                ebtqVar3.c(0);
            }
            this.c.start();
        }
        this.j = false;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        ebtq ebtqVar;
        if (!this.k && (ebtqVar = this.c) != null) {
            ebtqVar.b();
        }
        this.j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ebtq ebtqVar = this.c;
        ebtr ebtrVar = a;
        synchronized (ebtrVar) {
            ebtqVar.d = true;
            ebtqVar.f = false;
            ebtrVar.notifyAll();
            while (ebtqVar.e && !ebtqVar.f && !ebtqVar.a) {
                try {
                    ebtrVar.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.c.a(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ebtq ebtqVar = this.c;
        ebtr ebtrVar = a;
        synchronized (ebtrVar) {
            ebtqVar.d = false;
            ebtrVar.notifyAll();
            while (!ebtqVar.e && !ebtqVar.a) {
                try {
                    ebtrVar.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c.a(i, i2);
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new WeakReference(this);
        this.k = false;
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
