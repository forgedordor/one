package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zeo {
    public final String a;
    public final List b;

    public zeo(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeo)) {
            return false;
        }
        zeo zeoVar = (zeo) obj;
        return fdbq.f(this.a, zeoVar.a) && fdbq.f(this.b, zeoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CachableUiDataParts(processedText=" + this.a + ", combinedAnnotations=" + this.b + ")";
    }
}
