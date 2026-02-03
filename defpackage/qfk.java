package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfk implements qcg {
    public static final String a = qas.d("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final qdd e;

    public qfk(Context context, qdd qddVar) {
        this.b = context;
        this.e = qddVar;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, qiw qiwVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, qiwVar);
        return intent;
    }

    static Intent d(Context context, qiw qiwVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, qiwVar);
        return intent;
    }

    static qiw e(Intent intent) {
        return new qiw(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, qiw qiwVar) {
        intent.putExtra("KEY_WORKSPEC_ID", qiwVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", qiwVar.b);
    }

    @Override // defpackage.qcg
    public final void a(qiw qiwVar, boolean z) {
        synchronized (this.d) {
            qfp qfpVar = (qfp) this.c.remove(qiwVar);
            this.e.a(qiwVar);
            if (qfpVar != null) {
                qas qasVarC = qas.c();
                String str = qfp.a;
                StringBuilder sb = new StringBuilder("onExecuted ");
                qiw qiwVar2 = qfpVar.d;
                sb.append(qiwVar2);
                sb.append(", ");
                sb.append(z);
                qasVarC.a(str, sb.toString());
                qfpVar.a();
                if (z) {
                    qfpVar.i.execute(new qfr(qfpVar.e, d(qfpVar.b, qiwVar2), qfpVar.c));
                }
                if (qfpVar.k) {
                    qfpVar.i.execute(new qfr(qfpVar.e, b(qfpVar.b), qfpVar.c));
                }
            }
        }
    }
}
