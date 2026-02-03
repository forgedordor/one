package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axem extends dqws {
    public axem(String[] strArr) {
        super("subscriptions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axel b() {
        l();
        return new axel(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = axer.a;
        k(new axep((axeq) function.apply(new axeq())));
    }
}
