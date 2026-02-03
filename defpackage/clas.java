package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clas implements cldx {
    static final cczv a = cdag.h(cdag.b, "run_reverse_sync_after_heuristics_in_oobe_permissions_handler", false);
    private static final cqce b = cqce.g("Bugle", "BootAndPackageReplacedReceiver");
    private final Context c;
    private final crqv d;
    private final crma e;
    private final cauu f;
    private final fcsu g;
    private final fcsu h;
    private final ayjj i;

    public clas(Context context, crqv crqvVar, crma crmaVar, ayjj ayjjVar, cauu cauuVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = context;
        this.d = crqvVar;
        this.e = crmaVar;
        this.i = ayjjVar;
        this.f = cauuVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
    }

    private final void d(boolean z) {
        this.i.a(z).j();
        if (craf.j(this.c)) {
            this.f.a();
        }
        e(false);
    }

    private final void e(boolean z) {
        this.d.g("pending_tasks_after_reboot", z);
    }

    @Override // defpackage.cldx
    public final void a() {
        if (this.d.q("pending_tasks_after_reboot", false)) {
            b.p("after SMS permission granted, run pending tasks");
            d(true);
        }
    }

    @Override // defpackage.cldx
    public final void b() {
        if (this.d.q("pending_tasks_after_reboot", false)) {
            d(false);
        }
    }

    @Override // defpackage.cldx
    public final void c() {
        if (!this.e.p()) {
            b.p("not running oobe tasks, no sms permission");
            e(true);
            return;
        }
        Optional optionalA = ((cnoy) this.h.b()).a(emjt.OOBE_PERMISSIONS_HANDLER);
        if (((Boolean) a.e()).booleanValue()) {
            if (optionalA.isPresent() && ((Boolean) optionalA.get()).booleanValue()) {
                b.p("Not starting oobe tasks immediately. Postponing it after reverse sync and starting the reverse sync immediately. Has permissions, but wipeout was detected");
                ((cnod) this.g.b()).a();
                e(true);
                return;
            }
            b.m("Wipeout was not detected in OobePermisionsHandler");
        }
        if (((cnod) this.g.b()).d()) {
            b.p("Not running oobe tasks, has permissions, but reverse sync is in progress. Oobe task will run after reverse sync completes.");
            e(true);
        } else {
            b.p("run post-reboot oobe tasks");
            d(false);
        }
    }
}
