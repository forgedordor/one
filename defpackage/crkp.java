package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crkp extends cayv {
    public final fcsu a;
    public final ayca b;
    public final eosd c;
    public final fcsu d;
    public final fcsu e;
    public final cogw f;
    private final ayez g;

    public crkp(ayez ayezVar, ayca aycaVar, fcsu fcsuVar, eosd eosdVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar) {
        this.a = fcsuVar;
        this.b = aycaVar;
        this.g = ayezVar;
        this.c = eosdVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = cogwVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RequestSmartSuggestionsHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return crkr.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final crkr crkrVar = (crkr) evuhVar;
        return eijx.h(new eooy() { // from class: crkn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                crkp crkpVar = this.a;
                if (!((crlk) crkpVar.a.b()).b()) {
                    crkp.E.n("Handler was called even though smart replies are not enabled.");
                    return eijx.e(cbcw.i());
                }
                crkr crkrVar2 = crkrVar;
                ConversationIdType conversationIdTypeB = barn.b(crkrVar2.b);
                MessageIdType messageIdTypeB = bary.b(crkrVar2.c);
                int i = crkrVar2.d;
                if (!crkrVar2.e) {
                    int i2 = ekgb.d;
                    return crkpVar.k(conversationIdTypeB, messageIdTypeB, i, ekoe.a);
                }
                List listN = ((baxe) crkpVar.d.b()).N(conversationIdTypeB, i);
                if (listN.isEmpty() || !((MessageCoreData) listN.get(0)).C().equals(messageIdTypeB)) {
                    return eijx.e(cbcw.i());
                }
                ekgb ekgbVarA = crhk.a(((crif) crkpVar.e.b()).b(messageIdTypeB), crkpVar.f);
                return ekgbVarA.isEmpty() ? eijx.e(cbcw.i()) : crkpVar.k(conversationIdTypeB, messageIdTypeB, i, ekgbVarA);
            }
        }, this.c);
    }

    public final eiju k(ConversationIdType conversationIdType, final MessageIdType messageIdType, int i, final ekgb ekgbVar) {
        try {
            ayez ayezVar = this.g;
            return ayezVar.a(ayezVar.b(conversationIdType, messageIdType, i)).i(new eooz() { // from class: crko
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final crbg crbgVar = (crbg) obj;
                    if (crbgVar == null) {
                        return eijx.e(cbcw.i());
                    }
                    final ekgb ekgbVar2 = ekgbVar;
                    ArrayList arrayList = new ArrayList(crbgVar.b);
                    List list = crbgVar.a;
                    if (!ekgbVar2.isEmpty()) {
                        list = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: crkh
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return (((ezgi) obj2).b & 1) != 0;
                            }
                        }).filter(new Predicate() { // from class: crki
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                ezgg ezggVar = ((ezgi) obj2).e;
                                if (ezggVar == null) {
                                    ezggVar = ezgg.b;
                                }
                                return ezggVar.p != 0;
                            }
                        }).collect(ekcv.a);
                    }
                    MessageIdType messageIdType2 = messageIdType;
                    final crkp crkpVar = this.a;
                    final ArrayList arrayList2 = new ArrayList(list);
                    return crkpVar.b.d(messageIdType2, arrayList, new Supplier() { // from class: crkj
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return arrayList2;
                        }
                    }, new Supplier() { // from class: crkk
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return crbgVar.c;
                        }
                    }, new Supplier() { // from class: crkl
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return crbgVar.d;
                        }
                    }).h(new ejvr() { // from class: crkm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekgb ekgbVar3 = ekgbVar2;
                            if (!ekgbVar3.isEmpty()) {
                                ((crif) crkpVar.e.b()).m(ekgbVar3);
                            }
                            return cbcw.i();
                        }
                    }, crkpVar.c);
                }
            }, this.c);
        } catch (IllegalStateException unused) {
            cqbd cqbdVarB = E.b();
            cqbdVarB.I(String.format("Caught an exception while requesting smart suggestions for conversationId: %s, targetMessageId: %s", conversationIdType, messageIdType));
            cqbdVarB.r();
            return eijx.e(cbcw.i());
        }
    }
}
