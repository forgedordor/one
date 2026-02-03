package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class azyw extends fcyz implements fdat {
    int a;
    final /* synthetic */ azyx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azyw(azyx azyxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = azyxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azyw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            azyx azyxVar = this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = azyxVar.b;
            for (Map.Entry entry : map.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                map.put((ConversationIdType) it.next(), true);
            }
            azxa azxaVar = (azxa) azyxVar.a.b();
            ekgb ekgbVarA = ekfv.a(setKeySet);
            this.a = 1;
            if (azxaVar.b(ekgbVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new azyw(this.b, fcxyVar);
    }
}
