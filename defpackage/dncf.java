package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dncf extends fcyz implements fdap {
    int a;
    final /* synthetic */ dncg b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dncf(dncg dncgVar, Uri uri, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dncgVar;
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
        dncg dncgVar = this.b;
        Uri uri = this.c;
        this.a = 1;
        Object objA = dncgVar.a.a(uri, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dncf(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
