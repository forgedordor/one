package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diil implements diip {
    public final int a;
    public final int b;
    private final String c = null;
    private final fdap d = null;

    public diil(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.diip
    public final int a() {
        return this.b;
    }

    @Override // defpackage.diip
    public final int b() {
        return this.a;
    }

    @Override // defpackage.diip
    public final /* bridge */ /* synthetic */ diip c(int i, int i2) {
        return new diil(i, i2);
    }

    @Override // defpackage.diip
    public final String d() {
        return null;
    }

    @Override // defpackage.diip
    public final fdap e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diil)) {
            return false;
        }
        diil diilVar = (diil) obj;
        if (this.a != diilVar.a || this.b != diilVar.b) {
            return false;
        }
        String str = diilVar.c;
        if (!fdbq.f(null, null)) {
            return false;
        }
        fdap fdapVar = diilVar.d;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((this.a * 31) + this.b) * 961;
    }

    public final String toString() {
        return "CodeBlock(start=" + this.a + ", end=" + this.b + ", onClickLabel=null, onClick=null)";
    }
}
