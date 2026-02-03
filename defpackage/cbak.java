package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbak extends fcyz implements fdat {
    final /* synthetic */ cban a;
    final /* synthetic */ pzj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbak(fcxy fcxyVar, cban cbanVar, pzj pzjVar) {
        super(2, fcxyVar);
        this.a = cbanVar;
        this.b = pzjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        pzj pzjVar = this.b;
        boolean z = pzjVar.e;
        boolean z2 = true;
        if (z || pzjVar.c) {
            if (Build.VERSION.SDK_INT < 28) {
                ((ekrd) cban.a.j().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator", "evaluateBatteryConstraints", 62, "WorkQueueConstraintEvaluator.kt")).q("Android version is too low to check battery constraints");
            } else {
                Intent intentG = kxj.g(this.a.c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentG == null) {
                    ((ekrd) cban.a.j().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator", "evaluateBatteryConstraints", 74, "WorkQueueConstraintEvaluator.kt")).q("Android returned null for ACTION_BATTERY_CHANGED sticky intent");
                } else if ((intentG.getBooleanExtra("battery_low", false) && z) || (pzjVar.c && intentG.getIntExtra("plugged", 0) <= 0)) {
                }
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbak cbakVar = new cbak(fcxyVar, this.a, this.b);
        cbakVar.c = obj;
        return cbakVar;
    }
}
