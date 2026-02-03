package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcj extends fdbr implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ fdau b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcj(ics icsVar, fdau fdauVar, int i) {
        super(2);
        this.a = icsVar;
        this.b = fdauVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.c | 1);
        dcr.b(this.a, this.b, (hml) obj, iA);
        return fctx.a;
    }
}
