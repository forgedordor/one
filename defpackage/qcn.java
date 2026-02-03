package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcn extends phj {
    public static final qcn c = new qcn();

    private qcn() {
        super(4, 5);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        pjoVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
