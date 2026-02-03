package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkx extends fdbr implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdap c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkx(fdap fdapVar, ics icsVar, fdap fdapVar2, int i, int i2) {
        super(2);
        this.a = fdapVar;
        this.b = icsVar;
        this.c = fdapVar2;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kli.b(this.a, this.b, this.c, (hml) obj, hpy.a(this.d | 1), this.e);
        return fctx.a;
    }
}
