package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvqv extends fdbb implements fdat {
    public cvqv(Object obj) {
        super(2, obj, cvqw.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/normalization/roamingshortcode/dataservice/RoamingShortCodeLoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z = ((cvrc) obj).a;
        cvqw cvqwVar = (cvqw) this.b;
        if (!z) {
            return null;
        }
        Context context = cvqwVar.a;
        fcsu fcsuVar = cvqwVar.b;
        fcsu fcsuVar2 = cvqwVar.c;
        cczi ccziVar = cvqy.a;
        return new tdo("roaming_short_code", null, dajs.c(context, fcsuVar, fcsuVar2, R.string.conversation_roaming_short_code_paragraph, cvqy.a, cvqy.b).toString(), new tdq(djrr.bT), null, null, false, null, null, 2034);
    }
}
