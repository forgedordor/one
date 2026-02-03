package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgww implements cgwb {
    public final bxlc b;
    public final dqsn c;
    public final bbhh d;
    private final aypv e;

    public cgww(bxlc bxlcVar, dqsn dqsnVar, aypv aypvVar, bbhh bbhhVar) {
        bxlcVar.getClass();
        dqsnVar.getClass();
        aypvVar.getClass();
        bbhhVar.getClass();
        this.b = bxlcVar;
        this.c = dqsnVar;
        this.e = aypvVar;
        this.d = bbhhVar;
    }

    public static final void c(final List list) {
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("updateGooglePhotosPartToSucceeded");
        bsjhVar.w(bvdt.SUCCEEDED);
        bsjhVar.D(new Function() { // from class: cgwk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.p(list);
                bsjlVar.m(bvdr.GOOGLE_PHOTOS_LINK);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjhVar.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(List list, bqih bqihVar, brdu brduVar) {
        String[] strArr = bqik.a;
        bqij bqijVar = new bqij();
        ekfw ekfwVar = new ekfw();
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        bqijVar.ap(new dqpm("message_photos_sharing.message_id", 3, bqij.as(ekfwVar.g()), true));
        bqihVar.af(new bqii(bqijVar));
        bqihVar.b().e();
        String[] strArr2 = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.t(list);
        brduVar.W(brecVar);
        brduVar.ak();
        return brduVar.b().e();
    }

    public final Object a(fcxy fcxyVar) {
        Object objC = fdxs.c(this.e.b(6).s(), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    public final void b(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final MessageIdType messageIdType = (MessageIdType) it.next();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("replaceGooglePhotosAttachmentsWithAlbumLinkTest-messages");
            brdrVarD.h(new Function() { // from class: cgwl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.p(messageIdType);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.f(new Function() { // from class: cgwm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarF = brdrVarD.b().f();
            ekgbVarF.getClass();
            final ConversationIdType conversationIdType = (ConversationIdType) fcva.N(ekgbVarF);
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.A("replaceGooglePhotosAttachmentsWithAlbumLinkTest-parts");
            bsjeVarC.h(new Function() { // from class: cgwn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.n(messageIdType);
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjeVarC.f(new Function() { // from class: cgwo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bsgr) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsgt bsgtVar = (bsgt) bsjeVarC.b().q(PartsTable.d.c);
            try {
                ekgb ekgbVarK = bsgtVar.k();
                bsgtVar.close();
                ekgbVarK.getClass();
                String strAF = fcva.aF(ekgbVarK, "\n", null, null, null, 62);
                String strQ = fdgn.H(strAF) ? str : a.q(str, strAF, "\n");
                bsix bsixVar = new bsix();
                bsixVar.f("replaceGooglePhotosAttachmentsWithAlbumLinkTest");
                bsixVar.a(new Function() { // from class: cgwp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        bsjlVar.n(messageIdType);
                        bsjlVar.b(new Function() { // from class: cgwf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsjl bsjlVar2 = (bsjl) obj2;
                                bsjlVar2.m(bvdr.GOOGLE_PHOTOS_LINK);
                                return bsjlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cgwg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsjl bsjlVar2 = (bsjl) obj2;
                                bsjlVar2.f("text/plain");
                                return bsjlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsixVar.d();
                bscm bscmVar = new bscm();
                bscmVar.t("text/plain");
                bscmVar.Z(strQ);
                bscmVar.J(messageIdType);
                bscmVar.U(elha.TEXT_PART.a());
                bscmVar.u(conversationIdType);
                bscmVar.d();
                this.c.g(new dqsm() { // from class: cgwd
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.a("GPSSPI::requestLinkPreview::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: cgwe
                    @Override // java.lang.Runnable
                    public final void run() {
                        cczv cczvVar = cgwx.a;
                        Object objE = cgwx.f.e();
                        objE.getClass();
                        int iIntValue = ((Number) objE).intValue();
                        cawb cawbVar = (cawb) cawc.a.createBuilder();
                        MessageIdType messageIdType2 = messageIdType;
                        String strB = messageIdType2.b();
                        cawbVar.copyOnWrite();
                        cawc cawcVar = (cawc) cawbVar.instance;
                        strB.getClass();
                        cawcVar.b |= 1;
                        cawcVar.c = strB;
                        cawbVar.copyOnWrite();
                        cawc cawcVar2 = (cawc) cawbVar.instance;
                        cawcVar2.d = 3;
                        cawcVar2.b |= 2;
                        cawc cawcVar3 = (cawc) cawbVar.build();
                        caxr caxrVar = new caxr();
                        caxrVar.c = Duration.ofMillis(iIntValue);
                        cbog cbogVarA = caxrVar.a();
                        cgww cgwwVar = this.a;
                        ((cazj) cgwwVar.d.a.a.b()).g(cbcu.g("request_link_preview", cawcVar3, cbogVarA));
                        cgwwVar.b.l(conversationIdType, messageIdType2, new String[0]);
                    }
                });
            } finally {
            }
        }
    }
}
