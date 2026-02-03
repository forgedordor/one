package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvda extends dqye {
    public bvda() {
        super("vmt");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvcz b() {
        ah();
        return new bvcz(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        dqru.v(this.a, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, str);
    }

    public final void d(aonp aonpVar) {
        if (aonpVar == null) {
            this.a.putNull("vmt_status");
        } else {
            this.a.put("vmt_status", Integer.valueOf(aonpVar.a()));
        }
    }
}
