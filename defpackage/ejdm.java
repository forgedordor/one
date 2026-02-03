package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejdm implements fdat {
    final /* synthetic */ ejfj a;

    public ejdm(ejfj ejfjVar) {
        this.a = ejfjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ejfd.b(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
