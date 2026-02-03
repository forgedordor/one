package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aypr {
    private static final cqce a = cqce.g("BugleAction", "ProcessConversationUpdateActionLauncher");
    private static final eksp b = eksp.c("BugleDitto");
    private final Context c;
    private final Optional d;
    private final ayps e;
    private final fcsu f;
    private final fcsu g;

    public aypr(Context context, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, ayps aypsVar) {
        this.c = context;
        this.d = optional;
        this.e = aypsVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
    }

    public final void a(ezol ezolVar, String str, Uri uri) {
        if (uri == null || ezolVar == null) {
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        ConversationIdType conversationIdTypeB = barn.b(uri.getLastPathSegment());
        if (pathSegments.size() != bace.i(this.c).getPathSegments().size() + 1 || str == null || conversationIdTypeB.b() || !this.d.isPresent()) {
            if (conversationIdTypeB.b()) {
                a.n("Could not processConversationUpdate as conversationId was null");
                return;
            }
            return;
        }
        final Action actionB = this.e.b(ezolVar, str, conversationIdTypeB, uri.getBooleanQueryParameter("sendPush", false));
        if (!((aprz) this.f.b()).a()) {
            actionB.r();
        } else {
            if (((auxl) this.g.b()).b(conversationIdTypeB.toString(), new Runnable() { // from class: aypq
                @Override // java.lang.Runnable
                public final void run() {
                    actionB.r();
                }
            })) {
                return;
            }
            ((eksl) ((eksl) b.g()).h("com/google/android/apps/messaging/shared/datamodel/actionfactories/ProcessConversationUpdateActionLauncher", "processConversationUpdate", 78, "ProcessConversationUpdateActionLauncher.java")).t("Conversation [%s] Update is debounced as there is a recent update", conversationIdTypeB.a());
        }
    }
}
