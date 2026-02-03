package defpackage;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdu implements uok {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/Conversation2MainActivityAdapterFragmentPeer");
    private final vds b;
    private final efwo c;
    private final eygg d;
    private final eygg e;
    private final eygg f;
    private final fcsu g;

    public vdu(vds vdsVar, efwo efwoVar, eygg eyggVar, eygg eyggVar2, eygg eyggVar3, fcsu fcsuVar) {
        efwoVar.getClass();
        eyggVar.getClass();
        eyggVar2.getClass();
        eyggVar3.getClass();
        fcsuVar.getClass();
        this.b = vdsVar;
        this.c = efwoVar;
        this.d = eyggVar;
        this.e = eyggVar2;
        this.f = eyggVar3;
        this.g = fcsuVar;
    }

    @Override // defpackage.uok
    public final ea a() {
        return this.b.I().h("Conversation2Fragment");
    }

    @Override // defpackage.uok
    public final fr b() {
        fr frVarI = this.b.I();
        frVarI.getClass();
        return frVarI;
    }

    @Override // defpackage.uok
    public final ufg c() {
        ea eaVarH = this.b.I().h("start_chat_fragment_tag");
        if (eaVarH == null) {
            return null;
        }
        return new vdt(eaVarH);
    }

    @Override // defpackage.uok
    public final void d(final AssistContent assistContent) {
        lvj lvjVarA = a();
        ehlg ehlgVar = lvjVarA instanceof ehlg ? (ehlg) lvjVarA : null;
        Object objH = ehlgVar != null ? ehlgVar.H() : null;
        vdr vdrVar = objH instanceof vdr ? (vdr) objH : null;
        if (vdrVar != null) {
            Optional optional = (Optional) vdrVar.a().h.b();
            final fdap fdapVar = new fdap() { // from class: aakp
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    vro vroVar = (vro) obj;
                    vroVar.getClass();
                    auvw.k(vroVar.d, null, null, new vrn(vroVar, assistContent, null), 3);
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: aakq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.uok
    public final void e(gg ggVar) {
        eygg eyggVar = this.e;
        uml umlVar = new uml();
        eyhj.e(umlVar);
        ehok.b(umlVar, this.c);
        ggVar.x(R.id.fragment_container, umlVar, "conversation_placeholder");
    }

    @Override // defpackage.uok
    public final void f(gg ggVar, int i) {
        ctie ctieVar = ((ctic) this.d.b()).a().a;
        ((ajoy) ctieVar.a.b()).h(Boolean.valueOf(!((Boolean) ctif.j.e()).booleanValue()));
        Bundle bundle = new Bundle(1);
        bundle.putInt("contact_picker_source", i - 1);
        ctig ctigVarA = ctig.a(this.c);
        ctigVarA.at(bundle);
        ggVar.x(R.id.fragment_container, ctigVarA, "start_chat_fragment_tag");
    }

    @Override // defpackage.uok
    public final ea g(gg ggVar, ConversationId conversationId) {
        String str;
        String str2;
        String str3;
        vdu vduVar = this;
        vds vdsVar = vduVar.b;
        Intent intent = vdsVar.fg().getIntent();
        intent.getClass();
        MessageId messageId = (MessageId) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("mapi_message_id", MessageId.class) : intent.getParcelableExtra("mapi_message_id"));
        String stringExtra = intent.getStringExtra("search_text");
        intent.removeExtra("search_text");
        boolean booleanExtra = intent.getBooleanExtra("render_add_recipient_button", false);
        ComposeRowState composeRowStateB = avnt.b(intent);
        long longExtra = intent.getLongExtra("intent_timestamp", 0L);
        eg egVarFg = vdsVar.fg();
        final vde vdeVar = new vde(conversationId, messageId, stringExtra, composeRowStateB, !afic.a(egVarFg, ((tlt) r2.b()).a), booleanExtra, ((tlt) vduVar.f.b()).a, longExtra);
        ea eaVarA = vduVar.a();
        Bundle bundle = eaVarA != null ? eaVarA.m : null;
        ekrg ekrgVar = vdr.a;
        ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 433, "Conversation2FragmentPeer.kt")).t("Calculating hasMatching arguments with other %s", vdeVar);
        if (bundle == null) {
            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 436, "Conversation2FragmentPeer.kt")).q("hasMatchingArguments false because of null existing");
            str3 = "render_add_recipient_button";
            str2 = "is_bubble_activity";
            str = "intent_timestamp";
        } else {
            str = "intent_timestamp";
            boolean z = bundle.getBoolean("can_navigate_back", false);
            boolean z2 = vdeVar.e;
            if (z != z2) {
                ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 443, "Conversation2FragmentPeer.kt")).H("hasMatchingArguments false because of canNavigateBack: existing containsKey %b, other %b", bundle.containsKey("can_navigate_back"), z2);
            } else {
                boolean z3 = bundle.getBoolean("render_add_recipient_button");
                boolean z4 = vdeVar.f;
                if (z3 != z4) {
                    ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 454, "Conversation2FragmentPeer.kt")).H("hasMatchingArguments false because of renderAddPeople: existing containsKey %b, other %b", bundle.containsKey("render_add_recipient_button"), z4);
                } else {
                    boolean z5 = bundle.getBoolean("is_bubble_activity");
                    boolean z6 = vdeVar.g;
                    if (z5 != z6) {
                        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 465, "Conversation2FragmentPeer.kt")).H("hasMatchingArguments false because of isBubbleActivity: existing containsKey %b, other %b", bundle.containsKey("is_bubble_activity"), z6);
                    } else if (vwp.a(bundle) != vwo.a) {
                        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 476, "Conversation2FragmentPeer.kt")).t("hasMatching arguments false because of composeRowMode: existing %s", vwp.a(bundle));
                    } else {
                        final ComposeRowState composeRowState = (ComposeRowState) ih.a(bundle, "compose_row_state", ComposeRowState.class);
                        ekrw ekrwVarH = avnt.a.h();
                        str2 = "is_bubble_activity";
                        ekrwVarH.X(eksq.a, "BugleComposeRow2");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrdVar.Z(eksk.SMALL);
                        str3 = "render_add_recipient_button";
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "getComposeRowState", 108, "ComposeRowState.kt")).t("Bundle.getComposeRowState %s", composeRowState);
                        ekrd ekrdVar2 = (ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 486, "Conversation2FragmentPeer.kt");
                        ComposeRowState composeRowState2 = vdeVar.d;
                        ekrdVar2.D("hasMatchingArguments comparing existingComposeRowState %s, other.composeRowState %s", composeRowState, composeRowState2);
                        if (fdbq.f(composeRowState, composeRowState2)) {
                            OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) bundle.getParcelable("open_conversation2_arguments");
                            if (openConversation2Arguments != null && openConversation2Arguments.equals(vdeVar.i)) {
                                ekrd ekrdVar3 = (ekrd) a.h();
                                ekrdVar3.X(cqnc.t, conversationId);
                                ekrdVar3.X(cqnc.c, messageId);
                                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/conversation2/Conversation2MainActivityAdapterFragmentPeer", "createConversationFragment", 124, "Conversation2MainActivityAdapterFragmentPeer.kt")).t("Conversation2Fragment has matching arguments so reusing existing fragment instead of recreating: arguments %s", vdeVar);
                                ea eaVarA2 = a();
                                eaVarA2.getClass();
                                return eaVarA2;
                            }
                            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 512, "Conversation2FragmentPeer.kt")).D("hasMatchingArguments false because of openConversation2Arguments: existing %s, other %s", openConversation2Arguments, vdeVar.i);
                        } else {
                            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "hasMatchingArguments", 494, "Conversation2FragmentPeer.kt")).t("hasMatchingArguments false because of composeRowState: draft text equality %b", new ekri() { // from class: vdc
                                @Override // defpackage.ekri
                                public final Object a() {
                                    IncomingDraft incomingDraft;
                                    IncomingDraft incomingDraft2;
                                    ComposeRowState composeRowState3 = composeRowState;
                                    String str4 = null;
                                    String str5 = (composeRowState3 == null || (incomingDraft2 = composeRowState3.a) == null) ? null : incomingDraft2.a;
                                    ComposeRowState composeRowState4 = vdeVar.d;
                                    if (composeRowState4 != null && (incomingDraft = composeRowState4.a) != null) {
                                        str4 = incomingDraft.a;
                                    }
                                    return Boolean.valueOf(fdbq.f(str5, str4));
                                }
                            });
                        }
                        vduVar = this;
                    }
                }
            }
            vduVar = this;
            str3 = "render_add_recipient_button";
            str2 = "is_bubble_activity";
        }
        efwo efwoVar = vduVar.c;
        ekrd ekrdVar4 = (ekrd) ekrgVar.h();
        ConversationId conversationId2 = vdeVar.a;
        ekrdVar4.X(cqnc.t, conversationId2);
        MessageId messageId2 = vdeVar.b;
        ekrdVar4.X(cqnc.c, messageId2);
        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/conversation2/Conversation2FragmentPeer$Factory", "create", 395, "Conversation2FragmentPeer.kt")).D("Creating Conversation2Fragment: accountId %s, arguments %s", efwoVar, vdeVar);
        vcw vcwVar = new vcw();
        eyhj.e(vcwVar);
        ehok.b(vcwVar, efwoVar);
        Bundle bundle2 = vcwVar.m;
        if (bundle2 != null) {
            String str4 = vdeVar.c;
            boolean z7 = vdeVar.e;
            boolean z8 = vdeVar.f;
            boolean z9 = vdeVar.g;
            bundle2.putParcelable("open_conversation2_arguments", new OpenConversation2Arguments(conversationId2, messageId2, str4, Boolean.valueOf(z7), z8, z9, null, 64, null));
            vwp.b(bundle2, vwo.a);
            ComposeRowState composeRowState3 = vdeVar.d;
            if (composeRowState3 != null) {
                ekrw ekrwVarH2 = avnt.a.h();
                ekrwVarH2.X(eksq.a, "BugleComposeRow2");
                ekrd ekrdVar5 = (ekrd) ekrwVarH2;
                ekrdVar5.Z(eksk.SMALL);
                ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "putComposeRowState", 116, "ComposeRowState.kt")).t("Bundle.putComposeRowState %s", composeRowState3);
                bundle2.putParcelable("compose_row_state", composeRowState3);
            }
            bundle2.putBoolean("can_navigate_back", z7);
            bundle2.putBoolean(str3, z8);
            bundle2.putBoolean(str2, z9);
            if (eotp.a("bugle.enable_ignore_stale_draft_extras", "bugle")) {
                bundle2.putLong(str, vdeVar.h);
            }
        }
        ggVar.x(R.id.fragment_container, vcwVar, "Conversation2Fragment");
        return vcwVar;
    }
}
