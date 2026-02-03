package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcv implements adcu {
    private final eigp a;
    private final adcq b;

    public adcv(Context context, eigp eigpVar, addh addhVar) {
        this.a = eigpVar;
        this.b = new adcq(context, addhVar, R.attr.colorPrimary, R.attr.colorOnPrimary);
    }

    @Override // defpackage.adcu
    public final adcz a() {
        return this.b;
    }

    @Override // defpackage.adcu
    public final void b(wv wvVar, SelectedConversation selectedConversation) {
        eieh eiehVarC = this.a.c("SwipeArchiveHandler", "com/google/android/apps/messaging/home/swipeactions/handlers/SwipeArchiveHandler", "onSwiped", 36);
        try {
            einf.g(new cwvb(ekgb.r(selectedConversation.a), elka.CONVERSATION_FROM_LIST_SWIPE), wvVar.a);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
