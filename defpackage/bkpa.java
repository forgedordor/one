package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bkpa extends dqpd {
    private ConversationIdType a = barn.a;
    private String b;

    protected bkpa() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ParticipantsSearchFromConversationToParticipantsSubquery [conversation_to_participants.conversation_to_participants_conversation_id: %s,\n  participants.participants_lookup_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bktg bktgVar = (bktg) dqqjVar;
        aC();
        this.cN = bktgVar.cV();
        if (bktgVar.dj(0)) {
            this.a = new ConversationIdType(bktgVar.getLong(bktgVar.cO(0, bktl.a)));
            fN(0);
        }
        if (bktgVar.dj(1)) {
            this.b = bktgVar.getString(bktgVar.cO(1, bktl.a));
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkpa)) {
            return false;
        }
        bkpa bkpaVar = (bkpa) obj;
        return super.aE(bkpaVar.cN) && Objects.equals(this.a, bkpaVar.a) && Objects.equals(this.b, bkpaVar.b);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ParticipantsSearchFromConversationToParticipantsSubquery -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
