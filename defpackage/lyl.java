package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyl {
    public final Map a;
    public final Map b;
    public final Map c;
    public final piw d;
    private final Map e;

    public lyl() {
        this((byte[]) null);
    }

    public final Object a(String str) {
        Map map = this.e;
        Object objRemove = this.a.remove(str);
        map.remove(str);
        return objRemove;
    }

    public final void b(String str, Object obj) {
        str.getClass();
        this.a.put(str, obj);
        fduf fdufVar = (fduf) this.e.get(str);
        if (fdufVar != null) {
            fdufVar.f(obj);
        }
        fduf fdufVar2 = (fduf) this.c.get(str);
        if (fdufVar2 != null) {
            fdufVar2.f(obj);
        }
    }

    public lyl(Map map) {
        this.a = fcwa.m(map);
        this.b = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new piw() { // from class: lyk
            @Override // defpackage.piw
            public final Bundle a() {
                fcti[] fctiVarArr;
                lyl lylVar = this.a;
                for (Map.Entry entry : fcwa.l(lylVar.c).entrySet()) {
                    lylVar.b((String) entry.getKey(), ((fduf) entry.getValue()).c());
                }
                for (Map.Entry entry2 : fcwa.l(lylVar.b).entrySet()) {
                    lylVar.b((String) entry2.getKey(), ((piw) entry2.getValue()).a());
                }
                Map map2 = lylVar.a;
                if (map2.isEmpty()) {
                    fctiVarArr = new fcti[0];
                } else {
                    ArrayList arrayList = new ArrayList(map2.size());
                    for (Map.Entry entry3 : map2.entrySet()) {
                        arrayList.add(new fcti((String) entry3.getKey(), entry3.getValue()));
                    }
                    fctiVarArr = (fcti[]) arrayList.toArray(new fcti[0]);
                }
                return lab.a((fcti[]) Arrays.copyOf(fctiVarArr, fctiVarArr.length));
            }
        };
    }

    public /* synthetic */ lyl(byte[] bArr) {
        this(fcvp.a);
    }
}
