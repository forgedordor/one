package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atsj {
    private final atrv a;
    private final Set b;
    private final eosc c;
    private final eosc d;

    public atsj(atrv atrvVar, Set set, eosc eoscVar, eosc eoscVar2) {
        this.a = atrvVar;
        this.b = set;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    public final eiju a(final Object obj, final atrj atrjVar) {
        final String strA = this.a.a(obj);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (final atsk atskVar : this.b) {
            ekfwVar.h(eijx.g(new Callable() { // from class: atsh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return atskVar.a(obj, atrjVar);
                }
            }, this.d));
        }
        return eijx.a(ekfwVar.g()).h(new ejvr() { // from class: atsi
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                auex auexVar = (auex) auey.a.createBuilder();
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    auexVar.mergeFrom((auex) it.next());
                }
                String str = strA;
                auexVar.copyOnWrite();
                auey aueyVar = (auey) auexVar.instance;
                str.getClass();
                aueyVar.b |= 1;
                aueyVar.c = str;
                return (auey) auexVar.build();
            }
        }, this.c);
    }
}
