package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhv implements angp {
    private final String a;
    private final String b;

    public anhv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.angp
    public final String a() {
        return this.a;
    }

    @Override // defpackage.angp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        anhv anhvVar = obj instanceof anhv ? (anhv) obj : null;
        return fdbq.f(anhvVar != null ? anhvVar.a : null, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmotifyReactionV2(id=" + this.a + ", uri=" + this.b + ")";
    }
}
