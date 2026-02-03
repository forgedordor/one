package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzam extends fcyz implements fdat {
    final /* synthetic */ bzap a;
    final /* synthetic */ Queue b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ fdap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzam(bzap bzapVar, Queue queue, int i, int i2, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bzapVar;
        this.b = queue;
        this.c = i;
        this.d = i2;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzam) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        bzap bzapVar;
        ekhx ekhxVarI;
        fctl.b(obj);
        try {
            bzapVar = this.a;
            ekhxVarI = bzap.i(this.b);
        } catch (Exception e) {
            ekrw ekrwVarJ = bzap.a.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper$updateZeroKeyItemsInCms$1", "invokeSuspend", 204, "CmsZeroKeyRecoveryHelper.kt")).r("Failed to handle updates of %s.", this.d);
        }
        if (ekhxVarI == null) {
            return fctx.a;
        }
        bzapVar.h(this.c, ekhxVarI.size());
        ekqg ekqgVarListIterator = ekhxVarI.listIterator();
        ekqgVarListIterator.getClass();
        while (ekqgVarListIterator.hasNext()) {
            String str = (String) ekqgVarListIterator.next();
            try {
                bykf bykfVar = bzapVar.d;
                fdap fdapVar = this.e;
                int i = this.d;
                byiv byivVar = byiv.a;
                byiu byiuVar = (byiu) byiv.a.createBuilder();
                byiuVar.getClass();
                str.getClass();
                byin.e((String) fdapVar.invoke(str), byiuVar);
                byin.f(i, byiuVar);
                byin.b(bzapVar.c.a(), byiuVar);
                byin.c(bzap.b, byiuVar);
                byin.d(false, byiuVar);
                bykfVar.c(byin.a(byiuVar));
            } catch (Exception e2) {
                ekrw ekrwVarJ2 = bzap.a.j();
                ekrwVarJ2.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarJ2).g(e2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper$updateZeroKeyItemsInCms$1", "invokeSuspend", BasePaymentResult.ERROR_REQUEST_FAILED, "CmsZeroKeyRecoveryHelper.kt")).B("Failed to enqueue update of %s (type %s).", str, this.d);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzam(this.a, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
