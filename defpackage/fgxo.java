package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgxo extends fgxh {
    private byte[] a;

    public fgxo(int i) {
        super(i);
    }

    @Override // defpackage.fgxh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(fhau.a(this.a));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    @Override // defpackage.fgxh
    public final void b(fgxc fgxcVar) {
        this.a = fgxcVar.h();
    }

    @Override // defpackage.fgxh
    public final void c(fgxe fgxeVar) {
        fgxeVar.a(this.a);
    }
}
