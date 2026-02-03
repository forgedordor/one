package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atxs {
    public final fcsu a;
    public final cema b;
    public final fcsu c;
    public final eosc d;
    public final fcsu e;
    public final cfeh f;
    private final bvkr g;

    public atxs(bvkr bvkrVar, fcsu fcsuVar, cema cemaVar, fcsu fcsuVar2, cfeh cfehVar, eosc eoscVar, fcsu fcsuVar3) {
        this.g = bvkrVar;
        this.a = fcsuVar;
        this.b = cemaVar;
        this.c = fcsuVar2;
        this.f = cfehVar;
        this.d = eoscVar;
        this.e = fcsuVar3;
    }

    public final eiju a(final ConversationIdType conversationIdType, final String str, final boolean z) {
        return this.g.j(new Function() { // from class: atxm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                epey epeyVar;
                cfeg cfegVarA;
                bvix bvixVar = (bvix) obj;
                final ezol ezolVarD = bvixVar.d();
                bvks bvksVarC = bvixVar.c();
                String strE = bvixVar.e();
                eieu eieuVarK = eiiy.k("IsComposingDittoSender#getExistingConversation");
                final ConversationIdType conversationIdType2 = conversationIdType;
                try {
                    ecem.b();
                    botb botbVarE = botm.e();
                    botbVarE.A("IsComposingDittoSender#getExistingConversation");
                    botbVarE.i(new Function() { // from class: atxq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            botl botlVar = (botl) obj2;
                            botlVar.r(conversationIdType2);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    botbVarE.y(1);
                    botbVarE.f(new Function() { // from class: atxr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bopp boppVar = (bopp) obj2;
                            return new bopq[]{boppVar.a, boppVar.aa, boppVar.y};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bopr boprVar = (bopr) botbVarE.b().p();
                    eieuVarK.close();
                    try {
                        boolean zMoveToFirst = boprVar.moveToFirst();
                        boolean z2 = z;
                        String str2 = str;
                        if (zMoveToFirst) {
                            epqc epqcVar = (epqc) epqd.a.createBuilder();
                            String strA = boprVar.h().a();
                            epqcVar.copyOnWrite();
                            epqd epqdVar = (epqd) epqcVar.instance;
                            strA.getClass();
                            epqdVar.c = strA;
                            if (boprVar.u() != null) {
                                epqe epqeVar = (epqe) epqf.a.createBuilder();
                                String strB = ejwk.b(boprVar.u());
                                epqeVar.copyOnWrite();
                                ((epqf) epqeVar.instance).b = strB;
                                epqf epqfVar = (epqf) epqeVar.build();
                                epqcVar.copyOnWrite();
                                epqd epqdVar2 = (epqd) epqcVar.instance;
                                epqfVar.getClass();
                                epqdVar2.d = epqfVar;
                                epqdVar2.b |= 1;
                            } else {
                                String strT = boprVar.t();
                                if (strT != null) {
                                    epqcVar.copyOnWrite();
                                    ((epqd) epqcVar.instance).e = strT;
                                }
                            }
                            epex epexVar = (epex) epey.a.createBuilder();
                            epqd epqdVar3 = (epqd) epqcVar.build();
                            epexVar.copyOnWrite();
                            epey epeyVar2 = (epey) epexVar.instance;
                            epqdVar3.getClass();
                            epeyVar2.f = epqdVar3;
                            epeyVar2.b |= 2;
                            String strA2 = conversationIdType2.a();
                            epexVar.copyOnWrite();
                            epey epeyVar3 = (epey) epexVar.instance;
                            strA2.getClass();
                            epeyVar3.c = strA2;
                            epck epckVar = (epck) epcm.a.createBuilder();
                            epckVar.copyOnWrite();
                            ((epcm) epckVar.instance).b = epcl.a(3);
                            epckVar.copyOnWrite();
                            epcm epcmVar = (epcm) epckVar.instance;
                            str2.getClass();
                            epcmVar.c = str2;
                            epcm epcmVar2 = (epcm) epckVar.build();
                            epexVar.copyOnWrite();
                            epey epeyVar4 = (epey) epexVar.instance;
                            epcmVar2.getClass();
                            epeyVar4.d = epcmVar2;
                            epeyVar4.b |= 1;
                            epexVar.copyOnWrite();
                            ((epey) epexVar.instance).e = z2;
                            epeyVar = (epey) epexVar.build();
                        } else {
                            epex epexVar2 = (epex) epey.a.createBuilder();
                            String strA3 = conversationIdType2.a();
                            epexVar2.copyOnWrite();
                            epey epeyVar5 = (epey) epexVar2.instance;
                            strA3.getClass();
                            epeyVar5.c = strA3;
                            epck epckVar2 = (epck) epcm.a.createBuilder();
                            epckVar2.copyOnWrite();
                            ((epcm) epckVar2.instance).b = epcl.a(3);
                            epckVar2.copyOnWrite();
                            epcm epcmVar3 = (epcm) epckVar2.instance;
                            str2.getClass();
                            epcmVar3.c = str2;
                            epcm epcmVar4 = (epcm) epckVar2.build();
                            epexVar2.copyOnWrite();
                            epey epeyVar6 = (epey) epexVar2.instance;
                            epcmVar4.getClass();
                            epeyVar6.d = epcmVar4;
                            epeyVar6.b |= 1;
                            epexVar2.copyOnWrite();
                            ((epey) epexVar2.instance).e = z2;
                            epeyVar = (epey) epexVar2.build();
                        }
                        boprVar.close();
                        epfb epfbVar = (epfb) epfc.a.createBuilder();
                        epfbVar.copyOnWrite();
                        epfc epfcVar = (epfc) epfbVar.instance;
                        epeyVar.getClass();
                        evtg evtgVar = epfcVar.b;
                        if (!evtgVar.c()) {
                            epfcVar.b = evsn.mutableCopy(evtgVar);
                        }
                        final atxs atxsVar = this.a;
                        epfcVar.b.add(epeyVar);
                        epfc epfcVar2 = (epfc) epfbVar.build();
                        fcsu fcsuVar = atxsVar.e;
                        if (((cdio) fcsuVar.b()).a()) {
                            cfef cfefVarA = atxsVar.f.a(bvksVarC, epby.GET_UPDATES);
                            cfefVarA.c = strE;
                            eozc eozcVar = (eozc) eoze.a.createBuilder();
                            eozcVar.copyOnWrite();
                            eoze eozeVar = (eoze) eozcVar.instance;
                            epfcVar2.getClass();
                            eozeVar.c = epfcVar2;
                            eozeVar.b = 4;
                            cfefVarA.b(eozcVar.build());
                            cfefVarA.l = true;
                            cfefVarA.i = ezjh.EPHEMERAL;
                            cfegVarA = cfefVarA.a();
                        } else {
                            cfef cfefVarC = atxsVar.f.c(ezolVarD, ((cdio) fcsuVar.b()).a() ? bvksVarC.c : Optional.empty(), epby.GET_UPDATES);
                            cfefVarC.c = strE;
                            eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                            eozcVar2.copyOnWrite();
                            eoze eozeVar2 = (eoze) eozcVar2.instance;
                            epfcVar2.getClass();
                            eozeVar2.c = epfcVar2;
                            eozeVar2.b = 4;
                            cfefVarC.b(eozcVar2.build());
                            cfefVarC.l = true;
                            cfefVarC.i = ezjh.EPHEMERAL;
                            cfegVarA = cfefVarC.a();
                        }
                        ((bvio) atxsVar.a.b()).f(strE, ((cdio) fcsuVar.b()).a() ? bvksVarC.b : ezolVarD.c, epby.GET_UPDATES.a(), 4, cfegVarA.c);
                        return (((cdio) fcsuVar.b()).a() ? (cemb) atxsVar.c.b() : atxsVar.b).a(cfegVarA).h(new ejvr() { // from class: atxo
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ezjn ezjnVar = (ezjn) obj2;
                                if (ezjnVar == null) {
                                    return null;
                                }
                                cfeg.t(atxsVar.b, ezjnVar, ezolVarD);
                                return null;
                            }
                        }, atxsVar.d).e(fbtf.class, new ejvr() { // from class: atxp
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cfeg.s((fbtf) obj2);
                                return null;
                            }
                        }, eoqg.a);
                    } finally {
                    }
                } finally {
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: atxn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
