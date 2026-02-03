package defpackage;

import android.animation.ValueAnimator;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmoo {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraUiAdapter");
    public final dpzv b;
    public final dmlz c;
    public final fdjx d;
    public final fdap e;
    public final fdap f;
    public boolean g;
    public final fduf h;
    public fdlr i;
    public final dmsq j;
    private final fctc k;
    private ValueAnimator l;
    private final int m;

    public dmoo(dpzv dpzvVar, dmlz dmlzVar, dmsq dmsqVar, Optional optional, final Optional optional2, fdjx fdjxVar, fdap fdapVar, fdap fdapVar2, int i) {
        dpzvVar.getClass();
        dmlzVar.getClass();
        optional.getClass();
        this.b = dpzvVar;
        this.c = dmlzVar;
        this.j = dmsqVar;
        this.d = fdjxVar;
        this.e = fdapVar;
        this.f = fdapVar2;
        this.m = i;
        this.k = fctd.a(new fdae() { // from class: dmnk
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional3 = optional2;
                optional3.isPresent();
                return optional3.get();
            }
        });
        Duration durationB = dmlzVar.b();
        dmns dmnsVar = new dmns(this);
        dmnt dmntVar = new dmnt(this);
        dmnu dmnuVar = new dmnu(this);
        dmnv dmnvVar = new dmnv(this);
        dmnw dmnwVar = new dmnw(dmlzVar);
        dmnx dmnxVar = new dmnx(this);
        dmny dmnyVar = new dmny(this);
        dmqz dmqzVar = new dmqz(new dmnz(this), new dmoa(this));
        f();
        f();
        this.h = fdvf.a(new dmoz(durationB, dmnsVar, dmntVar, dmnuVar, dmnvVar, dmnwVar, dmnxVar, dmnyVar, i, dmqzVar, new dmoy(), 561263));
        fdil.d(fdjxVar, null, null, new dmno(this, null), 3);
        this.i = fdil.d(fdjxVar, null, null, new dmnq(this, null), 3);
        dmsqVar.a();
    }

    public final fdpl a() {
        return fdud.b(this.h, this.b.d, this.c.j(), this.j.b, new dmoe(this, null));
    }

    public final void b(bdv bdvVar) {
        if (bdvVar == null) {
            return;
        }
        e(bdvVar.c());
    }

    public final void c(float f) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        bdv bdvVar = (bdv) this.c.k().c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(bdvVar != null ? bdvVar.c() : 1.0f, f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dmnl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                valueAnimator2.getClass();
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                this.a.c.o(((Float) animatedValue).floatValue());
            }
        });
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new dmod(this, f));
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new lud());
        valueAnimatorOfFloat.start();
        this.l = valueAnimatorOfFloat;
    }

    public final void d(lvj lvjVar, azg azgVar) {
        f();
        f();
        this.c.l(lvjVar, azgVar);
        while (true) {
            fduf fdufVar = this.h;
            Object objC = fdufVar.c();
            azg azgVar2 = azgVar;
            if (fdufVar.g(objC, dmoz.a((dmoz) objC, 0, azgVar2, 0, null, false, null, null, null, 2097149))) {
                f();
                return;
            }
            azgVar = azgVar2;
        }
    }

    public final void e(float f) {
        Object objC;
        bdv bdvVar = (bdv) this.c.k().c();
        if (bdvVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        float f2 = 1.0f;
        if (bdvVar.b() < 1.0f) {
            arrayList.add(new dmsy(f < 1.0f ? f : bdvVar.b(), f, new dmok(this)));
        }
        if (f > 1.0f && f < 2.0f) {
            f2 = f;
        }
        arrayList.add(new dmsy(f2, f, new dmol(this)));
        if (bdvVar.a() >= 2.0f) {
            arrayList.add(new dmsy(f > 2.0f ? f : 2.0f, f, new dmom(this)));
        }
        fduf fdufVar = this.h;
        do {
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, dmoz.a((dmoz) objC, 0, null, 0, null, false, arrayList, null, null, 2097087)));
    }

    public final void f() {
    }

    public final void g(lvj lvjVar, int i) {
        fduf fdufVar = this.h;
        if (i == ((dmoz) fdufVar.c()).a) {
            return;
        }
        f();
        this.c.m(lvjVar, i);
        while (true) {
            Object objC = fdufVar.c();
            int i2 = i;
            if (fdufVar.g(objC, dmoz.a((dmoz) objC, i2, null, 0, null, false, null, null, null, 2097150))) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
