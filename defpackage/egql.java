package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egql extends fcyz implements fdat {
    final /* synthetic */ egqq a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egql(fcxy fcxyVar, egqq egqqVar, Uri uri, String str, String[] strArr) {
        super(2, fcxyVar);
        this.a = egqqVar;
        this.b = uri;
        this.c = str;
        this.d = strArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egql) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Integer(this.a.b.a(this.b, this.c, this.d));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egql egqlVar = new egql(fcxyVar, this.a, this.b, this.c, this.d);
        egqlVar.e = obj;
        return egqlVar;
    }
}
