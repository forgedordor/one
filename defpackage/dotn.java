package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotn implements dpvv {
    final /* synthetic */ dpvw a;
    final /* synthetic */ dots b;

    public dotn(dpvw dpvwVar, dots dotsVar) {
        this.a = dpvwVar;
        this.b = dotsVar;
    }

    @Override // defpackage.dpvv
    public final void b(int i) {
        if (this.a.h()) {
            View view = this.b.c.l;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        View view2 = this.b.c.l;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // defpackage.dpvv
    public final /* synthetic */ void a(int i, float f) {
    }
}
