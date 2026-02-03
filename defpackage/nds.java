package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nds implements nge {
    private final ekgb a;
    private long b;

    public nds(List list, List list2) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        mee.a(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            ekfwVar.h(new ndr((nge) list.get(i2), (List) list2.get(i2)));
        }
        this.a = ekfwVar.g();
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nge
    public final long c() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                break;
            }
            ndr ndrVar = (ndr) ekgbVar.get(i);
            long jC = ndrVar.c();
            ekgb ekgbVar2 = ndrVar.a;
            if ((ekgbVar2.contains(1) || ekgbVar2.contains(2) || ekgbVar2.contains(4)) && jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
            if (jC != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jC);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nge
    public final long e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                break;
            }
            long jE = ((ndr) ekgbVar.get(i)).e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nge
    public final void l(long j) {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return;
            }
            ((ndr) ekgbVar.get(i)).l(j);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nge
    public final boolean n(msd msdVar) {
        boolean zN;
        boolean z = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zN = false;
            while (true) {
                ekgb ekgbVar = this.a;
                if (i >= ((ekoe) ekgbVar).c) {
                    break;
                }
                long jE2 = ((ndr) ekgbVar.get(i)).e();
                boolean z2 = jE2 != Long.MIN_VALUE && jE2 <= msdVar.a;
                if (jE2 == jE || z2) {
                    zN |= ((ndr) ekgbVar.get(i)).n(msdVar);
                }
                i++;
            }
            z |= zN;
        } while (zN);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nge
    public final boolean o() {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return false;
            }
            if (((ndr) ekgbVar.get(i)).o()) {
                return true;
            }
            i++;
        }
    }
}
