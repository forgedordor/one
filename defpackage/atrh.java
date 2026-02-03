package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atrh implements atru {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final asre e;
    public final attm f;
    public final fcsu g;
    public final fcsu h;
    public final atau i;

    public atrh(eosc eoscVar, eosc eoscVar2, attm attmVar, fcsu fcsuVar, asre asreVar, fcsu fcsuVar2, fcsu fcsuVar3, atau atauVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.f = attmVar;
        this.d = fcsuVar;
        this.e = asreVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = atauVar;
    }

    private final eiju b(final ConversationIdType conversationIdType, final avoe avoeVar) {
        return eijx.g(new Callable() { // from class: atrg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = atrh.a;
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("setConversationErrorState");
                boteVar.x(avoeVar);
                return boteVar.f(conversationIdType) ? cbcw.i() : cbcw.k();
            }
        }, this.c);
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, final auey aueyVar) {
        aucx aucxVar = aueyVar.j;
        if (aucxVar == null) {
            aucxVar = aucx.a;
        }
        if (!aucxVar.c) {
            return eijx.e(cbcw.i());
        }
        avoe avoeVar = avoe.RCS_GROUP_NOT_FOUND;
        avoe avoeVarB = avoe.b(aucxVar.d);
        if (avoeVarB == null) {
            avoeVarB = avoe.NONE;
        }
        if (avoeVar.equals(avoeVarB)) {
            avoe avoeVarB2 = avoe.b(aucxVar.d);
            if (avoeVarB2 == null) {
                avoeVarB2 = avoe.NONE;
            }
            return b(conversationIdType, avoeVarB2).i(new eooz() { // from class: atrb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final aubq aubqVar = aueyVar.l;
                    if (aubqVar == null) {
                        aubqVar = aubq.a;
                    }
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    final atrh atrhVar = this.a;
                    return atrhVar.f.h(conversationIdType2).i(new eooz() { // from class: atrc
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final atrh atrhVar2 = atrhVar;
                            final atrj atrjVar = (atrj) obj2;
                            final auib auibVar = (auib) atrhVar2.i.fM(cqdr.a());
                            final ConversationIdType conversationIdType3 = conversationIdType2;
                            eiju eijuVarG = eijx.g(new Callable() { // from class: atrd
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return ((bakt) atrhVar2.d.b()).K(conversationIdType3);
                                }
                            }, atrhVar2.c);
                            final aubq aubqVar2 = aubqVar;
                            eooz eoozVar = new eooz() { // from class: atre
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    List list = (List) obj3;
                                    if (list.isEmpty()) {
                                        ((eksl) ((eksl) atrh.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "recreateGroupChatOnServer", 156, "ErrorStateGroupMetadataProcessor.java")).q("Stop recreating group due to no participants");
                                        return eijx.e(cbcw.i());
                                    }
                                    aubq aubqVar3 = aubqVar2;
                                    final auib auibVar2 = auibVar;
                                    final atrj atrjVar2 = atrjVar;
                                    final atrh atrhVar3 = atrhVar2;
                                    assb assbVar = (assb) atrhVar3.h.b();
                                    String strO = atrjVar2.o();
                                    int size = list.size();
                                    ellv ellvVarA = assbVar.a(strO);
                                    ellvVarA.copyOnWrite();
                                    elmc elmcVar = (elmc) ellvVarA.instance;
                                    evsy evsyVar = elmc.a;
                                    elmcVar.d = 13;
                                    elmcVar.c |= 1;
                                    ellz ellzVar = (ellz) elma.a.createBuilder();
                                    ellzVar.copyOnWrite();
                                    elma elmaVar = (elma) ellzVar.instance;
                                    elmaVar.b |= 2;
                                    elmaVar.d = size;
                                    ellvVarA.copyOnWrite();
                                    elmc elmcVar2 = (elmc) ellvVarA.instance;
                                    elma elmaVar2 = (elma) ellzVar.build();
                                    elmaVar2.getClass();
                                    elmcVar2.i = elmaVar2;
                                    elmcVar2.c |= 32;
                                    enrs enrsVar = (enrs) enru.a.createBuilder();
                                    enrsVar.copyOnWrite();
                                    enru enruVar = (enru) enrsVar.instance;
                                    enruVar.d = 2;
                                    enruVar.b |= 2;
                                    fhaz fhazVar = (fhaz) assbVar.a.fH().fM(auibVar2);
                                    enrsVar.copyOnWrite();
                                    enru enruVar2 = (enru) enrsVar.instance;
                                    fhazVar.getClass();
                                    enruVar2.c = fhazVar;
                                    enruVar2.b |= 1;
                                    ellvVarA.copyOnWrite();
                                    elmc elmcVar3 = (elmc) ellvVarA.instance;
                                    enru enruVar3 = (enru) enrsVar.build();
                                    enruVar3.getClass();
                                    elmcVar3.n = enruVar3;
                                    elmcVar3.c |= 16384;
                                    assbVar.b((elmc) ellvVarA.build());
                                    aucd aucdVar = (aucd) auce.a.createBuilder();
                                    String strO2 = atrjVar2.o();
                                    aucdVar.copyOnWrite();
                                    auce auceVar = (auce) aucdVar.instance;
                                    auceVar.b |= 1;
                                    auceVar.c = strO2;
                                    String strM = atrjVar2.m();
                                    aucdVar.copyOnWrite();
                                    auce auceVar2 = (auce) aucdVar.instance;
                                    auceVar2.b |= 2;
                                    auceVar2.d = strM;
                                    aucdVar.copyOnWrite();
                                    auce auceVar3 = (auce) aucdVar.instance;
                                    aubqVar3.getClass();
                                    auceVar3.f = aubqVar3;
                                    auceVar3.b |= 8;
                                    Stream map = Collection.EL.stream(((alrj) atrhVar3.g.b()).y(list)).map(new Function() { // from class: atqy
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            eksp ekspVar = atrh.a;
                                            return (aubq) ((alqm) obj4).e().orElseThrow(new Supplier() { // from class: atqz
                                                @Override // java.util.function.Supplier
                                                public final Object get() {
                                                    return new asrb("Group endpoint must have a conference URI");
                                                }
                                            });
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = ekgb.d;
                                    aucdVar.a((ekgb) map.collect(ekcv.a));
                                    auca aucaVar = (auca) aucb.a.createBuilder();
                                    String strO3 = atrjVar2.o();
                                    aucaVar.copyOnWrite();
                                    aucb aucbVar = (aucb) aucaVar.instance;
                                    aucbVar.b |= 1;
                                    aucbVar.c = strO3;
                                    aucaVar.copyOnWrite();
                                    aucb aucbVar2 = (aucb) aucaVar.instance;
                                    aucbVar2.b |= 2;
                                    aucbVar2.d = true;
                                    aucaVar.copyOnWrite();
                                    aucb aucbVar3 = (aucb) aucaVar.instance;
                                    auibVar2.getClass();
                                    aucbVar3.e = auibVar2;
                                    aucbVar3.b |= 4;
                                    evqs byteString = ((aucb) aucaVar.build()).toByteString();
                                    aucdVar.copyOnWrite();
                                    auce auceVar4 = (auce) aucdVar.instance;
                                    auceVar4.b |= 16;
                                    auceVar4.h = byteString;
                                    return atrhVar3.e.b((auce) aucdVar.build()).h(new ejvr() { // from class: atra
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj4) {
                                            auch auchVar = (auch) obj4;
                                            aubl aublVar = auchVar.c;
                                            if (aublVar == null) {
                                                aublVar = aubl.a;
                                            }
                                            aubk aubkVarB = aubk.b(aublVar.c);
                                            if (aubkVarB == null) {
                                                aubkVarB = aubk.UNKNOWN_STATUS;
                                            }
                                            if (!aubkVarB.equals(aubk.OK) && !aubkVarB.equals(aubk.PENDING)) {
                                                atrj atrjVar3 = atrjVar2;
                                                assb assbVar2 = (assb) atrhVar3.h.b();
                                                String strO4 = atrjVar3.o();
                                                aubl aublVar2 = auchVar.c;
                                                if (aublVar2 == null) {
                                                    aublVar2 = aubl.a;
                                                }
                                                asry asryVar = assbVar2.c;
                                                aubk aubkVarB2 = aubk.b(aublVar2.c);
                                                if (aubkVarB2 == null) {
                                                    aubkVarB2 = aubk.UNKNOWN_STATUS;
                                                }
                                                enxk enxkVar = (enxk) asryVar.fM(aubkVarB2);
                                                atah atahVar = assbVar2.b;
                                                aubi aubiVarB = aubi.b(aublVar2.d);
                                                if (aubiVarB == null) {
                                                    aubiVarB = aubi.UNKNOWN_CAUSE;
                                                }
                                                assbVar2.c(strO4, 2, enxkVar, (enxi) atahVar.fM(aubiVarB), auibVar2);
                                            }
                                            int iOrdinal = aubkVarB.ordinal();
                                            if (iOrdinal == 0) {
                                                ((eksl) ((eksl) atrh.a.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 225, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group operation returned UNKNOWN_STATUS.");
                                                return cbcw.k();
                                            }
                                            if (iOrdinal == 1 || iOrdinal == 2) {
                                                return cbcw.i();
                                            }
                                            if (iOrdinal == 3) {
                                                ((eksl) ((eksl) atrh.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 219, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group failed transiently.");
                                                return cbcw.m();
                                            }
                                            if (iOrdinal != 4) {
                                                throw new IllegalStateException("Unrecognized ChatApiResult.Status");
                                            }
                                            ((eksl) ((eksl) atrh.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 222, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group failed permanently.");
                                            return cbcw.k();
                                        }
                                    }, atrhVar3.b);
                                }
                            };
                            eosc eoscVar = atrhVar2.b;
                            return eijuVarG.i(eoozVar, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: atrf
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    ((assb) atrhVar2.h.b()).c(atrjVar.o(), 2, enxk.CHAT_API_FAILED_PERMANENTLY, ((IllegalArgumentException) obj3) instanceof asrb ? enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT : enxi.CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS, auibVar);
                                    return cbcw.k();
                                }
                            }, eoscVar);
                        }
                    }, atrhVar.b);
                }
            }, this.b);
        }
        avoe avoeVarB3 = avoe.b(aucxVar.d);
        if (avoeVarB3 == null) {
            avoeVarB3 = avoe.NONE;
        }
        return b(conversationIdType, avoeVarB3);
    }
}
