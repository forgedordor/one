package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolg extends fcyz implements fdap {
    int a;
    final /* synthetic */ dolm b;
    final /* synthetic */ dlvd c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dolg(dolm dolmVar, dlvd dlvdVar, Uri uri, boolean z, fcxy fcxyVar) {
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
        Duration durationB = dlvdVar.b();
        if (durationB == null) {
            durationB = dolm.a;
        }
        dome domeVar = new dome(dlvdVar.c(), durationB);
        int iCompareTo = domeVar.b.compareTo(Duration.ZERO);
        Object objB = domeVar;
        objB = domeVar;
        if (iCompareTo <= 0 && z) {
            objB = null;
        }
        if (objB == null) {
            objB = dolmVar.c.b(uri, this);
        }
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dolg(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
