package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvz extends fcvy {
    final /* synthetic */ cvx a;
    private int b;

    public cvz(cvx cvxVar) {
        this.a = cvxVar;
    }

    @Override // defpackage.fcvy
    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
