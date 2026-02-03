package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcz {
    public static final String a = qas.d("Schedulers");

    public static void a(pzd pzdVar, WorkDatabase workDatabase, List list) {
        pff pffVar;
        pff pffVar2;
        Boolean boolValueOf;
        if (list == null || list.size() == 0) {
            return;
        }
        qjo qjoVarD = workDatabase.D();
        workDatabase.n();
        try {
            pex pexVar = ((qkk) qjoVarD).a;
            pff pffVarA = pff.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
            pexVar.m();
            Cursor cursorA = phn.a(pexVar, pffVarA, false);
            try {
                int iB = phm.b(cursorA, "id");
                pffVar = pffVarA;
                try {
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
                    int i = iB19;
                    ArrayList arrayList = new ArrayList(cursorA.getCount());
                    while (true) {
                        Boolean boolValueOf2 = null;
                        if (!cursorA.moveToNext()) {
                            break;
                        }
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
                        int i3 = iB14;
                        long j6 = cursorA.getLong(i3);
                        int i4 = iB5;
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
                        int i10 = i;
                        int i11 = cursorA.getInt(i10);
                        i = i10;
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
                        String string4 = cursorA.isNull(i17) ? null : cursorA.getString(i17);
                        iB23 = i17;
                        int i18 = iB24;
                        Integer numValueOf = cursorA.isNull(i18) ? null : Integer.valueOf(cursorA.getInt(i18));
                        if (numValueOf != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iB24 = i18;
                        int i19 = iB25;
                        Boolean bool = boolValueOf2;
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
                        iB5 = i4;
                        iB14 = i3;
                    }
                    cursorA.close();
                    pffVar.j();
                    qbj qbjVar = pzdVar.l;
                    b(qjoVarD, arrayList);
                    int i28 = pzdVar.k;
                    pff pffVarA2 = pff.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                    pffVarA2.e(1, 20L);
                    pex pexVar2 = ((qkk) qjoVarD).a;
                    pexVar2.m();
                    Cursor cursorA2 = phn.a(pexVar2, pffVarA2, false);
                    try {
                        int iB34 = phm.b(cursorA2, "id");
                        int iB35 = phm.b(cursorA2, "state");
                        int iB36 = phm.b(cursorA2, "worker_class_name");
                        int iB37 = phm.b(cursorA2, "input_merger_class_name");
                        int iB38 = phm.b(cursorA2, "input");
                        int iB39 = phm.b(cursorA2, "output");
                        int iB40 = phm.b(cursorA2, "initial_delay");
                        int iB41 = phm.b(cursorA2, "interval_duration");
                        int iB42 = phm.b(cursorA2, "flex_duration");
                        int iB43 = phm.b(cursorA2, "run_attempt_count");
                        int iB44 = phm.b(cursorA2, "backoff_policy");
                        int iB45 = phm.b(cursorA2, "backoff_delay_duration");
                        pffVar2 = pffVarA2;
                        try {
                            int iB46 = phm.b(cursorA2, "last_enqueue_time");
                            int iB47 = phm.b(cursorA2, "minimum_retention_duration");
                            int iB48 = phm.b(cursorA2, "schedule_requested_at");
                            int iB49 = phm.b(cursorA2, "run_in_foreground");
                            int iB50 = phm.b(cursorA2, "out_of_quota_policy");
                            int iB51 = phm.b(cursorA2, "period_count");
                            int iB52 = phm.b(cursorA2, "generation");
                            int iB53 = phm.b(cursorA2, "next_schedule_time_override");
                            int iB54 = phm.b(cursorA2, "next_schedule_time_override_generation");
                            int iB55 = phm.b(cursorA2, "stop_reason");
                            int iB56 = phm.b(cursorA2, "trace_tag");
                            int iB57 = phm.b(cursorA2, "backoff_on_system_interruptions");
                            int iB58 = phm.b(cursorA2, "required_network_type");
                            int iB59 = phm.b(cursorA2, "required_network_request");
                            int iB60 = phm.b(cursorA2, "requires_charging");
                            int iB61 = phm.b(cursorA2, "requires_device_idle");
                            int iB62 = phm.b(cursorA2, "requires_battery_not_low");
                            int iB63 = phm.b(cursorA2, "requires_storage_not_low");
                            int iB64 = phm.b(cursorA2, "trigger_content_update_delay");
                            int iB65 = phm.b(cursorA2, "trigger_max_content_delay");
                            int iB66 = phm.b(cursorA2, "content_uri_triggers");
                            int i29 = iB47;
                            ArrayList arrayList2 = new ArrayList(cursorA2.getCount());
                            while (cursorA2.moveToNext()) {
                                String string5 = cursorA2.getString(iB34);
                                qbo qboVarF2 = qkr.f(cursorA2.getInt(iB35));
                                String string6 = cursorA2.getString(iB36);
                                String string7 = cursorA2.getString(iB37);
                                pzs pzsVarC3 = pzs.c(cursorA2.getBlob(iB38));
                                pzs pzsVarC4 = pzs.c(cursorA2.getBlob(iB39));
                                long j11 = cursorA2.getLong(iB40);
                                long j12 = cursorA2.getLong(iB41);
                                long j13 = cursorA2.getLong(iB42);
                                int i30 = cursorA2.getInt(iB43);
                                pza pzaVarD2 = qkr.d(cursorA2.getInt(iB44));
                                long j14 = cursorA2.getLong(iB45);
                                long j15 = cursorA2.getLong(iB46);
                                int i31 = i29;
                                long j16 = cursorA2.getLong(i31);
                                int i32 = iB34;
                                int i33 = iB48;
                                long j17 = cursorA2.getLong(i33);
                                iB48 = i33;
                                int i34 = iB49;
                                boolean z6 = cursorA2.getInt(i34) != 0;
                                iB49 = i34;
                                int i35 = iB50;
                                qbf qbfVarE2 = qkr.e(cursorA2.getInt(i35));
                                iB50 = i35;
                                int i36 = iB51;
                                int i37 = cursorA2.getInt(i36);
                                iB51 = i36;
                                int i38 = iB52;
                                int i39 = cursorA2.getInt(i38);
                                iB52 = i38;
                                int i40 = iB53;
                                long j18 = cursorA2.getLong(i40);
                                iB53 = i40;
                                int i41 = iB54;
                                int i42 = cursorA2.getInt(i41);
                                iB54 = i41;
                                int i43 = iB55;
                                int i44 = cursorA2.getInt(i43);
                                iB55 = i43;
                                int i45 = iB56;
                                String string8 = cursorA2.isNull(i45) ? null : cursorA2.getString(i45);
                                iB56 = i45;
                                int i46 = iB57;
                                Integer numValueOf2 = cursorA2.isNull(i46) ? null : Integer.valueOf(cursorA2.getInt(i46));
                                if (numValueOf2 == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                }
                                iB57 = i46;
                                int i47 = iB58;
                                int iL2 = qkr.l(cursorA2.getInt(i47));
                                iB58 = i47;
                                int i48 = iB59;
                                qlh qlhVarG2 = qkr.g(cursorA2.getBlob(i48));
                                iB59 = i48;
                                int i49 = iB60;
                                boolean z7 = cursorA2.getInt(i49) != 0;
                                iB60 = i49;
                                int i50 = iB61;
                                boolean z8 = cursorA2.getInt(i50) != 0;
                                iB61 = i50;
                                int i51 = iB62;
                                boolean z9 = cursorA2.getInt(i51) != 0;
                                iB62 = i51;
                                int i52 = iB63;
                                boolean z10 = cursorA2.getInt(i52) != 0;
                                iB63 = i52;
                                int i53 = iB64;
                                long j19 = cursorA2.getLong(i53);
                                iB64 = i53;
                                int i54 = iB65;
                                long j20 = cursorA2.getLong(i54);
                                iB65 = i54;
                                int i55 = iB66;
                                iB66 = i55;
                                arrayList2.add(new qjn(string5, qboVarF2, string6, string7, pzsVarC3, pzsVarC4, j11, j12, j13, new pzj(qlhVarG2, iL2, z7, z8, z9, z10, j19, j20, qkr.h(cursorA2.getBlob(i55))), i30, pzaVarD2, j14, j15, j16, j17, z6, qbfVarE2, i37, i39, j18, i42, i44, string8, boolValueOf));
                                iB34 = i32;
                                i29 = i31;
                            }
                            cursorA2.close();
                            pffVar2.j();
                            b(qjoVarD, arrayList2);
                            arrayList2.addAll(arrayList);
                            List listK = qjoVarD.k();
                            workDatabase.q();
                            workDatabase.o();
                            if (arrayList2.size() > 0) {
                                qjn[] qjnVarArr = (qjn[]) arrayList2.toArray(new qjn[arrayList2.size()]);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    qcw qcwVar = (qcw) it.next();
                                    if (qcwVar.d()) {
                                        qcwVar.c(qjnVarArr);
                                    }
                                }
                            }
                            if (listK.size() > 0) {
                                qjn[] qjnVarArr2 = (qjn[]) listK.toArray(new qjn[listK.size()]);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    qcw qcwVar2 = (qcw) it2.next();
                                    if (!qcwVar2.d()) {
                                        qcwVar2.c(qjnVarArr2);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursorA2.close();
                            pffVar2.j();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        pffVar2 = pffVarA2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursorA.close();
                    pffVar.j();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                pffVar = pffVarA;
            }
        } catch (Throwable th5) {
            workDatabase.o();
            throw th5;
        }
    }

    private static void b(qjo qjoVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qjoVar.l(((qjn) it.next()).c, jCurrentTimeMillis);
            }
        }
    }
}
