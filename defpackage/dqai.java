package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqai {
    public final int a;
    private final fctc b = fctd.a(new fdae() { // from class: dqah
        @Override // defpackage.fdae
        public final Object invoke() {
            return new dqag(this.a.a, 2, null);
        }
    });
    private int c;
    private int d;

    public dqai(int i) {
        this.a = i;
    }

    private final dqag c() {
        return (dqag) this.b.a();
    }

    public final void a(RecyclerView recyclerView) {
        int i = this.a;
        if (i != 0) {
            this.c = recyclerView.getPaddingStart();
            int paddingTop = recyclerView.getPaddingTop();
            this.d = paddingTop;
            int i2 = this.c;
            if (i2 == 0) {
                i2 = i;
            }
            if (paddingTop != 0) {
                i = paddingTop;
            }
            recyclerView.setPaddingRelative(i2, i, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
            recyclerView.v(c());
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (this.a != 0) {
            recyclerView.setPaddingRelative(this.c, this.d, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
            recyclerView.ad(c());
        }
    }
}
