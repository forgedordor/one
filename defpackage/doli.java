package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doli extends fcyz implements fdap {
    int a;
    final /* synthetic */ dolm b;
    final /* synthetic */ dlvd c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doli(dolm dolmVar, dlvd dlvdVar, Uri uri, boolean z, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dolmVar;
        this.c = dlvdVar;
        this.d = uri;
        this.e = z;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objD;
        Object obj2 = fcyl.a;
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
        Duration durationB = dlvdVar.b();
        if (sizeA == null || durationB == null) {
            objD = dolmVar.c.d(uri, this);
        } else {
            domg domgVar = new domg(dlvdVar.c(), sizeA, durationB);
            objD = domgVar;
            if (z) {
                objD = dolmVar.c.a(domgVar, uri, this);
            }
        }
        return objD == obj2 ? obj2 : objD;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new doli(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
