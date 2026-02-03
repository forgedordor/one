package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrb extends esmm {
    public final esmk a;
    public final List b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public esrb(esmk esmkVar, List list) {
        this.a = esmkVar;
        this.b = list;
    }

    @Override // defpackage.esmm
    public final fbnd a(final esob esobVar) {
        String str = esobVar.a().a;
        ConcurrentHashMap concurrentHashMap = this.c;
        fbnd fbndVar = (fbnd) concurrentHashMap.get(esobVar);
        if (fbndVar != null) {
            return fbndVar;
        }
        ConcurrentHashMap concurrentHashMap2 = this.d;
        fbnd fbndVarC = (fbnd) concurrentHashMap2.get(str);
        if (fbndVarC == null) {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(esrz.a(new fcsu() { // from class: esra
                @Override // defpackage.fcsu
                public final Object b() {
                    return ekgb.s(new esqt(this.a.a), new esti());
                }
            }));
            esmk esmkVar = this.a;
            if (((esma) esmkVar).g == null) {
                ekfwVar.h(new esrc());
            } else {
                ekfwVar.h(new esqr());
                ekfwVar.h(esrz.a(new fcsu() { // from class: esqw
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return ekgb.r(new esqj());
                    }
                }));
            }
            ekfwVar.h(new esqv());
            ekfwVar.h(esrz.a(new fcsu() { // from class: esqx
                @Override // defpackage.fcsu
                public final Object b() {
                    return ekgb.s(new estp(), new esto());
                }
            }));
            ekfwVar.h(esrz.a(new fcsu() { // from class: esqy
                @Override // defpackage.fcsu
                public final Object b() {
                    int i2 = ekgb.d;
                    ekfw ekfwVar2 = new ekfw();
                    Iterator it = this.a.b.iterator();
                    while (it.hasNext()) {
                        ekfwVar2.h(((esmp) it.next()).a());
                    }
                    return ekfwVar2.g();
                }
            }));
            fbndVarC = fbnk.c(new esrq(str, esmkVar), ekfwVar.g());
            fbnd fbndVar2 = (fbnd) concurrentHashMap2.putIfAbsent(str, fbndVarC);
            if (fbndVar2 != null) {
                fbndVarC = fbndVar2;
            }
        }
        fbnd fbndVarD = fbnk.d(fbndVarC, esrz.a(new fcsu() { // from class: esqz
            @Override // defpackage.fcsu
            public final Object b() {
                return ekgb.r(new esrd(esobVar));
            }
        }));
        fbnd fbndVar3 = (fbnd) concurrentHashMap.putIfAbsent(esobVar, fbndVarD);
        return fbndVar3 != null ? fbndVar3 : fbndVarD;
    }
}
