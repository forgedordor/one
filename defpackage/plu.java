package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plu extends pmy {
    boolean a = false;
    final ViewGroup b;

    public plu(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void a(pmx pmxVar) {
        pnk.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void b(pmx pmxVar) {
        if (!this.a) {
            pnk.a(this.b, false);
        }
        pmxVar.I(this);
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void c() {
        pnk.a(this.b, false);
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void d() {
        pnk.a(this.b, true);
    }
}
