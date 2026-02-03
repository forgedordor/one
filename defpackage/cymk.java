package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymk {
    public final cogw a;
    public final JobScheduler b;
    public final fduj c;
    public final fdpl d;
    public final fdpl e;
    private final Context f;
    private final cbmx g;
    private final fdjx h;
    private final fdpl i;
    private final fduj j;
    private final fdpl k;

    public cymk(Context context, cogw cogwVar, cbmx cbmxVar, fdjx fdjxVar) {
        context.getClass();
        cogwVar.getClass();
        cbmxVar.getClass();
        fdjxVar.getClass();
        this.f = context;
        this.a = cogwVar;
        this.g = cbmxVar;
        this.h = fdjxVar;
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        this.b = (JobScheduler) systemService;
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("PwqDebugUiDataService::workItemCounts");
        cbfdVarA.s();
        cbeg cbegVar = cbfi.c;
        cbfdVarA.c(cbegVar.f);
        cbfdVarA.n(new dqxm("COUNT(*)"), "count");
        cbfdVarA.w(cbegVar.f);
        fdpl fdplVarA = bmgj.a(cbfdVarA.b());
        fdus fdusVar = fdur.a;
        cyma cymaVar = new cyma(new cylx(fdtg.a(fdplVarA, fdjxVar, fdusVar, 1)));
        this.i = cymaVar;
        fduf fdufVar = cbmxVar.d;
        cbmq cbmqVar = new cbmq(null);
        int i = fdsn.a;
        fduj fdujVarA = fdtg.a(new fdua(fdqq.a(new fdwg(cbmqVar, fdufVar)), cymaVar, new cylt(null)), fdjxVar, fdusVar, 1);
        this.c = fdujVarA;
        String[] strArr = cbjq.a;
        cbjl cbjlVar = new cbjl(cbjq.a);
        cbjlVar.A("PwqDebugUiDataService::wqwmRowsQuery");
        cbjlVar.s();
        fduj fdujVarA2 = fdtg.a(bmgj.a(cbjlVar.b()), fdjxVar, fdusVar, 1);
        this.j = fdujVarA2;
        long j = fdhi.a;
        cymg cymgVar = new cymg(new cymd(new fdui(new cyls(fdhk.f(5, fdhl.d), null)), this), this);
        this.k = cymgVar;
        this.d = fdud.a(fdujVarA, fdujVarA2, cymgVar, new cylu(this, null));
        this.e = new fdto(new ArrayList(), new cymj(new fdug(cbmxVar.e), this), new cylq(null));
    }
}
