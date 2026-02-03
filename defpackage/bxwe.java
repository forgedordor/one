package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwe implements bxuz {
    public static final eksp a = eksp.c("BugleSearch");
    public final bxxd b;
    private final bxuh c;
    private final eosc d;
    private final bxro e;

    public bxwe(bxro bxroVar, bxuh bxuhVar, bxxd bxxdVar, eosc eoscVar) {
        this.e = bxroVar;
        this.c = bxuhVar;
        this.b = bxxdVar;
        this.d = eoscVar;
    }

    private final eiju d(bxwn bxwnVar, final bxws bxwsVar, CancellationSignal cancellationSignal) {
        eiju eijuVarG;
        if (!bxwnVar.c() && !bxwnVar.e() && !bxwnVar.f) {
            boolean z = bxwnVar.d;
            boolean z2 = (!z || bxwnVar.e == 6) && bxwnVar.d();
            boolean z3 = z && bxwnVar.e == 6 && !bxwnVar.d();
            if (z2 || z3) {
                int iIntValue = ((Integer) bxwnVar.b().map(new Function() { // from class: bxvn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((bxwq) obj).b());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
                if (bxwnVar.d()) {
                    eijuVarG = this.c.a(bxwnVar.a, iIntValue, cancellationSignal);
                } else if (bxwnVar.e()) {
                    bxuh bxuhVar = this.c;
                    final String str = bxwnVar.c;
                    if (TextUtils.isEmpty(str)) {
                        int i = ekgb.d;
                        eijuVarG = eijx.e(ekoe.a);
                    } else {
                        final bxum bxumVar = (bxum) bxuhVar;
                        eijuVarG = eijx.g(new Callable() { // from class: bxuj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List listSingletonList = Collections.singletonList(str);
                                cqaz.h();
                                bxum bxumVar2 = bxumVar;
                                cqiz cqizVar = bxumVar2.b;
                                Cursor cursorA = cqizVar.d(listSingletonList).a();
                                Cursor cursorA2 = cqizVar.c(listSingletonList).a();
                                if (cursorA != null && cursorA2 != null) {
                                    cursorA = new MergeCursor(new Cursor[]{cursorA, cursorA2});
                                } else if (cursorA == null) {
                                    cursorA = cursorA2 != null ? cursorA2 : new MatrixCursor(new String[0]);
                                }
                                return bxumVar2.b(cursorA, true, Alert.DURATION_SHOW_INDEFINITELY);
                            }
                        }, bxumVar.c);
                    }
                } else {
                    final bxum bxumVar2 = (bxum) this.c;
                    eijuVarG = eijx.g(new Callable() { // from class: bxul
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            bxum bxumVar3 = bxumVar2;
                            return bxumVar3.b(bxumVar3.b.e().a(), true, Alert.DURATION_SHOW_INDEFINITELY);
                        }
                    }, bxumVar2.c);
                }
                return eijuVarG.h(new ejvr() { // from class: bxvo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = bxwe.a;
                        bxwsVar.b((List) obj);
                        return null;
                    }
                }, this.d);
            }
        }
        return eijx.e(null);
    }

    private final eiju e(final bxwn bxwnVar, final bxws bxwsVar) {
        return eijx.g(new Callable() { // from class: bxvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byar byarVar = bxwnVar.h;
                byarVar.getClass();
                bxwsVar.c(this.a.b.e(byarVar.c));
                return null;
            }
        }, this.d);
    }

    private final eiju f(eiju eijuVar, final bxwn bxwnVar, final bxws bxwsVar) {
        if ((!bxwnVar.d() && !bxwnVar.e()) || bxwnVar.c() || ((bxwnVar.d && bxwnVar.e != 1) || bxwnVar.f)) {
            return eijx.e(null);
        }
        final Function function = new Function() { // from class: bxvp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwn bxwnVar2 = bxwnVar;
                bxwf bxwfVar = (bxwf) obj;
                if ((bxwfVar == null || bxwfVar.f()) && !TextUtils.isEmpty(bxwnVar2.a)) {
                    return null;
                }
                bxwe bxweVar = this.a;
                bxut bxutVarG = bxweVar.b.g(bxwnVar2.c, bxwfVar, ((Integer) bxwnVar2.b().map(new Function() { // from class: bxvu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((bxwq) obj2).a());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue());
                if (bxutVarG == null) {
                    return null;
                }
                bxwsVar.c(bxutVarG);
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bxvx bxvxVar = new bxvx(function);
        eosc eoscVar = this.d;
        return eijuVar.h(bxvxVar, eoscVar).e(byal.class, new ejvr() { // from class: bxvq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = bxwe.a;
                return (Void) function.apply(((byal) obj).a);
            }
        }, eoscVar);
    }

    private final eiju g(final bxwn bxwnVar, final bxws bxwsVar) {
        return (bxwnVar.d() || (bxwnVar.d && bxwnVar.e != 2)) ? eijx.e(null) : eijx.g(new Callable() { // from class: bxva
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxwn bxwnVar2 = bxwnVar;
                bxwsVar.d(this.a.b.q(bxwnVar2.b, bxwnVar2.c, bxwnVar2.f, ((Integer) bxwnVar2.b().map(new Function() { // from class: bxvr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((bxwq) obj).f());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()).cZ(new bxvf()));
                return null;
            }
        }, this.d);
    }

    private final eiju h(eiju eijuVar, final bxwn bxwnVar, final bxws bxwsVar) {
        if (bxwnVar.d && bxwnVar.e != 4) {
            return eijx.e(null);
        }
        final Function function = new Function() { // from class: bxvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwn bxwnVar2 = bxwnVar;
                bxwf bxwfVar = (bxwf) obj;
                if ((bxwfVar == null || bxwfVar.a().isEmpty()) && !TextUtils.isEmpty(bxwnVar2.a)) {
                    return null;
                }
                bxws bxwsVar2 = bxwsVar;
                bxwe bxweVar = this.a;
                bxwsVar2.e(bxweVar.b.m(bxwnVar2.b, bxwnVar2.c, bxwfVar, bxwnVar2.f, ((Integer) bxwnVar2.b().map(new Function() { // from class: bxvv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((bxwq) obj2).c());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bxvx bxvxVar = new bxvx(function);
        eosc eoscVar = this.d;
        return eijuVar.h(bxvxVar, eoscVar).e(byal.class, new ejvr() { // from class: bxvy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byal byalVar = (byal) obj;
                ((eksl) ((eksl) ((eksl) bxwe.a.j()).g(byalVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadLinksAsync", (char) 456, "MessageSearchApiImpl.java")).q("Failure occurred while handling link results from Icing. Continuing with partial results.");
                function.apply(byalVar.a);
                return null;
            }
        }, eoscVar);
    }

    private final eiju i(eiju eijuVar, final bxwn bxwnVar, final bxws bxwsVar) {
        if (bxwnVar.d && bxwnVar.e != 5) {
            return eijx.e(null);
        }
        final Function function = new Function() { // from class: bxvs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwn bxwnVar2 = bxwnVar;
                bxwf bxwfVar = (bxwf) obj;
                if ((bxwfVar == null || bxwfVar.b().isEmpty()) && !TextUtils.isEmpty(bxwnVar2.a)) {
                    return null;
                }
                bxws bxwsVar2 = bxwsVar;
                bxwe bxweVar = this.a;
                bxwsVar2.f(bxweVar.b.i(bxwnVar2.b, bxwnVar2.c, bxwfVar, bxwnVar2.f));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bxvx bxvxVar = new bxvx(function);
        eosc eoscVar = this.d;
        return eijuVar.h(bxvxVar, eoscVar).e(byal.class, new ejvr() { // from class: bxvt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byal byalVar = (byal) obj;
                ((eksl) ((eksl) ((eksl) bxwe.a.j()).g(byalVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadLocationsAsync", (char) 412, "MessageSearchApiImpl.java")).q("Failure occurred while handling location results from Icing. Continuing with partial results.");
                function.apply(byalVar.a);
                return null;
            }
        }, eoscVar);
    }

    private final eiju j(eiju eijuVar, bxwn bxwnVar, final bxws bxwsVar) {
        if (!bxwnVar.d() || !bxwnVar.c()) {
            return eijx.e(null);
        }
        final ConversationIdType conversationIdType = bxwnVar.b;
        conversationIdType.getClass();
        final Function function = new Function() { // from class: bxvz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwf bxwfVar = (bxwf) obj;
                if (bxwfVar == null || bxwfVar.f()) {
                    return null;
                }
                bxws bxwsVar2 = bxwsVar;
                ConversationIdType conversationIdType2 = conversationIdType;
                bxwe bxweVar = this.a;
                Stream map = Collection.EL.stream((List) Collection.EL.stream(bxweVar.b.j(conversationIdType2, bxwfVar.c())).map(new Function() { // from class: bxvg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eksp ekspVar = bxwe.a;
                        return ((MessageIdType) obj2).b();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bxvh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }))).map(new Function() { // from class: bxvi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Long.valueOf(Long.parseLong((String) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                int i = ekgb.d;
                bxwsVar2.g((List) map.collect(ekcv.a));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bxvx bxvxVar = new bxvx(function);
        eosc eoscVar = this.d;
        return eijuVar.h(bxvxVar, eoscVar).e(byal.class, new ejvr() { // from class: bxwa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byal byalVar = (byal) obj;
                ((eksl) ((eksl) ((eksl) bxwe.a.j()).g(byalVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadMessagesInConversationAsync", (char) 252, "MessageSearchApiImpl.java")).q("Failure occurred while handling message results from Icing. Continuing with partial results.");
                function.apply(byalVar.a);
                return null;
            }
        }, eoscVar);
    }

    private final eiju k(eiju eijuVar, final bxwn bxwnVar, final bxws bxwsVar) {
        if (!bxwnVar.f || (bxwnVar.d && bxwnVar.e != 7)) {
            return eijx.e(null);
        }
        final Function function = new Function() { // from class: bxvc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                java.util.Collection collectionC;
                bxwn bxwnVar2 = bxwnVar;
                bxwf bxwfVar = (bxwf) obj;
                if ((bxwfVar == null || bxwfVar.c().isEmpty()) && !TextUtils.isEmpty(bxwnVar2.a)) {
                    return null;
                }
                bxwe bxweVar = this.a;
                ConversationIdType conversationIdType = bxwnVar2.b;
                String str = bxwnVar2.c;
                if (bxwfVar == null) {
                    int i = ekgb.d;
                    collectionC = ekoe.a;
                } else {
                    collectionC = bxwfVar.c();
                }
                bxwsVar.h(bxweVar.b.h(conversationIdType, str, collectionC, ((Integer) bxwnVar2.b().map(new Function() { // from class: bxvm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((bxwq) obj2).g());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bxvx bxvxVar = new bxvx(function);
        eosc eoscVar = this.d;
        return eijuVar.h(bxvxVar, eoscVar).e(byal.class, new ejvr() { // from class: bxvd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byal byalVar = (byal) obj;
                ((eksl) ((eksl) ((eksl) bxwe.a.j()).g(byalVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadStarredTexts", (char) 211, "MessageSearchApiImpl.java")).q("Failure occurred while handling starred results from Icing. Continuing with partial results.");
                function.apply(byalVar.a);
                return null;
            }
        }, eoscVar);
    }

    private final eiju l(final bxwn bxwnVar, final bxws bxwsVar) {
        return (bxwnVar.d() || (bxwnVar.d && bxwnVar.e != 3)) ? eijx.e(null) : eijx.g(new Callable() { // from class: bxvb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxwn bxwnVar2 = bxwnVar;
                bxwsVar.i(this.a.b.s(bxwnVar2.b, bxwnVar2.c, bxwnVar2.f, ((Integer) bxwnVar2.b().map(new Function() { // from class: bxve
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((bxwq) obj).h());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()).cZ(new bxvf()));
                return null;
            }
        }, this.d);
    }

    private final eiju m(SearchQuery searchQuery, bxwn bxwnVar) {
        int i;
        if (!bxwnVar.d() || (bxwnVar.d && ((i = bxwnVar.e) == 2 || i == 3 || i == 6))) {
            return eijx.e(bxwf.e());
        }
        bxro bxroVar = this.e;
        ekrw ekrwVarE = bxro.a.e();
        ekrwVarE.X(eksq.a, "BugleSearch");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceSearchApiImpl", "searchMessages", 52, "OnDeviceSearchApiImpl.kt")).q("AppSearch is disabled. Search message via Icing.");
        eiju eijuVarA = bxroVar.b.a(searchQuery);
        eijuVarA.getClass();
        return eiju.g(eijuVarA);
    }

    @Override // defpackage.bxuz
    public final eiju a(SearchQuery searchQuery) {
        bxwn bxwnVarA = bxwn.a(searchQuery);
        if (bxwnVarA.f()) {
            return eijx.e(bxwt.j().a());
        }
        boolean z = bxwnVarA.g;
        final bxws bxwsVarJ = bxwt.j();
        if (z) {
            return e(bxwnVarA, bxwsVarJ).h(new ejvr() { // from class: bxvj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = bxwe.a;
                    return bxwsVarJ.a();
                }
            }, this.d);
        }
        eiju eijuVarM = m(searchQuery, bxwnVarA);
        return eijx.b(f(eijuVarM, bxwnVarA, bxwsVarJ), j(eijuVarM, bxwnVarA, bxwsVarJ), g(bxwnVarA, bxwsVarJ), l(bxwnVarA, bxwsVarJ), i(eijuVarM, bxwnVarA, bxwsVarJ), h(eijuVarM, bxwnVarA, bxwsVarJ), d(bxwnVarA, bxwsVarJ, null), k(eijuVarM, bxwnVarA, bxwsVarJ)).h(new ejvr() { // from class: bxvk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = bxwe.a;
                return bxwsVarJ.a();
            }
        }, this.d);
    }

    @Override // defpackage.bxuz
    public final eiju b(SearchQuery searchQuery, CancellationSignal cancellationSignal) {
        bxwn bxwnVarA = bxwn.a(searchQuery);
        if (bxwnVarA.f()) {
            return eijx.e(bxwt.j().a());
        }
        boolean z = bxwnVarA.g;
        final bxws bxwsVarJ = bxwt.j();
        if (z) {
            return e(bxwnVarA, bxwsVarJ).h(new ejvr() { // from class: bxwb
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = bxwe.a;
                    return bxwsVarJ.a();
                }
            }, this.d);
        }
        eiju eijuVarM = m(searchQuery, bxwnVarA);
        return eijx.b(f(eijuVarM, bxwnVarA, bxwsVarJ), j(eijuVarM, bxwnVarA, bxwsVarJ), g(bxwnVarA, bxwsVarJ), l(bxwnVarA, bxwsVarJ), i(eijuVarM, bxwnVarA, bxwsVarJ), h(eijuVarM, bxwnVarA, bxwsVarJ), d(bxwnVarA, bxwsVarJ, cancellationSignal), k(eijuVarM, bxwnVarA, bxwsVarJ)).h(new ejvr() { // from class: bxwc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = bxwe.a;
                return bxwsVarJ.a();
            }
        }, this.d);
    }

    @Override // defpackage.bxuz
    public final bxwd c(SearchQuery searchQuery) {
        return new bxwd(bxwn.a(searchQuery));
    }
}
