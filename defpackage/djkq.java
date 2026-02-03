package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djkq implements fdat {
    final /* synthetic */ djmj a;

    public djkq(djmj djmjVar) {
        this.a = djmjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djmj djmjVar = this.a;
            djmd.h(djmjVar.a, djmjVar.b, null, hmlVar, 0, 12);
        }
        return fctx.a;
    }
}
