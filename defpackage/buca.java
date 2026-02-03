package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buca extends dqws {
    public buca(String[] strArr) {
        super("settings", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bubz b() {
        l();
        return new bubz(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bucf.a;
        k(new bucd((buce) function.apply(new buce())));
    }
}
