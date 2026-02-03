package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqyb implements fdap {
    final /* synthetic */ cqyh a;
    final /* synthetic */ long b;
    final /* synthetic */ cqyk c;

    public cqyb(cqyh cqyhVar, long j, cqyk cqykVar) {
        this.a = cqyhVar;
        this.b = j;
        this.c = cqykVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cqya cqyaVar = new cqya(this.c);
        cqyh cqyhVar = this.a;
        cqyhVar.b.post(cqyaVar);
        cqxn cqxnVar = cqyhVar.d;
        cqxnVar.p(3);
        cqxnVar.r(14);
        cqxnVar.k(cqyhVar.b(this.b));
        cqxnVar.b();
        return fctx.a;
    }
}
