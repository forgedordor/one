package defpackage;

import android.R;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvuz implements ctiv {
    public final ConversationDetailsActivity a;
    public final fcsu b;
    private final fcsu c;

    public cvuz(ConversationDetailsActivity conversationDetailsActivity, fcsu fcsuVar, fcsu fcsuVar2, final efxf efxfVar, final egkc egkcVar) {
        efxfVar.getClass();
        egkcVar.getClass();
        this.a = conversationDetailsActivity;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        Optional optional = (Optional) fcsuVar.b();
        final fdap fdapVar = new fdap() { // from class: cvuw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((cvut) obj).getClass();
                cvuz cvuzVar = this;
                egap egapVarF = egaq.f(cvuzVar.a);
                egapVarF.d(egkc.class);
                egapVarF.d(eghx.class);
                egaq egaqVarA = egapVarF.a();
                efxf efxfVar2 = efxfVar;
                efxfVar2.g(egaqVarA);
                efxfVar2.e(new cvuy(cvuzVar));
                efxfVar2.e(new egkb(egkcVar));
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: cvux
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ctiv
    public final void a(ConversationId conversationId, String str, ekgb ekgbVar, efwo efwoVar) {
        Bundle bundle = new Bundle(5);
        bundle.putParcelable("conversation_mapi_id", conversationId);
        bundle.putString("group_name", str);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ekqh it = ekgbVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            Recipient recipient = (Recipient) it.next();
            alqm alqmVarG = recipient.g();
            alqmVarG.getClass();
            String strA = aqbw.a() ? cssf.a(recipient.x(true)) : recipient.x(true);
            strA.getClass();
            arrayList.add(new ChipData(alqmVarG, strA, recipient.f().k, recipient.b(), true));
        }
        bundle.putParcelableArrayList("identities", arrayList);
        bundle.putInt("contact_picker_source", 2);
        bundle.putInt("selection_mode", cueh.b.ordinal());
        ctig ctigVarA = ctig.a(efwoVar);
        ctigVarA.at(bundle);
        fr frVarA = this.a.a();
        ea eaVarH = frVarA.h("ConversationDetailsFragment");
        if (eaVarH == null) {
            return;
        }
        cg cgVar = new cg(frVarA);
        cgVar.o(eaVarH);
        cgVar.v("ConversationDetailsFragment");
        cgVar.j();
        frVarA.al();
        cg cgVar2 = new cg(frVarA);
        cgVar2.x(R.id.content, ctigVarA, "GroupRenameFragment");
        cgVar2.c();
    }

    public final void b() {
        this.a.finishAfterTransition();
    }

    public final void c() {
        fr frVarA = this.a.a();
        ea eaVarH = frVarA.h("GroupRenameFragment");
        if (eaVarH == null) {
            b();
            return;
        }
        cg cgVar = new cg(frVarA);
        cgVar.o(eaVarH);
        cgVar.c();
        ea eaVarH2 = frVarA.h("ConversationDetailsFragment");
        if (eaVarH2 == null) {
            return;
        }
        frVarA.aq(eaVarH2.H);
    }
}
