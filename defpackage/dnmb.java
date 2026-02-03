package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnmb extends dnmj {
    public static final Map a;
    private static final List b;
    private static final Map c;
    private final fctc d = fctd.a(new fdae() { // from class: dnly
        @Override // defpackage.fdae
        public final Object invoke() {
            dnmb dnmbVar = this.a;
            dnjw dnjwVarB = dnmbVar.b();
            dnjw dnjwVar = dnjw.d;
            boolean z = true;
            if ((dnjwVarB != dnjwVar || dnmbVar.c() != dnjw.c) && (dnmbVar.b() != dnjw.c || dnmbVar.c() != dnjwVar)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    });

    static {
        fctc fctcVar = dnjz.a;
        EnumSet enumSetA = dnjy.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumSetA) {
            if (((dnjz) obj) != dnjz.b) {
                arrayList.add(obj);
            }
        }
        b = arrayList;
        c = fcwa.g(new fcti(dnjw.b, "🧑"), new fcti(dnjw.c, "👩"), new fcti(dnjw.d, "👨"));
        dnjw dnjwVar = dnjw.c;
        dnjw dnjwVar2 = dnjw.d;
        dnjw dnjwVar3 = dnjw.b;
        a = fcwa.g(new fcti(new fcti(dnjwVar, dnjwVar), "👭"), new fcti(new fcti(dnjwVar2, dnjwVar2), "👬"), new fcti(new fcti(dnjwVar, dnjwVar2), "👫"), new fcti(new fcti(dnjwVar3, dnjwVar3), "🧑\u200d🤝\u200d🧑"));
    }

    public static final void h(dnjz dnjzVar, dnjz dnjzVar2, dnjw dnjwVar, dnjw dnjwVar2, StringBuilder sb) {
        dnjwVar.getClass();
        dnjwVar2.getClass();
        Map map = c;
        sb.append((String) map.get(dnjwVar));
        dnml dnmlVar = dnjzVar.h;
        if (dnmlVar != null) {
            sb.append(dnmlVar.a());
        }
        dnml dnmlVar2 = dnkf.c;
        sb.append(dnmlVar2.a());
        sb.append("🤝");
        sb.append(dnmlVar2.a());
        sb.append((String) map.get(dnjwVar2));
        dnml dnmlVar3 = dnjzVar2.h;
        if (dnmlVar3 != null) {
            sb.append(dnmlVar3.a());
        }
    }

    public abstract dnjw b();

    public abstract dnjw c();

    public abstract dnka d(dnjz dnjzVar, dnjz dnjzVar2);

    public abstract Set e();

    @Override // defpackage.dnmj
    public final Set f() {
        List<dnjz> list = b;
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() * list.size());
        for (dnjz dnjzVar : list) {
            for (dnjz dnjzVar2 : list) {
                dnjzVar.getClass();
                dnjzVar2.getClass();
                linkedHashSet.add(d(dnjzVar, dnjzVar2));
            }
        }
        return linkedHashSet;
    }

    public final boolean g() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
