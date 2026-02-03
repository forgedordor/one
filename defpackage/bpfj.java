package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpfj extends dqws {
    public bpfj(String[] strArr) {
        super("emergency_sessions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpfi b() {
        l();
        return new bpfi(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bpfo.a;
        k(new bpfm((bpfn) function.apply(new bpfn())));
    }
}
