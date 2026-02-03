package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbb extends dsbh {
    public String a;
    public evhv b;
    public String c;
    private ethk d;
    private long e;
    private ekgp f;
    private byte g;

    @Override // defpackage.dsbh
    public final dsbi a() {
        if (this.f == null) {
            this.f = ekoj.a;
        }
        if (this.g == 1 && this.d != null) {
            return new dsbc(this.a, this.d, this.e, this.f, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" promotion");
        }
        if (this.g == 0) {
            sb.append(" triggeringEventTimeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dsbh
    public final void b(Map map) {
        this.f = ekgp.j(map);
    }

    @Override // defpackage.dsbh
    public final void c(ethk ethkVar) {
        if (ethkVar == null) {
            throw new NullPointerException("Null promotion");
        }
        this.d = ethkVar;
    }

    @Override // defpackage.dsbh
    public final void d(long j) {
        this.e = j;
        this.g = (byte) 1;
    }
}
