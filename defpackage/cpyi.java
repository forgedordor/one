package defpackage;

import j$.util.Collection;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cpyi {
    UNKNOWN,
    SCHEDULED_BY_BATCH_BACKUP,
    EXECUTING_VIA_BATCH_BACKUP,
    SUCCEED_VIA_BATCH_BACKUP,
    FAILED_VIA_BATCH_BACKUP,
    SCHEDULED_BY_INITIAL_BACKUP,
    EXECUTING_VIA_INITIAL_BACKUP,
    SUCCEED_VIA_INITIAL_BACKUP,
    FAILED_VIA_INITIAL_BACKUP,
    SCHEDULED_BY_INCREMENTAL_BACKUP,
    EXECUTING_VIA_INCREMENTAL_BACKUP,
    SUCCEED_VIA_INCREMENTAL_BACKUP,
    FAILED_VIA_INCREMENTAL_BACKUP,
    RESTORED_FROM_TELEPHONY,
    RESTORED_FROM_CMS,
    MERGED_FROM_CMS,
    CMS_RESTORE_FAILED,
    CMS_RESTORE_IN_PROGRESS,
    SKIPPED_VIA_BATCH_BACKUP,
    SKIPPED_VIA_INITIAL_BACKUP,
    SKIPPED_VIA_INCREMENTAL_BACKUP,
    EXCLUDED;

    public static final ekhx A;
    private static final ekhx B;
    public static final ekhx w;
    public static final ekhx x;
    public static final ekhx y;
    public static final ekhx z;

    static {
        cpyi cpyiVar = UNKNOWN;
        cpyi cpyiVar2 = SCHEDULED_BY_BATCH_BACKUP;
        cpyi cpyiVar3 = FAILED_VIA_BATCH_BACKUP;
        cpyi cpyiVar4 = SCHEDULED_BY_INITIAL_BACKUP;
        cpyi cpyiVar5 = FAILED_VIA_INITIAL_BACKUP;
        cpyi cpyiVar6 = SCHEDULED_BY_INCREMENTAL_BACKUP;
        cpyi cpyiVar7 = FAILED_VIA_INCREMENTAL_BACKUP;
        cpyi cpyiVar8 = RESTORED_FROM_TELEPHONY;
        cpyi cpyiVar9 = RESTORED_FROM_CMS;
        cpyi cpyiVar10 = MERGED_FROM_CMS;
        cpyi cpyiVar11 = CMS_RESTORE_FAILED;
        cpyi cpyiVar12 = CMS_RESTORE_IN_PROGRESS;
        cpyi cpyiVar13 = SKIPPED_VIA_BATCH_BACKUP;
        cpyi cpyiVar14 = SKIPPED_VIA_INITIAL_BACKUP;
        cpyi cpyiVar15 = SKIPPED_VIA_INCREMENTAL_BACKUP;
        cpyi cpyiVar16 = EXCLUDED;
        w = ekhx.r(cpyiVar, cpyiVar8);
        x = ekhx.t(cpyiVar11, cpyiVar12, cpyiVar10, cpyiVar9);
        ekhx ekhxVarV = ekhx.v(cpyiVar, cpyiVar2, cpyiVar3, cpyiVar4, cpyiVar5, cpyiVar6, cpyiVar7, cpyiVar8, cpyiVar13, cpyiVar15, cpyiVar14, cpyiVar16);
        y = ekhxVarV;
        z = ekhx.v(cpyiVar, cpyiVar2, cpyiVar3, cpyiVar4, cpyiVar5, cpyiVar6, cpyiVar7, cpyiVar12, cpyiVar8, cpyiVar16);
        A = ekhx.v(cpyiVar, cpyiVar2, cpyiVar3, cpyiVar4, cpyiVar5, cpyiVar6, cpyiVar7, cpyiVar12, cpyiVar8);
        ekhv ekhvVar = new ekhv();
        ekhvVar.j(ekhxVarV);
        ekhvVar.c(cpyiVar12);
        B = ekhvVar.g();
    }

    public static Integer[] b() {
        return (Integer[]) Collection.EL.stream(B).map(new cpyc()).sorted().toArray(new IntFunction() { // from class: cpyf
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cpyi cpyiVar = cpyi.UNKNOWN;
                return new Integer[i];
            }
        });
    }

    public static cpyi c(int i, int i2) {
        int i3 = i2 - 1;
        int i4 = i - 1;
        if (i3 == 1) {
            if (i == 0) {
                throw null;
            }
            if (i4 == 0) {
                return EXECUTING_VIA_INCREMENTAL_BACKUP;
            }
            if (i4 == 1) {
                return EXECUTING_VIA_INITIAL_BACKUP;
            }
            if (i4 == 2) {
                return EXECUTING_VIA_BATCH_BACKUP;
            }
            throw new IllegalStateException("Unknown CmsBackupType ".concat(cpxz.a(i)));
        }
        if (i3 == 2) {
            if (i == 0) {
                throw null;
            }
            if (i4 == 0) {
                return SUCCEED_VIA_INCREMENTAL_BACKUP;
            }
            if (i4 == 1) {
                return SUCCEED_VIA_INITIAL_BACKUP;
            }
            if (i4 == 2) {
                return SUCCEED_VIA_BATCH_BACKUP;
            }
            throw new IllegalStateException("Unknown CmsBackupType ".concat(cpxz.a(i)));
        }
        if (i3 != 3) {
            if (i == 0) {
                throw null;
            }
            if (i4 == 0) {
                return SKIPPED_VIA_INCREMENTAL_BACKUP;
            }
            if (i4 == 1) {
                return SKIPPED_VIA_INITIAL_BACKUP;
            }
            if (i4 == 2) {
                return SKIPPED_VIA_BATCH_BACKUP;
            }
            throw new IllegalStateException("Unknown CmsBackupType ".concat(cpxz.a(i)));
        }
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            return FAILED_VIA_INCREMENTAL_BACKUP;
        }
        if (i4 == 1) {
            return FAILED_VIA_INITIAL_BACKUP;
        }
        if (i4 == 2) {
            return FAILED_VIA_BATCH_BACKUP;
        }
        throw new IllegalStateException("Unknown CmsBackupType ".concat(cpxz.a(i)));
    }

    public final boolean a() {
        return !y.contains(this);
    }
}
