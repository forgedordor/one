package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngp extends dqtb {
    public bngp() {
        super("conversation_classifications_table", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bngo b() {
        return new bngo(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = bngz.a;
        this.b = new bngx((bngy) function.apply(new bngy()));
    }
}
