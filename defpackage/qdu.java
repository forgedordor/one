package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdu extends phj {
    public qdu() {
        super(18, 19);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
