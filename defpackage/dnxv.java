package defpackage;

import android.support.constraint.Guideline;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnxv implements dpvw {
    final /* synthetic */ dnyn a;
    private final dpvw b;

    public dnxv(dnyn dnynVar, dpvw dpvwVar) {
        this.a = dnynVar;
        this.b = dpvwVar;
    }

    @Override // defpackage.dpvw
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.dpvw
    public final View b() {
        return null;
    }

    @Override // defpackage.dpvw
    public final dpvp c() {
        return ((dpvt) this.b).a;
    }

    @Override // defpackage.dpvw
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // defpackage.dpvw
    public final void f(int i) {
        Guideline guideline;
        this.b.f(i);
        dnyn dnynVar = this.a;
        View view = dnynVar.Q;
        if (view == null || (guideline = (Guideline) view.findViewById(R.id.header_guideline)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        au auVar = (au) layoutParams;
        auVar.a = i - dnynVar.a().getResources().getDimensionPixelSize(R.dimen.standard_view_padding);
        guideline.setLayoutParams(auVar);
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
        return false;
    }

    @Override // defpackage.dpvw
    public final void j(int i) {
        this.b.j(i);
    }

    @Override // defpackage.dpvw
    public final void k(boolean z) {
        this.b.k(z);
    }

    @Override // defpackage.dpvw
    public final void e() {
    }
}
