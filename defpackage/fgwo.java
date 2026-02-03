package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgwo extends fgze implements fgwp {
    private static final long serialVersionUID = 5971755205903597024L;
    final int a;
    final int b;

    public fgwo(fgze fgzeVar, int i, long j) {
        super(fgzeVar);
        this.a = i;
        this.b = fgwr.a(fgzeVar.e(), j);
    }

    @Override // defpackage.fgwp
    public final int a(int i) {
        return this.a - i;
    }

    @Override // defpackage.fgwp
    public final boolean b() {
        return ((int) (System.currentTimeMillis() / 1000)) >= this.b;
    }

    @Override // defpackage.fgze
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" cl = ");
        stringBuffer.append(this.a);
        return stringBuffer.toString();
    }
}
