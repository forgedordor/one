package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekb implements eekk {
    final /* synthetic */ eekk a;
    final /* synthetic */ eekk b;
    final /* synthetic */ ExtendedFloatingActionButton c;

    public eekb(ExtendedFloatingActionButton extendedFloatingActionButton, eekk eekkVar, eekk eekkVar2) {
        this.a = eekkVar;
        this.b = eekkVar2;
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.eekk
    public final int a() {
        int i = this.c.v;
        return i == -1 ? this.a.a() : (i == 0 || i == -2) ? this.b.a() : i;
    }

    @Override // defpackage.eekk
    public final int b() {
        return this.c.q;
    }

    @Override // defpackage.eekk
    public final int c() {
        return this.c.p;
    }

    @Override // defpackage.eekk
    public final int d() {
        int i = this.c.u;
        return i == -1 ? this.a.d() : (i == 0 || i == -2) ? this.b.d() : i;
    }

    @Override // defpackage.eekk
    public final ViewGroup.LayoutParams e() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i = extendedFloatingActionButton.u;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.v;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }
}
