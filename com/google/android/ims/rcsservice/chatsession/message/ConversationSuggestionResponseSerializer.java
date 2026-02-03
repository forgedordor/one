package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import android.util.Xml;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dhih;
import defpackage.dhja;
import defpackage.dhji;
import defpackage.esye;
import defpackage.esyj;
import defpackage.esym;
import defpackage.esyn;
import defpackage.esyq;
import java.io.StringWriter;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionResponseSerializer {
    private static final String ATTR_POST_BACK_ENCODING = "encoding";
    private static final String NAMESPACE = "";
    private static final String TAG_POST_BACK_DATA = "postbackdata";
    private static final String TAG_REPLY_TEXT = "text";
    private static final String TAG_RESPONSE = "response";
    private static final String TAG_RESPONSE_ROOT = "imSuggestion";
    private static final String TAG_TARGET_MESSAGE_ID = "messageid";

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer$1, reason: invalid class name */
    public class AnonymousClass1 {
        final /* synthetic */ ConversationSuggestion val$suggestion;

        public AnonymousClass1(ConversationSuggestion conversationSuggestion) {
            this.val$suggestion = conversationSuggestion;
        }

        public esyj serialize(ConversationSuggestion conversationSuggestion, Type type, esyq esyqVar) {
            esym esymVar = new esym();
            String propertyValue = this.val$suggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
            if (TextUtils.isEmpty(propertyValue)) {
                propertyValue = this.val$suggestion.getPropertyValue("text");
            }
            if (!TextUtils.isEmpty(propertyValue)) {
                esymVar.f(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT, propertyValue);
            }
            String postBackData = this.val$suggestion.getPostBackData();
            if (!TextUtils.isEmpty(postBackData)) {
                esym esymVar2 = new esym();
                esymVar2.f(GroupManagementRequest.DATA_TAG, postBackData);
                esymVar.e("postback", esymVar2);
            }
            String typeIdentifier = ConversationSuggestionResponseSerializer.getTypeIdentifier(this.val$suggestion);
            if (typeIdentifier == null) {
                throw new esyn("Invalid suggestion type");
            }
            esym esymVar3 = new esym();
            esymVar3.e(typeIdentifier, esymVar);
            esym esymVar4 = new esym();
            esymVar4.e("response", esymVar3);
            return esymVar4;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType;

        static {
            int[] iArr = new int[ConversationSuggestionResponse.ConversationSuggestionResponseType.values().length];
            $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType = iArr;
            try {
                iArr[ConversationSuggestionResponse.ConversationSuggestionResponseType.REPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType[ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String getTypeIdentifier(ConversationSuggestion conversationSuggestion) {
        switch (conversationSuggestion.getSuggestionType()) {
            case 0:
                return "reply";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                return GroupManagementRequest.ACTION_TAG;
            case 6:
            case 7:
            default:
                dhja.g("Unsupported suggestion type: %s", Integer.valueOf(conversationSuggestion.getSuggestionType()));
                return null;
        }
    }

    public static String serializeToJson(ConversationSuggestion conversationSuggestion) {
        esye esyeVar = new esye();
        esyeVar.c(ConversationSuggestion.class, new AnonymousClass1(conversationSuggestion));
        try {
            return esyeVar.a().k(conversationSuggestion);
        } catch (esyn e) {
            dhja.i(e, "Unable to serialize JSON from suggestion response: %s", conversationSuggestion);
            return null;
        }
    }

    public static String serializeToXml(String str, String str2, String str3, String str4) throws Throwable {
        StringWriter stringWriter;
        try {
            stringWriter = new StringWriter();
            try {
                dhih dhihVar = new dhih();
                dhihVar.a = stringWriter;
                dhihVar.startDocument(Xml.Encoding.UTF_8.toString(), true);
                dhihVar.startTag(NAMESPACE, TAG_RESPONSE_ROOT);
                dhihVar.startTag(NAMESPACE, TAG_TARGET_MESSAGE_ID);
                dhihVar.text(str);
                dhihVar.endTag(NAMESPACE, TAG_TARGET_MESSAGE_ID);
                dhihVar.startTag(NAMESPACE, "response");
                if (!TextUtils.isEmpty(str2)) {
                    dhihVar.startTag(NAMESPACE, "text");
                    dhihVar.text(str2);
                    dhihVar.endTag(NAMESPACE, "text");
                }
                dhihVar.startTag(NAMESPACE, TAG_POST_BACK_DATA);
                dhihVar.attribute(NAMESPACE, ATTR_POST_BACK_ENCODING, str4);
                dhihVar.text(str3);
                dhihVar.endTag(NAMESPACE, TAG_POST_BACK_DATA);
                dhihVar.endTag(NAMESPACE, "response");
                dhihVar.endTag(NAMESPACE, TAG_RESPONSE_ROOT);
                dhihVar.flush();
                String string = stringWriter.toString();
                dhji.a(stringWriter);
                return string;
            } catch (Throwable th) {
                th = th;
                dhji.a(stringWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            stringWriter = null;
        }
    }

    public static String getTypeIdentifier(ConversationSuggestionResponse.ConversationSuggestionResponseType conversationSuggestionResponseType) {
        ConversationSuggestionResponse.ConversationSuggestionResponseType conversationSuggestionResponseType2 = ConversationSuggestionResponse.ConversationSuggestionResponseType.UNKNOWN;
        int iOrdinal = conversationSuggestionResponseType.ordinal();
        if (iOrdinal == 1) {
            return "reply";
        }
        if (iOrdinal != 2) {
            dhja.g("Unsupported suggestion response type: %s", conversationSuggestionResponseType);
            return null;
        }
        return GroupManagementRequest.ACTION_TAG;
    }
}
