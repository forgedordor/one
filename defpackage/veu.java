package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class veu extends fdbo implements fdau {
    public veu(Object obj) {
        super(3, obj, vev.class, "addPeople", "addPeople(Ljava/util/List;Lcom/google/android/apps/messaging/shared/api/messaging/ConversationProperties;Lcom/google/android/apps/messaging/shared/api/messaging/ComposeConstraints;)V", 0);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        ajlk ajlkVar = (ajlk) obj2;
        ajlh ajlhVar = (ajlh) obj3;
        list.getClass();
        ajlkVar.getClass();
        ajlhVar.getClass();
        vev vevVar = (vev) this.g;
        ufx.d((ufx) vevVar.f.b(), 16, -1, 3, 0, false, 56);
        ajts ajtsVar = (ajts) ajlkVar;
        upo upoVar = (upo) vevVar.e.b();
        ajlj ajljVarC = ajtsVar.c();
        ajlj ajljVar = ajlj.GROUP;
        boolean z = ajlhVar.e().g;
        boolean zT = ajtsVar.t();
        avoe avoeVarF = ajtsVar.F();
        boolean zH = ((bvur) upoVar.a.b()).h();
        boolean z2 = ajljVarC == ajljVar;
        int i = (zH && z2 && z && zT) ? 14 : (z2 && avoeVarF == avoe.RCS_GROUP_SELF_ONLY) ? 12 : (z2 && z) ? 5 : 7;
        afzc afzcVar = vevVar.c;
        ConversationId conversationId = vevVar.b;
        aoer aoerVarH = ajlkVar.h();
        afzcVar.h(new agaz(conversationId, list, aoerVarH != null ? aoerVarH.h() : null, i));
        return fctx.a;
    }
}
