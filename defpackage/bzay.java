package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzay {
    private final Object a;
    private final String b;

    public bzay(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzay)) {
            return false;
        }
        bzay bzayVar = (bzay) obj;
        return fdbq.f(this.a, bzayVar.a) && fdbq.f(this.b, bzayVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MergeWithExistingCmsEntity(localRow=" + this.a + ", cmsId=" + this.b + ")";
    }
}
