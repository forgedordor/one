package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwqc extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Iterable d;
    final /* synthetic */ bwqd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwqc(Iterable iterable, bwqd bwqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = iterable;
        this.e = bwqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwqc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r1;
        LinkedHashMap linkedHashMap;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            ?? r0 = this.b;
            r1 = this.a;
            try {
                fctl.b(obj);
                linkedHashMap = r0;
                r1 = r1;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r1, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            Iterable iterable = this.d;
            bwqd bwqdVar = this.e;
            eieu eieuVarH = eiiy.h("getLocalE2eeInfoData");
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(iterable, 10)), 16));
                for (Object obj2 : iterable) {
                    linkedHashMap2.put(obj2, ((aubq) obj2).d);
                }
                bwqa bwqaVar = (bwqa) bwqdVar.d.b();
                List listAo = fcva.ao(linkedHashMap2.values());
                this.a = eieuVarH;
                this.b = linkedHashMap2;
                this.c = 1;
                obj = bwqaVar.c(listAo, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                r1 = eieuVarH;
                linkedHashMap = linkedHashMap2;
            } catch (Throwable th3) {
                th = th3;
                r1 = eieuVarH;
                throw th;
            }
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fcwa.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry.getKey(), (E2eeInfo) map.get(entry.getValue()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap3.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                Map mapK = fcwa.k(arrayList);
                fczl.a(r1, null);
                return mapK;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            fcti fctiVar = value != null ? new fcti(key, value) : null;
            if (fctiVar != null) {
                arrayList.add(fctiVar);
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwqc(this.d, this.e, fcxyVar);
    }
}
