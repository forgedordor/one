package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfw implements View.OnApplyWindowInsetsListener {
    final lfs a;
    private lgt b;

    public lfw(View view, lfs lfsVar) {
        lgt lgtVarA;
        this.a = lfsVar;
        int[] iArr = ley.a;
        lgt lgtVarA2 = leo.a(view);
        if (lgtVarA2 != null) {
            lgtVarA = (Build.VERSION.SDK_INT >= 34 ? new lgg(lgtVarA2) : Build.VERSION.SDK_INT >= 31 ? new lgf(lgtVarA2) : Build.VERSION.SDK_INT >= 30 ? new lge(lgtVarA2) : Build.VERSION.SDK_INT >= 29 ? new lgd(lgtVarA2) : new lgc(lgtVarA2)).a();
        } else {
            lgtVarA = null;
        }
        this.b = lgtVarA;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = lgt.p(windowInsets, view);
            return lfx.a(view, windowInsets);
        }
        lgt lgtVarP = lgt.p(windowInsets, view);
        if (this.b == null) {
            int[] iArr = ley.a;
            this.b = leo.a(view);
        }
        if (this.b == null) {
            this.b = lgtVarP;
            return lfx.a(view, windowInsets);
        }
        lfs lfsVarB = lfx.b(view);
        if (lfsVarB != null && Objects.equals(lfsVarB.b, lgtVarP)) {
            return lfx.a(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        lgt lgtVar = this.b;
        for (int i = 1; i <= 512; i += i) {
            kzc kzcVarF = lgtVarP.f(i);
            kzc kzcVarF2 = lgtVar.f(i);
            int i2 = kzcVarF.b;
            int i3 = kzcVarF2.b;
            boolean z = i2 > i3 || kzcVarF.c > kzcVarF2.c || kzcVarF.d > kzcVarF2.d || kzcVarF.e > kzcVarF2.e;
            if (z != (i2 < i3 || kzcVarF.c < kzcVarF2.c || kzcVarF.d < kzcVarF2.d || kzcVarF.e < kzcVarF2.e)) {
                if (z) {
                    iArr2[0] = iArr2[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
        }
        int i4 = iArr2[0];
        int i5 = iArr3[0];
        int i6 = i4 | i5;
        if (i6 == 0) {
            this.b = lgtVarP;
            return lfx.a(view, windowInsets);
        }
        lgt lgtVar2 = this.b;
        lgb lgbVar = new lgb(i6, (i4 & 8) != 0 ? lfx.a : (i5 & 8) != 0 ? lfx.b : (i4 & 519) != 0 ? lfx.c : (i5 & 519) != 0 ? lfx.d : null, (i6 & 8) != 0 ? 160L : 250L);
        lgbVar.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(lgbVar.c());
        kzc kzcVarF3 = lgtVarP.f(i6);
        kzc kzcVarF4 = lgtVar2.f(i6);
        int i7 = kzcVarF3.b;
        int i8 = kzcVarF4.b;
        int i9 = kzcVarF3.c;
        int i10 = kzcVarF4.c;
        int i11 = kzcVarF3.d;
        int i12 = kzcVarF4.d;
        int i13 = kzcVarF3.e;
        int i14 = kzcVarF4.e;
        lfr lfrVar = new lfr(kzc.d(Math.min(i7, i8), Math.min(i9, i10), Math.min(i11, i12), Math.min(i13, i14)), kzc.d(Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        lfx.d(view, lgbVar, lgtVarP, false);
        duration.addUpdateListener(new lft(lgbVar, lgtVarP, lgtVar2, i6, view));
        duration.addListener(new lfu(lgbVar, view));
        ldq.b(view, new lfv(view, lgbVar, lfrVar, duration));
        this.b = lgtVarP;
        return lfx.a(view, windowInsets);
    }
}
