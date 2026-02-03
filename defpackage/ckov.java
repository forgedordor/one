package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class ckov extends dqpd {
    private MessageIdType a;
    private MessageIdType b;
    private ckml c;
    private ckmb d;
    private MessageIdType e;
    private int f;

    protected ckov() {
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ckml.b(0);
        this.e = messageIdType;
        this.f = 0;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ReactionMessages [message_reactions.message_reactions_message_id: %s,\n  message_reactions.message_reactions_reacted_message_id: %s,\n  message_reactions.message_reactions_reaction: %s,\n  message_reactions.message_reactions_applied_reaction: %s,\n  messages.messages__id: %s,\n  messages.messages_message_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        ckvr.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        ckmb ckmbVar;
        ckvk ckvkVar = (ckvk) dqqjVar;
        aC();
        this.cN = ckvkVar.cV();
        if (ckvkVar.dj(0)) {
            this.a = new MessageIdType(ckvkVar.getLong(ckvkVar.cO(0, ckvr.a)));
            fN(0);
        }
        if (ckvkVar.dj(1)) {
            this.b = new MessageIdType(ckvkVar.getLong(ckvkVar.cO(1, ckvr.a)));
            fN(1);
        }
        if (ckvkVar.dj(2)) {
            this.c = ckml.b(ckvkVar.getInt(ckvkVar.cO(2, ckvr.a)));
            fN(2);
        }
        if (ckvkVar.dj(3)) {
            byte[] blob = ckvkVar.getBlob(ckvkVar.cO(3, ckvr.a));
            if (blob == null) {
                ckmbVar = null;
            } else {
                try {
                    ckmbVar = (ckmb) evsn.parseFrom(ckmb.a, blob, evrr.a());
                } catch (Throwable unused) {
                    ckmbVar = ckmb.a;
                }
            }
            this.d = ckmbVar;
            fN(3);
        }
        if (ckvkVar.dj(4)) {
            this.e = new MessageIdType(ckvkVar.getLong(ckvkVar.cO(4, ckvr.a)));
            fN(4);
        }
        if (ckvkVar.dj(5)) {
            this.f = ckvkVar.getInt(ckvkVar.cO(5, ckvr.a));
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ckov)) {
            return false;
        }
        ckov ckovVar = (ckov) obj;
        return super.aE(ckovVar.cN) && Objects.equals(this.a, ckovVar.a) && Objects.equals(this.b, ckovVar.b) && this.c == ckovVar.c && Objects.equals(this.d, ckovVar.d) && Objects.equals(this.e, ckovVar.e) && this.f == ckovVar.f;
    }

    public final ckmb f() {
        aA(3, "applied_reaction");
        return this.d;
    }

    public final ckml g() {
        aA(2, "reaction");
        return this.c;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ReactionMessages -- REDACTED") : a();
    }
}
