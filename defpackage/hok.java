package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hok implements fdap {
    final /* synthetic */ hol a;
    final /* synthetic */ fdis b;

    public hok(hol holVar, fdis fdisVar) {
        this.a = holVar;
        this.b = fdisVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hol holVar = this.a;
        Object obj2 = holVar.a;
        fdis fdisVar = this.b;
        synchronized (obj2) {
            holVar.b.remove(fdisVar);
        }
        return fctx.a;
    }
}
