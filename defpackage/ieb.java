package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ieb extends fdbr implements fdat {
    final /* synthetic */ jog a;
    final /* synthetic */ ied b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieb(jog jogVar, ied iedVar) {
        super(2);
        this.a = jogVar;
        this.b = iedVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        jsl jslVar = (jsl) obj2;
        if (!this.a.b.a(jslVar.e)) {
            ied iedVar = this.b;
            iedVar.m(iIntValue, jslVar);
            iedVar.j();
        }
        return fctx.a;
    }
}
