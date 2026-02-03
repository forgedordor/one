package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfc {
    static final /* synthetic */ fdeh[] a;
    public final adfd b;
    public final ea c;
    public final abxm d;
    public final fcsu e;
    public final daog f;
    public final fdcz g;
    public final adge h;
    private final fdcz i;

    static {
        fdbv fdbvVar = new fdbv(adfc.class, "anchor", "getAnchor()Landroid/view/ViewGroup;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(adfc.class, "state", "getState()Lcom/google/android/apps/messaging/hqmediasharing/onboarding/OnboardingState;", 0)};
    }

    public adfc(adfd adfdVar, ea eaVar, abxm abxmVar, fcsu fcsuVar, daog daogVar, adge adgeVar) {
        fcsuVar.getClass();
        this.b = adfdVar;
        this.c = eaVar;
        this.d = abxmVar;
        this.e = fcsuVar;
        this.f = daogVar;
        this.h = adgeVar;
        this.i = new ader(this);
        this.g = new ades(this);
    }

    public final ViewGroup a() {
        return (ViewGroup) this.i.c(a[0]);
    }

    public final void b() {
        auvw.k(lvk.a(this.c), null, null, new adeq(this, null), 3);
        d(null);
    }

    public final void c(adel adelVar) {
        adelVar.d(adfr.a);
        b();
    }

    public final void d(adel adelVar) {
        this.g.d(a[1], adelVar);
    }
}
