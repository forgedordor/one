package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmq extends dzms {
    public float a;
    public int b;
    public fcsu c;
    public byte d;
    public int e;
    private final ejwi f = ejud.a;

    @Override // defpackage.dzms
    public final dzmt a() {
        int i;
        if (this.d == 3 && (i = this.e) != 0) {
            return new dzmr(i, this.a, this.b, this.c, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.d & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzms
    public final dzms b(int i) {
        this.e = i;
        return this;
    }
}
