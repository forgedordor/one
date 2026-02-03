package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolk extends fcyz implements fdap {
    int a;
    final /* synthetic */ dolm b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dolk(dolm dolmVar, Uri uri, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dolmVar;
        this.c = uri;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dolm dolmVar = this.b;
        Uri uri = this.c;
        this.a = 1;
        Object objC = dolmVar.c.c(uri, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dolk(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
