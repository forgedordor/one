package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class to extends wg {
    final /* synthetic */ tr a;

    public to(tr trVar) {
        this.a = trVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        tr trVar = this.a;
        int iComputeVerticalScrollRange = trVar.l.computeVerticalScrollRange();
        int i3 = trVar.k;
        trVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= trVar.a;
        int iComputeHorizontalScrollRange = trVar.l.computeHorizontalScrollRange();
        int i4 = trVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= trVar.a;
        trVar.n = z;
        if (trVar.m) {
            float f = i3;
            trVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            trVar.d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (trVar.o != 0) {
                trVar.f(0);
                return;
            }
            return;
        }
        if (trVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            trVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            trVar.g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = trVar.o;
        if (i5 == 0 || i5 == 1) {
            trVar.f(1);
        }
    }
}
