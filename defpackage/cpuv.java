package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpuv {
    public final fcsu a;
    public final Duration b;

    public cpuv(fcsu fcsuVar) {
        this.a = fcsuVar;
        Object objE = cpyl.F.e();
        objE.getClass();
        Duration durationOfDays = Duration.ofDays(((Number) objE).longValue());
        durationOfDays.getClass();
        this.b = durationOfDays;
    }

    public static final ekgb a(final ekgb ekgbVar) {
        ecem.b();
        String[] strArr = bmyr.a;
        bmyj bmyjVar = new bmyj();
        bmyjVar.f("CmsRestoreDependencyCacheDatabaseOperations#deleteDependencyMessages");
        bmyjVar.c(new Function() { // from class: cput
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmyq bmyqVar = (bmyq) obj;
                bmyqVar.getClass();
                bmyqVar.ap(new dqpm("cms_restore_dependency_cache_table.dependency_cms_id", 3, bmyq.as(ekgbVar), false));
                return bmyqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bmyp bmypVar = (bmyp) bmyjVar.b().b;
        ekgb ekgbVar2 = (ekgb) bmyr.b().p("cms_restore_dependency_cache_table-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: bmxc
            @Override // defpackage.ejxr
            public final Object get() {
                bmyo bmyoVarA = bmyr.a();
                bmyp bmypVar2 = bmypVar;
                bmyoVarA.k(bmypVar2);
                bmyoVarA.A("cms_restore_dependency_cache_table-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ = bmyoVarA.b().z();
                bmyj bmyjVar2 = new bmyj();
                bmyjVar2.b = bmypVar2;
                bmyjVar2.f("cms_restore_dependency_cache_table-deleteAndReturnDeletedRows-delete");
                bmyjVar2.b().b();
                return ekgbVarZ;
            }
        });
        ekgbVar2.getClass();
        return ekgbVar2;
    }
}
