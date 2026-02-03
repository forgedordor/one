package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jg implements ldn {
    final /* synthetic */ jz a;

    public jg(jz jzVar) {
        this.a = jzVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lgt lgtVarA;
        int i;
        int i2;
        int iD = lgtVar.d();
        int iD2 = lgtVar.d();
        jz jzVar = this.a;
        ActionBarContextView actionBarContextView = jzVar.s;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jzVar.s.getLayoutParams();
            if (jzVar.s.isShown()) {
                if (jzVar.L == null) {
                    jzVar.L = new Rect();
                    jzVar.M = new Rect();
                }
                Rect rect = jzVar.L;
                Rect rect2 = jzVar.M;
                rect.set(lgtVar.b(), lgtVar.d(), lgtVar.c(), lgtVar.a());
                kzc kzcVarF = lgtVar.f(2);
                ViewGroup viewGroup = jzVar.y;
                int i3 = 1;
                if (Build.VERSION.SDK_INT >= 29) {
                    Insets systemWindowInsets = viewGroup.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                    rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                    i2 = 0;
                } else {
                    if (zy.a) {
                        i2 = 0;
                    } else {
                        zy.a = true;
                        i2 = 0;
                        try {
                            zy.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!zy.b.isAccessible()) {
                                zy.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = zy.b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i2] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect2.left;
                int i5 = rect2.top;
                int i6 = rect2.right;
                int i7 = rect2.bottom;
                int i8 = kzcVarF.b - i4;
                int i9 = kzcVarF.c - i5;
                int i10 = kzcVarF.d - i6;
                int i11 = kzcVarF.e - i7;
                int i12 = i2;
                kzc kzcVarD = kzc.d(Math.max(i12, i8), Math.max(i12, i9), Math.max(i12, i10), Math.max(i12, i11));
                int i13 = marginLayoutParams.leftMargin;
                int i14 = kzcVarD.b;
                if (i13 == i14 && marginLayoutParams.rightMargin == kzcVarD.d) {
                    i3 = i12;
                } else {
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = kzcVarD.d;
                }
                ActionBarContextView actionBarContextView2 = jzVar.s;
                int i15 = rect.left - i14;
                int i16 = rect.top;
                int i17 = rect.right - kzcVarD.d;
                actionBarContextView2.k = i15;
                actionBarContextView2.l = i16;
                actionBarContextView2.m = i17;
                actionBarContextView2.n();
                if (!jzVar.B && rect.top > 0) {
                    iD2 = i12;
                }
                i = i3;
            } else {
                i = 0;
            }
            if (i != 0) {
                jzVar.s.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = lgtVar.b();
            int iC = lgtVar.c();
            int iA = lgtVar.a();
            lgh lggVar = Build.VERSION.SDK_INT >= 34 ? new lgg(lgtVar) : Build.VERSION.SDK_INT >= 31 ? new lgf(lgtVar) : Build.VERSION.SDK_INT >= 30 ? new lge(lgtVar) : Build.VERSION.SDK_INT >= 29 ? new lgd(lgtVar) : new lgc(lgtVar);
            lggVar.c(kzc.d(iB, iD2, iC, iA));
            lgtVarA = lggVar.a();
        } else {
            lgtVarA = lgtVar;
        }
        return ley.g(view, lgtVarA);
    }
}
