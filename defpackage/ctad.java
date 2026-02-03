package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctad {
    private final String a;
    private final String b;
    private final ParticipantColor c;

    public ctad(String str, String str2, Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = (ParticipantColor) optional.orElse(new ParticipantColor());
    }

    public final denz a() {
        denz denzVar = new denz();
        denzVar.n("1", this.a);
        String str = this.b;
        if (str != null) {
            denzVar.n("4", str);
        }
        ParticipantColor participantColor = this.c;
        denzVar.l("2", participantColor.a);
        denzVar.l("3", participantColor.b);
        denzVar.l("5", participantColor.c);
        return denzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctad) {
            return a().equals(((ctad) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
