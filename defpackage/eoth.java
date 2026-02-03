package defpackage;

import j$.util.Map;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoth {
    private final Map a;
    private final eotm b;

    public eoth(Map map, eotm eotmVar) {
        this.a = map;
        this.b = eotmVar;
    }

    public final boolean a(String str) {
        boolean zBooleanValue = ((Boolean) ((fcsu) Map.EL.getOrDefault(this.a, str, new fcsu() { // from class: eotg
            @Override // defpackage.fcsu
            public final Object b() {
                return false;
            }
        })).b()).booleanValue();
        eotm eotmVar = this.b;
        if (eotmVar.e()) {
            Optional optionalB = eotmVar.b(str);
            if (optionalB.isPresent()) {
                return ((Boolean) optionalB.orElseThrow()).booleanValue();
            }
        }
        return zBooleanValue;
    }
}
