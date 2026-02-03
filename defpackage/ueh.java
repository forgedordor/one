package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationShimActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueh implements avmp {
    private final fcsu a;
    private final fcsu b;

    public ueh(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    private static int G(Intent intent, ConversationId conversationId) {
        if (intent.getData() == null) {
            return conversationId.hashCode();
        }
        return 0;
    }

    private static void H(Intent intent, MessageIdType messageIdType, boolean z) {
        if (messageIdType.c()) {
            return;
        }
        intent.putExtra("message_id", messageIdType.b());
        if (z) {
            return;
        }
        intent.putExtra("mapi_message_id", new CoreBugleMessageId(messageIdType, -1L));
    }

    private final Intent I(Context context, ConversationId conversationId, Uri uri, bajg bajgVar, String str) {
        Intent intentJ = J(context, MainActivity.class, conversationId, 11, new batr(null), bajgVar, str, false, false);
        if (uri != null) {
            intentJ.putExtra("target_uri", uri);
        }
        intentJ.setData(bace.d(context, conversationId));
        intentJ.putExtra("via_notification", true);
        return intentJ;
    }

    private final Intent J(Context context, Class cls, ConversationId conversationId, Integer num, batq batqVar, bajg bajgVar, String str, boolean z, boolean z2) {
        final Intent intent;
        if (M(context)) {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            ejyb.e(intent);
        } else {
            intent = new Intent(context, (Class<?>) cls);
        }
        if (z) {
            if (conversationId == InvalidConversationId.a || num == null) {
                intent.setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
            } else {
                intent.setFlags(536870912);
            }
        }
        if (conversationId != InvalidConversationId.a) {
            ajso.d(conversationId, intent, z2);
        }
        if (num != null) {
            intent.putExtra("conversation_state", num);
        }
        intent.addFlags(1);
        batqVar.a(new fdap() { // from class: uef
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ClipData clipDataB;
                ComposeRowState composeRowState = (ComposeRowState) obj;
                if (composeRowState != null) {
                    Intent intent2 = intent;
                    avnt.d(intent2, composeRowState);
                    IncomingDraft incomingDraft = composeRowState.a;
                    if (incomingDraft != null && (clipDataB = avnz.b(incomingDraft)) != null) {
                        intent2.setClipData(clipDataB);
                    }
                }
                return fctx.a;
            }
        }, new fdap() { // from class: ueg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Uri uriT;
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                if (messageCoreData != null) {
                    Intent intent2 = intent;
                    intent2.putExtra("draft_data", messageCoreData);
                    ClipData clipDataNewRawUri = null;
                    for (MessagePartCoreData messagePartCoreData : messageCoreData.M()) {
                        if (messagePartCoreData.aX() && (uriT = messagePartCoreData.t()) != null) {
                            if (clipDataNewRawUri == null) {
                                clipDataNewRawUri = ClipData.newRawUri("Attachments", uriT);
                            } else {
                                clipDataNewRawUri.addItem(new ClipData.Item(uriT));
                            }
                        }
                    }
                    if (clipDataNewRawUri != null) {
                        intent2.setClipData(clipDataNewRawUri);
                    }
                }
                return fctx.a;
            }
        });
        if (bajgVar != null) {
            if (intent.getExtras() == null) {
                intent.putExtra("fake", "fake");
            }
            Bundle bundle = new Bundle();
            String str2 = bajgVar.c;
            if (str2 != null) {
                bundle.putString("other_participant_msisdn", str2);
            }
            String str3 = bajgVar.b;
            if (str3 != null) {
                bundle.putString("conversation_name", str3);
            }
            Integer num2 = bajgVar.a;
            if (num2 != null) {
                bundle.putInt("theme_color", num2.intValue());
            }
            intent.putExtras(bundle);
        }
        if (str != null) {
            intent.putExtra("search_text", str);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        intent.putExtra("intent_timestamp", ((cogw) this.b.b()).f().toEpochMilli());
        return intent;
    }

    private final Intent K(Context context, Class cls, ConversationId conversationId, MessageIdType messageIdType, Integer num, batq batqVar, bajg bajgVar) {
        Intent intentJ = J(context, cls, conversationId, num, batqVar, bajgVar, null, true, true);
        H(intentJ, messageIdType, true);
        return intentJ;
    }

    private final void L(Context context, ConversationId conversationId, MessageIdType messageIdType, MessageId messageId, Uri uri, Integer num, batq batqVar, bajg bajgVar, Bundle bundle, String str, boolean z, Bundle bundle2, Optional optional, boolean z2, int i) throws IOException {
        cqaz.k(true);
        final Intent intentJ = J(context, MainActivity.class, conversationId, num, batqVar, bajgVar, str, z2, false);
        if (messageId != null) {
            intentJ.putExtra("mapi_message_id", messageId);
            if (messageId instanceof BugleMessageId) {
                intentJ.putExtra("message_id", ((BugleMessageId) messageId).c().b());
            }
        } else {
            H(intentJ, messageIdType, false);
        }
        if (uri != null) {
            intentJ.putExtra("target_uri", uri);
        }
        if (z) {
            intentJ.putExtra("open_keyboard", true);
        }
        if (bundle2 != null) {
            intentJ.putExtras(bundle2);
        }
        if (abxb.a()) {
            optional.ifPresent(new Consumer() { // from class: uec
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    efyp.c(intentJ, (efwo) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        intentJ.putExtra("launch_origin", i - 1);
        if (bundle == null || !(bundle.getBoolean("via_share_intent", false) || bundle.getBoolean("via_rbm_deep_link", false))) {
            eiid.p(context, intentJ, bundle);
        } else {
            intentJ.putExtras(bundle);
            eiid.o(context, intentJ);
        }
    }

    private static boolean M(Context context) {
        return !(context instanceof Activity);
    }

    @Override // defpackage.avmp
    public final void A(Context context, ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar, Optional optional, int i) throws IOException {
        y(context, conversationId, messageIdType, null, new batr(null), bajgVar, null, "", false, null, optional, false, i);
    }

    @Override // defpackage.avmp
    public final boolean B(Activity activity, int i, ConversationId conversationId, ComposeRowState composeRowState, Integer num, bajg bajgVar) {
        ejwl.a(true);
        Intent intentK = K(activity, MainActivity.class, conversationId, bary.a, num, new bato(composeRowState), bajgVar);
        intentK.putExtra("via_share_intent", true);
        try {
            activity.startActivityForResult(intentK, i, null);
            return true;
        } catch (SecurityException e) {
            cqaz.p("failure to start conversation for sharing", e);
            return false;
        }
    }

    @Override // defpackage.avmp
    public final /* synthetic */ void C(Context context, ConversationId conversationId, Integer num, batq batqVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("via_share_intent", true);
        w(context, conversationId, bary.a, num, batqVar, null, bundle, null);
    }

    @Override // defpackage.avmp
    public final void D(Context context, ConversationId conversationId) throws IOException {
        Intent intentK = K(context, MainActivity.class, conversationId, bary.a, null, new bato(null), null);
        intentK.setFlags(335544320);
        eiid.o(context, intentK);
    }

    @Override // defpackage.avmp
    public final void E(Context context, ConversationId conversationId, bajg bajgVar) {
        kxg kxgVar = new kxg(context);
        kxgVar.e(K(context, MainActivity.class, conversationId, bary.a, null, new bato(avnr.a(avnz.a(null, fcvo.a, null), null)), bajgVar));
        kxgVar.b();
    }

    @Override // defpackage.avmp
    public final void F(Context context, ConversationId conversationId, batq batqVar, Bundle bundle, Optional optional) throws IOException {
        L(context, conversationId, bary.a, null, null, null, batqVar, null, null, null, true, bundle, optional, true, 4);
    }

    @Override // defpackage.avmp
    public final int a(Intent intent, ConversationId conversationId) {
        return G(intent, conversationId);
    }

    @Override // defpackage.avmp
    public final PendingIntent b(Context context, ConversationId conversationId, MessageIdType messageIdType, String str) {
        Intent intentK = K(context, MainActivity.class, conversationId, messageIdType, null, new bato(null), null);
        intentK.putExtra("via_notification", true);
        intentK.putExtra("via_reminder_view", true);
        intentK.putExtra("viewed_reminder_id", str);
        return avmo.a(context, intentK, 0);
    }

    @Override // defpackage.avmp
    public final PendingIntent c(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("via_notification", true);
        return avmo.a(context, intent, 0);
    }

    @Override // defpackage.avmp
    public final PendingIntent d(Context context, emgo emgoVar) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("via_notification", true);
        intent.putExtra("via_report_issue_notification", true);
        ProtoParsers.i(intent, "report_issue_event_key", emgoVar);
        return avmo.a(context, intent, 0);
    }

    @Override // defpackage.avmp
    public final Intent e(Context context) {
        return new Intent(context, (Class<?>) MainActivity.class);
    }

    @Override // defpackage.avmp
    public final Intent f(Context context) {
        Intent intent = new Intent(context, (Class<?>) LaunchConversationActivity.class);
        intent.putExtra("via_share_intent", true);
        intent.setFlags(1140850689);
        return intent;
    }

    @Override // defpackage.avmp
    public final void g(Context context, ConversationId conversationId, MessageIdType messageIdType) {
        kxg kxgVar = new kxg(context);
        kxgVar.e(K(context, MainActivity.class, conversationId, messageIdType, null, new bato(null), null));
        kxgVar.b();
    }

    @Override // defpackage.avmp
    public final void h(Context context, ConversationId conversationId, Optional optional) throws IOException {
        L(context, conversationId, bary.a, null, null, null, new bato(null), null, null, null, true, null, optional, true, 4);
    }

    @Override // defpackage.avmp
    public final /* synthetic */ void i(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MainActivity.class));
    }

    @Override // defpackage.avmp
    public final /* synthetic */ void j(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        context.startActivity(intent);
    }

    @Override // defpackage.avmp
    public final /* synthetic */ void k(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.addFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.avmp
    public final void l(Context context, Bundle bundle) throws IOException {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(268468224);
        if (bundle != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.putExtras(bundle);
        }
        eiid.o(context, intent);
    }

    @Override // defpackage.avmp
    public final void m(Context context, ConversationId conversationId, batq batqVar, boolean z, Bundle bundle) throws IOException {
        final Intent intent = new Intent(context, (Class<?>) LaunchConversationShimActivity.class);
        intent.putExtra("conversation_id", conversationId.b());
        intent.putExtra("mapi_conversation_id", conversationId);
        batp.b(batqVar, new fdap() { // from class: ued
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ComposeRowState composeRowState = (ComposeRowState) obj;
                if (composeRowState != null) {
                    avnt.d(intent, composeRowState);
                }
                return fctx.a;
            }
        }, new fdap() { // from class: uee
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                intent.putExtra("draft_data", (MessageCoreData) obj);
                return fctx.a;
            }
        });
        intent.putExtra("open_keyboard", z);
        if (bundle != null && bundle.containsKey("FOCUS_ON_FIELD")) {
            intent.putExtra("FOCUS_ON_FIELD", bundle.getString("FOCUS_ON_FIELD"));
        }
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eiid.o(context, intent);
    }

    @Override // defpackage.avmp
    public final Intent n(Context context, ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar, String str) {
        Intent intentI = I(context, conversationId, null, bajgVar, str);
        H(intentI, (MessageIdType) Objects.requireNonNullElse(messageIdType, bary.a), false);
        return intentI;
    }

    @Override // defpackage.avmp
    public final Intent o(Context context, ConversationId conversationId, bajg bajgVar, boolean z) {
        Intent intentK = K(context, MainActivity.class, conversationId, bary.a, null, new batr(null), bajgVar);
        if (!M(context)) {
            intentK.setData(bace.d(context, conversationId));
        }
        intentK.putExtra("via_notification", z);
        return intentK;
    }

    @Override // defpackage.avmp
    public final Intent p(Context context, ConversationId conversationId) {
        Intent intentJ = J(context, MainActivity.class, conversationId, null, new batr(null), null, null, true, true);
        H(intentJ, bary.a, true);
        if (!M(context)) {
            intentJ.setData(bace.d(context, conversationId));
        }
        intentJ.putExtra("via_notification", false);
        intentJ.putExtra("mapi_conversation_id", conversationId);
        return intentJ;
    }

    @Override // defpackage.avmp
    public final Intent q(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        ajso.d(conversationId, intent, false);
        if (messageCoreData != null) {
            intent.putExtra("draft_data", messageCoreData);
        }
        intent.putExtra("scroll_to_bottom", false);
        intent.putExtra("should_launch_home_on_back", true);
        intent.putExtra("open_keyboard", z);
        if (bundle != null && bundle.containsKey("FOCUS_ON_FIELD")) {
            intent.putExtra("FOCUS_ON_FIELD", bundle.getString("FOCUS_ON_FIELD"));
        }
        intent.setFlags(131072);
        return intent;
    }

    @Override // defpackage.avmp
    public final PendingIntent r(Context context, ConversationId conversationId) {
        Intent intentO = o(context, conversationId, null, true);
        return avmo.a(context, intentO, G(intentO, conversationId));
    }

    @Override // defpackage.avmp
    public final PendingIntent s(Context context, ConversationId conversationId, emgo emgoVar) {
        Intent intentO = o(context, conversationId, null, true);
        intentO.putExtra("via_report_issue_notification", true);
        ProtoParsers.i(intentO, "report_issue_event_key", emgoVar);
        return avmo.a(context, intentO, G(intentO, conversationId));
    }

    @Override // defpackage.avmp
    public final void t(Context context, ConversationId conversationId, MessageId messageId, Uri uri) throws IOException {
        Intent intentI = I(context, conversationId, uri, null, null);
        if (messageId != null) {
            intentI.putExtra("mapi_message_id", messageId);
            if (messageId instanceof BugleMessageId) {
                intentI.putExtra("message_id", ((BugleMessageId) messageId).c().b());
            }
        }
        intentI.setData(bace.d(context, conversationId));
        intentI.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        eiid.o(context, intentI);
    }

    @Override // defpackage.avmp
    public final void u(Context context, ConversationId conversationId, MessageIdType messageIdType, String str) throws IOException {
        Intent intentN = n(context, conversationId, messageIdType, null, str);
        intentN.setData(bace.d(context, conversationId));
        intentN.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        eiid.o(context, intentN);
    }

    @Override // defpackage.avmp
    public final void v(Context context, ConversationId conversationId, MessageId messageId, Uri uri) throws IOException {
        L(context, conversationId, bary.a, messageId, uri, null, new batr(null), null, null, null, false, null, Optional.empty(), true, 4);
    }

    @Override // defpackage.avmp
    public final void w(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, batq batqVar, bajg bajgVar, Bundle bundle, String str) throws IOException {
        y(context, conversationId, messageIdType, num, batqVar, bajgVar, bundle, str, false, null, Optional.empty(), true, 4);
    }

    @Override // defpackage.avmp
    public final /* synthetic */ void x(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z, Bundle bundle) throws IOException {
        y(context, conversationId, bary.a, num, new batr(messageCoreData), null, null, null, z, bundle, Optional.empty(), true, 4);
    }

    public final void y(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, batq batqVar, bajg bajgVar, Bundle bundle, String str, boolean z, Bundle bundle2, Optional optional, boolean z2, int i) throws IOException {
        L(context, conversationId, messageIdType, null, null, num, batqVar, bajgVar, bundle, str, z, bundle2, optional, z2, i);
    }

    @Override // defpackage.avmp
    public final void z(Context context, ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar, String str) throws IOException {
        y(context, conversationId, messageIdType, null, new batr(null), bajgVar, null, str, false, null, Optional.empty(), false, 4);
    }
}
