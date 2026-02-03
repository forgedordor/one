package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqqz extends dqws {
    public bqqz(String[] strArr) {
        super("message_spam", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqqx b() {
        l();
        return new bqqx(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bqrg.a;
        k(new bqrc((bqrf) function.apply(new bqrf())));
    }
}
