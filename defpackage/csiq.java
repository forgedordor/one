package defpackage;

import android.util.LruCache;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csiq {
    public static final /* synthetic */ int a = 0;

    static {
        eksp.c("BugleSpam");
        fctd.a(new fdae() { // from class: csip
            @Override // defpackage.fdae
            public final Object invoke() {
                int i = csiq.a;
                return new LruCache(BasePaymentResult.ERROR_REQUEST_FAILED);
            }
        });
        cdag.e(cdag.b, "moirai_max_number_of_messages_to_send", 10);
        cdag.h(cdag.b, "moirai_enable_uma_logs", false);
        fcwa.g(new fcti(csir.b, sfp.USER_FEEDBACK_CONFIRMED_SPAM), new fcti(csir.e, sfp.USER_FEEDBACK_BLOCKED_SPAM), new fcti(csir.c, sfp.USER_FEEDBACK_DELETED_SPAM), new fcti(csir.d, sfp.USER_FEEDBACK_LEFT_SPAM));
    }

    public csiq(fcsu fcsuVar, fcsu fcsuVar2, cpkp cpkpVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cpkpVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fdjxVar.getClass();
    }
}
