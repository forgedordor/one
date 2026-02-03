package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adld extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ adlf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adld(adlf adlfVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = adlfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        adld adldVar = new adld(this.c, (fcxy) obj3);
        adldVar.a = (ajlk) obj;
        adldVar.b = (ekgb) obj2;
        return adldVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        String strM = r1.m();
        if (strM == null) {
            strM = "";
        }
        String str = strM;
        int size = ((ekgb) obj2).size() + 1;
        boolean z = r1.b() != null;
        final adlf adlfVar = this.c;
        fduf fdufVar = adlfVar.f;
        fdufVar.f(Boolean.valueOf(z));
        adlfVar.h = r1.d();
        aoer aoerVarH = r1.h();
        aoerVarH.getClass();
        adlfVar.i = aoerVarH;
        adlfVar.j = r1.b();
        ekrw ekrwVarH = adlf.a.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/joinvialink/screen/JoinViaLinkUiAdapterImpl", "createJoinViaLinkUiData", 81, "JoinViaLinkUiAdapterImpl.kt");
        ConversationId conversationId = adlfVar.h;
        if (conversationId == null) {
            fdbq.c("conversationId");
            conversationId = null;
        }
        ekrdVar.D("JBL URI for conversation %s: %s", conversationId, adlfVar.j);
        Uri uriA = r1.a();
        dkrk dkrkVar = uriA != null ? new dkrk(new dkpf(uriA, false, null, 0, null, 28), null, 0, 0, 0.0f, null, 62) : new dkrk(null, null, 0, 0, 0.0f, null, 63);
        final Uri uri = adlfVar.j;
        Context context = adlfVar.b;
        String string = context.getString(R.string.copy_link);
        string.getClass();
        String string2 = context.getString(R.string.send_link);
        string2.getClass();
        String string3 = context.getString(R.string.qr_code);
        string3.getClass();
        String string4 = context.getString(R.string.share_link);
        string4.getClass();
        return new adlg(str, size, dkrkVar, fcva.g(new dkeg(string, null, null, null, null, new dkdk(djrr.aE), null, new fdae() { // from class: adkw
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 94), new dkeg(string2, null, null, null, null, new dkdk(djrr.dA), null, new fdae() { // from class: adkx
            @Override // defpackage.fdae
            public final Object invoke() {
                adlf adlfVar2 = adlfVar;
                auvw.m(adlfVar2.c, null, new adlc(adlfVar2, uri, null), 3);
                return fctx.a;
            }
        }, 94), new dkeg(string3, null, null, null, null, new dkdk(djrr.dk), null, new fdae() { // from class: adky
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 94), new dkeg(string4, null, null, null, null, new dkdk(djrr.dH), null, new fdae() { // from class: adkz
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 94)), adlfVar.j, fdufVar, adlfVar.g, new adla(adlfVar));
    }
}
