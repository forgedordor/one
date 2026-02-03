package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabz extends lxd implements dacq {
    public final cogw a;
    public final bbgw b;
    public final eosc c;
    public final bxxd d;
    public final daig e;
    public final crqx f;
    public final lvy g;
    public final lvy h;
    public final lvy i;
    public final lvy j;
    public UrlSearchResult l;
    private final afhk m;
    private ListenableFuture n = null;
    public volatile Long k = null;

    public dabz(cogw cogwVar, bbgw bbgwVar, eosc eoscVar, bxxd bxxdVar, daig daigVar, crqx crqxVar, afhk afhkVar, UrlSearchResult urlSearchResult) {
        this.a = cogwVar;
        this.b = bbgwVar;
        this.c = eoscVar;
        this.d = bxxdVar;
        this.e = daigVar;
        this.f = crqxVar;
        this.m = afhkVar;
        this.l = urlSearchResult;
        lvy lvyVar = new lvy();
        this.g = lvyVar;
        lvy lvyVar2 = new lvy();
        this.h = lvyVar2;
        lvy lvyVar3 = new lvy();
        this.i = lvyVar3;
        lvy lvyVar4 = new lvy();
        this.j = lvyVar4;
        lvyVar.m(n(urlSearchResult));
        lvyVar2.m(l(urlSearchResult));
        lvyVar3.m(daigVar.c(urlSearchResult));
        lvyVar4.m(a(crqxVar, cogwVar, urlSearchResult));
    }

    public static Uri a(crqx crqxVar, cogw cogwVar, UrlSearchResult urlSearchResult) {
        if (!crqxVar.f()) {
            return null;
        }
        ezds ezdsVarL = urlSearchResult.l();
        ezdk ezdkVar = ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a;
        if ((ezdkVar.b & 2) != 0) {
            ezdm ezdmVar = ezdkVar.e;
            if (ezdmVar == null) {
                ezdmVar = ezdm.a;
            }
            if (!ezdmVar.d.isEmpty()) {
                ezdm ezdmVar2 = ezdkVar.e;
                if (ezdmVar2 == null) {
                    ezdmVar2 = ezdm.a;
                }
                if (ezdmVar2.e > cogwVar.f().toEpochMilli()) {
                    ezdm ezdmVar3 = ezdkVar.e;
                    if (ezdmVar3 == null) {
                        ezdmVar3 = ezdm.a;
                    }
                    return Uri.parse(ezdmVar3.d);
                }
            }
        }
        if (TextUtils.isEmpty(urlSearchResult.p()) || urlSearchResult.g() <= cogwVar.f().toEpochMilli()) {
            return null;
        }
        return Uri.parse(urlSearchResult.p());
    }

    public static String l(UrlSearchResult urlSearchResult) {
        String str;
        ezds ezdsVarL = urlSearchResult.l();
        ezdk ezdkVar = ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a;
        if ((ezdkVar.b & 2) != 0) {
            ezdm ezdmVar = ezdkVar.e;
            if (ezdmVar == null) {
                ezdmVar = ezdm.a;
            }
            str = ezdmVar.f;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            urlSearchResult.aA(14, "link_domain");
            str = urlSearchResult.o;
        }
        if (TextUtils.isEmpty(str)) {
            String host = Uri.parse(r(urlSearchResult)).getHost();
            if (!TextUtils.isEmpty(host)) {
                String[] strArrSplit = host.split("\\.", -1);
                int length = strArrSplit.length;
                ejwl.a(length > 0);
                return length == 1 ? strArrSplit[0] : String.format("%s.%s", strArrSplit[length - 2], strArrSplit[length - 1]);
            }
        }
        return str;
    }

    public static String n(UrlSearchResult urlSearchResult) {
        String strR;
        ezds ezdsVarL = urlSearchResult.l();
        ezdk ezdkVar = ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a;
        if ((ezdkVar.b & 2) != 0) {
            ezdm ezdmVar = ezdkVar.e;
            if (ezdmVar == null) {
                ezdmVar = ezdm.a;
            }
            strR = ezdmVar.b;
        } else {
            strR = null;
        }
        if (TextUtils.isEmpty(strR)) {
            strR = urlSearchResult.q();
        }
        if (TextUtils.isEmpty(strR)) {
            strR = r(urlSearchResult);
        }
        ejwl.a(!TextUtils.isEmpty(strR));
        return strR;
    }

    private static String r(UrlSearchResult urlSearchResult) {
        String strConcat;
        ezds ezdsVarL = urlSearchResult.l();
        ezdk ezdkVar = ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a;
        if ((ezdkVar.b & 2) != 0) {
            ezdm ezdmVar = ezdkVar.e;
            if (ezdmVar == null) {
                ezdmVar = ezdm.a;
            }
            strConcat = ezdmVar.c;
        } else {
            strConcat = null;
        }
        if (TextUtils.isEmpty(strConcat)) {
            strConcat = urlSearchResult.o();
        }
        if (TextUtils.isEmpty(strConcat)) {
            strConcat = ezdkVar.c;
            if (Uri.parse(strConcat).getScheme() == null) {
                strConcat = "http://".concat(String.valueOf(strConcat));
            }
        }
        ejwl.a(!TextUtils.isEmpty(strConcat));
        return strConcat;
    }

    @Override // defpackage.dacq
    public final lvv b() {
        return this.h;
    }

    @Override // defpackage.dacq
    public final lvv c() {
        return this.j;
    }

    @Override // defpackage.dacq
    public final lvv e() {
        return this.i;
    }

    @Override // defpackage.dacq
    public final lvv f() {
        return this.g;
    }

    @Override // defpackage.dacq
    public final UrlSearchResult k() {
        return this.l;
    }

    @Override // defpackage.dacq
    public final String m() {
        return this.l.n();
    }

    @Override // defpackage.dacq
    public final String o() {
        return r(this.l);
    }

    @Override // defpackage.dacq
    public final void p() {
        ecem.c();
        afhk afhkVar = this.m;
        if (afhkVar.a.f() && afhkVar.g() && afhkVar.f()) {
            ListenableFuture listenableFuture = this.n;
            if (listenableFuture == null || listenableFuture.isCancelled() || this.n.isDone()) {
                ezds ezdsVarL = this.l.l();
                ezdk ezdkVar = ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a;
                if ((ezdkVar.b & 2) != 0) {
                    ezdm ezdmVar = ezdkVar.e;
                    if (ezdmVar == null) {
                        ezdmVar = ezdm.a;
                    }
                    if (ezdmVar.e >= this.a.f().toEpochMilli()) {
                        return;
                    }
                }
                this.n = eijx.h(new eooy() { // from class: daby
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final dabz dabzVar = this.a;
                        if (dabzVar.k != null && dabzVar.k.longValue() > dabzVar.a.f().toEpochMilli() - 60000) {
                            return eijx.e(null);
                        }
                        final bbgw bbgwVar = dabzVar.b;
                        ezds ezdsVarL2 = dabzVar.l.l();
                        final ezdk ezdkVar2 = ezdsVarL2.c == 8 ? (ezdk) ezdsVarL2.d : ezdk.a;
                        final MessageIdType messageIdTypeK = dabzVar.l.k();
                        return eijx.h(new eooy() { // from class: bbgo
                            /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
                            
                                if (defpackage.bbbd.o(r5) != false) goto L27;
                             */
                            @Override // defpackage.eooy
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final com.google.common.util.concurrent.ListenableFuture a() {
                                /*
                                    Method dump skipped, instructions count: 285
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.bbgo.a():com.google.common.util.concurrent.ListenableFuture");
                            }
                        }, bbgwVar.q).h(new ejvr() { // from class: dabx
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ezds ezdsVarL3;
                                ezdk ezdkVar3 = (ezdk) obj;
                                dabz dabzVar2 = dabzVar;
                                cogw cogwVar = dabzVar2.a;
                                dabzVar2.k = Long.valueOf(cogwVar.f().toEpochMilli());
                                ezdkVar3.getClass();
                                if ((ezdkVar3.b & 2) == 0 || (ezdsVarL3 = dabzVar2.l.l()) == null) {
                                    return null;
                                }
                                ezdr ezdrVar = (ezdr) ezdsVarL3.toBuilder();
                                ezdrVar.copyOnWrite();
                                ezds ezdsVar = (ezds) ezdrVar.instance;
                                ezdsVar.d = ezdkVar3;
                                ezdsVar.c = 8;
                                ezds ezdsVar2 = (ezds) ezdrVar.build();
                                dabzVar2.d.o(dabzVar2.l.n(), ezdsVar2);
                                String[] strArr = UrlSearchQuery.a;
                                dqpg dqpgVar = new dqpg(UrlSearchQuery.d());
                                ConversationIdType conversationIdType = barn.a;
                                MessageIdType messageIdTypeK2 = dabzVar2.l.k();
                                int i = dqpgVar.aB;
                                if (i < 20040) {
                                    dqru.x("message_id", i);
                                }
                                dqpgVar.aE(1);
                                ConversationIdType conversationIdTypeJ = dabzVar2.l.j();
                                dqpgVar.aE(3);
                                dqpgVar.aE(2);
                                String strM = dabzVar2.l.m();
                                dqpgVar.aE(7);
                                if (!dqpgVar.aC) {
                                    strM = cssq.a(strM);
                                }
                                long jI = dabzVar2.l.i();
                                dqpgVar.aE(4);
                                int iF = dabzVar2.l.f();
                                dqpgVar.aE(5);
                                String strR = dabzVar2.l.r();
                                dqpgVar.aE(6);
                                if (!dqpgVar.aC) {
                                    strR = cssb.a(strR);
                                }
                                String strN = dabzVar2.l.n();
                                dqpgVar.aE(0);
                                UrlSearchResult urlSearchResult = new UrlSearchResult();
                                urlSearchResult.aD(dqpgVar.aB());
                                urlSearchResult.a = strN;
                                urlSearchResult.b = messageIdTypeK2;
                                urlSearchResult.c = ezdsVar2;
                                urlSearchResult.d = conversationIdTypeJ;
                                urlSearchResult.e = jI;
                                urlSearchResult.f = iF;
                                urlSearchResult.g = strR;
                                urlSearchResult.h = strM;
                                urlSearchResult.i = 0L;
                                urlSearchResult.j = null;
                                urlSearchResult.k = 0L;
                                urlSearchResult.l = null;
                                urlSearchResult.m = null;
                                urlSearchResult.n = null;
                                urlSearchResult.o = null;
                                urlSearchResult.p = null;
                                urlSearchResult.q = false;
                                urlSearchResult.r = false;
                                urlSearchResult.s = 0L;
                                urlSearchResult.t = conversationIdType;
                                urlSearchResult.u = null;
                                urlSearchResult.v = false;
                                urlSearchResult.cM = dqpgVar.aC();
                                dabzVar2.l = urlSearchResult;
                                UrlSearchResult urlSearchResult2 = dabzVar2.l;
                                dabzVar2.g.j(dabz.n(urlSearchResult2));
                                dabzVar2.h.j(dabz.l(urlSearchResult2));
                                dabzVar2.i.j(dabzVar2.e.c(urlSearchResult2));
                                dabzVar2.j.j(dabz.a(dabzVar2.f, cogwVar, urlSearchResult2));
                                return null;
                            }
                        }, dabzVar.c);
                    }
                }, this.c);
            }
        }
    }

    @Override // defpackage.dacq
    public final boolean q() {
        return this.l.h() > 0;
    }
}
