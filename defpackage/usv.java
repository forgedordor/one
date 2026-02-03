package defpackage;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usv implements urw {
    public final Context a;
    public final eosc b;
    public final eosc c;
    public final egzh d;
    public final crtq e;
    public final bafp f;
    public final fcsu g;
    public final fcsu h;
    public final crab i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final bveo o;
    private final egyt p;
    private final fcsu q;
    private final fcsu r;
    private final aqhc s;

    public usv(Context context, bveo bveoVar, egyt egytVar, egzh egzhVar, crtq crtqVar, eosc eoscVar, eosc eoscVar2, bafp bafpVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, crab crabVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, aqhc aqhcVar) {
        this.a = context;
        this.o = bveoVar;
        this.b = eoscVar;
        this.d = egzhVar;
        this.p = egytVar;
        this.e = crtqVar;
        this.c = eoscVar2;
        this.f = bafpVar;
        this.q = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = crabVar;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
        this.n = fcsuVar8;
        this.r = fcsuVar9;
        this.s = aqhcVar;
    }

    @Override // defpackage.urw
    public final egyi a(lvc lvcVar, final ConversationIdType conversationIdType) {
        botb botbVarE = botm.e();
        botbVarE.A("getNameDataSource");
        botbVarE.f(new Function() { // from class: use
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                return new bopq[]{boppVar.c, boppVar.O};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: usf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.r(conversationIdType);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return this.o.a(botbVarE.b(), new bveh() { // from class: usg
            @Override // defpackage.bveh
            public final eiju a(Object obj) {
                final bosz boszVar = (bosz) obj;
                return eijx.g(eiid.l(new Callable() { // from class: ush
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bojh bojhVar = (bojh) boszVar.l();
                        if (bojhVar == null || bojhVar.Y() == null) {
                            return Optional.empty();
                        }
                        return Optional.of(bvdi.b(bojhVar.k()) ? bojhVar.Y() : cssf.c(bojhVar.Y()));
                    }
                }), this.a.b);
            }
        }, "NAME_KEY".concat(String.valueOf(String.valueOf(conversationIdType))), lvcVar);
    }

    @Override // defpackage.urw
    public final egyi b(lvc lvcVar, final ConversationIdType conversationIdType) {
        botb botbVarE = botm.e();
        botbVarE.A("getOptionsListDataSource");
        botbVarE.i(new Function() { // from class: usb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.r(conversationIdType);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bosz boszVarB = botbVarE.b();
        boszVarB.N(lvcVar, new uss(this));
        baga.e(conversationIdType, true).N(lvcVar, new ust(this));
        final Conversation conversationA = this.s.a() ? ((ajln) this.r.b()).a(new RbmConversationId(conversationIdType), ajlm.FOR_DISPLAY) : null;
        final boip boipVarB = baga.a(conversationIdType).b();
        boipVarB.N(lvcVar, new usu(this));
        return new egys(this.p, new eopk() { // from class: usc
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                eiju eijuVarE;
                eiju eijuVarE2;
                final usv usvVar = this.a;
                baqm baqmVar = (baqm) usvVar.l.b();
                final ConversationIdType conversationIdType2 = conversationIdType;
                eiju eijuVarB = baqmVar.b(conversationIdType2);
                final boip boipVar = boipVarB;
                eooz eoozVar = new eooz() { // from class: usr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final ekgb ekgbVar = (ekgb) obj;
                        eiju eijuVarX = boipVar.x();
                        final usv usvVar2 = usvVar;
                        return eijuVarX.h(new ejvr() { // from class: usj
                            /* JADX WARN: Type inference failed for: r0v3, types: [eygg, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v3, types: [eygg, java.lang.Object] */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                bafp bafpVar = usvVar2.f;
                                ekgb ekgbVar2 = (ekgb) obj2;
                                bafpVar.a.b().getClass();
                                ?? B = bafpVar.b.b();
                                B.getClass();
                                ?? B2 = bafpVar.c.b();
                                B2.getClass();
                                ekgb ekgbVar3 = ekgbVar;
                                ekgbVar3.getClass();
                                ekgbVar2.getClass();
                                return new bafo(B, B2, ekgbVar3, ekgbVar2);
                            }
                        }, usvVar2.c);
                    }
                };
                eosc eoscVar = usvVar.b;
                final eiju eijuVarI = eijuVarB.i(eoozVar, eoscVar);
                final bosz boszVar = boszVarB;
                final eiju eijuVarG = eijx.g(new Callable() { // from class: usk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bojh bojhVar = (bojh) boszVar.l();
                        if (bojhVar != null) {
                            return bojhVar;
                        }
                        String[] strArr = botm.a;
                        return new bojm().a();
                    }
                }, eoscVar);
                eooz eoozVar2 = new eooz() { // from class: usl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final ArrayList arrayListC = ((bafo) obj).c();
                        final usv usvVar2 = usvVar;
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        return usvVar2.b.submit(eiid.l(new Callable() { // from class: usi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                crtq crtqVar = usvVar2.e;
                                MessageCoreData messageCoreDataJ = ((baxe) crtqVar.b.b()).j(conversationIdType3);
                                ParticipantsTable.BindData bindDataB = null;
                                if (messageCoreDataJ != null) {
                                    String strAB = messageCoreDataJ.aB();
                                    if (!TextUtils.isEmpty(strAB)) {
                                        List<ParticipantsTable.BindData> list = arrayListC;
                                        if (list != null) {
                                            for (ParticipantsTable.BindData bindData : list) {
                                                if (strAB.equals(bindData.R())) {
                                                    bindDataB = bindData;
                                                    break;
                                                }
                                            }
                                            bindDataB = ((bbca) crtqVar.a.b()).b(strAB);
                                        } else {
                                            bindDataB = ((bbca) crtqVar.a.b()).b(strAB);
                                        }
                                    }
                                }
                                if (bindDataB != null) {
                                    return bindDataB;
                                }
                                String[] strArr = ParticipantsTable.a;
                                return new brvq().a();
                            }
                        }));
                    }
                };
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureK = eika.k(eijuVarI, eoozVar2, eoqgVar);
                final eiju eijuVarI2 = eijuVarG.i(new eooz() { // from class: usa
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        usv usvVar2 = usvVar;
                        return ((bvus) usvVar2.h.b()).b(((bojh) obj).ab()).h(new ejvr() { // from class: usd
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return Boolean.valueOf(((Optional) obj2).isPresent());
                            }
                        }, usvVar2.c);
                    }
                }, usvVar.c);
                final eiju eijuVarE3 = conversationIdType2 == null ? eijx.e(null) : ((cpkp) usvVar.g.b()).a(conversationIdType2);
                Conversation conversation = conversationA;
                final eiju eijuVarI3 = eijuVarG.i(new eooz() { // from class: usm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final bojh bojhVar = (bojh) obj;
                        final usv usvVar2 = usvVar;
                        return eijx.g(eiid.l(new Callable() { // from class: urx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context;
                                Ringtone ringtone;
                                bojh bojhVar2 = bojhVar;
                                usv usvVar3 = usvVar2;
                                Uri uriA = usvVar3.i.a(bojhVar2.Z());
                                return (uriA == null || (ringtone = RingtoneManager.getRingtone((context = usvVar3.a), uriA)) == null) ? Optional.empty() : Optional.of(ringtone.getTitle(context));
                            }
                        }), usvVar2.b);
                    }
                }, eoqgVar);
                final eiju eijuVarI4 = eijuVarG.i(new eooz() { // from class: usn
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        usv usvVar2 = usvVar;
                        bojh bojhVar = (bojh) obj;
                        if (!((bvur) usvVar2.k.b()).i()) {
                            return eijx.e(Optional.empty());
                        }
                        ParticipantsTable.BindData bindDataB = ((bbca) usvVar2.m.b()).b(bojhVar.T());
                        if (bindDataB == null) {
                            throw new IllegalStateException("The current self id must exist and it must reflect a participant.");
                        }
                        aubq aubqVar = (aubq) ((alrj) usvVar2.n.b()).q(bindDataB).e().orElseThrow();
                        ConversationIdType conversationIdTypeC = bojhVar.C();
                        bwvc bwvcVar = (bwvc) bwvf.a.createBuilder();
                        String strA = conversationIdTypeC.a();
                        bwvcVar.copyOnWrite();
                        bwvf bwvfVar = (bwvf) bwvcVar.instance;
                        strA.getClass();
                        bwvfVar.c = 2;
                        bwvfVar.d = strA;
                        bwvcVar.copyOnWrite();
                        bwvf bwvfVar2 = (bwvf) bwvcVar.instance;
                        aubqVar.getClass();
                        bwvfVar2.f = aubqVar;
                        bwvfVar2.b |= 2;
                        return ((bwuv) usvVar2.j.b()).b((bwvf) bwvcVar.build()).h(new ejvr() { // from class: ury
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return Optional.ofNullable((bwvh) obj2);
                            }
                        }, usvVar2.c);
                    }
                }, eoscVar);
                if (conversation != null) {
                    eijuVarE = conversation.g().b().h(new ejvr() { // from class: uso
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return Optional.of((ekgb) obj);
                        }
                    }, eoqgVar);
                    eijuVarE2 = conversation.h().b().h(new ejvr() { // from class: usp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            aoer aoerVarH = ((ajlk) obj).h();
                            return aoerVarH == null ? Optional.empty() : Optional.of(aoerVarH);
                        }
                    }, eoqgVar);
                } else {
                    eijuVarE = eijx.e(Optional.empty());
                    eijuVarE2 = eijx.e(Optional.empty());
                }
                final eiju eijuVar = eijuVarE;
                final eiju eijuVar2 = eijuVarE2;
                return new eopy(eijx.k(eijuVarG, eijuVarI, listenableFutureK, eijuVarI4, eijuVarE3, eijuVarI2, eijuVarI3, eijuVar, eijuVar2).a(new Callable() { // from class: usq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bojh bojhVar = (bojh) eork.q(eijuVarG);
                        bafo bafoVar = (bafo) eork.q(eijuVarI);
                        Optional optional = (Optional) eork.q(eijuVarI4);
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) eork.q(listenableFutureK);
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) eork.q(eijuVarE3);
                        boolean zBooleanValue = ((Boolean) eork.q(eijuVarI2)).booleanValue();
                        Optional optional2 = (Optional) eork.q(eijuVarI3);
                        Optional optional3 = (Optional) eork.q(eijuVar);
                        Optional optional4 = (Optional) eork.q(eijuVar2);
                        bvdk bvdkVarG = bojhVar.G();
                        if (bvdkVarG == null) {
                            bvdkVarG = bvdk.UNARCHIVED;
                        }
                        return new bacl(bojhVar, bafoVar, optional, bindData, bindData2, zBooleanValue, bvdkVarG, optional2, optional3, optional4);
                    }
                }, eoqgVar));
            }
        }, "OPTIONS_LIST_KEY");
    }

    @Override // defpackage.urw
    public final eiju c(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        cpjw cpjwVar = (cpjw) this.q.b();
        cpki cpkiVarQ = cpkj.q();
        BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
        cpju cpjuVar = (cpju) cpkiVarQ;
        cpjuVar.d = bugleConversationId;
        cpjuVar.e = bindData.R();
        cpjuVar.a = false;
        cpjuVar.b = false;
        cpjuVar.g = elka.CONVERSATION_FROM_UNBLOCK_ACTION;
        cpjuVar.i = 3;
        cpjuVar.j = 6;
        return cpjwVar.a(cpkiVarQ.a().p()).h(new ejvr() { // from class: urz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
