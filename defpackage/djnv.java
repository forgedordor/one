package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnv implements fdat {
    final /* synthetic */ djmv a;

    public djnv(djmv djmvVar) {
        this.a = djmvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djmv djmvVar = this.a;
            djmd.h(djmvVar.b, djmvVar.c, null, hmlVar, 0, 12);
        }
        return fctx.a;
    }
}
