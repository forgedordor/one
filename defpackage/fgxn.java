package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxn extends fgzh {
    private static final long serialVersionUID = -6349714958085750705L;
    private byte[] a;
    private byte[] b;
    private byte[] c;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.b, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.a, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgxn();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws NumberFormatException, fhao {
        this.b = fgxcVar.j();
        this.a = fgxcVar.j();
        this.c = fgxcVar.j();
        try {
            double d = Double.parseDouble(h(this.b, false));
            double d2 = Double.parseDouble(h(this.a, false));
            if (d < -90.0d || d > 90.0d) {
                StringBuffer stringBuffer = new StringBuffer("illegal longitude ");
                stringBuffer.append(d);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            if (d2 < -180.0d || d2 > 180.0d) {
                StringBuffer stringBuffer2 = new StringBuffer("illegal latitude ");
                stringBuffer2.append(d2);
                throw new IllegalArgumentException(stringBuffer2.toString());
            }
        } catch (IllegalArgumentException e) {
            throw new fhao(e.getMessage());
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.c(this.b);
        fgxeVar.c(this.a);
        fgxeVar.c(this.c);
    }
}
