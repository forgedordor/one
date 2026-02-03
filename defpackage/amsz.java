package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amsz extends amtr {
    private final String a;

    public amsz(String str) {
        this.a = str;
    }

    @Override // defpackage.amtr
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amtr) {
            return this.a.equals(((amtr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BreadcrumbBubbleContent{text=" + this.a + "}";
    }
}
