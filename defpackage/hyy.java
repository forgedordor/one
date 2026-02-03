package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hyy implements fdap {
    final /* synthetic */ fdap a;

    public hyy(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        hzn hznVar = (hzn) obj;
        synchronized (hzt.c) {
            j = hzt.e;
            hzt.e = 1 + j;
        }
        return new hzd(j, hznVar, this.a);
    }
}
