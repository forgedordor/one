package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngu extends dqws {
    public bngu(String[] strArr) {
        super("conversation_classifications_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bngt b() {
        l();
        return new bngt(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bngz.a;
        k(new bngx((bngy) function.apply(new bngy())));
    }
}
