package com.google.android.ims.rcsservice.chatsession.message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.dhip;
import defpackage.dhja;
import defpackage.esyg;
import defpackage.esyh;
import defpackage.esyi;
import defpackage.esyj;
import defpackage.esyl;
import defpackage.esym;
import defpackage.esyp;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionDeserializer implements esyi<ConversationSuggestion> {
    public static final dfny<Boolean> DESERIALIZE_FALLBACK_URLS = dfod.a(148616363);
    private static final dhip TAG = new dhip("ConversationSuggestionDeserializer");
    private String postBackData;
    private HashMap<String, String> properties;
    private int suggestionType;

    private void deserializeComposeTextDraftMessage(esym esymVar) {
        deserializeProperty(esymVar, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_DRAFT_TEXT);
    }

    private boolean deserializeCreateCalendarEvent(esym esymVar) {
        esym esymVarD = esymVar.d("createCalendarEvent");
        if (esymVarD == null) {
            dhja.d(TAG, "Unable to deserialize create calendar event action: null event", new Object[0]);
            return false;
        }
        String strDeserializeProperty = deserializeProperty(esymVarD, "startTime", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        String strDeserializeProperty2 = deserializeProperty(esymVarD, "endTime", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
        String strDeserializeProperty3 = deserializeProperty(esymVarD, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        deserializeProperty(esymVarD, "description", "description");
        deserializeFallbackUrl(esymVarD);
        if (!TextUtils.isEmpty(strDeserializeProperty) && !TextUtils.isEmpty(strDeserializeProperty2) && !TextUtils.isEmpty(strDeserializeProperty3)) {
            return true;
        }
        dhja.d(TAG, "Unable to deserialize create calendar action: invalid properties; startTime: %s, endTime: %s, title: %s", strDeserializeProperty, strDeserializeProperty2, strDeserializeProperty3);
        return false;
    }

    private boolean deserializeFallbackUrl(esym esymVar) {
        if (!((Boolean) DESERIALIZE_FALLBACK_URLS.a()).booleanValue()) {
            return false;
        }
        String strDeserializePropertyWithoutSaving = deserializePropertyWithoutSaving(esymVar, ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
        if (TextUtils.isEmpty(strDeserializePropertyWithoutSaving)) {
            dhja.d(TAG, "Unable to deserialize fallback url: empty url", new Object[0]);
            return false;
        }
        Uri uri = Uri.parse(strDeserializePropertyWithoutSaving);
        if (uri == null) {
            dhja.d(TAG, "Unable to deserialize fallback url: null uri", new Object[0]);
            return false;
        }
        if (!URLUtil.isNetworkUrl(strDeserializePropertyWithoutSaving) || TextUtils.isEmpty(uri.getHost())) {
            dhja.d(TAG, "Unable to deserialize fallback url: invalid url: %s", strDeserializePropertyWithoutSaving);
            return false;
        }
        dhja.d(TAG, "Valid fallback url: %s", strDeserializePropertyWithoutSaving);
        savePropertyInPropertyMap(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL, strDeserializePropertyWithoutSaving);
        return true;
    }

    private boolean deserializeLocation(esym esymVar) {
        esym esymVarD = esymVar.d("location");
        if (esymVarD == null) {
            dhja.d(TAG, "Unable to deserialize location action: null location", new Object[0]);
            return false;
        }
        String strDeserializeProperty = deserializeProperty(esymVarD, "latitude", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
        String strDeserializeProperty2 = deserializeProperty(esymVarD, "longitude", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        String strDeserializeProperty3 = deserializeProperty(esymVarD, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        deserializeProperty(esymVarD, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        deserializeFallbackUrl(esymVar);
        if ((!TextUtils.isEmpty(strDeserializeProperty) && !TextUtils.isEmpty(strDeserializeProperty2)) || !TextUtils.isEmpty(strDeserializeProperty3)) {
            return true;
        }
        dhja.d(TAG, "Unable to deserialize location action: invalid properties; latitude: %s, longitude: %s, query: %s", strDeserializeProperty, strDeserializeProperty2, strDeserializeProperty3);
        return false;
    }

    private boolean deserializePhoneNumber(esym esymVar) {
        esym esymVarD = esymVar.d("dialPhoneNumber");
        if (esymVarD == null) {
            dhja.d(TAG, "Unable to deserialize phone action: null dialPhoneNumber", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(deserializeProperty(esymVarD, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER))) {
            dhja.d(TAG, "Unable to deserialize phone action: empty phoneNumber", new Object[0]);
            return false;
        }
        deserializeFallbackUrl(esymVarD);
        return true;
    }

    private boolean deserializePhoneNumberForComposeAction(esym esymVar) {
        return !TextUtils.isEmpty(deserializeProperty(esymVar, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER));
    }

    private String deserializeProperty(esym esymVar, String str, String str2) {
        String strDeserializePropertyWithoutSaving = deserializePropertyWithoutSaving(esymVar, str);
        if (strDeserializePropertyWithoutSaving != null) {
            savePropertyInPropertyMap(str2, strDeserializePropertyWithoutSaving);
        }
        return strDeserializePropertyWithoutSaving;
    }

    private static String deserializePropertyWithoutSaving(esym esymVar, String str) {
        esyj esyjVar;
        if (esymVar == null || (esyjVar = (esyj) esymVar.a.get(str)) == null || (esyjVar instanceof esyl)) {
            return null;
        }
        return esyjVar instanceof esym ? esyjVar.c().toString() : esyjVar instanceof esyg ? esyjVar.b().toString() : esyjVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void deserializeSuggestedAction(defpackage.esym r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.deserializeDisplayText(r6)
            java.lang.String r1 = r5.deserializePostBackData(r6)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L19
            dhip r6 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionDeserializer.TAG
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Unable to deserialize suggested action: empty display text"
            defpackage.dhja.d(r6, r1, r0)
            return
        L19:
            r5.postBackData = r1
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r5.properties
            java.lang.String r2 = "text"
            r1.put(r2, r0)
            java.lang.String r0 = "urlAction"
            esym r0 = r6.d(r0)
            if (r0 == 0) goto L63
            dhip r6 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionDeserializer.TAG
            boolean r1 = defpackage.dflx.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r1
            java.lang.String r1 = " EnableWebviewStaticBridge flag is : %s"
            defpackage.dhja.l(r6, r1, r4)
            boolean r1 = defpackage.dflx.a()
            if (r1 != 0) goto L4d
            boolean r6 = r5.deserializeWebUri(r0)
            if (r6 == 0) goto Le0
            r5.suggestionType = r2
            return
        L4d:
            boolean r0 = r5.validateAndDeserializeOpenUrlAction(r0)
            if (r0 == 0) goto Le0
            int r0 = r5.suggestionType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = " Valid open url action with suggestionType: %s"
            defpackage.dhja.l(r6, r0, r1)
            return
        L63:
            java.lang.String r0 = "dialerAction"
            esym r0 = r6.d(r0)
            if (r0 == 0) goto L73
            boolean r0 = r5.deserializePhoneNumber(r0)
            if (r0 == 0) goto L73
            r6 = 2
            goto Laa
        L73:
            java.lang.String r0 = "mapAction"
            esym r0 = r6.d(r0)
            if (r0 == 0) goto L9b
            java.lang.String r1 = "showLocation"
            esym r1 = r0.d(r1)
            if (r1 == 0) goto L8b
            boolean r1 = r5.deserializeLocation(r1)
            if (r1 == 0) goto L8b
            r6 = 3
            goto Laa
        L8b:
            java.lang.String r1 = "requestLocationPush"
            esym r0 = r0.d(r1)
            if (r0 != 0) goto L94
            goto L9b
        L94:
            r5.deserializeFallbackUrl(r0)
            r6 = 5
            r5.suggestionType = r6
            return
        L9b:
            java.lang.String r0 = "calendarAction"
            esym r0 = r6.d(r0)
            if (r0 == 0) goto Lad
            boolean r0 = r5.deserializeCreateCalendarEvent(r0)
            if (r0 == 0) goto Lad
            r6 = 4
        Laa:
            r5.suggestionType = r6
            return
        Lad:
            java.lang.String r0 = "composeAction"
            esym r6 = r6.d(r0)
            if (r6 == 0) goto Le0
            java.lang.String r0 = "composeTextMessage"
            esym r0 = r6.d(r0)
            if (r0 == 0) goto Lcc
            boolean r1 = r5.deserializePhoneNumberForComposeAction(r0)
            if (r1 != 0) goto Lc4
            goto Lcc
        Lc4:
            r5.deserializeComposeTextDraftMessage(r0)
            r6 = 8
            r5.suggestionType = r6
            return
        Lcc:
            java.lang.String r0 = "composeRecordingMessage"
            esym r6 = r6.d(r0)
            if (r6 == 0) goto Le0
            boolean r0 = r5.deserializePhoneNumberForComposeAction(r6)
            if (r0 == 0) goto Le0
            int r6 = r5.determineComposeRecordingSuggestionType(r6)
            r5.suggestionType = r6
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionDeserializer.deserializeSuggestedAction(esym):void");
    }

    private void deserializeSuggestedReply(esym esymVar) {
        String strDeserializeDisplayText = deserializeDisplayText(esymVar);
        String strDeserializePostBackData = deserializePostBackData(esymVar);
        if (TextUtils.isEmpty(strDeserializeDisplayText)) {
            dhja.d(TAG, "Unable to deserialize suggested reply: empty display text", new Object[0]);
            return;
        }
        this.suggestionType = 0;
        this.postBackData = strDeserializePostBackData;
        this.properties.put(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, strDeserializeDisplayText);
    }

    private boolean deserializeWebUri(esym esymVar) {
        esym esymVarD = esymVar.d("openUrl");
        if (esymVarD == null) {
            dhja.c("Unable to deserialize web action: null openUrl", new Object[0]);
            return false;
        }
        String strDeserializeProperty = deserializeProperty(esymVarD, "url", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (TextUtils.isEmpty(strDeserializeProperty)) {
            dhja.c("Unable to deserialize web action: empty url", new Object[0]);
            return false;
        }
        Uri uri = Uri.parse(strDeserializeProperty);
        if (uri == null) {
            dhja.c("Unable to deserialize web action: null uri", new Object[0]);
            return false;
        }
        if (URLUtil.isNetworkUrl(strDeserializeProperty)) {
            if (!TextUtils.isEmpty(uri.getHost())) {
                dhja.c("Valid web url: %s", strDeserializeProperty);
                return true;
            }
        } else if (!TextUtils.isEmpty(uri.getScheme()) && !URLUtil.isContentUrl(strDeserializeProperty) && !URLUtil.isFileUrl(strDeserializeProperty)) {
            dhja.c("Valid intent url: %s", strDeserializeProperty);
            return true;
        }
        dhja.c("Unable to deserialize web action: invalid url: %s", strDeserializeProperty);
        return false;
    }

    private int determineComposeRecordingSuggestionType(esym esymVar) {
        String strDeserializeProperty = deserializeProperty(esymVar, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_RECORDING_TYPE);
        if (strDeserializeProperty == null) {
            return -1;
        }
        if (strDeserializeProperty.equals("AUDIO")) {
            return 9;
        }
        return strDeserializeProperty.equals(VCardConstants.PARAM_TYPE_VIDEO) ? 10 : -1;
    }

    private void savePropertyInPropertyMap(String str, String str2) {
        HashMap<String, String> map = this.properties;
        if (map != null) {
            map.put(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean validateAndDeserializeOpenUrlAction(defpackage.esym r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionDeserializer.validateAndDeserializeOpenUrlAction(esym):boolean");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.esyi
    public ConversationSuggestion deserialize(esyj esyjVar, Type type, esyh esyhVar) {
        esym esymVarC = esyjVar.c();
        this.suggestionType = -1;
        this.postBackData = null;
        this.properties = new HashMap<>();
        esym esymVarD = esymVarC.d("reply");
        if (esymVarD != null) {
            deserializeSuggestedReply(esymVarD);
        } else {
            esym esymVarD2 = esymVarC.d(GroupManagementRequest.ACTION_TAG);
            if (esymVarD2 != null) {
                deserializeSuggestedAction(esymVarD2);
            }
        }
        int i = this.suggestionType;
        if (i != -1) {
            return ConversationSuggestion.createRbmConversationSuggestion(i, this.properties, this.postBackData, (String) null, (String) null, (String) null);
        }
        dhja.q("Ignoring malformed suggestion.", new Object[0]);
        return null;
    }

    public String deserializeDisplayText(esym esymVar) {
        return deserializeProperty(esymVar, ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
    }

    public String deserializePostBackData(esym esymVar) {
        esyp esypVar;
        esym esymVarD = esymVar.d("postback");
        if (esymVarD == null || (esypVar = (esyp) esymVarD.a.get(GroupManagementRequest.DATA_TAG)) == null || !(esypVar.a instanceof String) || TextUtils.isEmpty(esypVar.a())) {
            return null;
        }
        return esypVar.a();
    }
}
