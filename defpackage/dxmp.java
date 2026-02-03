package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxmp extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxmr b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxmp(dxmr dxmrVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxmrVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxmp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxmr dxmrVar = this.b;
        int i2 = this.c;
        String strA = dxms.a(null, i2);
        ekrw ekrwVarO = dxmr.a.o();
        Context context = dxmrVar.b;
        ekrwVarO.I("Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", context.getApplicationContext().getPackageName(), strA, new Integer(i2));
        ListenableFuture listenableFuture = ((qbb) qbq.a(context).b(strA)).c;
        this.a = 1;
        Object objC = fdxs.c(listenableFuture, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxmp(this.b, this.c, fcxyVar);
    }
}
