package defpackage;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edty implements edtv {
    private static final ekgb b = ekgb.t(edtt.ART, edtt.GOOGLE_PHOTOS, edtt.DEVICE_PHOTOS);
    public final EnumMap a = new EnumMap(edtt.class);
    private final Map c;
    private final List d;

    public edty(Map map, ejwi ejwiVar) {
        this.c = map;
        this.d = (List) ejwiVar.e(b);
    }

    @Override // defpackage.edtv
    public final List a() {
        ekeh ekehVarD = ekeh.d(this.d);
        final Map map = this.c;
        return ekgb.n(ekehVarD.f(new ejvr() { // from class: edtw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (edtu) map.get((edtt) obj);
            }
        }).c(new ejwm() { // from class: edtx
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                Boolean bool;
                edtu edtuVar = (edtu) obj;
                boolean z = edtuVar != null && edtuVar.h();
                if (edtuVar != null) {
                    bool = (Boolean) this.a.a.get(edtuVar.e());
                } else {
                    bool = Boolean.FALSE;
                }
                return z && (bool == null || bool.booleanValue());
            }
        }).g());
    }

    @Override // defpackage.edtv
    public final void b(edtt edttVar, boolean z) {
        this.a.put((EnumMap) edttVar, (edtt) Boolean.valueOf(z));
    }
}
