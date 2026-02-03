package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hym implements hyk {
    private final fdap a;
    private final cuz b;
    private cuz c;

    public hym(Map map, fdap fdapVar) {
        this.a = fdapVar;
        cuz cuzVar = null;
        if (map != null && !map.isEmpty()) {
            hpt hptVar = hyo.a;
            cuzVar = new cuz(map.size());
            for (Map.Entry entry : map.entrySet()) {
                cuzVar.e(entry.getKey(), entry.getValue());
            }
        }
        this.b = cuzVar;
    }

    @Override // defpackage.hyk
    public final Object a(String str) {
        cuz cuzVar = this.b;
        List list = cuzVar != null ? (List) cuzVar.b(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            List listSubList = list.subList(1, list.size());
            int iA = cuzVar.a(str);
            if (iA < 0) {
                iA = ~iA;
            }
            Object[] objArr = cuzVar.c;
            Object obj = objArr[iA];
            cuzVar.b[iA] = str;
            objArr[iA] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // defpackage.hyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hym.b():java.util.Map");
    }

    @Override // defpackage.hyk
    public final boolean d(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.hyk
    public final hyl e(String str, fdae fdaeVar) {
        hpt hptVar = hyo.a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!fdfv.a(str.charAt(i))) {
                cuz cuzVar = this.c;
                if (cuzVar == null) {
                    long[] jArr = cvp.a;
                    cuzVar = new cuz((byte[]) null);
                    this.c = cuzVar;
                }
                Object objF = cuzVar.f(str);
                if (objF == null) {
                    objF = new ArrayList();
                    cuzVar.e(str, objF);
                }
                ((List) objF).add(fdaeVar);
                return new hyl(cuzVar, str, fdaeVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
