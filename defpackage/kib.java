package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kib implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public kib(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Exception {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            khy.a(this.a, this.b, hmlVar, new Object[0]);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
