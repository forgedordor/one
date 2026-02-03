package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aewc extends dqpd {
    private String a;
    private int c;
    private bqhg d;
    private bqhh e;
    private MessageIdType b = bary.a;
    private String f = "";
    private String g = "";
    private ConversationIdType h = barn.a;
    private long i = 0;

    protected aewc() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageLabelsFullQuery [message_labels.message_labels__id: %s,\n  message_labels.message_labels_message_id: %s,\n  message_labels.message_labels_label: %s,\n  message_labels.message_labels_confidence: %s,\n  message_labels.message_labels_source: %s,\n  message_labels.message_labels_intent: %s,\n  message_labels.message_labels_model_id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        afcw.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        afcr afcrVar = (afcr) dqqjVar;
        aC();
        this.cN = afcrVar.cV();
        if (afcrVar.dj(0)) {
            this.a = afcrVar.getString(afcrVar.cO(0, afcw.a));
            fN(0);
        }
        if (afcrVar.dj(1)) {
            this.b = new MessageIdType(afcrVar.getLong(afcrVar.cO(1, afcw.a)));
            fN(1);
        }
        if (afcrVar.dj(2)) {
            this.c = afcrVar.getInt(afcrVar.cO(2, afcw.a));
            fN(2);
        }
        if (afcrVar.dj(3)) {
            bqhg[] bqhgVarArrValues = bqhg.values();
            int i = afcrVar.getInt(afcrVar.cO(3, afcw.a));
            if (i >= bqhgVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.d = bqhgVarArrValues[i];
            fN(3);
        }
        if (afcrVar.dj(4)) {
            bqhh[] bqhhVarArrValues = bqhh.values();
            int i2 = afcrVar.getInt(afcrVar.cO(4, afcw.a));
            if (i2 >= bqhhVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.e = bqhhVarArrValues[i2];
            fN(4);
        }
        if (afcrVar.dj(5)) {
            String[] strArr = afcw.a;
            if (afcrVar.isNull(afcrVar.cO(5, strArr))) {
                throw new IllegalStateException("found null in cursor for column intent");
            }
            this.f = afcrVar.getString(afcrVar.cO(5, strArr));
            fN(5);
        }
        if (afcrVar.dj(6)) {
            String[] strArr2 = afcw.a;
            if (afcrVar.isNull(afcrVar.cO(6, strArr2))) {
                throw new IllegalStateException("found null in cursor for column model_id");
            }
            this.g = afcrVar.getString(afcrVar.cO(6, strArr2));
            fN(6);
        }
        if (afcrVar.dj(7)) {
            this.h = new ConversationIdType(afcrVar.getLong(afcrVar.cO(7, afcw.a)));
            fN(7);
        }
        if (afcrVar.dj(8)) {
            this.i = afcrVar.getLong(afcrVar.cO(8, afcw.a));
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aewc)) {
            return false;
        }
        aewc aewcVar = (aewc) obj;
        return super.aE(aewcVar.cN) && Objects.equals(this.a, aewcVar.a) && Objects.equals(this.b, aewcVar.b) && this.c == aewcVar.c && this.d == aewcVar.d && this.e == aewcVar.e && Objects.equals(this.f, aewcVar.f) && Objects.equals(this.g, aewcVar.g) && Objects.equals(this.h, aewcVar.h) && this.i == aewcVar.i;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        MessageIdType messageIdType = this.b;
        Integer numValueOf = Integer.valueOf(this.c);
        bqhg bqhgVar = this.d;
        Integer numValueOf2 = Integer.valueOf(bqhgVar == null ? 0 : bqhgVar.ordinal());
        bqhh bqhhVar = this.e;
        return Objects.hash(dqqeVar2, str, messageIdType, numValueOf, numValueOf2, Integer.valueOf(bqhhVar == null ? 0 : bqhhVar.ordinal()), this.f, this.g, this.h, Long.valueOf(this.i), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageLabelsFullQuery -- REDACTED") : a();
    }
}
