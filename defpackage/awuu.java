package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awuu extends fcyz implements fdat {
    int a;
    final /* synthetic */ awvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awuu(awvh awvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awuu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awvh awvhVar = this.b;
            awye awyeVar = awvhVar.b;
            ekgb ekgbVarN = ekgb.n(awyeVar.b.values());
            ekhx ekhxVar = awyeVar.a;
            ekgbVarN.getClass();
            if (!ekgbVarN.isEmpty()) {
                ekhxVar.getClass();
                if (!ekhxVar.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : ekgbVarN) {
                        awxn awxnVar = (awxn) obj2;
                        if (ekhxVar.contains(awxnVar.b()) && awxnVar.e().isEmpty()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() < ekhxVar.size()) {
                        ekrw ekrwVarJ = awvh.a.j();
                        ekrwVarJ.X(eksq.a, "BugleCME");
                        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/core/myidentity/CachedMyIdentityManager$getActiveMyIdentities$2", "invokeSuspend", 112, "CachedMyIdentityManager.kt")).u("CanonicalActiveTokens size is %s but cachedActiveTokens size is %s", arrayList.size(), ekhxVar.size());
                    }
                    return arrayList;
                }
            }
            this.a = 1;
            obj = awvhVar.k(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : iterable) {
            if (((awxn) obj3).e().isEmpty()) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.size() >= fcva.E(iterable)) {
            return arrayList2;
        }
        ekrw ekrwVarJ2 = awvh.a.j();
        ekrwVarJ2.X(eksq.a, "BugleCME");
        ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/core/myidentity/CachedMyIdentityManager$getActiveMyIdentities$2", "invokeSuspend", 123, "CachedMyIdentityManager.kt")).q("Non canonical active tokens from delegate");
        return arrayList2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awuu(this.b, fcxyVar);
    }
}
