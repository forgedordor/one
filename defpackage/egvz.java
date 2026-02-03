package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egvz implements eyif {
    public static fcyh a(egvh egvhVar, eosd eosdVar, fcyh fcyhVar, ejwi ejwiVar, final ejwi ejwiVar2, final ejwi ejwiVar3) {
        eosdVar.getClass();
        fcyhVar.getClass();
        final eygg eyggVar = new eygg() { // from class: egvx
            @Override // defpackage.eygg
            public final Object b() {
                return ((ejwt) ejwiVar3).a;
            }
        };
        Boolean bool = true;
        bool.getClass();
        fcyh fcyhVarA = egvhVar.a(new dqkk(eosj.a(new egpl(eosdVar, true, ((Boolean) ejwiVar2.e(false)).booleanValue(), true)), eosdVar));
        eygg eyggVar2 = new eygg() { // from class: egvy
            @Override // defpackage.eygg
            public final Object b() {
                boolean z = true;
                if (!((Boolean) eyggVar.b()).booleanValue()) {
                    ejwi ejwiVar4 = ejwiVar2;
                    Boolean bool2 = true;
                    bool2.getClass();
                    if (!((Boolean) ejwiVar4.e(false)).booleanValue()) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        fcyf fcyfVar = fcyhVarA.get(CoroutineExceptionHandler.c);
        fcyfVar.getClass();
        egvw egvwVar = new egvw((CoroutineExceptionHandler) fcyfVar, egvt.a, eyggVar2);
        fcxz fcxzVar = fcya.k;
        fcyf fcyfVar2 = fcyhVarA.get(fcxzVar);
        fcyfVar2.getClass();
        fcyf fcyfVar3 = fcyhVar.get(fcxzVar);
        fcyfVar3.getClass();
        fcyh fcyhVarPlus = fcyhVarA.plus(new egvu((fdjq) fcyfVar2, new egwa((fdjq) fcyfVar3), eyggVar)).plus(egvwVar);
        fcyhVarPlus.getClass();
        return fcyhVarPlus;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
