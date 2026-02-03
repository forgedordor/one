package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rlg implements rle {
    private final String a;

    public rlg(String str) {
        this.a = str;
    }

    @Override // defpackage.rle
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rlg) {
            return this.a.equals(((rlg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
