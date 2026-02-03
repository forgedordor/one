package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkk implements qjo {
    public final pex a;
    public final pdn b;
    public final pdl c;
    public final pfn d;
    public final pfn e;
    public final pfn f;
    public final pfn g;
    public final pfn h;
    public final pfn i;
    private final pfn j;
    private final pfn k;
    private final pfn l;
    private final pfn m;
    private final pfn n;
    private final pfn o;
    private final pfn p;

    public qkk(pex pexVar) {
        this.a = pexVar;
        this.b = new qka(pexVar);
        this.c = new qkc(pexVar);
        this.j = new qkd(pexVar);
        this.k = new qke(pexVar);
        this.d = new qkf(pexVar);
        this.e = new qkg(pexVar);
        this.l = new qkh(pexVar);
        this.m = new qki(pexVar);
        this.f = new qkj(pexVar);
        this.g = new qjr(pexVar);
        new qjs(pexVar);
        this.n = new qjt(pexVar);
        this.o = new qju(pexVar);
        this.h = new qjv(pexVar);
        this.i = new qjw(pexVar);
        new qjx(pexVar);
        this.p = new qjy(pexVar);
    }

    @Override // defpackage.qjo
    public final qbo a(String str) throws IOException {
        pff pffVarA = pff.a("SELECT state FROM workspec WHERE id=?", 1);
        pffVarA.g(1, str);
        pex pexVar = this.a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            qbo qboVarF = null;
            if (cursorA.moveToFirst()) {
                Integer numValueOf = cursorA.isNull(0) ? null : Integer.valueOf(cursorA.getInt(0));
                if (numValueOf != null) {
                    qboVarF = qkr.f(numValueOf.intValue());
                }
            }
            return qboVarF;
        } finally {
            cursorA.close();
            pffVarA.j();
        }
    }

    @Override // defpackage.qjo
    public final qjn b(String str) throws Throwable {
        pff pffVar;
        pff pffVarA = pff.a("SELECT * FROM workspec WHERE id=?", 1);
        pffVarA.g(1, str);
        pex pexVar = this.a;
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
            int iB12 = phm.b(cursorA, "backoff_delay_duration");
            int iB13 = phm.b(cursorA, "last_enqueue_time");
            pffVar = pffVarA;
            try {
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
                qjn qjnVar = null;
                Boolean boolValueOf = null;
                if (cursorA.moveToFirst()) {
                    String string = cursorA.getString(iB);
                    qbo qboVarF = qkr.f(cursorA.getInt(iB2));
                    String string2 = cursorA.getString(iB3);
                    String string3 = cursorA.getString(iB4);
                    pzs pzsVarC = pzs.c(cursorA.getBlob(iB5));
                    pzs pzsVarC2 = pzs.c(cursorA.getBlob(iB6));
                    long j = cursorA.getLong(iB7);
                    long j2 = cursorA.getLong(iB8);
                    long j3 = cursorA.getLong(iB9);
                    int i = cursorA.getInt(iB10);
                    pza pzaVarD = qkr.d(cursorA.getInt(iB11));
                    long j4 = cursorA.getLong(iB12);
                    long j5 = cursorA.getLong(iB13);
                    long j6 = cursorA.getLong(iB14);
                    long j7 = cursorA.getLong(iB15);
                    boolean z = cursorA.getInt(iB16) != 0;
                    qbf qbfVarE = qkr.e(cursorA.getInt(iB17));
                    int i2 = cursorA.getInt(iB18);
                    int i3 = cursorA.getInt(iB19);
                    long j8 = cursorA.getLong(iB20);
                    int i4 = cursorA.getInt(iB21);
                    int i5 = cursorA.getInt(iB22);
                    String string4 = cursorA.isNull(iB23) ? null : cursorA.getString(iB23);
                    Integer numValueOf = cursorA.isNull(iB24) ? null : Integer.valueOf(cursorA.getInt(iB24));
                    if (numValueOf != null) {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    qjnVar = new qjn(string, qboVarF, string2, string3, pzsVarC, pzsVarC2, j, j2, j3, new pzj(qkr.g(cursorA.getBlob(iB26)), qkr.l(cursorA.getInt(iB25)), cursorA.getInt(iB27) != 0, cursorA.getInt(iB28) != 0, cursorA.getInt(iB29) != 0, cursorA.getInt(iB30) != 0, cursorA.getLong(iB31), cursorA.getLong(iB32), qkr.h(cursorA.getBlob(iB33))), i, pzaVarD, j4, j5, j6, j7, z, qbfVarE, i2, i3, j8, i4, i5, string4, boolValueOf);
                }
                cursorA.close();
                pffVar.j();
                return qjnVar;
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

    @Override // defpackage.qjo
    public final List c() throws Throwable {
        pff pffVar;
        pex pexVar = this.a;
        pff pffVarA = pff.a("SELECT * FROM workspec WHERE state=1", 0);
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
            int iB12 = phm.b(cursorA, "backoff_delay_duration");
            int iB13 = phm.b(cursorA, "last_enqueue_time");
            int iB14 = phm.b(cursorA, "minimum_retention_duration");
            pffVar = pffVarA;
            try {
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
                return arrayList;
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

    @Override // defpackage.qjo
    public final List d() throws Throwable {
        pff pffVar;
        pex pexVar = this.a;
        pff pffVarA = pff.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
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
            int iB12 = phm.b(cursorA, "backoff_delay_duration");
            int iB13 = phm.b(cursorA, "last_enqueue_time");
            int iB14 = phm.b(cursorA, "minimum_retention_duration");
            pffVar = pffVarA;
            try {
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
                return arrayList;
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

    @Override // defpackage.qjo
    public final List e(String str) throws IOException {
        pff pffVarA = pff.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        pffVarA.g(1, str);
        pex pexVar = this.a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorA.getCount());
            while (cursorA.moveToNext()) {
                arrayList.add(new qjk(cursorA.getString(0), qkr.f(cursorA.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorA.close();
            pffVarA.j();
        }
    }

    @Override // defpackage.qjo
    public final void f(String str) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.j.d();
        pklVarD.g(1, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.j.f(pklVarD);
        }
    }

    @Override // defpackage.qjo
    public final void g(String str, int i) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.n.d();
        pklVarD.g(1, str);
        pklVarD.e(2, i);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.n.f(pklVarD);
        }
    }

    @Override // defpackage.qjo
    public final void h(String str, long j) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.m.d();
        pklVarD.e(1, j);
        pklVarD.g(2, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.m.f(pklVarD);
        }
    }

    @Override // defpackage.qjo
    public final void i(String str, pzs pzsVar) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.l.d();
        pklVarD.c(1, pzo.a(pzsVar));
        pklVarD.g(2, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.l.f(pklVarD);
        }
    }

    @Override // defpackage.qjo
    public final void j(String str, int i) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.p.d();
        pklVarD.e(1, i);
        pklVarD.g(2, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.p.f(pklVarD);
        }
    }

    @Override // defpackage.qjo
    public final List k() throws Throwable {
        pff pffVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        pff pffVarA = pff.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        pffVarA.e(1, 200L);
        pex pexVar = this.a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            iB = phm.b(cursorA, "id");
            iB2 = phm.b(cursorA, "state");
            iB3 = phm.b(cursorA, "worker_class_name");
            iB4 = phm.b(cursorA, "input_merger_class_name");
            iB5 = phm.b(cursorA, "input");
            iB6 = phm.b(cursorA, "output");
            iB7 = phm.b(cursorA, "initial_delay");
            iB8 = phm.b(cursorA, "interval_duration");
            iB9 = phm.b(cursorA, "flex_duration");
            iB10 = phm.b(cursorA, "run_attempt_count");
            iB11 = phm.b(cursorA, "backoff_policy");
            iB12 = phm.b(cursorA, "backoff_delay_duration");
            iB13 = phm.b(cursorA, "last_enqueue_time");
            pffVar = pffVarA;
        } catch (Throwable th) {
            th = th;
            pffVar = pffVarA;
        }
        try {
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorA.close();
            pffVar.j();
            throw th;
        }
    }

    @Override // defpackage.qjo
    public final void l(String str, long j) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.o.d();
        pklVarD.e(1, j);
        pklVarD.g(2, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.o.f(pklVarD);
        }
    }

    @Override // defpackage.qjo
    public final void m(qbo qboVar, String str) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.k.d();
        pklVarD.e(1, qkr.c(qboVar));
        pklVarD.g(2, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.k.f(pklVarD);
        }
    }

    public final void n(HashMap map) throws IOException {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pib.a(map, new fdap() { // from class: qjq
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    this.a.n((HashMap) obj);
                    return fctx.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        pii.a(sb, size);
        sb.append(")");
        pff pffVarA = pff.a(sb.toString(), size);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            pffVarA.g(i, (String) it.next());
            i++;
        }
        Cursor cursorA = phn.a(this.a, pffVarA, false);
        try {
            int iA = phm.a(cursorA, "work_spec_id");
            if (iA != -1) {
                while (cursorA.moveToNext()) {
                    ArrayList arrayList = (ArrayList) map.get(cursorA.getString(iA));
                    if (arrayList != null) {
                        arrayList.add(pzs.c(cursorA.getBlob(0)));
                    }
                }
            }
        } finally {
            cursorA.close();
        }
    }

    public final void o(HashMap map) throws IOException {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pib.a(map, new fdap() { // from class: qjp
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    this.a.o((HashMap) obj);
                    return fctx.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        pii.a(sb, size);
        sb.append(")");
        pff pffVarA = pff.a(sb.toString(), size);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            pffVarA.g(i, (String) it.next());
            i++;
        }
        Cursor cursorA = phn.a(this.a, pffVarA, false);
        try {
            int iA = phm.a(cursorA, "work_spec_id");
            if (iA != -1) {
                while (cursorA.moveToNext()) {
                    ArrayList arrayList = (ArrayList) map.get(cursorA.getString(iA));
                    if (arrayList != null) {
                        arrayList.add(cursorA.getString(0));
                    }
                }
            }
        } finally {
            cursorA.close();
        }
    }
}
