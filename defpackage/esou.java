package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class esou {
    public abstract esov a();

    public abstract void b(ekhx ekhxVar);

    public final esov c() {
        esov esovVarA = a();
        esoq esoqVar = (esoq) esovVarA;
        if (esoqVar.a.g()) {
            ejwl.m(!((ekhx) r2.c()).isEmpty(), "Cannot get token for empty scope set");
        }
        HashSet hashSet = new HashSet();
        ekqg ekqgVarListIterator = esoqVar.b.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ejwi ejwiVar = (ejwi) ekqgVarListIterator.next();
            if (ejwiVar.g()) {
                ekqg ekqgVarListIterator2 = ((esot) ejwiVar.c()).a.listIterator();
                while (ekqgVarListIterator2.hasNext()) {
                    String str = (String) ekqgVarListIterator2.next();
                    ejwl.p(hashSet.add(str), "Cannot map account type (%s) to more than one fallback provider", str);
                }
            }
        }
        return esovVarA;
    }
}
