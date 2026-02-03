package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bptj extends dqws {
    public bptj(String[] strArr) {
        super("lighter_conversations_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpti b() {
        l();
        return new bpti(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bpto.a;
        k(new bptm((bptn) function.apply(new bptn())));
    }
}
