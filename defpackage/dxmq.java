package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxmq extends fcyz implements fdat {
    int a;
    Object b;
    int c;
    final /* synthetic */ dxml d;
    final /* synthetic */ dxmr e;
    final /* synthetic */ dxhe f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxmq(dxml dxmlVar, dxmr dxmrVar, dxhe dxheVar, Bundle bundle, Long l, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dxmlVar;
        this.e = dxmrVar;
        this.f = dxheVar;
        this.g = bundle;
        this.h = l;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxmq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String strA;
        byte[] bArrMarshall;
        qba qbaVarG;
        int i;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            i = this.a;
            strA = this.b;
            try {
                fctl.b(obj);
                strA = strA;
            } catch (Exception e) {
                e = e;
                ((eksl) dxmr.a.j()).I("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), strA, new Integer(i));
                return new dxfp(e);
            }
        } else {
            fctl.b(obj);
            dxml dxmlVar = this.d;
            dxhe dxheVar = this.f;
            int iA = dxmlVar.a();
            strA = dxms.a(dxheVar, iA);
            pzn pznVar = new pzn();
            pznVar.e("com.google.android.libraries.notifications.platform.JOB_KEY", dxmlVar.e());
            pznVar.e("com.google.android.libraries.notifications.platform.JOB_ID", strA);
            Bundle bundle = this.g;
            bundle.getClass();
            if (bundle.isEmpty()) {
                bArrMarshall = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                bundle.writeToParcel(parcelObtain, 0);
                bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
            }
            if (bArrMarshall != null) {
                pznVar.d("com.google.android.libraries.notifications.platform.WORKER_PARAMS", bArrMarshall);
            }
            pzh pzhVar = new pzh();
            pzhVar.c(dxmlVar.h() + (-1) != 1 ? 2 : 1);
            pzj pzjVarA = pzhVar.a();
            try {
                pzs pzsVarA = pznVar.a();
                dxmr dxmrVar = this.e;
                Context context = dxmrVar.b;
                dxmrVar.d.c(context.getPackageName(), true);
                dxml dxmlVar2 = this.d;
                if (dxmlVar2.f()) {
                    Long l = this.h;
                    qbg qbgVar = new qbg(dxmrVar.c, dxmlVar2.b(), TimeUnit.MILLISECONDS);
                    qbgVar.j(pzsVarA);
                    qbgVar.g(pzjVarA);
                    dxmo.a(qbgVar, dxmlVar2, l);
                    qbaVarG = qbq.a(context).f(strA, pzy.c, (qbh) qbgVar.b());
                } else {
                    Long l2 = this.h;
                    qau qauVar = new qau(dxmrVar.c);
                    qauVar.j(pzsVarA);
                    qauVar.g(pzjVarA);
                    dxmo.a(qauVar, dxmlVar2, l2);
                    qbaVarG = qbq.a(context).g(strA, pzz.a, (qav) qauVar.b());
                }
                try {
                    ListenableFuture listenableFuture = ((qbb) qbaVarG).c;
                    this.b = strA;
                    this.a = iA;
                    this.c = 1;
                    if (fdxs.c(listenableFuture, this) == fcylVar) {
                        return fcylVar;
                    }
                    i = iA;
                    strA = strA;
                } catch (Exception e2) {
                    e = e2;
                    i = iA;
                    ((eksl) dxmr.a.j()).I("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), strA, new Integer(i));
                    return new dxfp(e);
                }
            } catch (Exception e3) {
                dxmr dxmrVar2 = this.e;
                dxmrVar2.d.c(dxmrVar2.b.getPackageName(), false);
                return new dxfp(e3);
            }
        }
        dxmr.a.o().I("Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), strA, new Integer(i));
        return new dxfx(fctx.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxmq(this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
