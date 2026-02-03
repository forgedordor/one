package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import defpackage.dhja;
import defpackage.esye;
import defpackage.esyh;
import defpackage.esyi;
import defpackage.esyj;
import defpackage.esym;
import defpackage.esyn;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionResponseDeserializer {
    public static ConversationSuggestionResponse deserializeFromJson(String str) {
        esye esyeVar = new esye();
        esyeVar.c(ConversationSuggestionResponse.class, new esyi<ConversationSuggestionResponse>() { // from class: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // defpackage.esyi
            public ConversationSuggestionResponse deserialize(esyj esyjVar, Type type, esyh esyhVar) {
                esym esymVarD = esyjVar.c().d(GroupManagementResponse.XML_TAG);
                if (esymVarD == null) {
                    return null;
                }
                esym esymVarD2 = esymVarD.d("reply");
                esym esymVarD3 = esymVarD.d(GroupManagementRequest.ACTION_TAG);
                if (esymVarD2 == null && esymVarD3 == null) {
                    return null;
                }
                ConversationSuggestionResponse conversationSuggestionResponse = new ConversationSuggestionResponse();
                if (esymVarD2 != null) {
                    conversationSuggestionResponse.type = ConversationSuggestionResponse.ConversationSuggestionResponseType.REPLY;
                } else {
                    conversationSuggestionResponse.type = ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION;
                    esymVarD2 = esymVarD3;
                }
                ConversationSuggestionDeserializer conversationSuggestionDeserializer = new ConversationSuggestionDeserializer();
                String strDeserializeDisplayText = conversationSuggestionDeserializer.deserializeDisplayText(esymVarD2);
                String strDeserializePostBackData = conversationSuggestionDeserializer.deserializePostBackData(esymVarD2);
                if (TextUtils.isEmpty(strDeserializeDisplayText)) {
                    return null;
                }
                conversationSuggestionResponse.displayText = strDeserializeDisplayText;
                conversationSuggestionResponse.postBackData = strDeserializePostBackData;
                return conversationSuggestionResponse;
            }
        });
        try {
            return (ConversationSuggestionResponse) esyeVar.a().i(str, ConversationSuggestionResponse.class);
        } catch (esyn e) {
            dhja.i(e, "Unable to deserialize JSON into suggestion response: %s", str);
            return null;
        }
    }
}
