package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglo extends fgle {
    public String a;

    public fglo() {
    }

    @Override // defpackage.fgle
    public final void d(fglq fglqVar) {
        fglqVar.o(this);
    }

    @Override // defpackage.fgle
    protected final String l() {
        return "literal=".concat(String.valueOf(this.a));
    }

    public fglo(String str) {
        this.a = str;
    }
}
