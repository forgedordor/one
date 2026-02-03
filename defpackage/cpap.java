package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpap extends cqdj {
    public final String a;
    public ContactIconView b;
    private final ajhd c;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final Optional n;
    private final elrk o;

    public cpap(ajhd ajhdVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional, String str, ContactIconView contactIconView, elrk elrkVar) {
        super("Bugle.Async.ContactIconView.onClick.Duration", null);
        this.c = ajhdVar;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.n = optional;
        this.a = str;
        this.b = contactIconView;
        this.o = elrkVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        Optional optionalOf;
        fcsu fcsuVar = this.m;
        bbca bbcaVar = (bbca) fcsuVar.b();
        String str = this.a;
        if (bbcaVar.c(str) == null) {
            optionalOf = Optional.empty();
        } else {
            elrk elrkVar = this.o;
            elrk elrkVar2 = elrk.UNKNOWN_BIZINFO_EVENT_SOURCE;
            if (elrkVar2 == elrkVar || (elrkVar2 != null && elrkVar != null && elrkVar2.equals(elrkVar))) {
                cqaz.o(a.H(elrkVar, elrkVar2, "Expected anything but ", " but got "));
            }
            this.c.am(2, elrkVar, str);
            ConversationIdType conversationIdTypeA = ((baqx) this.l.b()).a(str);
            optionalOf = Optional.of(new cpak(conversationIdTypeA, conversationIdTypeA.b() ? 0 : ((bakt) this.k.b()).a(conversationIdTypeA), true));
        }
        if (optionalOf.isPresent()) {
            return optionalOf;
        }
        ParticipantsTable.BindData bindDataD = ((bbca) fcsuVar.b()).d(str);
        Optional optionalEmpty = (bindDataD == null || !bindDataD.D().a()) ? Optional.empty() : Optional.of(new cpak(((baqx) this.l.b()).a(str), 0, false));
        return optionalEmpty.isPresent() ? optionalEmpty : Optional.empty();
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        final Optional optional = (Optional) obj;
        final ContactIconView contactIconView = this.b;
        if (contactIconView == null) {
            return;
        }
        if (optional.isEmpty()) {
            if (contactIconView.isAttachedToWindow()) {
                contactIconView.h();
                return;
            }
            return;
        }
        final ConversationIdType conversationIdTypeB = ((cpan) optional.get()).b();
        if (conversationIdTypeB.b()) {
            ekrw ekrwVarJ = ContactIconView.h.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/ui/ContactIconView$OpenConversationSettingsTask", "doPostExecute", 409, "ContactIconView.java")).q("Can't launch Info & Options page. RBM bot conversation ID is empty");
        } else if (contactIconView.isAttachedToWindow()) {
            this.n.ifPresent(new Consumer() { // from class: cpao
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) throws IOException {
                    Optional optional2 = optional;
                    uqm uqmVar = (uqm) obj2;
                    boolean zC = ((cpan) optional2.get()).c();
                    ContactIconView contactIconView2 = contactIconView;
                    ConversationIdType conversationIdType = conversationIdTypeB;
                    if (!zC) {
                        Context context = contactIconView2.getContext();
                        Intent intentA = uqmVar.a(context, false, ((cpan) optional2.get()).a(), false, false, 0, 0);
                        intentA.putExtra("conversation_id", conversationIdType.a());
                        intentA.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
                        eiid.o(context, intentA);
                        return;
                    }
                    cpap cpapVar = this.a;
                    Context context2 = contactIconView2.getContext();
                    Intent intent = new Intent(context2, (Class<?>) InfoAndOptionsActivity.class);
                    intent.putExtra("conversation_id", conversationIdType.a());
                    intent.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
                    intent.putExtra("is_rcs_conversation", true);
                    intent.putExtra("is_group_conversation", false);
                    intent.putExtra("rbm_bot_id", cpapVar.a);
                    context2.startActivity(intent);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
