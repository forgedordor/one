package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpjp extends dqtb {
    public bpjp() {
        super("events", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bpjz.a;
        this.b = new bpjx((bpjy) function.apply(new bpjy()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bpjo(this.a.a(), this.b);
    }
}
