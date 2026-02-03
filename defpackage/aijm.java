package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aijm extends fcyz implements fdat {
    int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ BugleAlarmReceiver c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aijm(fcxy fcxyVar, Intent intent, BugleAlarmReceiver bugleAlarmReceiver) {
        super(2, fcxyVar);
        this.b = intent;
        this.c = bugleAlarmReceiver;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aijm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Intent intent = this.b;
            if (!fdbq.f(intent.getAction(), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM")) {
                ((ekrd) BugleAlarmReceiver.a.j().h("com/google/android/apps/messaging/shared/alarm/BugleAlarmReceiver$doInBackgroundAsync$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 64, "BugleAlarmReceiver.kt")).q("Unexpected intent action sent to BugleAlarmReceiver");
                return fctx.a;
            }
            BugleAlarmReceiver bugleAlarmReceiver = this.c;
            fcsu fcsuVar = bugleAlarmReceiver.c;
            if (fcsuVar == null) {
                fdbq.c("bugleAlarmExecutor");
                fcsuVar = null;
            }
            aijl aijlVar = (aijl) fcsuVar.b();
            this.a = 1;
            String stringExtra = intent.getStringExtra("com.google.android.apps.messaging.shared.alarm.task");
            if (stringExtra == null) {
                throw new IllegalArgumentException("Bugle Alarm: no task ID provided in Intent");
            }
            aijx aijxVar = (aijx) aijlVar.a.get(stringExtra);
            if (aijxVar == null) {
                throw new IllegalStateException("Bugle Alarm: no ScheduledTask registered for the taskId ".concat(stringExtra));
            }
            Object objA = aijxVar.a(intent, bugleAlarmReceiver, this);
            if (objA != fcylVar) {
                objA = fctx.a;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aijm aijmVar = new aijm(fcxyVar, this.b, this.c);
        aijmVar.d = obj;
        return aijmVar;
    }
}
