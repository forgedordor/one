package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knp extends abk {
    public fdae a;
    public knl c;
    public final knj d;
    private final View e;
    private final float f;
    private boolean g;

    public knp(fdae fdaeVar, knl knlVar, View view, kji kjiVar, kio kioVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), true != knlVar.d ? R.style.FloatingDialogWindowTheme : R.style.DialogWindowTheme));
        this.a = fdaeVar;
        this.c = knlVar;
        this.e = view;
        this.f = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        lfq.a(window, this.c.d);
        window.setGravity(17);
        if (!this.c.d) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 30) {
                knb knbVar = knb.a;
                knbVar.a(attributes, 0);
                knbVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        knj knjVar = new knj(getContext(), window);
        setTitle(this.c.e);
        Objects.toString(uuid);
        knjVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        knjVar.setClipChildren(false);
        knjVar.setElevation(kioVar.en(8.0f));
        knjVar.setOutlineProvider(new knn());
        this.d = knjVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(knjVar);
        lxr.b(knjVar, lxr.a(view));
        lxs.b(knjVar, lxs.a(view));
        pje.b(knjVar, pje.a(view));
        a(this.a, this.c, kjiVar);
        acg.a(this.b, this, true, new kno(this));
    }

    private static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof knj) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    public final void a(fdae fdaeVar, knl knlVar, kji kjiVar) {
        int i;
        this.a = fdaeVar;
        this.c = knlVar;
        int i2 = knlVar.f;
        int i3 = i2 - 1;
        boolean zD = kna.d(this.e);
        if (i2 == 0) {
            throw null;
        }
        if (i3 != 0) {
            throw new fctg();
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(true != zD ? -8193 : 8192, 8192);
        knj knjVar = this.d;
        int iOrdinal = kjiVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            i = 1;
        }
        knjVar.setLayoutDirection(i);
        boolean z = knlVar.d;
        boolean z2 = knlVar.c;
        boolean z3 = (knjVar.d && z2 == knjVar.b && z == knjVar.c) ? false : true;
        knjVar.b = z2;
        knjVar.c = z;
        if (z3) {
            Window window2 = knjVar.a;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i4 = true != z2 ? -1 : -2;
            if (i4 != attributes.width || !knjVar.d) {
                window2.setLayout(i4, -2);
                knjVar.d = true;
            }
        }
        setCanceledOnTouchOutside(knlVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.c.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.a.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6 <= r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r10 != 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r10 != 3) goto L37;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            knl r1 = r9.c
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L85
            knj r1 = r9.d
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6b
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6b
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L36
            goto L6b
        L36:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r6 = r6 + r7
            int r7 = r5.getWidth()
            int r7 = r7 + r6
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r1 = r1 + r8
            int r5 = r5.getHeight()
            int r5 = r5 + r1
            float r8 = r10.getX()
            int r8 = defpackage.fdcu.b(r8)
            if (r6 > r8) goto L6b
            if (r8 > r7) goto L6b
            float r6 = r10.getY()
            int r6 = defpackage.fdcu.b(r6)
            if (r1 > r6) goto L6b
            if (r6 > r5) goto L6b
            goto L85
        L6b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L82
            if (r10 == r4) goto L76
            if (r10 == r2) goto L90
            goto L8f
        L76:
            boolean r10 = r9.g
            if (r10 == 0) goto L8f
            fdae r10 = r9.a
            r10.invoke()
            r9.g = r3
            return r4
        L82:
            r9.g = r4
            return r4
        L85:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L90
            if (r10 == r4) goto L90
            if (r10 == r2) goto L90
        L8f:
            return r0
        L90:
            r9.g = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knp.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
