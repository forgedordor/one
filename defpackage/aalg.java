package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aalg implements fdpm {
    final /* synthetic */ aall a;

    public aalg(aall aallVar) {
        this.a = aallVar;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        int iA;
        int i;
        fcto fctoVar = (fcto) obj;
        ajlk ajlkVar = (ajlk) fctoVar.a;
        ekgb ekgbVar = (ekgb) fctoVar.b;
        ajlh ajlhVar = (ajlh) fctoVar.c;
        ((ekrd) aall.a.h().h("com/google/android/apps/messaging/conversation2/viewmodel/LegacyConversationOpenedMetricMonitorImpl$monitorOpenedWithUnreadMessage$1$3", "emit", 80, "LegacyConversationOpenedMetricMonitorImpl.kt")).q("Logging conversation opened with unread message metric.");
        ajna ajnaVarE = ajlhVar.e();
        boolean z = ajnaVarE.g;
        ajlkVar.getClass();
        ajts ajtsVar = (ajts) ajlkVar;
        aall aallVar = this.a;
        Conversation conversation = aallVar.c;
        boolean z2 = conversation.d() instanceof PenpalBotConversationId;
        ajhd ajhdVar = (ajhd) aallVar.e.b();
        ConversationIdType conversationIdTypeA = ajwb.a(conversation.d());
        elka elkaVar = elka.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        int size = ekgbVar.size();
        Boolean boolValueOf = Boolean.valueOf(ajtsVar.I() == elwp.SEND_MODE_XMS_LATCH);
        int iA2 = ajtsVar.A();
        ekgbVar.getClass();
        aixq aixqVar = (aixq) aallVar.f.b();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolvedRecipient) it.next()).g());
        }
        ekgb ekgbVarA = aixqVar.a(ekfv.a(arrayList));
        boolean zO = ajtsVar.O();
        ajlj ajljVarC = ajtsVar.c();
        if (ajljVarC != null) {
            int iOrdinal = ajljVarC.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    iA = csyi.a(csxq.a(ekgbVar));
                }
                i = 7;
            } else {
                iA = csyi.a(((aobo) ((ResolvedRecipient) fcva.X(ekgbVar)).m()).d);
            }
            i = iA;
        } else {
            i = 7;
        }
        ajhdVar.as(conversationIdTypeA, elkaVar, size, true, boolValueOf, z, z2, iA2, ekgbVarA, zO, i, ajnaVarE.h, bvdk.h(ajtsVar.i()));
        if (((Boolean) ((cczi) ajkb.c.get()).e()).booleanValue()) {
            ((ajjx) aallVar.g.b()).c(true);
        }
        return fctx.a;
    }
}
