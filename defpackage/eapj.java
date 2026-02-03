package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eapj extends eatu {
    public easi a;
    public eary b;
    public easj c;
    private boolean d;
    private byte e;

    @Override // defpackage.eatu
    public final eatv a() {
        eary earyVar;
        easj easjVar;
        if (this.e == 1 && (earyVar = this.b) != null && (easjVar = this.c) != null) {
            return new earu(this.a, earyVar, easjVar, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" day");
        }
        if (this.c == null) {
            sb.append(" time");
        }
        if (this.e == 0) {
            sb.append(" truncated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eatu
    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
