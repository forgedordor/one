package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qce extends pev {
    @Override // defpackage.pev
    public final void a(pjo pjoVar) {
        pjoVar.d();
        try {
            pjoVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - qdn.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            pjoVar.h();
        } finally {
            pjoVar.f();
        }
    }
}
