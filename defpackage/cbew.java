package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbew extends dqtb {
    public cbew() {
        super("work_queue", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbev b() {
        return new cbev(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = cbfi.a;
        this.b = new cbfg((cbfh) function.apply(new cbfh()));
    }
}
