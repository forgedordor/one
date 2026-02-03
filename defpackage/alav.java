package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alav extends fcyz implements fdat {
    int a;
    final /* synthetic */ alaz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alav(alaz alazVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = alazVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        String propertyValue;
        String propertyValue2;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objC = obj;
        } else {
            eiju eijuVarX = alaz.d(this.b.c.a).x();
            eijuVarX.getClass();
            this.a = 1;
            objC = fdxs.c(eijuVarX, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
        }
        objC.getClass();
        ArrayList arrayList = new ArrayList();
        for (bods bodsVar : (Iterable) objC) {
            bodsVar.getClass();
            ConversationSuggestion conversationSuggestionCreateRbmConversationSuggestion = ConversationSuggestion.createRbmConversationSuggestion(bodsVar.k(), bodsVar.r(), bodsVar.p(), bodsVar.q(), bodsVar.n().b, bodsVar.o().b);
            String strSerializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(conversationSuggestionCreateRbmConversationSuggestion);
            alff bbdpVar = null;
            if (strSerializeToJson != null && (propertyValue = conversationSuggestionCreateRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) != null) {
                bbdw bbdwVar = new bbdw(strSerializeToJson, propertyValue);
                switch (conversationSuggestionCreateRbmConversationSuggestion.getSuggestionType()) {
                    case 0:
                        bbdpVar = new bbdp(bbdwVar);
                        break;
                    case 1:
                        bbdpVar = new bbdr(bbdwVar, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                    case 2:
                        bbdpVar = new bbdq(bbdwVar, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                    case 3:
                        bbdpVar = new bbdt(bbdwVar, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                    case 4:
                        String propertyValue3 = conversationSuggestionCreateRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
                        if (propertyValue3 != null && (propertyValue2 = conversationSuggestionCreateRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) != null) {
                            try {
                                bbdpVar = new bbdu(bbdwVar, conversationSuggestionCreateRbmConversationSuggestion, dhie.b(propertyValue3).a, dhie.b(propertyValue2).a);
                                break;
                            } catch (IllegalArgumentException unused) {
                                break;
                            }
                        }
                        break;
                    case 5:
                        bbdpVar = new bbdv(bbdwVar);
                        break;
                    case 6:
                    case 7:
                    default:
                        ((ekrd) ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/suggestions/ConversationSuggestionExtKt").j().h("com/google/android/apps/messaging/shared/datamodel/data/suggestions/ConversationSuggestionExtKt", "toSuggestionV2", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "ConversationSuggestionExt.kt")).r("Unexpected RBM suggestion type loaded", conversationSuggestionCreateRbmConversationSuggestion.getSuggestionType());
                        break;
                    case 8:
                        bbdpVar = new bbdo(alfd.t, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                    case 9:
                        bbdpVar = new bbdo(alfd.v, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                    case 10:
                        bbdpVar = new bbdo(alfd.u, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                    case 11:
                        bbdpVar = new bbds(bbdwVar, conversationSuggestionCreateRbmConversationSuggestion);
                        break;
                }
            }
            if (bbdpVar != null) {
                arrayList.add(bbdpVar);
            }
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alav(this.b, fcxyVar);
    }
}
