package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.UnsupportedEncodingException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwtj {
    public static final cqce a = cqce.g("Bugle", "SuggestionIntentFactory");
    public final cpbz b;
    private final Optional c;

    public cwtj(cpbz cpbzVar, Optional optional) {
        this.b = cpbzVar;
        this.c = optional;
    }

    public final Intent a(RbmSuggestionData rbmSuggestionData) {
        final ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 4) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("suggestion is not calendar type, cannot create calendar intent");
            cqbdVarC.N("suggestion", rbmSuggestionData);
            cqbdVarC.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        String propertyValue2 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
        if (propertyValue != null && propertyValue2 != null) {
            try {
                final long j = dhie.b(propertyValue).a;
                final long j2 = dhie.b(propertyValue2).a;
                return (Intent) this.c.map(new Function() { // from class: cwti
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ConversationSuggestion conversationSuggestion2 = conversationSuggestion;
                        return ((tlw) obj).a(new cpld(Long.valueOf(j), Long.valueOf(j2), conversationSuggestion2.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE), conversationSuggestion2.getPropertyValue("description"), null, null));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final Intent b(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 3) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("suggestion is not map type, cannot create map intent");
            cqbdVarC.N("suggestion", rbmSuggestionData);
            cqbdVarC.r();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        try {
            if (TextUtils.isEmpty(propertyValue)) {
                String propertyValue2 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
                String propertyValue3 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
                if (!TextUtils.isEmpty(propertyValue2) && !TextUtils.isEmpty(propertyValue3)) {
                    String strH = cssr.h(propertyValue2);
                    String strH2 = cssr.h(propertyValue3);
                    String propertyValue4 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                    if (TextUtils.isEmpty(propertyValue4)) {
                        sb.append(String.format("geo:%s,%s", strH, strH2));
                    } else {
                        sb.append(String.format("geo:0,0?q=%s,%s(%s)", strH, strH2, cssr.h(propertyValue4)));
                    }
                }
                cqbd cqbdVarC2 = a.c();
                cqbdVarC2.I("suggestion type map missing lat/lng, cannot create intent");
                cqbdVarC2.M(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT, propertyValue2);
                cqbdVarC2.M("lng", propertyValue3);
                cqbdVarC2.r();
                return null;
            }
            sb.append("geo:0,0?q=");
            sb.append(cssr.h(propertyValue));
            return this.b.b(Uri.parse(sb.toString()));
        } catch (UnsupportedEncodingException unused) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Unsupported encoding exception for suggested map action.");
            cqbdVarA.N("suggestion", rbmSuggestionData);
            cqbdVarA.r();
            return null;
        }
    }

    public final Intent c(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 2) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("suggestion is not phone type, cannot create call intent");
            cqbdVarC.N("suggestion", rbmSuggestionData);
            cqbdVarC.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        if (!TextUtils.isEmpty(propertyValue)) {
            return this.b.a(propertyValue);
        }
        cqbd cqbdVarC2 = a.c();
        cqbdVarC2.I("suggestion type phone has empty number. Cannot create call intent.");
        cqbdVarC2.N("suggestion", rbmSuggestionData);
        cqbdVarC2.r();
        return null;
    }

    public final Intent d(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 1) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("suggestion is not web type, cannot create web intent");
            cqbdVarC.N("suggestion", rbmSuggestionData);
            cqbdVarC.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (!TextUtils.isEmpty(propertyValue)) {
            return this.b.c(propertyValue);
        }
        cqbd cqbdVarC2 = a.c();
        cqbdVarC2.I("suggestion type web has empty uri. Cannot create web intent.");
        cqbdVarC2.N("suggestion", rbmSuggestionData);
        cqbdVarC2.r();
        return null;
    }
}
