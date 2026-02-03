package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqcc extends dqtb {
    public bqcc() {
        super("message_classifications_table", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqcb b() {
        return new bqcb(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = bqcn.a;
        this.b = new bqci((bqcm) function.apply(new bqcm()));
    }
}
