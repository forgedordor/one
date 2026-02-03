package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgky extends fgle {
    public String a;
    private String b;

    public fgky() {
    }

    @Override // defpackage.fgle
    public final void d(fglq fglqVar) {
        fglqVar.h(this);
    }

    @Override // defpackage.fgle
    protected final String l() {
        return "destination=" + this.a + ", title=" + this.b;
    }

    public fgky(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
