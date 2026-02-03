package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckxt {
    public final int a;
    public final MessageIdType b;
    public final String c;

    public ckxt(int i, MessageIdType messageIdType, String str) {
        this.a = i;
        this.b = messageIdType;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckxt)) {
            return false;
        }
        ckxt ckxtVar = (ckxt) obj;
        return this.a == ckxtVar.a && fdbq.f(this.b, ckxtVar.b) && fdbq.f(this.c, ckxtVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.b.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "QueriedMessage(queryIndex=" + this.a + ", id=" + this.b + ", text=" + this.c + ")";
    }
}
