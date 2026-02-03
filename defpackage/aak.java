package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aak extends aag {
    public final int a;
    public final int b;

    public aak(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.aag
    public int e(RecyclerView recyclerView, wv wvVar) {
        return g(this.b, q(recyclerView, wvVar));
    }

    public int q(RecyclerView recyclerView, wv wvVar) {
        return this.a;
    }
}
