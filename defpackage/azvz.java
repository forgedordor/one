package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azvz implements azvn {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps");
    public final azvp a;
    private final azvb c;
    private final fcsu d;
    private final Map e;
    private final Map f;
    private final Set g;
    private final int h;

    public /* synthetic */ azvz(azvb azvbVar, azvp azvpVar, fcsu fcsuVar, Map map, Map map2, Set set, int i, Map map3, int i2) {
        map2 = (i2 & 16) != 0 ? fcvp.a : map2;
        set = (i2 & 32) != 0 ? fcvq.a : set;
        i = (i2 & 64) != 0 ? 2 : i;
        map3 = (i2 & 128) != 0 ? fcvp.a : map3;
        fcsuVar.getClass();
        map.getClass();
        map2.getClass();
        set.getClass();
        if (i == 0) {
            throw null;
        }
        map3.getClass();
        this.c = azvbVar;
        this.a = azvpVar;
        this.d = fcsuVar;
        this.e = map;
        this.f = map2;
        this.g = set;
        this.h = i;
    }

    private final dqws h(dqws dqwsVar, bmju... bmjuVarArr) {
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        if (bmjuVarArr.length == 0 || this.h == 1) {
            bmkiVar.v();
        } else {
            bmkiVar.c((bmju[]) Arrays.copyOf(bmjuVarArr, 1));
        }
        bmkiVar.d(new Function() { // from class: azvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.c(1L);
                bmkmVar.g(this.a.a.d());
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(bmkiVar.b(), bmkn.c.c, this.c.a());
        ((dqos) dqtrVarI).e = "batch_limiter";
        return dqwsVar.j(dqtrVarI);
    }

    @Override // defpackage.azvn
    public final int a() {
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.A("totalRowsToProcess");
        bmkiVar.d(new Function() { // from class: azvx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.c(0L);
                bmkmVar.g(this.a.a.d());
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bmkiVar.b().h();
    }

    @Override // defpackage.azvn
    public final void b(dqws dqwsVar) {
        if (dqwsVar == null) {
            azvb azvbVar = this.c;
            dqws dqwsVarB = azvbVar.b();
            dqwsVarB.v();
            dqwsVarB.n(new dqxl("$V", new Object[]{azvbVar.a()}), "backup_id");
            dqwsVar = dqwsVarB;
        }
        dqwsVar.n(new dqxl("-1", new Object[0]), "bugle_id");
        azvg.a(dqwsVar, this.a.b(), 0L, 4);
    }

    @Override // defpackage.azvn
    public final void c(ahzu ahzuVar) {
        int i = 0;
        for (dqws dqwsVar : (Iterable) this.d.b()) {
            int i2 = i + 1;
            int i3 = fdhq.a;
            long jB = fdhq.b();
            dqws dqwsVarH = h(dqwsVar, new bmju[0]);
            azvp azvpVar = this.a;
            int iA = azvg.a(dqwsVarH, azvpVar.b(), -1L, 5);
            long jB2 = fdhr.b(jB);
            if (ahzuVar != null) {
                String strD = azvpVar.d();
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(iA);
                Long lValueOf = Long.valueOf(fdhi.g(jB2));
                ekrd ekrdVar = (ekrd) ahzuVar.a.e();
                String str = ahzuVar.c;
                ekrz ekrzVar = eksq.a;
                ekrdVar.X(ekrzVar, str);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/logging/DoubleLogger", "atFine", 136, "DoubleLogger.kt")).J("[%s] Duplicate query [%s] found [%s] dupes in [%d] ms", strD, numValueOf, numValueOf2, lValueOf);
                if (ahzuVar.e) {
                    eksl ekslVar = (eksl) ahzuVar.b.e();
                    ekslVar.X(ekrzVar, ahzuVar.d);
                    ekslVar.J("[%s] Duplicate query [%s] found [%s] dupes in [%d] ms", strD, numValueOf, numValueOf2, lValueOf);
                }
            } else {
                ekrw ekrwVarE = b.e();
                ekrwVarE.X(eksq.a, "BugleRestore");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps", "findAndMarkDuplicates", 155, "DefaultBatchedRestoreTableWriterWorkflowSteps.kt")).J("[%s] Duplicate query [%s] found [%s] dupes in [%d] ms", azvpVar.d(), Integer.valueOf(i), Integer.valueOf(iA), Long.valueOf(fdhi.g(jB2)));
            }
            i = i2;
        }
    }

    @Override // defpackage.azvn
    public final void d(ahzu ahzuVar) {
        try {
            azvb azvbVar = this.c;
            dqws dqwsVarB = azvbVar.b();
            Map map = this.e;
            if (map.isEmpty()) {
                dqwsVarB.v();
            } else {
                dqwsVarB = azvbVar.c(dqwsVarB, fcva.ao(map.keySet()));
            }
            dqws dqwsVarH = h(dqwsVarB, bmkn.c.d);
            Set set = this.g;
            for (fcvv fcvvVar : fcva.L(set)) {
                azwa azwaVar = (azwa) fcvvVar.b;
                if (azwaVar.d) {
                    dqwsVarH.G(azvg.c(azwaVar.a, azwaVar.c, a.g(fcvvVar.a, "fk_map_"), true, 8));
                } else {
                    dqwsVarH.j(azvg.c(azwaVar.a, azwaVar.c, a.g(fcvvVar.a, "fk_map_"), false, 24));
                }
            }
            Map map2 = this.f;
            for (Map.Entry entry : map2.entrySet()) {
                dqpo dqpoVar = (dqpo) entry.getKey();
                dqwsVarH.n((dqxe) entry.getValue(), dqpoVar.d() + "_expression");
            }
            dqwl dqwlVarB = dqwsVarH.b();
            azvp azvpVar = this.a;
            dqtq dqtqVarC = azvpVar.c();
            fcww fcwwVar = new fcww((byte[]) null);
            fcwwVar.addAll(map.values());
            if (this.h == 2) {
                fcwwVar.add(azvbVar.a());
            }
            ArrayList arrayList = new ArrayList(fcva.p(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((azwa) it.next()).b);
            }
            fcwwVar.addAll(arrayList);
            fcwwVar.addAll(map2.keySet());
            dqpo[] dqpoVarArr = (dqpo[]) fcva.a(fcwwVar).toArray(new dqpo[0]);
            dqtqVarC.b((dqpo[]) Arrays.copyOf(dqpoVarArr, dqpoVarArr.length));
            dqtqVarC.c = dqwlVarB;
            int iA = dqtqVarC.a().a();
            if (ahzuVar != null) {
                ahzuVar.c("[%s] Inserted [%d] rows.", azvpVar.d(), Integer.valueOf(iA));
                return;
            }
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleRestore");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps", "performBugleInsert", 307, "DefaultBatchedRestoreTableWriterWorkflowSteps.kt")).B("[%s] Inserted [%d] rows.", azvpVar.d(), iA);
        } catch (Exception e) {
            throw new aysn(this.a.e(), e);
        }
    }

    @Override // defpackage.azvn
    public final void f() {
        String[] strArr = bmkn.a;
        bmkk bmkkVar = new bmkk();
        bmkkVar.ap("updateBatchStatusToWritten");
        bmkkVar.af(new bmkl((bmkm) new Function() { // from class: azvy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.c(1L);
                bmkmVar.g(this.a.a.d());
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bmkm())));
        bmkkVar.a.put("status", (Long) 2L);
        bmkkVar.b().e();
    }

    @Override // defpackage.azvn
    public final void g(int i, dqxe dqxeVar) {
        azvp azvpVar = this.a;
        long jA = azvpVar.a();
        if (dqxeVar == null) {
            final String strD = azvpVar.d();
            azwc azwcVar = azvt.a;
            String[] strArr = bmkn.a;
            bmki bmkiVar = new bmki(bmkn.a);
            bmjt bmjtVar = bmkn.c;
            bmju bmjuVar = bmjtVar.a;
            bmkiVar.c(bmjtVar.c, bmjuVar);
            bmkiVar.C(bmjuVar);
            bmkiVar.d(new Function() { // from class: azvq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar = (bmkm) obj;
                    azwc azwcVar2 = azvt.a;
                    bmkmVar.g(strD);
                    bmkmVar.c(0L);
                    return bmkmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bmkiVar.y(i);
            dqxeVar = bmkiVar.b();
        }
        azvg.b(new dqxl("WITH batch AS $V SELECT batch.backup_id AS backup_id, $V + $R AS bugle_id, $V AS table_name, $V AS status FROM batch", new Object[]{dqxeVar, Long.valueOf(jA), this.h + (-1) != 1 ? "ROW_NUMBER() OVER ()" : "ROW_NUMBER() OVER (ORDER BY _id)", azvpVar.d(), 1L}), 5);
    }

    @Override // defpackage.azvn
    public final /* synthetic */ void e(ahzu ahzuVar) {
    }
}
