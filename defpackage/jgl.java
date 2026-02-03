package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jgl extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private hna c;
    private hnb d;
    private fdae e;
    private boolean f;
    private boolean g;

    public jgl(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void a() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b5, B:39:0x00af, B:41:0x00b3, B:43:0x00b9, B:44:0x00c0, B:45:0x00c1, B:47:0x00da, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b5, B:39:0x00af, B:41:0x00b3, B:43:0x00b9, B:44:0x00c0, B:45:0x00c1, B:47:0x00da, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b5, B:39:0x00af, B:41:0x00b3, B:43:0x00b9, B:44:0x00c0, B:45:0x00c1, B:47:0x00da, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b5, B:39:0x00af, B:41:0x00b3, B:43:0x00b9, B:44:0x00c0, B:45:0x00c1, B:47:0x00da, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b5, B:39:0x00af, B:41:0x00b3, B:43:0x00b9, B:44:0x00c0, B:45:0x00c1, B:47:0x00da, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, java.lang.Object, jgl] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [hum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgl.c():void");
    }

    private final void k(hnb hnbVar) {
        if (true != l(hnbVar)) {
            hnbVar = null;
        }
        if (hnbVar != null) {
            this.a = new WeakReference(hnbVar);
        }
    }

    private static final boolean l(hnb hnbVar) {
        return !(hnbVar instanceof hqq) || ((hqj) ((hqq) hnbVar).q.c()).compareTo(hqj.b) > 0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        a();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(hml hmlVar, int i);

    protected boolean d() {
        return true;
    }

    public final void e() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        c();
    }

    public final void f() {
        hna hnaVar = this.c;
        if (hnaVar != null) {
            hnaVar.d();
        }
        this.c = null;
        requestLayout();
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final void i(hnb hnbVar) {
        if (this.d != hnbVar) {
            this.d = hnbVar;
            if (hnbVar != null) {
                this.a = null;
            }
            hna hnaVar = this.c;
            if (hnaVar != null) {
                hnaVar.d();
                this.c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.g || super.isTransitionGroup();
    }

    public final void j() {
        fdae jopVar;
        fdae fdaeVar = this.e;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
        if (isAttachedToWindow()) {
            lvj lvjVarA = lxr.a(this);
            if (lvjVarA == null) {
                itw.b(a.h(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new fcta();
            }
            jopVar = jot.a(this, lvjVarA.P());
        } else {
            fdci fdciVar = new fdci();
            joq joqVar = new joq(this, fdciVar);
            addOnAttachStateChangeListener(joqVar);
            fdciVar.a = new joo(this, joqVar);
            jopVar = new jop(fdciVar);
        }
        this.e = jopVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder windowToken = getWindowToken();
        if (this.b != windowToken) {
            this.b = windowToken;
            this.a = null;
        }
        if (d()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        c();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public jgl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public jgl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        jon jonVar = new jon(this);
        addOnAttachStateChangeListener(jonVar);
        jol jolVar = new jol(this);
        ljc.a(this).a.add(jolVar);
        this.e = new jom(this, jonVar, jolVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        a();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        a();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        a();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addView(view, layoutParams);
    }

    public /* synthetic */ jgl(Context context, AttributeSet attributeSet, int i, int i2, fdbk fdbkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
