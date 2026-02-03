package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addb implements adcu {
    private final eigp a;
    private final adcz b;

    public addb(Context context, eigp eigpVar, final addh addhVar, final addh addhVar2) {
        this.a = eigpVar;
        this.b = new adcx(context, addhVar, addhVar2, new Function() { // from class: adda
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SelectedConversation) obj).r ? addhVar : addhVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.adcu
    public final adcz a() {
        return this.b;
    }

    @Override // defpackage.adcu
    public final void b(wv wvVar, SelectedConversation selectedConversation) {
        eieh eiehVarC = this.a.c("SwipeMarkAsUnreadHandler", "com/google/android/apps/messaging/home/swipeactions/handlers/SwipeMarkAsReadOrUnreadHandler", "onSwiped", 46);
        try {
            einf.g(new cwvd(selectedConversation.a, !selectedConversation.r), wvVar.a);
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
