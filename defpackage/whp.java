package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class whp {
    public final wmq a;
    public final List b;

    public whp(wmq wmqVar, List list) {
        this.a = wmqVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whp)) {
            return false;
        }
        whp whpVar = (whp) obj;
        return this.a == whpVar.a && fdbq.f(this.b, whpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AddAttachmentResult(validation=" + this.a + ", updatedList=" + this.b + ")";
    }
}
