package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qfn implements Runnable {
    public final /* synthetic */ qfp a;

    public /* synthetic */ qfn(qfp qfpVar) {
        this.a = qfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qfp qfpVar = this.a;
        int i = qfpVar.g;
        qiw qiwVar = qfpVar.d;
        String str = qiwVar.a;
        if (i >= 2) {
            qas.c().a(qfp.a, "Already stopped work for ".concat(str));
            return;
        }
        qfpVar.g = 2;
        String strConcat = "Stopping work for WorkSpec ".concat(str);
        qas qasVarC = qas.c();
        String str2 = qfp.a;
        qasVarC.a(str2, strConcat);
        Context context = qfpVar.b;
        String str3 = qfk.a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        qfk.f(intent, qiwVar);
        Executor executor = qfpVar.i;
        qfu qfuVar = qfpVar.e;
        int i2 = qfpVar.c;
        executor.execute(new qfr(qfuVar, intent, i2));
        if (!qfuVar.d.f(str)) {
            qas.c().a(str2, a.a(str, "Processor does not have WorkSpec ", ". No need to reschedule"));
        } else {
            qas.c().a(str2, a.a(str, "WorkSpec ", " needs to be rescheduled"));
            executor.execute(new qfr(qfuVar, qfk.d(context, qiwVar), i2));
        }
    }
}
