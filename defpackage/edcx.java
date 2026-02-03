package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edcx extends lxd {
    public final lvx a;
    public ejwi b;
    public ejwi c;
    public String d = "";
    public int e;
    private final edjg f;

    public edcx(edjg edjgVar) {
        this.f = edjgVar;
        lvx lvxVar = new lvx();
        this.a = lvxVar;
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
        lvxVar.p(edjgVar.f, new lvz() { // from class: edcv
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVarJ = ejwi.j((edjc) obj);
                edcx edcxVar = this.a;
                edcxVar.b = ejwiVarJ;
                edcxVar.a();
            }
        });
        lvxVar.p(edjgVar.g, new lvz() { // from class: edcw
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVarJ = ejwi.j((edjo) obj);
                edcx edcxVar = this.a;
                edcxVar.c = ejwiVarJ;
                edcxVar.a();
            }
        });
    }

    public final void a() {
        ekgb ekgbVar;
        int i;
        ekgb ekgbVar2;
        edct edctVar = new edct();
        edctVar.c(this.e);
        int i2 = ekgb.d;
        ekgb ekgbVar3 = ekoe.a;
        edctVar.b(ekgbVar3);
        edctVar.d(ekgbVar3);
        ekfw ekfwVar = new ekfw();
        if (this.b.g() && this.e == 1) {
            if (((edjc) this.b.c()).a().g()) {
                edctVar.a(((edjc) this.b.c()).a());
                edctVar.c(3);
            } else {
                edctVar.b(((edjc) this.b.c()).b());
            }
            ekfwVar.h(((edjc) this.b.c()).c());
        }
        if (this.c.g() && this.e == 2) {
            if (((edjo) this.c.c()).a().g()) {
                edctVar.a(((edjo) this.c.c()).a());
                edctVar.c(3);
            } else {
                edctVar.d(((edjo) this.c.c()).b());
            }
            ekfwVar.h(((edjo) this.c.c()).c());
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (ekgbVarG == null) {
            throw new NullPointerException("Null events");
        }
        edctVar.d = ekgbVarG;
        lvx lvxVar = this.a;
        ekgb ekgbVar4 = edctVar.a;
        if (ekgbVar4 != null && (ekgbVar = edctVar.b) != null && (i = edctVar.e) != 0 && (ekgbVar2 = edctVar.d) != null) {
            lvxVar.j(new edcu(ekgbVar4, ekgbVar, i, edctVar.c, ekgbVar2));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (edctVar.a == null) {
            sb.append(" searchInterests");
        }
        if (edctVar.b == null) {
            sb.append(" searchSuggestions");
        }
        if (edctVar.e == 0) {
            sb.append(" searchState");
        }
        if (edctVar.d == null) {
            sb.append(" events");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        etvn etvnVar = (etvn) etvo.a.createBuilder();
        etvnVar.copyOnWrite();
        etvo etvoVar = (etvo) etvnVar.instance;
        edjg edjgVar = this.f;
        etul etulVar = edjgVar.c;
        etulVar.getClass();
        etvoVar.c = etulVar;
        etvoVar.b |= 1;
        etvnVar.copyOnWrite();
        etvo etvoVar2 = (etvo) etvnVar.instance;
        etvoVar2.b |= 2;
        etvoVar2.d = 8;
        ListenableFuture listenableFutureF = edjgVar.a.f((etvo) etvnVar.build());
        edhi edhiVarA = edjgVar.e.a(exwf.OBAKE_ART_SEARCH_INTERESTS);
        edhiVarA.d();
        eork.r(listenableFutureF, new edje(edjgVar, edhiVarA), edjgVar.b);
        this.e = 1;
    }

    public final void c(String str) {
        etwf etwfVar = (etwf) etwg.a.createBuilder();
        etwfVar.copyOnWrite();
        etwg etwgVar = (etwg) etwfVar.instance;
        edjg edjgVar = this.f;
        etul etulVar = edjgVar.c;
        etulVar.getClass();
        etwgVar.c = etulVar;
        etwgVar.b |= 1;
        etwfVar.copyOnWrite();
        etwg etwgVar2 = (etwg) etwfVar.instance;
        str.getClass();
        etwgVar2.b |= 2;
        etwgVar2.d = str;
        ListenableFuture listenableFutureH = edjgVar.a.h((etwg) etwfVar.build());
        edhi edhiVarA = edjgVar.e.a(exwf.OBAKE_ART_SEARCH_INTERESTS);
        edhiVarA.d();
        eork.r(listenableFutureH, new edjf(edjgVar, edhiVarA), edjgVar.b);
        this.e = 2;
        this.d = str;
    }
}
