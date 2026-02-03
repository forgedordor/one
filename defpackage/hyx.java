package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hyx implements fdap {
    final /* synthetic */ fdap a;
    final /* synthetic */ fdap b;

    public hyx(fdap fdapVar, fdap fdapVar2) {
        this.a = fdapVar;
        this.b = fdapVar2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        hzn hznVar = (hzn) obj;
        synchronized (hzt.c) {
            j = hzt.e;
            hzt.e = 1 + j;
        }
        return new hza(j, hznVar, this.a, this.b);
    }
}
