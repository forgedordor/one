package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdz {
    public final pex a;
    public final pgn b;
    public final Map c;
    public final ReentrantLock d;
    public final fdae e;
    public final fdae f;
    public final pdq g;
    public peb h;
    public final Object i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public pdz(pex pexVar, Map map, Map map2, String... strArr) {
        this.a = pexVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        pgn pgnVar = new pgn(pexVar, map, map2, strArr, pexVar.k, new pdw(this));
        this.b = pgnVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new fdae() { // from class: pdr
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.f = new fdae() { // from class: pds
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.g = new pdq(pexVar);
        this.i = new Object();
        pgnVar.e = new fdae() { // from class: pdt
            @Override // defpackage.fdae
            public final Object invoke() {
                pex pexVar2 = this.a.a;
                boolean z = true;
                if (pexVar2.r() && !pexVar2.t()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    public final Object a(fcxy fcxyVar) {
        Object objE = this.b.e(fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }

    public final void b() {
        this.b.g(this.e, this.f);
    }
}
