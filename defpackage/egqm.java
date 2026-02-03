package defpackage;

import android.content.ContentValues;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqm extends fcyz implements fdat {
    final /* synthetic */ egqq a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ContentValues c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egqm(fcxy fcxyVar, egqq egqqVar, Uri uri, ContentValues contentValues) {
        super(2, fcxyVar);
        this.a = egqqVar;
        this.b = uri;
        this.c = contentValues;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egqm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.b.d(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egqm egqmVar = new egqm(fcxyVar, this.a, this.b, this.c);
        egqmVar.d = obj;
        return egqmVar;
    }
}
