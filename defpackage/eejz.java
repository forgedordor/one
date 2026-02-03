package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejz implements eekk {
    final /* synthetic */ ExtendedFloatingActionButton a;

    public eejz(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.a = extendedFloatingActionButton;
    }

    @Override // defpackage.eekk
    public final int a() {
        return this.a.getMeasuredHeight();
    }

    @Override // defpackage.eekk
    public final int b() {
        return this.a.q;
    }

    @Override // defpackage.eekk
    public final int c() {
        return this.a.p;
    }

    @Override // defpackage.eekk
    public final int d() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        int measuredWidth = extendedFloatingActionButton.getMeasuredWidth();
        int iP = extendedFloatingActionButton.p();
        return (measuredWidth - (iP + iP)) + extendedFloatingActionButton.p + extendedFloatingActionButton.q;
    }

    @Override // defpackage.eekk
    public final ViewGroup.LayoutParams e() {
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
