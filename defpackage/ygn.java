package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygn {
    public final fduf a = fdvf.a(new ygm(0.0f, 0.0f));
    public final fdvc b;
    private final fduf c;
    private final Map d;

    public ygn() {
        fduf fdufVarA = fdvf.a(false);
        this.c = fdufVarA;
        this.b = fdufVarA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fcue fcueVar = new fcue((fcuh) ygp.c);
        while (fcueVar.hasNext()) {
            linkedHashMap.put((ygp) fcueVar.next(), fdvf.a(false));
        }
        this.d = linkedHashMap;
    }

    public final fdpl a(ygp ygpVar) {
        ygpVar.getClass();
        fduf fdufVar = (fduf) this.d.get(ygpVar);
        return fdufVar != null ? fdufVar : fdvf.a(false);
    }

    public final void b(float f) {
        fduf fdufVar = this.a;
        if (f == ((ygm) fdufVar.c()).b) {
            return;
        }
        fdufVar.f(new ygm(((ygm) fdufVar.c()).b, f >= 0.0f ? f : 0.0f));
        this.c.f(Boolean.valueOf(((ygm) fdufVar.c()).b > ((ygm) fdufVar.c()).a));
        fcue fcueVar = new fcue((fcuh) ygp.c);
        while (fcueVar.hasNext()) {
            ygp ygpVar = (ygp) fcueVar.next();
            fduf fdufVar2 = (fduf) this.d.get(ygpVar);
            if (fdufVar2 != null) {
                fdufVar2.f(Boolean.valueOf(f > ((float) ygpVar.d)));
            }
        }
    }
}
