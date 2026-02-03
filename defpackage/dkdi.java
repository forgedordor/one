package defpackage;

import com.android.vcard.VCardConstants;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkdi {
    public final List a;
    public final int b;

    public dkdi(int i, List list) {
        this.b = i;
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkdi)) {
            return false;
        }
        dkdi dkdiVar = (dkdi) obj;
        return this.b == dkdiVar.b && fdbq.f(this.a, dkdiVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextListItemAnnotation(target=");
        sb.append((Object) (this.b != 1 ? "SUBTITLE" : VCardConstants.PROPERTY_TITLE));
        sb.append(", annotations=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
