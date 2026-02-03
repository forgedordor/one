package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslc implements esli {
    private final String a;
    private final esld b;

    public eslc(Set set, esld esldVar) {
        this.a = b(set);
        this.b = esldVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            esle esleVar = (esle) it.next();
            sb.append(esleVar.a());
            sb.append('/');
            sb.append(esleVar.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.esli
    public final String a() {
        esld esldVar = this.b;
        if (esldVar.a().isEmpty()) {
            return this.a;
        }
        return this.a + " " + b(esldVar.a());
    }
}
