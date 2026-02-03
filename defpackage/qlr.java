package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlr extends fdbr implements fdap {
    final /* synthetic */ qbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlr(qbs qbsVar) {
        super(1);
        this.a = qbsVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) throws IOException {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        qlh qlhVar;
        int i17;
        int i18;
        boolean z;
        int i19;
        boolean z2;
        int i20;
        boolean z3;
        int i21;
        boolean z4;
        int i22;
        WorkDatabase workDatabase = (WorkDatabase) obj;
        workDatabase.getClass();
        akv akvVar = qjn.b;
        qik qikVarZ = workDatabase.z();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        qbs qbsVar = this.a;
        List list = qbsVar.a;
        String str2 = " AND";
        if (list.isEmpty()) {
            str = " WHERE";
        } else {
            ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UUID) it.next()).toString());
            }
            sb.append(" WHERE id IN (");
            qlm.a(sb, list.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        List list2 = qbsVar.c;
        if (list2.isEmpty()) {
            str2 = str;
        } else {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            qlm.a(sb, list2.size());
            sb.append("))");
            arrayList.addAll(list2);
        }
        List list3 = qbsVar.b;
        if (!list3.isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            qlm.a(sb, list3.size());
            sb.append("))");
            arrayList.addAll(list3);
        }
        sb.append(";");
        pjn pjnVar = new pjn(sb.toString(), arrayList.toArray(new Object[0]));
        pex pexVar = ((qin) qikVarZ).a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pjnVar, true);
        try {
            int iA = phm.a(cursorA, "id");
            int iA2 = phm.a(cursorA, "state");
            int iA3 = phm.a(cursorA, "output");
            int iA4 = phm.a(cursorA, "initial_delay");
            int iA5 = phm.a(cursorA, "interval_duration");
            int iA6 = phm.a(cursorA, "flex_duration");
            int iA7 = phm.a(cursorA, "run_attempt_count");
            int iA8 = phm.a(cursorA, "backoff_policy");
            int iA9 = phm.a(cursorA, "backoff_delay_duration");
            int iA10 = phm.a(cursorA, "last_enqueue_time");
            int iA11 = phm.a(cursorA, "period_count");
            int iA12 = phm.a(cursorA, "generation");
            int iA13 = phm.a(cursorA, "next_schedule_time_override");
            int iA14 = phm.a(cursorA, "stop_reason");
            int iA15 = phm.a(cursorA, "required_network_type");
            int iA16 = phm.a(cursorA, "required_network_request");
            int iA17 = phm.a(cursorA, "requires_charging");
            int iA18 = phm.a(cursorA, "requires_device_idle");
            int iA19 = phm.a(cursorA, "requires_battery_not_low");
            int iA20 = phm.a(cursorA, "requires_storage_not_low");
            int iA21 = phm.a(cursorA, "trigger_content_update_delay");
            int iA22 = phm.a(cursorA, "trigger_max_content_delay");
            int iA23 = phm.a(cursorA, "content_uri_triggers");
            HashMap map = new HashMap();
            int i23 = iA14;
            HashMap map2 = new HashMap();
            while (cursorA.moveToNext()) {
                int i24 = iA13;
                String string = cursorA.getString(iA);
                if (map.containsKey(string)) {
                    i22 = iA12;
                } else {
                    i22 = iA12;
                    map.put(string, new ArrayList());
                }
                String string2 = cursorA.getString(iA);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList());
                }
                iA13 = i24;
                iA12 = i22;
            }
            int i25 = iA13;
            int i26 = iA12;
            cursorA.moveToPosition(-1);
            ((qin) qikVarZ).b(map);
            ((qin) qikVarZ).a(map2);
            ArrayList arrayList3 = new ArrayList(cursorA.getCount());
            while (cursorA.moveToNext()) {
                String string3 = iA == -1 ? null : cursorA.getString(iA);
                qbo qboVarF = iA2 == -1 ? null : qkr.f(cursorA.getInt(iA2));
                pzs pzsVarC = iA3 == -1 ? null : pzs.c(cursorA.getBlob(iA3));
                long j2 = iA4 == -1 ? 0L : cursorA.getLong(iA4);
                long j3 = iA5 == -1 ? 0L : cursorA.getLong(iA5);
                long j4 = iA6 == -1 ? 0L : cursorA.getLong(iA6);
                int i27 = iA7 == -1 ? 0 : cursorA.getInt(iA7);
                pza pzaVarD = iA8 == -1 ? null : qkr.d(cursorA.getInt(iA8));
                long j5 = iA9 == -1 ? 0L : cursorA.getLong(iA9);
                long j6 = iA10 == -1 ? 0L : cursorA.getLong(iA10);
                if (iA11 == -1) {
                    int i28 = i26;
                    i = iA11;
                    i2 = i28;
                    i3 = 0;
                } else {
                    int i29 = cursorA.getInt(iA11);
                    int i30 = i26;
                    i = iA11;
                    i2 = i30;
                    i3 = i29;
                }
                if (i2 == -1) {
                    int i31 = i25;
                    i4 = i2;
                    i5 = i31;
                    i6 = 0;
                } else {
                    int i32 = cursorA.getInt(i2);
                    int i33 = i25;
                    i4 = i2;
                    i5 = i33;
                    i6 = i32;
                }
                if (i5 == -1) {
                    int i34 = i23;
                    i7 = i5;
                    i8 = i34;
                    j = 0;
                } else {
                    j = cursorA.getLong(i5);
                    int i35 = i23;
                    i7 = i5;
                    i8 = i35;
                }
                if (i8 == -1) {
                    int i36 = iA15;
                    i9 = i8;
                    i10 = i36;
                    i11 = 0;
                } else {
                    int i37 = cursorA.getInt(i8);
                    int i38 = iA15;
                    i9 = i8;
                    i10 = i38;
                    i11 = i37;
                }
                if (i10 == -1) {
                    int i39 = iA16;
                    i12 = i10;
                    i13 = i39;
                    i14 = 0;
                } else {
                    int iL = qkr.l(cursorA.getInt(i10));
                    int i40 = iA16;
                    i12 = i10;
                    i13 = i40;
                    i14 = iL;
                }
                if (i13 == -1) {
                    int i41 = iA17;
                    i15 = i13;
                    i16 = i41;
                    qlhVar = null;
                } else {
                    qlh qlhVarG = qkr.g(cursorA.getBlob(i13));
                    int i42 = iA17;
                    i15 = i13;
                    i16 = i42;
                    qlhVar = qlhVarG;
                }
                if (i16 == -1 || cursorA.getInt(i16) == 0) {
                    i17 = i16;
                    i18 = iA18;
                    z = false;
                } else {
                    i17 = i16;
                    i18 = iA18;
                    z = true;
                }
                if (i18 == -1 || cursorA.getInt(i18) == 0) {
                    iA18 = i18;
                    i19 = iA19;
                    z2 = false;
                } else {
                    iA18 = i18;
                    i19 = iA19;
                    z2 = true;
                }
                if (i19 == -1 || cursorA.getInt(i19) == 0) {
                    iA19 = i19;
                    i20 = iA20;
                    z3 = false;
                } else {
                    iA19 = i19;
                    i20 = iA20;
                    z3 = true;
                }
                if (i20 == -1 || cursorA.getInt(i20) == 0) {
                    iA20 = i20;
                    i21 = iA21;
                    z4 = false;
                } else {
                    iA20 = i20;
                    i21 = iA21;
                    z4 = true;
                }
                long j7 = i21 == -1 ? 0L : cursorA.getLong(i21);
                iA21 = i21;
                int i43 = iA22;
                long j8 = i43 != -1 ? cursorA.getLong(i43) : 0L;
                iA22 = i43;
                int i44 = iA23;
                arrayList3.add(new qjm(string3, qboVarF, pzsVarC, j2, j3, j4, new pzj(qlhVar, i14, z, z2, z3, z4, j7, j8, i44 == -1 ? null : qkr.h(cursorA.getBlob(i44))), i27, pzaVarD, j5, j6, i3, i6, j, i11, (ArrayList) map.get(cursorA.getString(iA)), (ArrayList) map2.get(cursorA.getString(iA))));
                iA23 = i44;
                iA11 = i;
                i26 = i4;
                i25 = i7;
                i23 = i9;
                iA15 = i12;
                iA16 = i15;
                iA17 = i17;
            }
            cursorA.close();
            Object objA = akvVar.a(arrayList3);
            objA.getClass();
            return objA;
        } catch (Throwable th) {
            cursorA.close();
            throw th;
        }
    }
}
