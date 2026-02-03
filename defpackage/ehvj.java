package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvj extends ehvn {
    public String a;
    public evuh b;
    public ehvh c;
    private ekgb d;
    private Optional e = Optional.empty();

    @Override // defpackage.ehvn
    public final ehvo a() {
        evuh evuhVar;
        ehvh ehvhVar;
        if (this.d == null) {
            int i = ekgb.d;
            this.d = ekoe.a;
        }
        String str = this.a;
        if (str != null && (evuhVar = this.b) != null && (ehvhVar = this.c) != null) {
            return new ehvk(str, this.d, evuhVar, ehvhVar, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" schema");
        }
        if (this.c == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ehvn
    public final void b(lne lneVar) {
        this.e = Optional.of(lneVar);
    }
}
