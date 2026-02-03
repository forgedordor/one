package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ SmartSuggestionData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsk(ztv ztvVar, SmartSuggestionData smartSuggestionData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = smartSuggestionData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ztv ztvVar = this.b;
            SmartSuggestionData smartSuggestionData = this.c;
            vwj vwjVarC = ztvVar.c();
            vvw vvwVar = new vvw(smartSuggestionData.d(), (List) null, (String) null, false, (MessageId) null, (EditingData) null, (Instant) null, false, 0, false, 2046);
            this.a = 1;
            obj = vwjVarC.b(vvwVar, null, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ((ekrd) ztv.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl$handleReplySuggestion$1$1", "invokeSuspend", 819, "SuggestionUiAdapterImpl.kt")).q("Failed to send reply suggestion");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsk(this.b, this.c, fcxyVar);
    }
}
