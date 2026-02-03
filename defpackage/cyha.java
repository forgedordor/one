package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyha extends lxd {
    public final cygm a;
    public final cygh b;
    public final fcyh c;
    public final bxaj d;
    public final Map e;
    public final fduf f;
    public final fdvc g;
    public final fdpl h;
    private final fdjx i;

    public cyha(fdjx fdjxVar, cygm cygmVar, cygh cyghVar, fcyh fcyhVar, bxaj bxajVar) {
        fdjxVar.getClass();
        cyghVar.getClass();
        fcyhVar.getClass();
        bxajVar.getClass();
        this.i = fdjxVar;
        this.a = cygmVar;
        this.b = cyghVar;
        this.c = fcyhVar;
        this.d = bxajVar;
        List listG = fcva.g(new cygi(1, "Dump Database", "dump", new fdae() { // from class: cygn
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.c(false);
                return fctx.a;
            }
        }), new cygi(2, "Dump Database (Redacted)", "dump", new fdae() { // from class: cygo
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.c(true);
                return fctx.a;
            }
        }), new cygi(3, "Install Fake sqlite_stat1", "run", new fdae() { // from class: cygp
            @Override // defpackage.fdae
            public final Object invoke() {
                cyha cyhaVar = this.a;
                cyhaVar.b(new cygv(cyhaVar, null));
                return fctx.a;
            }
        }), new cygi(4, "Analyze Database", "run", new fdae() { // from class: cygq
            @Override // defpackage.fdae
            public final Object invoke() {
                cyha cyhaVar = this.a;
                cyhaVar.b(new cygx(cyhaVar, null));
                return fctx.a;
            }
        }), new cygi(5, "Checkpoint WAL", "run", new fdae() { // from class: cygr
            @Override // defpackage.fdae
            public final Object invoke() {
                cyha cyhaVar = this.a;
                cyhaVar.b(new cygz(cyhaVar, null));
                return fctx.a;
            }
        }));
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(listG, 10)), 16));
        for (Object obj : listG) {
            linkedHashMap.put(Integer.valueOf(((cygi) obj).a), obj);
        }
        this.e = linkedHashMap;
        fduf fdufVarA = fdvf.a(false);
        this.f = fdufVarA;
        this.g = fdufVarA;
        this.h = ooy.a(new ouu(new ouv(20, 0, false, 0, 0, 0, 58), new fdae() { // from class: cygs
            @Override // defpackage.fdae
            public final Object invoke() {
                Map map = this.a.e;
                map.getClass();
                return new cygk(map);
            }
        }).a, this.i);
    }

    public final void a() {
        fduf fdufVar;
        Object objC;
        do {
            fdufVar = this.f;
            objC = fdufVar.c();
            ((Boolean) objC).booleanValue();
        } while (!fdufVar.g(objC, false));
    }

    public final void b(fdap fdapVar) {
        auvw.k(this.i, null, null, new cygt(this, fdapVar, null), 3);
    }

    public final void c(boolean z) {
        b(new cygu(this, z, null));
    }
}
