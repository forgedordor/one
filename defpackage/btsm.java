package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsm extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new btsl(this);
    }

    public final void b(btsp btspVar) {
        ap(new dqty("restore_workflow_files.file_type", 1, Integer.valueOf(btspVar == null ? 0 : btspVar.ordinal())));
    }

    public final void c(long j) {
        ap(new dqty("restore_workflow_files.workflow_execution_id", 1, Long.valueOf(j)));
    }
}
