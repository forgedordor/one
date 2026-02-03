package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnme extends dnmj {
    public abstract dnkc b(dnjw dnjwVar, dnjz dnjzVar);

    public abstract Set c();

    @Override // defpackage.dnmj
    public final Set f() {
        int size = c().size();
        fctc fctcVar = dnjz.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet(size * dnjy.a().size());
        for (dnjw dnjwVar : c()) {
            for (dnjz dnjzVar : dnjy.a()) {
                dnjzVar.getClass();
                linkedHashSet.add(b(dnjwVar, dnjzVar));
            }
        }
        return linkedHashSet;
    }
}
