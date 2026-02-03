package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kla extends fdbr implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdap c;
    final /* synthetic */ fdap d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kla(fdap fdapVar, ics icsVar, fdap fdapVar2, fdap fdapVar3, int i, int i2) {
        super(2);
        this.a = fdapVar;
        this.b = icsVar;
        this.c = fdapVar2;
        this.d = fdapVar3;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kli.c(this.a, this.b, this.c, this.d, (hml) obj, hpy.a(this.e | 1), this.f);
        return fctx.a;
    }
}
