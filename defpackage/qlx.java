package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlx extends fcyz implements fdat {
    int a;
    final /* synthetic */ qaq b;
    final /* synthetic */ qjn c;
    final /* synthetic */ qab d;
    final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlx(qaq qaqVar, qjn qjnVar, qab qabVar, Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qaqVar;
        this.c = qjnVar;
        this.d = qabVar;
        this.e = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qlx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            qaq qaqVar = this.b;
            ListenableFuture listenableFutureA = qaqVar.a();
            listenableFutureA.getClass();
            this.a = 1;
            obj = qfc.a(listenableFutureA, qaqVar, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        final qaa qaaVar = (qaa) obj;
        if (qaaVar == null) {
            throw new IllegalStateException("Worker was marked important (" + this.c.e + ") but did not provide ForegroundInfo");
        }
        qas.c().a(qly.a, "Updating notification for ".concat(String.valueOf(this.c.e)));
        qab qabVar = this.d;
        final Context context = this.e;
        final UUID uuidG = this.b.g();
        final qma qmaVar = (qma) qabVar;
        ListenableFuture listenableFutureA2 = qak.a(qmaVar.c.a, "setForegroundAsync", new fdae() { // from class: qlz
            @Override // defpackage.fdae
            public final Object invoke() {
                qaa qaaVar2;
                qma qmaVar2 = qmaVar;
                qjo qjoVar = qmaVar2.b;
                String string = uuidG.toString();
                qjn qjnVarB = qjoVar.b(string);
                if (qjnVarB == null || qjnVarB.d.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                qhx qhxVar = qmaVar2.a;
                synchronized (((qcu) qhxVar).j) {
                    qas.c();
                    Log.i(qcu.a, a.a(string, "Moving WorkSpec (", ") to the foreground"));
                    qfa qfaVar = (qfa) ((qcu) qhxVar).f.remove(string);
                    qaaVar2 = qaaVar;
                    if (qfaVar != null) {
                        if (((qcu) qhxVar).b == null) {
                            ((qcu) qhxVar).b = qlv.a(((qcu) qhxVar).c, "ProcessorForegroundLck");
                            ((qcu) qhxVar).b.acquire();
                        }
                        ((qcu) qhxVar).e.put(string, qfaVar);
                        Context context2 = ((qcu) qhxVar).c;
                        qiw qiwVarA = qfaVar.a();
                        int i2 = qia.k;
                        Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_START_FOREGROUND");
                        intent.putExtra("KEY_WORKSPEC_ID", qiwVarA.a);
                        intent.putExtra("KEY_GENERATION", qiwVarA.b);
                        intent.putExtra("KEY_NOTIFICATION_ID", qaaVar2.a);
                        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", qaaVar2.b);
                        intent.putExtra("KEY_NOTIFICATION", qaaVar2.c);
                        context2.startForegroundService(intent);
                    }
                }
                Context context3 = context;
                qiw qiwVarA2 = qkl.a(qjnVarB);
                int i3 = qia.k;
                Intent intent2 = new Intent(context3, (Class<?>) SystemForegroundService.class);
                intent2.setAction("ACTION_NOTIFY");
                intent2.putExtra("KEY_NOTIFICATION_ID", qaaVar2.a);
                intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", qaaVar2.b);
                intent2.putExtra("KEY_NOTIFICATION", qaaVar2.c);
                intent2.putExtra("KEY_WORKSPEC_ID", qiwVarA2.a);
                intent2.putExtra("KEY_GENERATION", qiwVarA2.b);
                context3.startService(intent2);
                return null;
            }
        });
        this.a = 2;
        Object objA = koo.a(listenableFutureA2, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qlx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
