package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbds implements alfe {
    private final amwf a;
    private final elny b = elny.RBM_SUGGESTION_REPLY;
    private final alfd c = alfd.e;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public bbds(bbdw bbdwVar, ConversationSuggestion conversationSuggestion) {
        this.a = bbdwVar;
        this.d = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        this.e = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_VIEW_MODE);
        this.f = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION);
        this.g = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.c;
    }

    @Override // defpackage.alff
    public final String b() {
        return null;
    }

    @Override // defpackage.alfe
    public final String c() {
        return this.f;
    }

    @Override // defpackage.alfe
    public final String d() {
        return this.d;
    }

    @Override // defpackage.alfe
    public final String e() {
        return this.e;
    }

    @Override // defpackage.alez
    public final amwf h() {
        return this.a;
    }

    @Override // defpackage.alez
    public final elny i() {
        return this.b;
    }

    @Override // defpackage.alfc
    public final String j() {
        return this.g;
    }
}
