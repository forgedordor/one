package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdu implements alfc, alez, alfa {
    private final amwf b;
    private final String d;
    private final long e;
    private final long f;
    private final String g;
    private final String h;
    private final alfd a = alfd.f;
    private final elny c = elny.RBM_SUGGESTION_REPLY;

    public bbdu(bbdw bbdwVar, ConversationSuggestion conversationSuggestion, long j, long j2) {
        this.b = bbdwVar;
        this.d = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
        this.e = j;
        this.f = j2;
        this.g = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        this.h = conversationSuggestion.getPropertyValue("description");
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.a;
    }

    @Override // defpackage.alff
    public final String b() {
        return null;
    }

    @Override // defpackage.alfa
    public final Long c() {
        return Long.valueOf(this.f);
    }

    @Override // defpackage.alfa
    public final Long d() {
        return Long.valueOf(this.e);
    }

    @Override // defpackage.alfa
    public final String e() {
        return this.h;
    }

    @Override // defpackage.alfa
    public final String f() {
        return null;
    }

    @Override // defpackage.alfa
    public final String g() {
        return this.g;
    }

    @Override // defpackage.alez
    public final amwf h() {
        return this.b;
    }

    @Override // defpackage.alez
    public final elny i() {
        return this.c;
    }

    @Override // defpackage.alfc
    public final String j() {
        return this.d;
    }
}
