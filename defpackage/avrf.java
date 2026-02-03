package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class avrf extends dqpd {
    private ConversationIdType a = barn.a;
    private int b = 0;
    private boolean c = false;
    private long[] d;
    private long[] e;
    private String f;
    private String[] g;
    private String[] h;
    private long[] i;

    protected avrf() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationsWithParticipantsFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rowid: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), aK(this.d), aK(this.e), String.valueOf(this.f), aM(this.g), aM(this.h), aK(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        awcb.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        awbu awbuVar = (awbu) ((awbt) dqqjVar);
        aC();
        this.cN = awbuVar.cV();
        if (awbuVar.dj(0)) {
            this.a = awbuVar.c();
            fN(0);
        }
        if (awbuVar.dj(1)) {
            this.b = awbuVar.getInt(awbuVar.cO(1, awcb.a));
            fN(1);
        }
        if (awbuVar.dj(2)) {
            this.c = awbuVar.getInt(awbuVar.cO(2, awcb.a)) == 1;
            fN(2);
        }
        if (awbuVar.dj(3)) {
            this.d = dqru.C(null, awbu.dt(awbuVar.getString(awbuVar.cO(3, awcb.a))));
            fN(3);
        }
        if (awbuVar.dj(4)) {
            this.e = dqru.C(null, awbu.dt(awbuVar.getString(awbuVar.cO(4, awcb.a))));
            fN(4);
        }
        if (awbuVar.dj(5)) {
            this.f = awbuVar.getString(awbuVar.cO(5, awcb.a));
            fN(5);
        }
        if (awbuVar.dj(6)) {
            this.g = awbuVar.d();
            fN(6);
        }
        if (awbuVar.dj(7)) {
            this.h = awbuVar.e();
            fN(7);
        }
        if (awbuVar.dj(8)) {
            this.i = dqru.C(null, awbu.dt(awbuVar.getString(awbuVar.cO(8, awcb.a))));
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avrf)) {
            return false;
        }
        avrf avrfVar = (avrf) obj;
        return super.aE(avrfVar.cN) && Objects.equals(this.a, avrfVar.a) && this.b == avrfVar.b && this.c == avrfVar.c && Arrays.equals(this.d, avrfVar.d) && Arrays.equals(this.e, avrfVar.e) && Objects.equals(this.f, avrfVar.f) && Arrays.equals(this.g, avrfVar.g) && Arrays.equals(this.h, avrfVar.h) && Arrays.equals(this.i, avrfVar.i);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationsWithParticipantsFromConversationToParticipantsQuery -- REDACTED") : a();
    }
}
