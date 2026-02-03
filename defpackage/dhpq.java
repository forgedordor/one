package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpq implements dhri {
    public final qbr a;
    private final ekrg b;

    public dhpq(Context context, Optional optional) {
        context.getClass();
        optional.isPresent();
        this.a = qbq.a(context);
        this.b = ekrg.c("com/google/android/libraries/abuse/hades/moirai/download/DefaultWorkManagerWrapper");
    }

    @Override // defpackage.dhri
    public final Object a(String str, qav qavVar, pzz pzzVar, boolean z, fcxy fcxyVar) {
        ((ekrd) this.b.h().h("com/google/android/libraries/abuse/hades/moirai/download/DefaultWorkManagerWrapper", "beginUniqueWork", 62, "WorkManagerWrapper.kt")).t("PersephoneDownloadWorker is scheduled for request %s.", qavVar.a);
        qbk qbkVarJ = this.a.j(str, pzzVar, qavVar);
        qbkVarJ.a();
        if (z) {
            qdl qdlVar = (qdl) qbkVarJ;
            qee qeeVar = qdlVar.a;
            qjo qjoVarD = qeeVar.e.D();
            List list = qdlVar.f;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
            int size = list.size();
            pii.a(sb, size);
            sb.append(")");
            pff pffVarA = pff.a(sb.toString(), size);
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                pffVarA.g(i, (String) it.next());
                i++;
            }
            qkk qkkVar = (qkk) qjoVarD;
            pdz pdzVarB = qkkVar.a.b();
            String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
            qjz qjzVar = new qjz(qkkVar, pffVarA);
            pdzVarB.b.f(strArr);
            pdq pdqVar = pdzVarB.g;
            pek pekVar = new pek(pdqVar.a, pdqVar, strArr, qjzVar);
            akv akvVar = qjn.b;
            qmg qmgVar = qeeVar.m;
            Object obj = new Object();
            lvx lvxVar = new lvx();
            lvxVar.p(pekVar, new qlg(qmgVar, obj, akvVar, lvxVar));
            Object objA = fdjy.a(new dhrm(lvxVar, new dhpp(null), null), fcxyVar);
            if (objA == fcyl.a) {
                return objA;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.dhri
    public final Object b(String str) {
        this.a.b(str);
        return fctx.a;
    }
}
