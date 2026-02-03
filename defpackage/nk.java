package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nk {
    lfo b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final lfp f = new nj(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lfn) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lfn lfnVar = (lfn) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                lfnVar.c(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) lfnVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                lfnVar.d(this.f);
            }
            View view2 = (View) lfnVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c(lfn lfnVar) {
        if (this.c) {
            return;
        }
        this.a.add(lfnVar);
    }

    public final void d() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void e(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void f(lfo lfoVar) {
        if (this.c) {
            return;
        }
        this.b = lfoVar;
    }
}
