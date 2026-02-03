package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnx extends dwrd {
    private long a;
    private ekgb b;
    private byte c;

    @Override // defpackage.dwrd
    public final dwre a() {
        ekgb ekgbVar;
        if (this.c == 1 && (ekgbVar = this.b) != null) {
            return new dwny(this.a, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" lastCapabilitiesReportTimeMs");
        }
        if (this.b == null) {
            sb.append(" lastReportedCapabilities");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrd
    public final void b(long j) {
        this.a = j;
        this.c = (byte) 1;
    }

    @Override // defpackage.dwrd
    public final void c(List list) {
        this.b = ekgb.n(list);
    }
}
