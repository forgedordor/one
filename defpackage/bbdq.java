package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdq implements alez, alfc {
    public final /* synthetic */ ConversationSuggestion a;
    private final amwf c;
    private final String e;
    private final alfd b = alfd.b;
    private final elny d = elny.RBM_SUGGESTION_REPLY;

    public bbdq(bbdw bbdwVar, ConversationSuggestion conversationSuggestion) {
        this.a = conversationSuggestion;
        this.c = bbdwVar;
        this.e = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.b;
    }

    @Override // defpackage.alff
    public final String b() {
        return null;
    }

    @Override // defpackage.alez
    public final amwf h() {
        return this.c;
    }

    @Override // defpackage.alez
    public final elny i() {
        return this.d;
    }

    @Override // defpackage.alfc
    public final String j() {
        return this.e;
    }
}
