package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdt implements alez, alfc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final amwf e;
    private final elny f = elny.RBM_SUGGESTION_REPLY;
    private final alfd g = alfd.s;
    private final String h;

    public bbdt(bbdw bbdwVar, ConversationSuggestion conversationSuggestion) {
        this.e = bbdwVar;
        this.a = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        this.b = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
        this.c = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        this.d = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        this.h = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.g;
    }

    @Override // defpackage.alff
    public final String b() {
        return null;
    }

    @Override // defpackage.alez
    public final amwf h() {
        return this.e;
    }

    @Override // defpackage.alez
    public final elny i() {
        return this.f;
    }

    @Override // defpackage.alfc
    public final String j() {
        return this.h;
    }
}
