package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alal extends fcyz implements fdat {
    int a;
    final /* synthetic */ alap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alal(alap alapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = alapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarX = alap.d(this.b.c.a).x();
            eijuVarX.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarX, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (bods bodsVar : (Iterable) obj) {
            ConversationSuggestion conversationSuggestionCreateRbmConversationSuggestion = ConversationSuggestion.createRbmConversationSuggestion(bodsVar.k(), bodsVar.r(), bodsVar.p(), bodsVar.q(), bodsVar.n().b, bodsVar.o().b);
            String strSerializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(conversationSuggestionCreateRbmConversationSuggestion);
            RbmSuggestionData rbmSuggestionData = null;
            if (strSerializeToJson != null) {
                String propertyValue = conversationSuggestionCreateRbmConversationSuggestion.getSuggestionType() == 0 ? conversationSuggestionCreateRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT) : strSerializeToJson;
                if (propertyValue != null) {
                    MessageIdType messageIdTypeM = bodsVar.m();
                    messageIdTypeM.getClass();
                    rbmSuggestionData = new RbmSuggestionData(conversationSuggestionCreateRbmConversationSuggestion, messageIdTypeM, new alak(strSerializeToJson, propertyValue));
                }
            }
            if (rbmSuggestionData != null) {
                arrayList.add(rbmSuggestionData);
            }
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alal(this.b, fcxyVar);
    }
}
