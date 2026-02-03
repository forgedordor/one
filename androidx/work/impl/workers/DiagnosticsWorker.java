package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.pex;
import defpackage.pff;
import defpackage.phm;
import defpackage.phn;
import defpackage.pza;
import defpackage.pzj;
import defpackage.pzs;
import defpackage.qao;
import defpackage.qap;
import defpackage.qas;
import defpackage.qbf;
import defpackage.qbj;
import defpackage.qbo;
import defpackage.qee;
import defpackage.qiq;
import defpackage.qiy;
import defpackage.qjn;
import defpackage.qjo;
import defpackage.qkk;
import defpackage.qkn;
import defpackage.qkr;
import defpackage.qlh;
import defpackage.qmu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final qap c() throws Throwable {
        pff pffVar;
        qiq qiqVar;
        qiy qiyVar;
        qkn qknVar;
        qee qeeVarM = qee.m(this.a);
        WorkDatabase workDatabase = qeeVarM.e;
        workDatabase.getClass();
        qjo qjoVarD = workDatabase.D();
        qiy qiyVarB = workDatabase.B();
        qkn qknVarE = workDatabase.E();
        qiq qiqVarA = workDatabase.A();
        qbj qbjVar = qeeVarM.d.l;
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        pff pffVarA = pff.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        pffVarA.e(1, jCurrentTimeMillis);
        pex pexVar = ((qkk) qjoVarD).a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            int iB = phm.b(cursorA, "id");
            int iB2 = phm.b(cursorA, "state");
            int iB3 = phm.b(cursorA, "worker_class_name");
            int iB4 = phm.b(cursorA, "input_merger_class_name");
            int iB5 = phm.b(cursorA, "input");
            int iB6 = phm.b(cursorA, "output");
            int iB7 = phm.b(cursorA, "initial_delay");
            int iB8 = phm.b(cursorA, "interval_duration");
            int iB9 = phm.b(cursorA, "flex_duration");
            int iB10 = phm.b(cursorA, "run_attempt_count");
            int iB11 = phm.b(cursorA, "backoff_policy");
            pffVar = pffVarA;
            try {
                int iB12 = phm.b(cursorA, "backoff_delay_duration");
                int iB13 = phm.b(cursorA, "last_enqueue_time");
                int iB14 = phm.b(cursorA, "minimum_retention_duration");
                int iB15 = phm.b(cursorA, "schedule_requested_at");
                int iB16 = phm.b(cursorA, "run_in_foreground");
                int iB17 = phm.b(cursorA, "out_of_quota_policy");
                int iB18 = phm.b(cursorA, "period_count");
                int iB19 = phm.b(cursorA, "generation");
                int iB20 = phm.b(cursorA, "next_schedule_time_override");
                int iB21 = phm.b(cursorA, "next_schedule_time_override_generation");
                int iB22 = phm.b(cursorA, "stop_reason");
                int iB23 = phm.b(cursorA, "trace_tag");
                int iB24 = phm.b(cursorA, "backoff_on_system_interruptions");
                int iB25 = phm.b(cursorA, "required_network_type");
                int iB26 = phm.b(cursorA, "required_network_request");
                int iB27 = phm.b(cursorA, "requires_charging");
                int iB28 = phm.b(cursorA, "requires_device_idle");
                int iB29 = phm.b(cursorA, "requires_battery_not_low");
                int iB30 = phm.b(cursorA, "requires_storage_not_low");
                int iB31 = phm.b(cursorA, "trigger_content_update_delay");
                int iB32 = phm.b(cursorA, "trigger_max_content_delay");
                int iB33 = phm.b(cursorA, "content_uri_triggers");
                int i = iB14;
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                while (cursorA.moveToNext()) {
                    String string = cursorA.getString(iB);
                    qbo qboVarF = qkr.f(cursorA.getInt(iB2));
                    String string2 = cursorA.getString(iB3);
                    String string3 = cursorA.getString(iB4);
                    pzs pzsVarC = pzs.c(cursorA.getBlob(iB5));
                    pzs pzsVarC2 = pzs.c(cursorA.getBlob(iB6));
                    long j = cursorA.getLong(iB7);
                    long j2 = cursorA.getLong(iB8);
                    long j3 = cursorA.getLong(iB9);
                    int i2 = cursorA.getInt(iB10);
                    pza pzaVarD = qkr.d(cursorA.getInt(iB11));
                    long j4 = cursorA.getLong(iB12);
                    long j5 = cursorA.getLong(iB13);
                    int i3 = i;
                    long j6 = cursorA.getLong(i3);
                    int i4 = iB;
                    int i5 = iB15;
                    long j7 = cursorA.getLong(i5);
                    iB15 = i5;
                    int i6 = iB16;
                    boolean z = cursorA.getInt(i6) != 0;
                    iB16 = i6;
                    int i7 = iB17;
                    qbf qbfVarE = qkr.e(cursorA.getInt(i7));
                    iB17 = i7;
                    int i8 = iB18;
                    int i9 = cursorA.getInt(i8);
                    iB18 = i8;
                    int i10 = iB19;
                    int i11 = cursorA.getInt(i10);
                    iB19 = i10;
                    int i12 = iB20;
                    long j8 = cursorA.getLong(i12);
                    iB20 = i12;
                    int i13 = iB21;
                    int i14 = cursorA.getInt(i13);
                    iB21 = i13;
                    int i15 = iB22;
                    int i16 = cursorA.getInt(i15);
                    iB22 = i15;
                    int i17 = iB23;
                    Boolean boolValueOf = null;
                    String string4 = cursorA.isNull(i17) ? null : cursorA.getString(i17);
                    iB23 = i17;
                    int i18 = iB24;
                    Integer numValueOf = cursorA.isNull(i18) ? null : Integer.valueOf(cursorA.getInt(i18));
                    if (numValueOf != null) {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    iB24 = i18;
                    int i19 = iB25;
                    Boolean bool = boolValueOf;
                    int iL = qkr.l(cursorA.getInt(i19));
                    iB25 = i19;
                    int i20 = iB26;
                    qlh qlhVarG = qkr.g(cursorA.getBlob(i20));
                    iB26 = i20;
                    int i21 = iB27;
                    boolean z2 = cursorA.getInt(i21) != 0;
                    iB27 = i21;
                    int i22 = iB28;
                    boolean z3 = cursorA.getInt(i22) != 0;
                    iB28 = i22;
                    int i23 = iB29;
                    boolean z4 = cursorA.getInt(i23) != 0;
                    iB29 = i23;
                    int i24 = iB30;
                    boolean z5 = cursorA.getInt(i24) != 0;
                    iB30 = i24;
                    int i25 = iB31;
                    long j9 = cursorA.getLong(i25);
                    iB31 = i25;
                    int i26 = iB32;
                    long j10 = cursorA.getLong(i26);
                    iB32 = i26;
                    int i27 = iB33;
                    iB33 = i27;
                    arrayList.add(new qjn(string, qboVarF, string2, string3, pzsVarC, pzsVarC2, j, j2, j3, new pzj(qlhVarG, iL, z2, z3, z4, z5, j9, j10, qkr.h(cursorA.getBlob(i27))), i2, pzaVarD, j4, j5, j6, j7, z, qbfVarE, i9, i11, j8, i14, i16, string4, bool));
                    iB = i4;
                    i = i3;
                }
                cursorA.close();
                pffVar.j();
                List listC = qjoVarD.c();
                List listK = qjoVarD.k();
                if (arrayList.isEmpty()) {
                    qiqVar = qiqVarA;
                    qiyVar = qiyVarB;
                    qknVar = qknVarE;
                } else {
                    qas.c();
                    String str = qmu.a;
                    Log.i(str, "Recently completed work:\n\n");
                    qas.c();
                    qiqVar = qiqVarA;
                    qiyVar = qiyVarB;
                    qknVar = qknVarE;
                    Log.i(str, qmu.a(qiyVar, qknVar, qiqVar, arrayList));
                }
                if (!listC.isEmpty()) {
                    qas.c();
                    String str2 = qmu.a;
                    Log.i(str2, "Running work:\n\n");
                    qas.c();
                    Log.i(str2, qmu.a(qiyVar, qknVar, qiqVar, listC));
                }
                if (!listK.isEmpty()) {
                    qas.c();
                    String str3 = qmu.a;
                    Log.i(str3, "Enqueued work:\n\n");
                    qas.c();
                    Log.i(str3, qmu.a(qiyVar, qknVar, qiqVar, listK));
                }
                return new qao();
            } catch (Throwable th) {
                th = th;
                cursorA.close();
                pffVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pffVar = pffVarA;
        }
    }
}
