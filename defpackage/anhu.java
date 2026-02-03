package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhu implements angp {
    private final dnvg a;
    private final String b;
    private final String c;

    public anhu(dnvg dnvgVar) {
        this.a = dnvgVar;
        this.b = dnvgVar.a;
        this.c = dnvgVar.b;
    }

    @Override // defpackage.angp
    public final String a() {
        return this.b;
    }

    @Override // defpackage.angp
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        anhu anhuVar = obj instanceof anhu ? (anhu) obj : null;
        return fdbq.f(anhuVar != null ? anhuVar.a.a : null, this.a.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmotifyReaction(customSticker=" + this.a + ")";
    }
}
