package defpackage;

import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebrn extends ebrp {
    final /* synthetic */ Map a;
    final /* synthetic */ ebrz b;

    public ebrn(ebrz ebrzVar, Map map) {
        this.a = map;
        this.b = ebrzVar;
    }

    @Override // defpackage.ebru
    public final void a(ebro ebroVar) throws ebrq {
        ebrs ebrsVar = ebroVar.a;
        Map map = this.a;
        ebrw ebrwVar = ebrsVar.a;
        if (map.containsKey(ebrwVar)) {
            ebrw ebrwVar2 = (ebrw) map.get(ebrwVar);
            ebrz ebrzVar = this.b;
            if (ebrzVar.b.a(ebrwVar2)) {
                ebrzVar.g((Throwable) ebrsVar.b().orElseGet(new Supplier() { // from class: ebrm
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ebry();
                    }
                }));
            } else {
                ebrzVar.h(ebrwVar2);
            }
        }
    }
}
