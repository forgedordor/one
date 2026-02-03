package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjjv extends dqpd {
    private MessageIdType a = bary.a;

    protected bjjv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageIdsQueryWithReactions [messages.messages__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bjqk bjqkVar = (bjqk) dqqjVar;
        aC();
        this.cN = bjqkVar.cV();
        if (bjqkVar.dj(0)) {
            this.a = new MessageIdType(bjqkVar.getLong(bjqkVar.cO(0, bjqr.a)));
            super.fN(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjjv)) {
            return false;
        }
        bjjv bjjvVar = (bjjv) obj;
        return super.aE(bjjvVar.cN) && Objects.equals(this.a, bjjvVar.a);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageIdsQueryWithReactions -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
