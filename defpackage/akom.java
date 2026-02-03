package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class akom extends dqpd {
    private String b;
    private long[] g;
    private long[] h;
    private String i;
    private String[] j;
    private String[] k;
    private String[] l;
    private long[] m;
    private ConversationIdType a = barn.a;
    private bvdp c = bvdp.NAME_IS_AUTOMATIC;
    private long d = 0;
    private int e = 0;
    private int f = 0;

    protected akom() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationsWithParticipantsFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rowid: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_comparable_destination: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), aK(this.g), aK(this.h), String.valueOf(this.i), aM(this.j), aM(this.k), aM(this.l), aK(this.m));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        akzi.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        akzb akzbVar = (akzb) ((akza) dqqjVar);
        aC();
        this.cN = akzbVar.cV();
        if (akzbVar.dj(0)) {
            this.a = akzbVar.d();
            fN(0);
        }
        if (akzbVar.dj(1)) {
            this.b = akzbVar.f();
            fN(1);
        }
        if (akzbVar.dj(2)) {
            this.c = akzbVar.e();
            fN(2);
        }
        if (akzbVar.dj(3)) {
            this.d = akzbVar.getLong(akzbVar.cO(3, akzi.a));
            fN(3);
        }
        if (akzbVar.dj(4)) {
            this.e = akzbVar.getInt(akzbVar.cO(4, akzi.a));
            fN(4);
        }
        if (akzbVar.dj(5)) {
            this.f = akzbVar.c();
            fN(5);
        }
        if (akzbVar.dj(6)) {
            this.g = akzbVar.g();
            fN(6);
        }
        if (akzbVar.dj(7)) {
            this.h = dqru.C(null, akzb.dt(akzbVar.getString(akzbVar.cO(7, akzi.a))));
            fN(7);
        }
        if (akzbVar.dj(8)) {
            this.i = akzbVar.getString(akzbVar.cO(8, akzi.a));
            fN(8);
        }
        if (akzbVar.dj(9)) {
            this.j = akzbVar.i();
            fN(9);
        }
        if (akzbVar.dj(10)) {
            this.k = akzbVar.j();
            fN(10);
        }
        if (akzbVar.dj(11)) {
            this.l = akzbVar.h();
            fN(11);
        }
        if (akzbVar.dj(12)) {
            this.m = dqru.C(null, akzb.dt(akzbVar.getString(akzbVar.cO(12, akzi.a))));
            fN(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akom)) {
            return false;
        }
        akom akomVar = (akom) obj;
        return super.aE(akomVar.cN) && Objects.equals(this.a, akomVar.a) && Objects.equals(this.b, akomVar.b) && this.c == akomVar.c && this.d == akomVar.d && this.e == akomVar.e && this.f == akomVar.f && Arrays.equals(this.g, akomVar.g) && Arrays.equals(this.h, akomVar.h) && Objects.equals(this.i, akomVar.i) && Arrays.equals(this.j, akomVar.j) && Arrays.equals(this.k, akomVar.k) && Arrays.equals(this.l, akomVar.l) && Arrays.equals(this.m, akomVar.m);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.a;
        String str = this.b;
        bvdp bvdpVar = this.c;
        return Objects.hash(dqqeVar2, conversationIdType, str, Integer.valueOf(bvdpVar == null ? 0 : bvdpVar.ordinal()), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationsWithParticipantsFromConversationToParticipantsQuery -- REDACTED") : a();
    }
}
