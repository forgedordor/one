package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvi extends fcyz implements fdat {
    final /* synthetic */ String[] a;
    final /* synthetic */ String[] b;
    final /* synthetic */ int c;
    final /* synthetic */ Uri d;
    final /* synthetic */ String e;
    final /* synthetic */ dlvl f;
    final /* synthetic */ dlvp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlvi(String[] strArr, String[] strArr2, int i, Uri uri, String str, dlvl dlvlVar, dlvp dlvpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = strArr;
        this.b = strArr2;
        this.c = i;
        this.d = uri;
        this.e = str;
        this.f = dlvlVar;
        this.g = dlvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlvi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = dlvl.c;
        String str = fcur.S(this.b, ", ", null, null, 62).concat(" DESC") + " LIMIT 20 OFFSET " + this.c;
        Uri uri = this.d;
        String strA = dngu.a(uri);
        StringBuilder sb = new StringBuilder("ofList for ");
        sb.append(strA);
        sb.append(" with ");
        String str2 = this.e;
        sb.append(str2);
        sb.append(", null, ");
        sb.append(str);
        return dlvl.b(this.g, sb.toString(), false, new dlvh(this.f, uri, str2, str));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlvi(this.a, this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
