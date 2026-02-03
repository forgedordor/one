package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqch extends dqws {
    public bqch(String[] strArr) {
        super("message_classifications_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqcg b() {
        l();
        return new bqcg(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bqcn.a;
        k(new bqci((bqcm) function.apply(new bqcm())));
    }
}
