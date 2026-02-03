package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wtj extends fdbo implements fdap {
    public static final wtj a = new wtj();

    public wtj() {
        super(1, bpbj.class, "getText", "getText()Ljava/lang/String;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        bpbj bpbjVar = (bpbj) obj;
        bpbjVar.getClass();
        bpbjVar.aA(1, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        return bpbjVar.b;
    }
}
