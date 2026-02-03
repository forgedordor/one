package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccei extends dqws {
    public ccei(String[] strArr) {
        super("mls_epoch_records", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cceg b() {
        l();
        return new cceg(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = ccen.a;
        k(new ccel((ccem) function.apply(new ccem())));
    }
}
