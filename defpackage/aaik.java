package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aaik extends fdbb implements fdat {
    public aaik(Object obj) {
        super(2, obj, aaim.class, "loadContent", "loadContent(Z)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final aaim aaimVar = (aaim) this.b;
        if (!zBooleanValue) {
            return null;
        }
        Context context = aaimVar.a;
        String string = context.getString(R.string.send_feedback_banner_body);
        tdq tdqVar = new tdq(djrr.bT);
        String string2 = context.getString(R.string.send_feedback_banner_button);
        string2.getClass();
        return new tdo("early_feedback", null, string, tdqVar, new tdk(string2, new fdae() { // from class: aaii
            @Override // defpackage.fdae
            public final Object invoke() {
                aaim aaimVar2 = aaimVar;
                aaimVar2.c();
                aaimVar2.c.h(agfq.a);
                return fctx.a;
            }
        }), null, false, new fdae() { // from class: aaij
            @Override // defpackage.fdae
            public final Object invoke() {
                aaimVar.c();
                return fctx.a;
            }
        }, null, 1504);
    }
}
