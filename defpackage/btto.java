package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btto extends dqws {
    public btto(String[] strArr) {
        super("restore_workflow_scratch_duplicates", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bttn b() {
        l();
        return new bttn(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bttr.a;
        k(new bttp((bttq) function.apply(new bttq())));
    }
}
