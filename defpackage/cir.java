package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cir {
    Size a;
    public final FrameLayout b;
    public final cig c;
    private boolean d = false;

    public cir(FrameLayout frameLayout, cig cigVar) {
        this.b = frameLayout;
        this.c = cigVar;
    }

    public abstract Bitmap a();

    public abstract View b();

    public abstract ListenableFuture c();

    public abstract void d();

    public abstract void e();

    final void f() {
        this.d = true;
        g();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final void g() {
        View viewB = b();
        if (viewB == null || !this.d) {
            return;
        }
        cig cigVar = this.c;
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            bbs.f("PreviewTransform", "Transform not applied due to PreviewView size: ".concat(size.toString()));
            return;
        }
        if (cigVar.f()) {
            if (viewB instanceof TextureView) {
                ((TextureView) viewB).setTransform(cigVar.d());
            } else {
                Display display = viewB.getDisplay();
                boolean z = (!cigVar.g || display == null || display.getRotation() == cigVar.e) ? false : true;
                boolean z2 = (cigVar.g || cigVar.a() == 0) ? false : true;
                if (z || z2) {
                    bbs.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = cigVar.e(size, layoutDirection);
            viewB.setPivotX(0.0f);
            viewB.setPivotY(0.0f);
            viewB.setScaleX(rectFE.width() / cigVar.a.getWidth());
            viewB.setScaleY(rectFE.height() / cigVar.a.getHeight());
            viewB.setTranslationX(rectFE.left - viewB.getLeft());
            viewB.setTranslationY(rectFE.top - viewB.getTop());
        }
    }

    public abstract void h(bdp bdpVar, cil cilVar);
}
