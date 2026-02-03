package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnt implements fdat {
    final /* synthetic */ djmv a;

    public djnt(djmv djmvVar) {
        this.a = djmvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djnw.b(this.a.g, hmlVar, 0);
        }
        return fctx.a;
    }
}
