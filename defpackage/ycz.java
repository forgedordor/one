package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ycz extends fdbo implements fdap {
    public ycz(Object obj) {
        super(1, obj, yek.class, "onMessageListInteractive", "onMessageListInteractive(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        yek yekVar = (yek) this.g;
        ((ekrd) yek.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onMessageListInteractive", 587, "PagedMessageListUiAdapterImpl.kt")).q("message list interactive");
        yekVar.f.e(context);
        yekVar.k.k();
        yekVar.q.a(yekVar.H);
        Iterator it = yekVar.v.a.iterator();
        while (it.hasNext()) {
            ((ycg) it.next()).a();
        }
        yekVar.j.a.f(true);
        yekVar.T.a(aadl.a);
        return fctx.a;
    }
}
