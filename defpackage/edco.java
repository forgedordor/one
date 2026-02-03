package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edco extends lxd {
    public boolean a = false;
    public String b;
    public final lvx c;
    private final edjm d;

    public edco(edjm edjmVar) {
        lvx lvxVar = new lvx();
        this.c = lvxVar;
        this.d = edjmVar;
        lvxVar.p(edjmVar.g, new lvz() { // from class: edcn
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ekgb ekgbVar;
                ekgb ekgbVar2;
                ekgb ekgbVar3;
                edji edjiVar = (edji) obj;
                edcp edcpVar = new edcp();
                int i = ekgb.d;
                ekgb ekgbVar4 = ekoe.a;
                edcpVar.c(ekgbVar4);
                edcpVar.a(ekgbVar4);
                edcpVar.b(ekgbVar4);
                if (edjiVar.a().g()) {
                    ejwi ejwiVarA = edjiVar.a();
                    if (ejwiVarA == null) {
                        throw new NullPointerException("Null errorState");
                    }
                    edcpVar.d = ejwiVarA;
                } else {
                    ekgb ekgbVarC = edjiVar.c();
                    ejwl.b(true, "limit is negative");
                    edcpVar.c(new ekir(ekgbVarC));
                    edcpVar.a(edjiVar.b());
                    edcpVar.b(ekis.e(edjiVar.c(), 12));
                }
                ekgb ekgbVarR = ekgb.r(edjiVar.d());
                if (ekgbVarR == null) {
                    throw new NullPointerException("Null events");
                }
                edco edcoVar = this.a;
                edcpVar.e = ekgbVarR;
                edcoVar.a = false;
                ekgb ekgbVar5 = edcpVar.a;
                if (ekgbVar5 != null && (ekgbVar = edcpVar.b) != null && (ekgbVar2 = edcpVar.c) != null && (ekgbVar3 = edcpVar.e) != null) {
                    edcoVar.c.j(new edcq(ekgbVar5, ekgbVar, ekgbVar2, edcpVar.d, ekgbVar3));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (edcpVar.a == null) {
                    sb.append(" topResults");
                }
                if (edcpVar.b == null) {
                    sb.append(" artCollections");
                }
                if (edcpVar.c == null) {
                    sb.append(" moreResults");
                }
                if (edcpVar.e == null) {
                    sb.append(" events");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
    }

    public final void a(String str) {
        this.b = str;
        this.a = true;
        etxb etxbVar = (etxb) etxc.a.createBuilder();
        etxbVar.copyOnWrite();
        etxc etxcVar = (etxc) etxbVar.instance;
        edjm edjmVar = this.d;
        etul etulVar = edjmVar.c;
        etulVar.getClass();
        etxcVar.c = etulVar;
        etxcVar.b = 1 | etxcVar.b;
        etxbVar.copyOnWrite();
        etxc etxcVar2 = (etxc) etxbVar.instance;
        str.getClass();
        etxcVar2.b |= 2;
        etxcVar2.d = str;
        ettv ettvVar = edjmVar.f;
        if (!ettvVar.equals(ettv.a)) {
            etxbVar.copyOnWrite();
            etxc etxcVar3 = (etxc) etxbVar.instance;
            ettvVar.getClass();
            etxcVar3.e = ettvVar;
            etxcVar3.b |= 32;
        }
        ListenableFuture listenableFutureK = edjmVar.a.k((etxc) etxbVar.build());
        edhi edhiVarA = edjmVar.e.a(exwf.OBAKE_ART_SEARCH_RESULTS);
        edhiVarA.d();
        eork.r(listenableFutureK, new edjl(edjmVar, edhiVarA), edjmVar.b);
    }
}
