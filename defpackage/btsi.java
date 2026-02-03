package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsi extends dqws {
    public btsi(String[] strArr) {
        super("restore_workflow_files", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btsh b() {
        l();
        return new btsh(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = btsn.a;
        k(new btsl((btsm) function.apply(new btsm())));
    }
}
