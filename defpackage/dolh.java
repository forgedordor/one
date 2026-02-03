package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolh extends fcyz implements fdap {
    int a;
    final /* synthetic */ dolm b;
    final /* synthetic */ dlvd c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dolh(dolm dolmVar, dlvd dlvdVar, Uri uri, boolean z, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dolmVar;
        this.c = dlvdVar;
        this.d = uri;
        this.e = z;
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
        dlvd dlvdVar = this.c;
        Uri uri = this.d;
        boolean z = this.e;
        this.a = 1;
        Size sizeA = dlvdVar.a();
        if (sizeA == null) {
            sizeA = dolm.b;
        }
        domf domfVar = new domf(dlvdVar.c(), sizeA);
        boolean zB = dngm.b(domfVar.b);
        Object objC = domfVar;
        objC = domfVar;
        if (!zB && z) {
            objC = null;
        }
        if (objC == null) {
            objC = dolmVar.c.c(uri, this);
        }
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dolh(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
