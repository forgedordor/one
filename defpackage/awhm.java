package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awhm extends awho {
    private ekgp a;
    private boolean b;
    private byte c;

    @Override // defpackage.awho
    public final awhp a() {
        ekgp ekgpVar;
        if (this.c == 1 && (ekgpVar = this.a) != null) {
            return new awhn(ekgpVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" capabilities");
        }
        if (this.c == 0) {
            sb.append(" isValid");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.awho
    public final void b(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    @Override // defpackage.awho
    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
