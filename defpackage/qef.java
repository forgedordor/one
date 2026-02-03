package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class qef extends fdbo implements fdax {
    public static final qef a = new qef();

    public qef() {
        super(6, qeg.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        pzd pzdVar = (pzd) obj2;
        qmg qmgVar = (qmg) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        qhw qhwVar = (qhw) obj5;
        qcu qcuVar = (qcu) obj6;
        context.getClass();
        pzdVar.getClass();
        qmgVar.getClass();
        workDatabase.getClass();
        qhwVar.getClass();
        qcuVar.getClass();
        String str = qcz.a;
        qfx qfxVar = new qfx(context, workDatabase, pzdVar);
        qli.a(context, SystemJobService.class, true);
        qas.c().a(qcz.a, "Created SystemJobScheduler and enabled SystemJobService");
        return fcva.g(qfxVar, new qfg(context, pzdVar, qhwVar, qcuVar, new qec(qcuVar, qmgVar), qmgVar));
    }
}
