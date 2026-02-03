package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyp extends fgzh {
    private static final long serialVersionUID = -5165065768816265385L;
    private fgyu a;
    private fhah b;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (!this.b.b()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.b.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyp();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = new fgyu(fgxcVar);
        this.b = new fhah(fgxcVar);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.a.h(fgxeVar, null, false);
        this.b.a(fgxeVar);
    }
}
