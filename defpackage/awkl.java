package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awkl extends dqws {
    public awkl(String[] strArr) {
        super("destinations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awkk b() {
        l();
        return new awkk(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = awko.a;
        k(new awkm((awkn) function.apply(new awkn())));
    }
}
