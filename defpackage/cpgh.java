package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpgh implements cpgf {
    static final cczi a = cdag.h(cdag.b, "disable_logging_archive_api_impl", false);
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/archive/ArchiveApiImpl");
    final cqce c = cqce.g("Bugle", "ArchiveApiImpl");
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final bxlc g;
    public final aypj h;
    public final fcsu i;
    public final aijz j;
    public final crtd k;
    private final dqsn l;

    public cpgh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, bxlc bxlcVar, aypj aypjVar, dqsn dqsnVar, fcsu fcsuVar4, aijz aijzVar, crtd crtdVar) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = bxlcVar;
        this.h = aypjVar;
        this.l = dqsnVar;
        this.i = fcsuVar4;
        this.j = aijzVar;
        this.k = crtdVar;
    }

    private final ekgb d(final ekgb ekgbVar, final bvdk bvdkVar, final elka elkaVar, final boolean z) {
        ecem.b();
        return (ekgb) this.l.c("ArchiveApiImpl#setStatusOnConversations", new ejxr() { // from class: cpgg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() throws Throwable {
                cpgh cpghVar;
                bvdk bvdkVar2;
                HashMap map = new HashMap();
                final ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    cpghVar = this.a;
                    if (i2 >= size) {
                        break;
                    }
                    ConversationIdType conversationIdType = (ConversationIdType) ekgbVar2.get(i2);
                    bvdk bvdkVarS = ((bakt) cpghVar.d.b()).s(conversationIdType);
                    if (bvdkVarS != null) {
                        map.put(conversationIdType, bvdkVarS);
                    }
                    i2++;
                }
                cqce cqceVar = cpghVar.c;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Previous archive status of conversations");
                cqbdVarC.A("conversationToPreviousArchiveStatus", map);
                cqbdVarC.r();
                final bare bareVar = (bare) cpghVar.e.b();
                ecem.b();
                cawi cawiVar = (cawi) cawj.a.createBuilder();
                List list = (List) Collection.EL.stream(ekgbVar2).map(new Function() { // from class: bark
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ConversationIdType) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new barj()));
                cawiVar.copyOnWrite();
                cawj cawjVar = (cawj) cawiVar.instance;
                evtg evtgVar = cawjVar.c;
                if (!evtgVar.c()) {
                    cawjVar.c = evsn.mutableCopy(evtgVar);
                }
                final bvdk bvdkVar3 = bvdkVar;
                evpz.addAll(list, cawjVar.c);
                int iOrdinal = bvdkVar3.ordinal();
                cawiVar.copyOnWrite();
                cawj cawjVar2 = (cawj) cawiVar.instance;
                cawjVar2.b |= 1;
                cawjVar2.d = iOrdinal;
                final cawj cawjVar3 = (cawj) cawiVar.build();
                ekgb ekgbVar3 = (ekgb) bareVar.b.c("ConversationDatabaseOperationsImpl#setConversationsArchiveStatus", new ejxr() { // from class: barc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        ecem.b();
                        bare bareVar2 = bareVar;
                        ejwl.l(bareVar2.b.i());
                        final ekfw ekfwVar = new ekfw();
                        for (ConversationIdType conversationIdType2 : ekgbVar2) {
                            bvdk bvdkVar4 = bvdkVar3;
                            String[] strArr = botm.a;
                            bote boteVar = new bote();
                            boteVar.ap("setConversationsArchiveStatusLocally");
                            boteVar.h(bvdkVar4);
                            if (((bakt) bareVar2.a.b()).aj(conversationIdType2, boteVar)) {
                                ekfwVar.h(conversationIdType2);
                            }
                        }
                        cawj cawjVar4 = cawjVar3;
                        String[] strArr2 = bodn.a;
                        bodf bodfVar = new bodf();
                        bodfVar.f("setConversationsArchiveStatusLocally");
                        bodfVar.a(new Function() { // from class: bard
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bodm bodmVar = (bodm) obj;
                                bodmVar.c(ekfwVar.g());
                                return bodmVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bodfVar.d();
                        ekgb ekgbVarG = ekfwVar.g();
                        ((cazj) ((cawk) bareVar2.c.b()).a.b()).a(cbcu.f("UPDATE_ARCHIVE_STATUS", cawjVar4));
                        return ekgbVarG;
                    }
                });
                cqbd cqbdVarC2 = cqceVar.c();
                cqbdVarC2.I("ArchivedStatus modified for the following conversations.");
                cqbdVarC2.A("ConversationIds", ekgbVar3);
                cqbdVarC2.A("newArchiveStatus", bvdkVar3);
                cqbdVarC2.r();
                int size2 = ekgbVar3.size();
                while (i < size2) {
                    ConversationIdType conversationIdType2 = (ConversationIdType) ekgbVar3.get(i);
                    crtd crtdVar = cpghVar.k;
                    String strA = crtdVar.a(conversationIdType2);
                    if (bvdkVar3.f() && crtdVar.b(strA)) {
                        auvw.k(crtdVar.b, null, null, new crtc(crtdVar, strA, null), 3);
                    }
                    if (bvdkVar3.d() && !conversationIdType2.b()) {
                        if (z) {
                            cpghVar.h.e(conversationIdType2);
                        } else {
                            ekrw ekrwVarH = cpgh.b.h();
                            ekrwVarH.X(eksq.a, "BugleNotifications");
                            ekrd ekrdVar = (ekrd) ekrwVarH;
                            ekrdVar.X(cqnc.r, conversationIdType2.toString());
                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/archive/ArchiveApiImpl", "setStatusOnConversations", 175, "ArchiveApiImpl.java")).q("Archiving conversation, canceling IM notification");
                            ((cgpi) cpghVar.i.b()).a(conversationIdType2);
                        }
                    }
                    if (((Boolean) cpgh.a.e()).booleanValue()) {
                        bvdkVar2 = bvdkVar3;
                    } else {
                        elka elkaVar2 = elkaVar;
                        bvdk bvdkVar4 = (bvdk) map.get(conversationIdType2);
                        cpgj cpgjVar = (cpgj) cpghVar.f.b();
                        elki elkiVarE = cpghVar.j.e(conversationIdType2);
                        elkiVarE.getClass();
                        conversationIdType2.getClass();
                        elkaVar2.getClass();
                        bvdkVar3.getClass();
                        bvdkVar2 = bvdkVar3;
                        auvw.m(cpgjVar.e, null, new cpgi(cpgjVar, elkiVarE, conversationIdType2, elkaVar2, bvdkVar2, bvdkVar4, null), 3);
                    }
                    cpghVar.g.d(conversationIdType2);
                    i++;
                    bvdkVar3 = bvdkVar2;
                }
                return ekgbVar3;
            }
        });
    }

    @Override // defpackage.cpgf
    public final boolean a(ConversationIdType conversationIdType, bvdk bvdkVar, elka elkaVar) {
        ecem.b();
        eieu eieuVarK = eiiy.k("ArchiveApiImpl::setStatusOnConversation");
        try {
            boolean zB = b(conversationIdType, bvdkVar, elkaVar, true);
            eieuVarK.close();
            return zB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpgf
    public final boolean b(ConversationIdType conversationIdType, bvdk bvdkVar, elka elkaVar, boolean z) {
        ecem.b();
        return d(ekgb.r(conversationIdType), bvdkVar, elkaVar, z).size() == 1;
    }

    @Override // defpackage.cpgf
    public final ekgb c(ekgb ekgbVar, bvdk bvdkVar, elka elkaVar) {
        ecem.b();
        return d(ekgbVar, bvdkVar, elkaVar, true);
    }
}
