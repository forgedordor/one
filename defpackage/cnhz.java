package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnhz {
    public final fcsu a;
    private final fcsu b;
    private final eosc c;

    public cnhz(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = eoscVar;
    }

    final eiju a(aubq aubqVar, String str) {
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return aubpVarB != aubp.GROUP ? eijx.e((ezol) new cnbb().fM(aubqVar)) : b(str);
    }

    final eiju b(final String str) {
        cnck cnckVar = (cnck) this.b.b();
        return cnckVar.b(cnck.a(str, emaf.TACHYGRAM_GET_ROUTING_TOKEN)).h(new ejvr() { // from class: cncg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cnck.a;
                return ((Optional) obj).flatMap(new Function() { // from class: cnbz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eksp ekspVar2 = cnck.a;
                        byte[] bArrAv = ((bojh) obj2).av();
                        if (bArrAv != null && bArrAv.length != 0) {
                            return Optional.of(evqs.x(bArrAv));
                        }
                        ((eksl) ((eksl) cnck.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getGroupRoutingTokenFromConversationBindData", 252, "TachygramDatabaseOperations.java")).q("No routing token stored in conversation for tachygram group.");
                        return Optional.empty();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, cnckVar.d).h(new ejvr() { // from class: cnhx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final ezok ezokVarA = cnln.a();
                felm felmVar = felm.GROUP_ID;
                ezokVarA.copyOnWrite();
                ezol ezolVar = (ezol) ezokVarA.instance;
                ezol ezolVar2 = ezol.a;
                ezolVar.b = felmVar.a();
                ezokVarA.copyOnWrite();
                ezol ezolVar3 = (ezol) ezokVarA.instance;
                String str2 = str;
                str2.getClass();
                ezolVar3.c = str2;
                ((Optional) obj).ifPresent(new Consumer() { // from class: cnhy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ezok ezokVar = ezokVarA;
                        evqs evqsVar = (evqs) obj2;
                        ezokVar.copyOnWrite();
                        ezol ezolVar4 = (ezol) ezokVar.instance;
                        ezol ezolVar5 = ezol.a;
                        evqsVar.getClass();
                        ezolVar4.e = evqsVar;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return (ezol) ezokVarA.build();
            }
        }, this.c);
    }

    final eiju c(ezol ezolVar) {
        final cnck cnckVar = (cnck) this.b.b();
        return cnckVar.b(cnck.a(ezolVar.c, emaf.TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER)).h(new ejvr() { // from class: cncb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final cnck cnckVar2 = cnckVar;
                return ((Optional) obj).flatMap(new Function() { // from class: cncf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String strAd = ((bojh) obj2).ad();
                        boolean zIsEmpty = TextUtils.isEmpty(strAd);
                        cnck cnckVar3 = cnckVar2;
                        if (!zIsEmpty) {
                            cnckVar3.b.e("Bugle.Tachygram.ConferenceUriLookup.Counts", cncj.a(1));
                            return Optional.of(strAd);
                        }
                        ((eksl) ((eksl) cnck.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConferenceUriFromConversationBindData", 233, "TachygramDatabaseOperations.java")).q("Conversation does not contain RCS conference URI for tachygram group.");
                        cnckVar3.b.e("Bugle.Tachygram.ConferenceUriLookup.Counts", cncj.a(2));
                        return Optional.empty();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, cnckVar.d).h(new ejvr() { // from class: cnhv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final cnhz cnhzVar = this.a;
                return ((Optional) obj).map(new Function() { // from class: cnhw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((asqx) cnhzVar.a.b()).e((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.c);
    }
}
