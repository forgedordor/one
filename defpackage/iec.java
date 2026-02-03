package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iec extends fdbr implements fdat {
    final /* synthetic */ ied a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iec(ied iedVar) {
        super(2);
        this.a = iedVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        this.a.m(((Number) obj).intValue(), (jsl) obj2);
        return fctx.a;
    }
}
