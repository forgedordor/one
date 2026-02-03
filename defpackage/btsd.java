package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsd extends dqtb {
    public btsd() {
        super("restore_workflow_files", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = btsn.a;
        this.b = new btsl((btsm) function.apply(new btsm()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new btsc(this.a.a(), this.b);
    }
}
