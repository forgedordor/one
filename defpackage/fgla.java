package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgla extends fgle {
    public String a;
    private String b;

    public fgla() {
    }

    @Override // defpackage.fgle
    public final void d(fglq fglqVar) {
        fglqVar.i(this);
    }

    @Override // defpackage.fgle
    protected final String l() {
        return "destination=" + this.a + ", title=" + this.b;
    }

    public fgla(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
