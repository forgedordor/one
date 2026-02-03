package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlj {
    public final Map a;
    private final ahax b;

    public tlj(ahax ahaxVar, Map map) {
        ahaxVar.getClass();
        this.b = ahaxVar;
        this.a = map;
    }

    public final void a(final tlk tlkVar) {
        this.b.d(true, new fdap() { // from class: tli
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                Map map = this.a.a;
                tlk tlkVar2 = tlkVar;
                int i = tlkVar2.c;
                tkv tkvVar = (tkv) map.get(tls.a(i));
                if (tkvVar != null) {
                    return tkvVar.a(ahatVar, tlkVar2);
                }
                throw new IllegalStateException("There is no corresponding UiAdapter for DialogType \"" + ((Object) tls.a(i)) + "\"!");
            }
        });
    }
}
