package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btys extends dqws {
    public btys(String[] strArr) {
        super("self_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btyr b() {
        l();
        return new btyr(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = btyx.a;
        k(new btyv((btyw) function.apply(new btyw())));
    }
}
