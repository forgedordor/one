package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awma extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ awmk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awma(fcxy fcxyVar, List list, awmk awmkVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = awmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = awmk.a.h();
            ekrwVarH.X(eksq.a, "BugleCME");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/core/group/CachingGroupManager$getGroupsFromLegacyGroupsCache$$inlined$sequenceAsyncPropagatingLegacy$1", "invokeSuspend", 322, "CachingGroupManager.kt");
            List list = this.b;
            ekrdVar.t("Looking up %s from legacyGroupsCache", list);
            awmk awmkVar = this.c;
            Set setAv = fcva.av(list);
            awmb awmbVar = new awmb(list, awmkVar, null);
            this.a = 1;
            obj = awmkVar.d.c(setAv, awmbVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Collection collectionValues = ((Map) obj).values();
        ArrayList arrayList = new ArrayList(fcva.p(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((awmq) it.next()).a);
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awma awmaVar = new awma(fcxyVar, this.b, this.c);
        awmaVar.d = obj;
        return awmaVar;
    }
}
