package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bgvm extends dqpd {
    public long a;
    private ConversationIdType b = barn.a;
    private auej c = auej.UNKNOWN_STATE;
    private String d;
    private String e;

    protected bgvm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsRcsGroupJoinStatusQuery [conversation_to_participants.conversation_to_participants_conversation_id: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rcs_group_join_status: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s\n]\n", String.valueOf(this.b), String.valueOf(this.a), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bgzq bgzqVar = (bgzq) dqqjVar;
        aC();
        this.cN = bgzqVar.cV();
        if (bgzqVar.dj(0)) {
            this.b = new ConversationIdType(bgzqVar.getLong(bgzqVar.cO(0, bgzx.a)));
            fN(0);
        }
        if (bgzqVar.dj(1)) {
            this.a = bgzqVar.getLong(bgzqVar.cO(1, bgzx.a));
            fN(1);
        }
        if (bgzqVar.dj(2)) {
            this.c = auej.b(bgzqVar.getInt(bgzqVar.cO(2, bgzx.a)));
            fN(2);
        }
        if (bgzqVar.dj(3)) {
            this.d = bgzqVar.getString(bgzqVar.cO(3, bgzx.a));
            fN(3);
        }
        if (bgzqVar.dj(4)) {
            this.e = cssb.a(bgzqVar.getString(bgzqVar.cO(4, bgzx.a)));
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgvm)) {
            return false;
        }
        bgvm bgvmVar = (bgvm) obj;
        return super.aE(bgvmVar.cN) && Objects.equals(this.b, bgvmVar.b) && this.a == bgvmVar.a && this.c == bgvmVar.c && Objects.equals(this.d, bgvmVar.d) && Objects.equals(this.e, bgvmVar.e);
    }

    public final auej f() {
        aA(2, "rcs_group_join_status");
        return this.c;
    }

    public final String g() {
        aA(4, "normalized_destination");
        return this.e;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.b, Long.valueOf(this.a), this.c, this.d, this.e, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationToParticipantsRcsGroupJoinStatusQuery -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
