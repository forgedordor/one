package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmqr extends dqws {
    public bmqr(String[] strArr) {
        super("cms_dead_letter_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmqq b() {
        l();
        return new bmqq(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bmqy.a;
        k(new bmqu((bmqx) function.apply(new bmqx())));
    }
}
