package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djns implements fdat {
    final /* synthetic */ djmv a;

    public djns(djmv djmvVar) {
        this.a = djmvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djmd.i(this.a.d, null, hmlVar, 0);
        }
        return fctx.a;
    }
}
