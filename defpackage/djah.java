package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djah {
    public final String a;
    public final boolean b;
    public final fdap c;
    public final boolean d;

    public djah() {
        this(false, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djah)) {
            return false;
        }
        djah djahVar = (djah) obj;
        return fdbq.f(this.a, djahVar.a) && this.b == djahVar.b && fdbq.f(this.c, djahVar.c) && this.d == djahVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + djaf.a(this.b)) * 31) + this.c.hashCode()) * 31) + djaf.a(this.d);
    }

    public final String toString() {
        return "CircleCheckboxUiData(contentDescription=" + this.a + ", isChecked=" + this.b + ", onCheckedChange=" + this.c + ", isTalkbackTarget=" + this.d + ")";
    }

    public djah(String str, boolean z, fdap fdapVar, boolean z2) {
        fdapVar.getClass();
        this.a = str;
        this.b = z;
        this.c = fdapVar;
        this.d = z2;
    }

    public /* synthetic */ djah(boolean z, fdap fdapVar, int i) {
        this(null, z & ((i & 2) == 0), (i & 4) != 0 ? new fdap() { // from class: djag
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                return fctx.a;
            }
        } : fdapVar, true);
    }
}
