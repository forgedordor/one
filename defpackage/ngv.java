package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ngv implements ngr {
    public static final /* synthetic */ int a = 0;
    private static final eknw b = new ekds(new ekcc(new ejvr() { // from class: ngt
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            int i = ngv.a;
            return Long.valueOf(((nut) obj).b);
        }
    }, ekno.a), new ekcc(new ejvr() { // from class: ngu
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            int i = ngv.a;
            return Long.valueOf(((nut) obj).c);
        }
    }, ekop.a));
    private final List c = new ArrayList();

    @Override // defpackage.ngr
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                break;
            }
            long j2 = ((nut) list.get(i)).b;
            long j3 = ((nut) list.get(i)).d;
            if (j < j2) {
                jMin = jMin != -9223372036854775807L ? Math.min(jMin, j2) : j2;
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ngr
    public final long b(long j) {
        List list = this.c;
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((nut) list.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((nut) list.get(0)).b;
        for (int i = 0; i < list.size(); i++) {
            long j2 = ((nut) list.get(i)).b;
            long j3 = ((nut) list.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ngr
    public final ekgb c(long j) {
        List list = this.c;
        if (!list.isEmpty()) {
            if (j >= ((nut) list.get(0)).b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    nut nutVar = (nut) list.get(i);
                    long j2 = nutVar.b;
                    if (j >= j2 && j < nutVar.d) {
                        arrayList.add(nutVar);
                    }
                    if (j < j2) {
                        break;
                    }
                }
                ekgb ekgbVarE = ekgb.E(b, arrayList);
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < ((ekoe) ekgbVarE).c; i2++) {
                    ekfwVar.j(((nut) ekgbVarE.get(i2)).a);
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.ngr
    public final void d() {
        this.c.clear();
    }

    @Override // defpackage.ngr
    public final void e(long j) {
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return;
            }
            long j2 = ((nut) list.get(i)).b;
            if (j > j2 && j > ((nut) list.get(i)).d) {
                list.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.ngr
    public final boolean f(nut nutVar, long j) {
        long j2 = nutVar.b;
        mee.a(j2 != -9223372036854775807L);
        mee.a(nutVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < nutVar.d;
        List list = this.c;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                list.add(0, nutVar);
                return z;
            }
        } while (j2 < ((nut) list.get(size)).b);
        list.add(size + 1, nutVar);
        return z;
    }
}
