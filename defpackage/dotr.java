package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotr implements dpvw {
    final /* synthetic */ dots a;
    private final /* synthetic */ dpvw b;

    public dotr(dpvw dpvwVar, dots dotsVar) {
        this.a = dotsVar;
        this.b = dpvwVar;
    }

    @Override // defpackage.dpvw
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.dpvw
    public final /* bridge */ /* synthetic */ View b() {
        dots dotsVar = this.a;
        ConstraintLayout constraintLayoutB = dotsVar.b();
        if (dotsVar.g || dotsVar.j != 3) {
            return null;
        }
        return constraintLayoutB;
    }

    @Override // defpackage.dpvw
    public final dpvp c() {
        return this.b.c();
    }

    @Override // defpackage.dpvw
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // defpackage.dpvw
    public final void e() {
        this.a.d.b.f();
    }

    @Override // defpackage.dpvw
    public final void f(int i) {
        this.b.f(i);
    }

    @Override // defpackage.dpvw
    public final boolean g() {
        return this.b.g();
    }

    @Override // defpackage.dpvw
    public final boolean h() {
        return this.b.h();
    }

    @Override // defpackage.dpvw
    public final boolean i(int i) {
        doum doumVar = this.a.d.b;
        doumVar.g = false;
        if (!doumVar.b(-i, true) && doumVar.c()) {
            doumVar.g = true;
            if (doumVar.c()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dpvw
    public final void j(int i) {
        this.b.j(i);
    }

    @Override // defpackage.dpvw
    public final void k(boolean z) {
        this.b.k(z);
    }
}
