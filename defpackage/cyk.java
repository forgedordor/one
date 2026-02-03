package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyk extends fdbr implements fdap {
    final /* synthetic */ cyl a;
    final /* synthetic */ ihu b;
    final /* synthetic */ ihu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyk(cyl cylVar, ihu ihuVar, ihu ihuVar2) {
        super(1);
        this.a = cylVar;
        this.b = ihuVar;
        this.c = ihuVar2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Boolean) obj).booleanValue() == ((Boolean) this.a.b.f()).booleanValue() ? this.b : this.c;
    }
}
