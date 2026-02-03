package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zso extends fcyz implements fdap {
    int a;
    final /* synthetic */ SmartSuggestionData b;
    final /* synthetic */ ztv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zso(SmartSuggestionData smartSuggestionData, ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = smartSuggestionData;
        this.c = ztvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String strB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (strB = this.b.b()) != null) {
            ztv ztvVar = this.c;
            crif crifVar = (crif) ztvVar.u.b();
            ConversationIdType conversationIdType = ((BugleConversationId) ztvVar.h.d()).a;
            ezaj ezajVar = ezaj.CONSUMED;
            this.a = 1;
            if (crifVar.f(conversationIdType, strB, ezajVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zso(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
