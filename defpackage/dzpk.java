package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzpk extends wg {
    final /* synthetic */ dzfh a;
    final /* synthetic */ dzpl b;
    private boolean c;

    public dzpk(dzpl dzplVar, dzfh dzfhVar) {
        this.a = dzfhVar;
        this.b = dzplVar;
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
        if (this.c) {
            if (i == 0) {
                this.b.g(this.a, null);
                this.c = false;
                return;
            }
            return;
        }
        if (i == 1) {
            this.b.f(this.a);
            this.c = true;
        }
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
    }
}
