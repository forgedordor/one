package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqp implements koi {
    final /* synthetic */ bqs a;

    public bqp(bqs bqsVar) {
        this.a = bqsVar;
    }

    @Override // defpackage.koi
    public final Object a(kog kogVar) {
        bqs bqsVar = this.a;
        lcg.d(bqsVar.c == null, "The result can only set once!");
        bqsVar.c = kogVar;
        return a.h(this, "ListFuture[", "]");
    }
}
