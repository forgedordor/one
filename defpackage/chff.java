package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chff extends chfg {
    public final String a;
    private final ContentType b;

    public chff(String str) {
        this.a = str;
        efil efilVarD = ContentType.d();
        efilVarD.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        efilVarD.e("plain");
        efilVarD.h(ekgp.l("charset", "UTF-8"));
        this.b = efilVarD.g();
    }

    @Override // defpackage.chfg
    public final ContentType a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chff) && fdbq.f(this.a, ((chff) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextMessage(text=" + this.a + ")";
    }
}
