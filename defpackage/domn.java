package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domn extends fcyz implements fdap {
    int a;
    final /* synthetic */ domr b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domn(domr domrVar, Uri uri, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = domrVar;
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
        domr domrVar = this.b;
        Uri uri = this.c;
        this.a = 1;
        Object objA = domrVar.b.a(uri, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new domn(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
