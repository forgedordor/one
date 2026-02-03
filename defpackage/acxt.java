package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxt extends vq {
    final /* synthetic */ wb a;
    final /* synthetic */ acxu b;

    public acxt(acxu acxuVar, wb wbVar) {
        this.a = wbVar;
        this.b = acxuVar;
    }

    private final void h() {
        if (((LinearLayoutManager) this.a).L() == 0) {
            this.b.a.aj(0);
        }
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        if (i == 0) {
            h();
        }
    }

    @Override // defpackage.vq
    public final void g(int i, int i2) {
        if (i2 == 0 || i == 0) {
            h();
        }
    }
}
