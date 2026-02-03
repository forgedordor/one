package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvt implements dpvw {
    public final dpvp a;
    final /* synthetic */ RecyclerView b;

    public dpvt(final RecyclerView recyclerView) {
        this.b = recyclerView;
        this.a = new dpvp(new fdap() { // from class: dpvq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpvv dpvvVar = (dpvv) obj;
                dpvvVar.getClass();
                return new dpvl(dpvvVar);
            }
        }, new fdap() { // from class: dpvr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpvl dpvlVar = (dpvl) obj;
                dpvlVar.getClass();
                recyclerView.y(dpvlVar);
                return fctx.a;
            }
        }, new fdap() { // from class: dpvs
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpvl dpvlVar = (dpvl) obj;
                dpvlVar.getClass();
                recyclerView.ah(dpvlVar);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.dpvw
    public final int a() {
        return this.b.computeVerticalScrollOffset();
    }

    @Override // defpackage.dpvw
    public final /* synthetic */ View b() {
        return null;
    }

    @Override // defpackage.dpvw
    public final dpvp c() {
        return this.a;
    }

    @Override // defpackage.dpvw
    public final void d(int i) {
        this.b.aA(0, i);
    }

    @Override // defpackage.dpvw
    public final void f(int i) {
        RecyclerView recyclerView = this.b;
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.invalidate();
    }

    @Override // defpackage.dpvw
    public final boolean g() {
        return !this.b.canScrollVertically(1);
    }

    @Override // defpackage.dpvw
    public final boolean h() {
        return !this.b.canScrollVertically(-1);
    }

    @Override // defpackage.dpvw
    public final /* synthetic */ boolean i(int i) {
        return false;
    }

    @Override // defpackage.dpvw
    public final void j(int i) {
        this.b.scrollBy(0, i);
    }

    @Override // defpackage.dpvw
    public final void k(boolean z) {
        RecyclerView recyclerView = this.b;
        if (z) {
            recyclerView.ax();
        }
        wb wbVar = recyclerView.o;
        if (wbVar != null) {
            if (wbVar instanceof GridLayoutManager) {
                ((GridLayoutManager) wbVar).ab(0, 0);
                return;
            }
            if (wbVar instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) wbVar;
                ym ymVar = staggeredGridLayoutManager.j;
                if (ymVar != null) {
                    ymVar.a();
                }
                staggeredGridLayoutManager.g = 0;
                staggeredGridLayoutManager.h = 0;
                staggeredGridLayoutManager.bb();
            }
        }
    }

    @Override // defpackage.dpvw
    public final /* synthetic */ void e() {
    }
}
