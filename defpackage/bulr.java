package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bulr extends dqpd {
    private long a;
    private ConversationIdType b = barn.a;

    protected bulr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "UpdateConversationSuggestionsFromConversationIdSelection [conversation_suggestions.conversation_suggestions__id: %s,\n  messages.messages_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        busl buslVar = (busl) dqqjVar;
        aC();
        this.cN = buslVar.cV();
        if (buslVar.dj(0)) {
            this.a = buslVar.getLong(buslVar.cO(0, busq.a));
            fN(0);
        }
        if (buslVar.dj(1)) {
            this.b = new ConversationIdType(buslVar.getLong(buslVar.cO(1, busq.a)));
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bulr)) {
            return false;
        }
        bulr bulrVar = (bulr) obj;
        return super.aE(bulrVar.cN) && this.a == bulrVar.a && Objects.equals(this.b, bulrVar.b);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "UpdateConversationSuggestionsFromConversationIdSelection -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
