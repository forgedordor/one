package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqt extends dqws {
    public btqt(String[] strArr) {
        super("restore_workflow_executions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btqr b() {
        l();
        return new btqr(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = btqy.a;
        k(new btqw((btqx) function.apply(new btqx())));
    }
}
