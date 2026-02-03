package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qco extends phj {
    public static final qco c = new qco();

    private qco() {
        super(6, 7);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
