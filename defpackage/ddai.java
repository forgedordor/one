package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddai extends ddak {
    private final int a;

    public ddai(int i) {
        this.a = i;
    }

    @Override // defpackage.ddak
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ddak) && this.a == ((ddak) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }
}
