package defpackage;

import j$.util.Collection;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cczl {
    private final eott a;

    public cczl(eott eottVar) {
        this.a = eottVar;
    }

    public final String a() {
        return b(false);
    }

    public final String b(final boolean z) {
        ArrayList arrayList;
        final StringBuilder sb = new StringBuilder();
        dzzf dzzfVar = cdag.a;
        cczi ccziVar = ccze.a;
        synchronized (cdag.d) {
            arrayList = new ArrayList(cdag.e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (arrayList.isEmpty()) {
            sb2.append("No phenotype keys/values");
        } else {
            Collections.sort(arrayList, new cdah());
            for (int i = 0; i < arrayList.size(); i++) {
                cczv cczvVar = (cczv) arrayList.get(i);
                Object objE = cczvVar.e();
                boolean zEquals = Objects.equals(objE, cczvVar.f());
                String strJ = cczvVar.j();
                if (z && strJ != null && strJ.startsWith("bugle_phenotype__")) {
                    strJ = strJ.substring(17);
                }
                cdag.z(sb2, z, (true != zEquals ? '*' : ' ') + strJ, objE);
            }
        }
        String string = sb2.toString();
        if (string.endsWith("\n")) {
            sb.append(string);
        }
        eott eottVar = this.a;
        final ekgi ekgiVar = new ekgi();
        for (String str : eottVar.a.values()) {
            if (!str.isEmpty()) {
                ekgiVar.i(str, Boolean.valueOf(eottVar.c.a(str)));
            }
        }
        Map.EL.forEach(eottVar.b, new BiConsumer() { // from class: eots
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Object objB = ((fcsu) obj2).b();
                ekgiVar.i((String) obj, objB);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        Collection.EL.stream(ekgiVar.c().entrySet()).sorted(new cczk()).forEach(new Consumer() { // from class: cczj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                String strValueOf = String.valueOf((String) entry.getKey());
                cdag.z(sb, z, "@".concat(strValueOf), entry.getValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String string2 = sb.toString();
        return string2.isEmpty() ? "No phenotype keys/values" : string2;
    }
}
