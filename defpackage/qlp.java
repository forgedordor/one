package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlp extends fdbr implements fdap {
    public qlp() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WorkDatabase workDatabase = (WorkDatabase) obj;
        workDatabase.getClass();
        akv akvVar = qjn.b;
        qjo qjoVarD = workDatabase.D();
        pff pffVarA = pff.a("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        pffVarA.g(1, "com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim");
        qkk qkkVar = (qkk) qjoVarD;
        pex pexVar = qkkVar.a;
        pexVar.m();
        pexVar.n();
        try {
            Cursor cursorA = phn.a(pexVar, pffVarA, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorA.moveToNext()) {
                    String string = cursorA.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorA.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorA.moveToPosition(-1);
                ((qkk) qjoVarD).o(map);
                ((qkk) qjoVarD).n(map2);
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                while (cursorA.moveToNext()) {
                    String string3 = cursorA.getString(0);
                    qbo qboVarF = qkr.f(cursorA.getInt(1));
                    pzs pzsVarC = pzs.c(cursorA.getBlob(2));
                    int i = cursorA.getInt(3);
                    int i2 = cursorA.getInt(4);
                    arrayList.add(new qjm(string3, qboVarF, pzsVarC, cursorA.getLong(14), cursorA.getLong(15), cursorA.getLong(16), new pzj(qkr.g(cursorA.getBlob(6)), qkr.l(cursorA.getInt(5)), cursorA.getInt(7) != 0, cursorA.getInt(8) != 0, cursorA.getInt(9) != 0, cursorA.getInt(10) != 0, cursorA.getLong(11), cursorA.getLong(12), qkr.h(cursorA.getBlob(13))), i, qkr.d(cursorA.getInt(17)), cursorA.getLong(18), cursorA.getLong(19), cursorA.getInt(20), i2, cursorA.getLong(21), cursorA.getInt(22), (ArrayList) map.get(cursorA.getString(0)), (ArrayList) map2.get(cursorA.getString(0))));
                }
                pexVar.q();
                pexVar.o();
                Object objA = akvVar.a(arrayList);
                objA.getClass();
                return objA;
            } finally {
                cursorA.close();
                pffVarA.j();
            }
        } catch (Throwable th) {
            qkkVar.a.o();
            throw th;
        }
    }
}
