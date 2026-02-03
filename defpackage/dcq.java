package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcq extends fdbr implements fdat {
    final /* synthetic */ fdav a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcq(fdav fdavVar, int i) {
        super(2);
        this.a = fdavVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.b | 1);
        dcr.a(this.a, (hml) obj, iA);
        return fctx.a;
    }
}
