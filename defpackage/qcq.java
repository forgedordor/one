package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcq extends phj {
    public static final qcq c = new qcq();

    private qcq() {
        super(8, 9);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
