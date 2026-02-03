package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class admz extends dqpd {
    private ConversationIdType a = barn.a;
    private long b = 0;
    private boolean c;

    protected admz() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "HomeScreenInnerQuery [conversations.conversations__id: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversation_pin.conversation_pin_pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        adto adtoVar = (adto) dqqjVar;
        aC();
        this.cN = adtoVar.cV();
        if (adtoVar.dj(0)) {
            this.a = new ConversationIdType(adtoVar.getLong(adtoVar.cO(0, adty.a)));
            fN(0);
        }
        if (adtoVar.dj(1)) {
            this.b = adtoVar.getLong(adtoVar.cO(1, adty.a));
            fN(1);
        }
        if (adtoVar.dj(2)) {
            this.c = adtoVar.getInt(adtoVar.cO(2, adty.a)) == 1;
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof admz)) {
            return false;
        }
        admz admzVar = (admz) obj;
        return super.aE(admzVar.cN) && Objects.equals(this.a, admzVar.a) && this.b == admzVar.b && this.c == admzVar.c;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "HomeScreenInnerQuery -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
