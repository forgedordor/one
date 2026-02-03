package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osb extends osg {
    public final orr a;
    public final int b;
    public final int c;
    public final int d;

    public osb(orr orrVar, int i, int i2, int i3) {
        this.a = orrVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (orrVar == orr.a) {
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
        }
        if (a() <= 0) {
            throw new IllegalArgumentException("Drop count must be > 0, but was " + a());
        }
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid placeholdersRemaining " + i3);
    }

    public final int a() {
        return (this.c - this.b) + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osb)) {
            return false;
        }
        osb osbVar = (osb) obj;
        return this.a == osbVar.a && this.b == osbVar.b && this.c == osbVar.c && this.d == osbVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 1) {
            str = "front";
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            str = ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME;
        }
        return fdgn.c("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.b + "\n                    |   maxPageOffset: " + this.c + "\n                    |   placeholdersRemaining: " + this.d + "\n                    |)", "|");
    }
}
