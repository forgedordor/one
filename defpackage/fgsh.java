package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsh {
    private final String a;
    private final String b;

    public fgsh(fgsd fgsdVar, String str) {
        fgsdVar.d();
        this.a = fgsdVar.m();
        this.b = str;
    }

    public final String toString() {
        return "<" + this.a + ">: " + this.b;
    }

    public fgsh(fgsd fgsdVar, String str, Object... objArr) {
        fgsdVar.d();
        this.a = fgsdVar.m();
        this.b = String.format(str, objArr);
    }
}
