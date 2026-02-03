package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djvv implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ djwc b;

    public djvv(String str, djwc djwcVar) {
        this.a = str;
        this.b = djwcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djvz.b(this.a, this.b.c, hmlVar, 0);
        }
        return fctx.a;
    }
}
