package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wl extends vq {
    final /* synthetic */ RecyclerView a;

    public wl(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.vq
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.z(null);
        recyclerView.N.f = true;
        recyclerView.aa(true);
        if (recyclerView.g.l()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.vq
    public final void c(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.z(null);
        ql qlVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = qlVar.a;
        arrayList.add(qlVar.c(4, i, i2, obj));
        qlVar.d |= 4;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.z(null);
        ql qlVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = qlVar.a;
        arrayList.add(qlVar.c(1, i, i2, null));
        qlVar.d |= 1;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.vq
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.z(null);
        ql qlVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = qlVar.a;
        arrayList.add(qlVar.c(2, i, i2, null));
        qlVar.d |= 2;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.vq
    public final void f() {
        vo voVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView.f == null || (voVar = recyclerView.n) == null || !voVar.D()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.vq
    public final void g(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.z(null);
        ql qlVar = recyclerView.g;
        if (i == i2) {
            return;
        }
        ArrayList arrayList = qlVar.a;
        arrayList.add(qlVar.c(8, i, i2, null));
        qlVar.d |= 8;
        if (arrayList.size() == 1) {
            h();
        }
    }

    final void h() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.s || !recyclerView.r) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.k;
            int[] iArr = ley.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
