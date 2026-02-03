package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvqn extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ResolvedRecipient c;
    final /* synthetic */ cvqp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvqn(ResolvedRecipient resolvedRecipient, cvqp cvqpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = resolvedRecipient;
        this.d = cvqpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvqn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ResolvedRecipient resolvedRecipient;
        fcyl fcylVar = fcyl.a;
        if (this.b == 0) {
            fctl.b(obj);
            ResolvedRecipient resolvedRecipient2 = this.c;
            if (resolvedRecipient2 != null) {
                eiju eijuVarI = this.d.g.b.I(resolvedRecipient2.F(), alwm.MODIFIED_AND_INFORMED);
                this.a = resolvedRecipient2;
                this.b = 1;
                Object objC = fdxs.c(eijuVarI, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                resolvedRecipient = resolvedRecipient2;
                obj = objC;
            }
            return fctx.a;
        }
        Object obj2 = this.a;
        fctl.b(obj);
        resolvedRecipient = obj2;
        if (((Boolean) obj).booleanValue()) {
            ekrw ekrwVarH = cvqp.a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/conversation/banners2o/normalization/countrycode/AddCountryCodeBanner2$onBannerHidden$1", "invokeSuspend", 117, "AddCountryCodeBanner2.kt")).t("The country code banner was shown and the user was informed.", resolvedRecipient.F());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvqn(this.c, this.d, fcxyVar);
    }
}
