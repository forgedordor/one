package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwao extends bwaq {
    private final atav a;

    public bwao(atav atavVar) {
        this.a = atavVar;
    }

    @Override // defpackage.bwaq, defpackage.bwjy
    public final atav a() {
        return this.a;
    }

    @Override // defpackage.bwjy
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bwjy) {
            bwjy bwjyVar = (bwjy) obj;
            if (bwjyVar.b() == 1 && this.a.equals(bwjyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResultOrSkipped{result=" + this.a.toString() + "}";
    }
}
