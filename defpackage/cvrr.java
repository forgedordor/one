package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvrr extends fdbb implements fdat {
    public cvrr(Object obj) {
        super(2, obj, cvrt.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/spam/dataservice/SpamBanner2LoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        final cvsa cvsaVar = (cvsa) obj;
        boolean z = cvsaVar.c;
        final cvrt cvrtVar = (cvrt) this.b;
        if (!z) {
            return null;
        }
        final ResolvedRecipient resolvedRecipient = cvsaVar.a;
        resolvedRecipient.getClass();
        Context context = cvrtVar.a;
        String string = context.getString(R.string.spam_banner_title_v2);
        string.getClass();
        String string2 = context.getString(R.string.spam_banner_body_v2);
        string2.getClass();
        tdq tdqVar = new tdq(djrr.bx);
        String string3 = context.getString(R.string.spam_banner_spam_button_v2);
        string3.getClass();
        String string4 = context.getString(R.string.spam_banner_not_spam_button_v2);
        string4.getClass();
        return new tdo("spam_banner", string, string2, tdqVar, new tdk(string3, new fdae() { // from class: cvro
            @Override // defpackage.fdae
            public final Object invoke() {
                int i = true != cvsaVar.b ? 2 : 3;
                cvrt cvrtVar2 = cvrtVar;
                cvrtVar2.c.a(new tlk(resolvedRecipient, cvrtVar2.b, i, 11));
                return fctx.a;
            }
        }), new tdk(string4, new fdae() { // from class: cvrp
            @Override // defpackage.fdae
            public final Object invoke() {
                cvrtVar.c(resolvedRecipient, 3);
                return fctx.a;
            }
        }), false, null, new fdae() { // from class: cvrq
            @Override // defpackage.fdae
            public final Object invoke() {
                cvrtVar.c(resolvedRecipient, 4);
                return fctx.a;
            }
        }, 576);
    }
}
