package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvsr extends fdbo implements fdat {
    public cvsr(Object obj) {
        super(2, obj, cvta.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/unblockunspam/dataservice/UnblockUnspamBanner2LoadedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cvtg cvtgVar = (cvtg) obj;
        int i = cvtgVar.b;
        final cvta cvtaVar = (cvta) this.g;
        if (i == 5) {
            return null;
        }
        final ResolvedRecipient resolvedRecipient = cvtgVar.a;
        int i2 = i - 1;
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? cvtaVar.c(true, resolvedRecipient) : cvtaVar.c(false, resolvedRecipient);
        }
        Context context = cvtaVar.a;
        String string = context.getString(R.string.unblock_banner_title);
        String string2 = context.getString(R.string.unblock_banner_body_v2);
        tdq tdqVar = new tdq(djrr.F);
        String string3 = context.getString(R.string.unblock_banner_positive_button);
        string3.getClass();
        return new tdo("unblock_unspam_banner", string, string2, tdqVar, new tdk(string3, new fdae() { // from class: cvsp
            @Override // defpackage.fdae
            public final Object invoke() {
                cvta cvtaVar2 = cvtaVar;
                auvw.k(cvtaVar2.c, cvtaVar2.b, null, new cvst(cvtaVar2, resolvedRecipient, null), 2);
                return fctx.a;
            }
        }), null, false, null, null, 1568);
    }
}
