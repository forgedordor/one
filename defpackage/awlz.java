package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awlz extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ List c;
    final /* synthetic */ awmk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awlz(List list, awmk awmkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = list;
        this.d = awmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awlz) c((Set) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Set set = (Set) this.b;
            ekrw ekrwVarE = awmk.a.e();
            ekrwVarE.X(eksq.a, "BugleCME");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/core/group/CachingGroupManager$getGroupsFromGroupsCache$2", "invokeSuspend", 338, "CachingGroupManager.kt")).t("Cache miss looking up groups %s from groupsCache.", this.c);
            awmk awmkVar = this.d;
            List listAo = fcva.ao(set);
            this.a = 1;
            obj = awmkVar.o(listAo, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Iterable iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(iterable, 10)), 16));
        for (Object obj2 : iterable) {
            linkedHashMap.put(((awmp) obj2).a, obj2);
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awlz awlzVar = new awlz(this.c, this.d, fcxyVar);
        awlzVar.b = obj;
        return awlzVar;
    }
}
