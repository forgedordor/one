package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgwq implements fgwp {
    final int a;
    final fgyu b;
    final int c;
    final int d;

    public fgwq(fgyu fgyuVar, int i, fgzo fgzoVar, int i2, long j) {
        this.b = fgyuVar;
        this.a = i;
        long j2 = fgzoVar != null ? fgzoVar.b : 0L;
        this.c = i2;
        this.d = fgwr.a(j2, j);
    }

    @Override // defpackage.fgwp
    public final int a(int i) {
        return this.c - i;
    }

    @Override // defpackage.fgwp
    public final boolean b() {
        return ((int) (System.currentTimeMillis() / 1000)) >= this.d;
    }

    @Override // defpackage.fgwp
    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.a;
        if (i == 0) {
            StringBuffer stringBuffer2 = new StringBuffer("NXDOMAIN ");
            stringBuffer2.append(this.b);
            stringBuffer.append(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer("NXRRSET ");
            stringBuffer3.append(this.b);
            stringBuffer3.append(" ");
            stringBuffer3.append(fhag.a(i));
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(" cl = ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
