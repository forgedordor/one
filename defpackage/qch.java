package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qch extends phj {
    public static final qch c = new qch();

    private qch() {
        super(11, 12);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
