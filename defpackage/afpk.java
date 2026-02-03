package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afpk implements fdap {
    final /* synthetic */ vvw a;
    final /* synthetic */ afpm b;
    final /* synthetic */ ConversationId c;

    public afpk(vvw vvwVar, afpm afpmVar, ConversationId conversationId) {
        this.a = vvwVar;
        this.b = afpmVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        wrv wrvVarA;
        bpbl bpblVar = (bpbl) obj;
        bpblVar.getClass();
        vvw vvwVar = this.a;
        bpblVar.h(vvwVar.a);
        wrx wrxVar = (wrx) wry.a.createBuilder();
        wrxVar.getClass();
        DesugarCollections.unmodifiableList(((wry) wrxVar.instance).c).getClass();
        ArrayList<vvr> arrayList = new ArrayList();
        Iterator it = vvwVar.b.iterator();
        afpm afpmVar = this.b;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            vvs vvsVar = (vvs) it.next();
            vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
            if (vvrVar != null) {
                arrayList.add(vvrVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (vvr vvrVar2 : arrayList) {
            try {
                wru wruVar = (wru) wrv.a.createBuilder();
                wruVar.getClass();
                wrw.c(afpmVar.b.a(vvrVar2.a), wruVar);
                Uri uri = vvrVar2.b.c;
                if (uri != null) {
                    wrw.b(uri.toString(), wruVar);
                }
                wrvVarA = wrw.a(wruVar);
            } catch (dlwa e) {
                ConversationId conversationId = this.c;
                ekrw ekrwVarI = afpm.a.i();
                ekrwVarI.X(eksq.a, "BugleMultiShare");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(e);
                ekrdVar.X(cqnc.t, conversationId);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/draft/DraftPersistenceImpl", "trySerialize", 140, "DraftPersistenceImpl.kt")).t("Failed to serialize %s", vvrVar2);
                wrvVarA = null;
            }
            if (wrvVarA != null) {
                arrayList2.add(wrvVarA);
            }
        }
        wrz.b(arrayList2, wrxVar);
        bpblVar.b(wrz.a(wrxVar));
        vvw vvwVar2 = this.a;
        bpblVar.g(vvwVar2.c);
        bpblVar.e(vvwVar2.d);
        MessageId messageId = vvwVar2.e;
        bpblVar.f(messageId != null ? messageId.a() : null);
        bpblVar.d(vvwVar2.h);
        return fctx.a;
    }
}
