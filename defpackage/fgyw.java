package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyw extends fgzh {
    private static final long serialVersionUID = -1277262990243423062L;
    private byte[] a;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != null) {
            if (fgyz.a("multiline")) {
                stringBuffer.append("(\n");
                stringBuffer.append(fhaw.b(this.a, true));
            } else {
                stringBuffer.append(fhaw.a(this.a));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyw();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.a(this.a);
    }
}
