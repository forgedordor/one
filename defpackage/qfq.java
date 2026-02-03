package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfq implements Runnable {
    final /* synthetic */ qfu a;

    public qfq(qfu qfuVar) {
        this.a = qfuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qfu qfuVar;
        qft qftVar;
        List<qda> listD;
        qfu qfuVar2 = this.a;
        List list = qfuVar2.g;
        synchronized (list) {
            qfuVar2.h = (Intent) list.get(0);
        }
        qfu qfuVar3 = this.a;
        Intent intent = qfuVar3.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = qfuVar3.h.getIntExtra("KEY_START_ID", 0);
            qas qasVarC = qas.c();
            String str = qfu.a;
            qasVarC.a(str, "Processing command " + qfuVar3.h + ", " + intExtra);
            PowerManager.WakeLock wakeLockA = qlv.a(qfuVar3.b, action + " (" + intExtra + ")");
            try {
                qas.c().a(str, a.m(wakeLockA, action, "Acquiring operation wake lock (", ") "));
                wakeLockA.acquire();
                qfk qfkVar = qfuVar3.f;
                Intent intent2 = qfuVar3.h;
                String action2 = intent2.getAction();
                boolean z = false;
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    qas qasVarC2 = qas.c();
                    String str2 = qfk.a;
                    Objects.toString(intent2);
                    qasVarC2.a(str2, "Handling constraints changed ".concat(String.valueOf(intent2)));
                    String str3 = qfm.a;
                    Context context = qfkVar.b;
                    qee qeeVar = qfuVar3.e;
                    qgr qgrVar = new qgr(qeeVar.l);
                    List<qjn> listD2 = qeeVar.e.D().d();
                    int i = ConstraintProxy.a;
                    Iterator it = listD2.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        pzj pzjVar = ((qjn) it.next()).l;
                        z2 |= pzjVar.e;
                        z3 |= pzjVar.c;
                        z4 |= pzjVar.f;
                        z5 |= pzjVar.j != 1;
                        if (z2 && z3 && z4 && z5) {
                            break;
                        }
                    }
                    int i2 = ConstraintProxyUpdateReceiver.b;
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(listD2.size());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (qjn qjnVar : listD2) {
                        if (jCurrentTimeMillis >= qjnVar.a() && (!qjnVar.d() || qgrVar.b(qjnVar))) {
                            arrayList.add(qjnVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        qjn qjnVar2 = (qjn) arrayList.get(i3);
                        String str4 = qjnVar2.c;
                        Intent intentC = qfk.c(context, qkl.a(qjnVar2));
                        qas.c().a(qfm.a, a.a(str4, "Creating a delay_met command for workSpec with id (", ")"));
                        qfuVar3.j.d.execute(new qfr(qfuVar3, intentC, intExtra));
                    }
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    qas.c().a(qfk.a, "Handling reschedule " + intent2 + ", " + intExtra);
                    qfuVar3.e.p();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                        qas.c();
                        Log.e(qfk.a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                    } else if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                        qiw qiwVarE = qfk.e(intent2);
                        qas qasVarC3 = qas.c();
                        String str5 = qfk.a;
                        Objects.toString(qiwVarE);
                        qasVarC3.a(str5, "Handling schedule work for ".concat(qiwVarE.toString()));
                        WorkDatabase workDatabase = qfuVar3.e.e;
                        workDatabase.n();
                        try {
                            qjn qjnVarB = workDatabase.D().b(qiwVarE.a);
                            if (qjnVarB == null) {
                                qas.c();
                                Log.w(str5, a.h(qiwVarE, "Skipping scheduling ", " because it's no longer in the DB"));
                            } else if (qjnVarB.d.a()) {
                                qas.c();
                                Log.w(str5, a.h(qiwVarE, "Skipping scheduling ", "because it is finished."));
                            } else {
                                long jA = qjnVarB.a();
                                if (qjnVarB.d()) {
                                    qas.c().a(str5, "Opportunistically setting an alarm for " + qiwVarE + "at " + jA);
                                    Context context2 = qfkVar.b;
                                    qfj.b(context2, workDatabase, qiwVarE, jA);
                                    qfuVar3.j.d.execute(new qfr(qfuVar3, qfk.b(context2), intExtra));
                                } else {
                                    qas.c().a(str5, "Setting up Alarms for " + qiwVarE + "at " + jA);
                                    qfj.b(qfkVar.b, workDatabase, qiwVarE, jA);
                                }
                                workDatabase.q();
                            }
                            workDatabase.o();
                        } catch (Throwable th) {
                            workDatabase.o();
                            throw th;
                        }
                    } else if ("ACTION_DELAY_MET".equals(action2)) {
                        synchronized (qfkVar.d) {
                            qiw qiwVarE2 = qfk.e(intent2);
                            qas qasVarC4 = qas.c();
                            String str6 = qfk.a;
                            qasVarC4.a(str6, a.l(qiwVarE2, "Handing delay met for "));
                            Map map = qfkVar.c;
                            if (map.containsKey(qiwVarE2)) {
                                qas.c().a(str6, a.h(qiwVarE2, "WorkSpec ", " is is already being handled for ACTION_DELAY_MET"));
                            } else {
                                qfp qfpVar = new qfp(qfkVar.b, intExtra, qfuVar3, qfkVar.e.b(qiwVarE2));
                                map.put(qiwVarE2, qfpVar);
                                String str7 = qfpVar.d.a;
                                qfpVar.j = qlv.a(qfpVar.b, str7 + " (" + qfpVar.c + ")");
                                qas qasVarC5 = qas.c();
                                String str8 = qfp.a;
                                qasVarC5.a(str8, "Acquiring wakelock " + qfpVar.j + "for WorkSpec " + str7);
                                qfpVar.j.acquire();
                                qjn qjnVarB2 = qfpVar.e.e.e.D().b(str7);
                                if (qjnVarB2 == null) {
                                    qfpVar.h.execute(new qfn(qfpVar));
                                } else {
                                    boolean zD = qjnVarB2.d();
                                    qfpVar.k = zD;
                                    if (zD) {
                                        qfpVar.n = qgu.a(qfpVar.f, qjnVarB2, qfpVar.m, qfpVar);
                                    } else {
                                        qas.c().a(str8, "No constraints for ".concat(str7));
                                        qfpVar.h.execute(new qfo(qfpVar));
                                    }
                                }
                            }
                        }
                    } else if ("ACTION_STOP_WORK".equals(action2)) {
                        Bundle extras2 = intent2.getExtras();
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                            int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                            listD = new ArrayList(1);
                            qda qdaVarA = qfkVar.e.a(new qiw(string, i4));
                            if (qdaVarA != null) {
                                listD.add(qdaVarA);
                            }
                        } else {
                            listD = qfkVar.e.d(string);
                        }
                        for (qda qdaVar : listD) {
                            qas.c().a(qfk.a, "Handing stopWork work for ".concat(String.valueOf(string)));
                            qea.a(qfuVar3.k, qdaVar);
                            Context context3 = qfkVar.b;
                            WorkDatabase workDatabase2 = qfuVar3.e.e;
                            qiw qiwVar = qdaVar.a;
                            String str9 = qfj.a;
                            qiq qiqVarA = workDatabase2.A();
                            qio qioVarA = qip.a(qiqVarA, qiwVar);
                            if (qioVarA != null) {
                                qfj.a(context3, qiwVar, qioVarA.c);
                                qas.c().a(qfj.a, "Removing SystemIdInfo for workSpecId (" + qiwVar + ")");
                                int i5 = qiwVar.b;
                                String str10 = qiwVar.a;
                                pex pexVar = ((qiu) qiqVarA).a;
                                pexVar.m();
                                pfn pfnVar = ((qiu) qiqVarA).b;
                                pkl pklVarD = pfnVar.d();
                                pklVarD.g(1, str10);
                                pklVarD.e(2, i5);
                                try {
                                    pexVar.n();
                                    try {
                                        pklVarD.a();
                                        pexVar.q();
                                        pexVar.o();
                                        pfnVar.f(pklVarD);
                                    } finally {
                                    }
                                } catch (Throwable th2) {
                                    ((qiu) qiqVarA).b.f(pklVarD);
                                    throw th2;
                                }
                            }
                            boolean z6 = z;
                            qfuVar3.a(qiwVar, z6);
                            z = z6;
                        }
                    } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                        qiw qiwVarE3 = qfk.e(intent2);
                        boolean z7 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                        qas.c().a(qfk.a, "Handling onExecutionCompleted " + intent2 + ", " + intExtra);
                        qfkVar.a(qiwVarE3, z7);
                    } else {
                        qas.c();
                        String str11 = qfk.a;
                        Objects.toString(intent2);
                        Log.w(str11, "Ignoring intent ".concat(String.valueOf(intent2)));
                    }
                }
                qas.c().a(qfu.a, a.m(wakeLockA, action, "Releasing operation wake lock (", ") "));
                wakeLockA.release();
                qfuVar = this.a;
                qftVar = new qft(qfuVar);
            } catch (Throwable th3) {
                try {
                    qas.c();
                    Log.e(qfu.a, "Unexpected error in onHandleIntent", th3);
                    qas.c().a(qfu.a, a.m(wakeLockA, action, "Releasing operation wake lock (", ") "));
                    wakeLockA.release();
                    qfuVar = this.a;
                    qftVar = new qft(qfuVar);
                } catch (Throwable th4) {
                    qas.c().a(qfu.a, a.m(wakeLockA, action, "Releasing operation wake lock (", ") "));
                    wakeLockA.release();
                    qfu qfuVar4 = this.a;
                    qfuVar4.j.d.execute(new qft(qfuVar4));
                    throw th4;
                }
            }
            qfuVar.j.d.execute(qftVar);
        }
    }
}
