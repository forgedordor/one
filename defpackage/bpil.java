package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpil extends dqws {
    public bpil(String[] strArr) {
        super("etouffee_rcs_metadata", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpik b() {
        l();
        return new bpik(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bpio.a;
        k(new bpim((bpin) function.apply(new bpin())));
    }
}
