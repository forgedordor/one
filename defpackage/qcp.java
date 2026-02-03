package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcp extends phj {
    public static final qcp c = new qcp();

    private qcp() {
        super(7, 8);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
