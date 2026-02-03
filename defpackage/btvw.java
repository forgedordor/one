package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvw extends dqws {
    public btvw(String[] strArr) {
        super("restore_workflow_scratch_timestamps", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btvv b() {
        l();
        return new btvv(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = btvz.a;
        k(new btvx((btvy) function.apply(new btvy())));
    }
}
