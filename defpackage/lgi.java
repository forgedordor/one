package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgi extends lgp {
    private static boolean d = false;
    private static Method e;
    private static Class h;
    private static Field i;
    private static Field j;
    final WindowInsets a;
    kzc b;
    int c;
    private kzc[] k;
    private kzc l;
    private lgt m;

    public lgi(lgt lgtVar, WindowInsets windowInsets) {
        super(lgtVar);
        this.l = null;
        this.a = windowInsets;
    }

    private kzc A() {
        lgt lgtVar = this.m;
        return lgtVar != null ? lgtVar.h() : kzc.a;
    }

    private kzc B(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!d) {
            C();
        }
        Method method = e;
        if (method != null && h != null && i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) i.get(j.get(objInvoke));
                if (rect != null) {
                    return kzc.c(rect);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        return null;
    }

    private static void C() throws ClassNotFoundException {
        try {
            e = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            h = cls;
            i = cls.getDeclaredField("mVisibleInsets");
            j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            i.setAccessible(true);
            j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
        }
        d = true;
    }

    static boolean o(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private kzc z(int i2, boolean z) {
        kzc kzcVarB = kzc.a;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0) {
                kzcVarB = kzc.b(kzcVarB, b(i3, z));
            }
        }
        return kzcVarB;
    }

    @Override // defpackage.lgp
    public kzc a(int i2) {
        return z(i2, false);
    }

    protected kzc b(int i2, boolean z) {
        kzc kzcVarH;
        kzc kzcVar;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    kzc[] kzcVarArr = this.k;
                    kzcVarH = kzcVarArr != null ? kzcVarArr[lgq.a(8)] : null;
                    if (kzcVarH != null) {
                        return kzcVarH;
                    }
                    kzc kzcVarD = d();
                    kzc kzcVarA = A();
                    int i3 = kzcVarD.e;
                    int i4 = kzcVarA.e;
                    if (i3 > i4 || ((kzcVar = this.b) != null && !kzcVar.equals(kzc.a) && (i3 = this.b.e) > i4)) {
                        return kzc.d(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return x();
                    }
                    if (i2 == 32) {
                        return w();
                    }
                    if (i2 == 64) {
                        return y();
                    }
                    if (i2 == 128) {
                        lgt lgtVar = this.m;
                        lcz lczVarJ = lgtVar != null ? lgtVar.j() : u();
                        if (lczVarJ != null) {
                            return kzc.d(lczVarJ.b(), lczVarJ.d(), lczVarJ.c(), lczVarJ.a());
                        }
                    }
                }
            } else {
                if (z) {
                    kzc kzcVarA2 = A();
                    kzc kzcVarP = p();
                    return kzc.d(Math.max(kzcVarA2.b, kzcVarP.b), 0, Math.max(kzcVarA2.d, kzcVarP.d), Math.max(kzcVarA2.e, kzcVarP.e));
                }
                if ((this.c & 2) == 0) {
                    kzc kzcVarD2 = d();
                    lgt lgtVar2 = this.m;
                    kzcVarH = lgtVar2 != null ? lgtVar2.h() : null;
                    int iMin = kzcVarD2.e;
                    if (kzcVarH != null) {
                        iMin = Math.min(iMin, kzcVarH.e);
                    }
                    return kzc.d(kzcVarD2.b, 0, kzcVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return kzc.d(0, Math.max(A().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return kzc.d(0, d().c, 0, 0);
            }
        }
        return kzc.a;
    }

    @Override // defpackage.lgp
    public kzc c(int i2) {
        return z(i2, true);
    }

    @Override // defpackage.lgp
    public final kzc d() {
        if (this.l == null) {
            WindowInsets windowInsets = this.a;
            this.l = kzc.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.l;
    }

    @Override // defpackage.lgp
    public lgt e(int i2, int i3, int i4, int i5) {
        lgt lgtVarO = lgt.o(this.a);
        lgh lggVar = Build.VERSION.SDK_INT >= 34 ? new lgg(lgtVarO) : Build.VERSION.SDK_INT >= 31 ? new lgf(lgtVarO) : Build.VERSION.SDK_INT >= 30 ? new lge(lgtVarO) : Build.VERSION.SDK_INT >= 29 ? new lgd(lgtVarO) : new lgc(lgtVarO);
        lggVar.c(lgt.i(d(), i2, i3, i4, i5));
        lggVar.b(lgt.i(p(), i2, i3, i4, i5));
        return lggVar.a();
    }

    @Override // defpackage.lgp
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        lgi lgiVar = (lgi) obj;
        return Objects.equals(this.b, lgiVar.b) && o(this.c, lgiVar.c);
    }

    @Override // defpackage.lgp
    public void f(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        kzc kzcVarB = B(view);
        if (kzcVarB == null) {
            kzcVarB = kzc.a;
        }
        i(kzcVarB);
    }

    @Override // defpackage.lgp
    public void g(lgt lgtVar) {
        lgtVar.s(this.m);
        lgtVar.b.i(this.b);
        lgtVar.t(this.c);
    }

    @Override // defpackage.lgp
    public void h(kzc[] kzcVarArr) {
        this.k = kzcVarArr;
    }

    @Override // defpackage.lgp
    public void i(kzc kzcVar) {
        this.b = kzcVar;
    }

    @Override // defpackage.lgp
    public void j(lgt lgtVar) {
        this.m = lgtVar;
    }

    @Override // defpackage.lgp
    public void k(int i2) {
        this.c = i2;
    }

    @Override // defpackage.lgp
    public boolean l() {
        return this.a.isRound();
    }

    protected boolean m(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !b(i2, false).equals(kzc.a);
    }

    @Override // defpackage.lgp
    public boolean n(int i2) {
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0 && !m(i3)) {
                return false;
            }
        }
        return true;
    }

    public lgi(lgt lgtVar, lgi lgiVar) {
        this(lgtVar, new WindowInsets(lgiVar.a));
    }
}
