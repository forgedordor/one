package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtzb extends dtzj {
    private boolean a;
    private ekhx b;
    private byte c;

    @Override // defpackage.dtzj
    public final dtzl a() {
        if (this.b == null) {
            this.b = ekon.a;
        }
        if (this.c == 1) {
            return new dtzc(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    @Override // defpackage.dtzj
    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) 1;
    }

    @Override // defpackage.dtzj
    public final void c(Set set) {
        this.b = ekhx.o(set);
    }
}
