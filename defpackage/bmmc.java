package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmmc extends dqye {
    public bmmc() {
        super("business_conversations_metadata");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmmb b() {
        ah();
        return new bmmb(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(aslb aslbVar) {
        if (aslbVar == null) {
            this.a.putNull("chatbot_directory_conversation_state");
        } else {
            this.a.put("chatbot_directory_conversation_state", Integer.valueOf(aslbVar.a()));
        }
    }
}
