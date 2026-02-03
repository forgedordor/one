package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvl implements djvm {
    private final fdae a;

    public djvl(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.dlhu
    public final fdae a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djvl) && fdbq.f(this.a, ((djvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TapToLoad(onClick=" + this.a + ")";
    }

    public djvl() {
        this(new fdae() { // from class: djvk
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        });
    }
}
