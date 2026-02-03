package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccea extends dqtb {
    public ccea() {
        super("mls_epoch_records", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ccdz b() {
        return new ccdz(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = ccen.a;
        this.b = new ccel((ccem) function.apply(new ccem()));
    }
}
