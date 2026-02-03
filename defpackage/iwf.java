package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwf extends fdbr implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ fdat b;
    final /* synthetic */ ixm c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwf(ics icsVar, fdat fdatVar, ixm ixmVar, int i) {
        super(2);
        this.a = icsVar;
        this.b = fdatVar;
        this.c = ixmVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.d | 1);
        iwh.b(this.a, this.b, this.c, (hml) obj, iA);
        return fctx.a;
    }
}
