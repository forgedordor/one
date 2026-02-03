package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jo implements na {
    final /* synthetic */ jz a;
    private final na b;

    public jo(jz jzVar, na naVar) {
        this.a = jzVar;
        this.b = naVar;
    }

    @Override // defpackage.na
    public final void a(nb nbVar) {
        ne neVar = (ne) this.b;
        neVar.a.onDestroyActionMode(neVar.e(nbVar));
        jz jzVar = this.a;
        if (jzVar.t != null) {
            jzVar.l.getDecorView().removeCallbacks(jzVar.u);
        }
        if (jzVar.s != null) {
            jzVar.E();
            lfn lfnVarE = ley.e(jzVar.s);
            lfnVarE.b(0.0f);
            jzVar.v = lfnVarE;
            jzVar.v.d(new jn(this));
        }
        iz izVar = jzVar.n;
        if (izVar != null) {
            izVar.m(jzVar.r);
        }
        jzVar.r = null;
        ViewGroup viewGroup = jzVar.y;
        int[] iArr = ley.a;
        lel.c(viewGroup);
        jzVar.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.na
    public final boolean b(nb nbVar, MenuItem menuItem) {
        ne neVar = (ne) this.b;
        return neVar.a.onActionItemClicked(neVar.e(nbVar), new ok(neVar.b, menuItem));
    }

    @Override // defpackage.na
    public final boolean c(nb nbVar, Menu menu) {
        ne neVar = (ne) this.b;
        return neVar.a.onCreateActionMode(neVar.e(nbVar), neVar.f(menu));
    }

    @Override // defpackage.na
    public final void d(nb nbVar, Menu menu) {
        ViewGroup viewGroup = this.a.y;
        int[] iArr = ley.a;
        lel.c(viewGroup);
        ne neVar = (ne) this.b;
        neVar.a.onPrepareActionMode(neVar.e(nbVar), neVar.f(menu));
    }
}
