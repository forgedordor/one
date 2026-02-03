package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekti extends ektl {
    private final Map a;
    private final Map b;
    private final ektk c;
    private final ektj d;

    public ekti(ekth ekthVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(ekthVar.c);
        map2.putAll(ekthVar.d);
        this.c = ekthVar.e;
        this.d = ekthVar.f;
    }

    @Override // defpackage.ektl
    protected final void a(ekrz ekrzVar, Object obj, Object obj2) {
        ektk ektkVar = (ektk) this.a.get(ekrzVar);
        if (ektkVar != null) {
            ektkVar.a(ekrzVar, obj, obj2);
        } else {
            this.c.a(ekrzVar, obj, obj2);
        }
    }

    @Override // defpackage.ektl
    protected final void b(ekrz ekrzVar, Iterator it, Object obj) {
        ektj ektjVar = (ektj) this.b.get(ekrzVar);
        if (ektjVar != null) {
            ektjVar.a(ekrzVar, it, obj);
            return;
        }
        ektj ektjVar2 = this.d;
        if (ektjVar2 != null && !this.a.containsKey(ekrzVar)) {
            ektjVar2.a(ekrzVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(ekrzVar, it.next(), obj);
            }
        }
    }
}
