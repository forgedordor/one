package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cws extends fdbr implements fdap {
    final /* synthetic */ iac a;
    final /* synthetic */ Object b;
    final /* synthetic */ cxg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cws(iac iacVar, Object obj, cxg cxgVar) {
        super(1);
        this.a = iacVar;
        this.b = obj;
        this.c = cxgVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cwr(this.a, this.b, this.c);
    }
}
