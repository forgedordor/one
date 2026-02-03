package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjdm extends dqpd {
    private MessageIdType a = bary.a;

    protected bjdm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageIdsQueryBase [messages.messages__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bjjl bjjlVar = (bjjl) dqqjVar;
        aC();
        this.cN = bjjlVar.cV();
        if (bjjlVar.dj(0)) {
            this.a = bjjlVar.c();
            super.fN(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjdm)) {
            return false;
        }
        bjdm bjdmVar = (bjdm) obj;
        return super.aE(bjdmVar.cN) && Objects.equals(this.a, bjdmVar.a);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageIdsQueryBase -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
