package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnsb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnsd b;
    final /* synthetic */ cnsa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnsb(cnsd cnsdVar, cnsa cnsaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnsdVar;
        this.c = cnsaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnsb) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnsd cnsdVar = this.b;
            cnsa cnsaVar = this.c;
            Set setB = fcwm.b(Uri.parse(cnsaVar.d));
            evqs evqsVar = cnsaVar.c;
            evqsVar.getClass();
            cobn cobnVar = new cobn(setB, 1, cobs.c(evqsVar), UUID.randomUUID());
            this.a = 1;
            obj = cnsdVar.b.b(cobnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekrw ekrwVarH = cnsd.a.h();
        ekrwVarH.X(eksq.a, "BugleTelephony");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/telephony/forwardsync/SpotSyncWorkHandler$processPendingWorkItemAsync$1$1", "invokeSuspend", 78, "SpotSyncWorkHandler.kt")).t("SpotSyncWorkHandler: Spot sync completed. batchStats: %s", (cnxt) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnsb(this.b, this.c, fcxyVar);
    }
}
