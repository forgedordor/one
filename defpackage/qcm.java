package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcm extends phj {
    public static final qcm c = new qcm();

    private qcm() {
        super(3, 4);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
