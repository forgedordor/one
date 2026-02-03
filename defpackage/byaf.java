package defpackage;

import android.os.CancellationSignal;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.gms.appdatasearch.QuerySpecification;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byaf extends byaj {
    final /* synthetic */ Long a;
    final /* synthetic */ Set b;
    final /* synthetic */ ArrayMap c;
    final /* synthetic */ Set d;
    final /* synthetic */ Set e;
    final /* synthetic */ Set f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byaf(byak byakVar, List list, QuerySpecification querySpecification, Executor executor, kog kogVar, eigp eigpVar, CancellationSignal cancellationSignal, Long l, Set set, ArrayMap arrayMap, Set set2, Set set3, Set set4) {
        super(byakVar, list, querySpecification, executor, kogVar, eigpVar, cancellationSignal);
        this.a = l;
        this.b = set;
        this.c = arrayMap;
        this.d = set2;
        this.e = set3;
        this.f = set4;
    }

    @Override // defpackage.byaj
    public final void b(dbje dbjeVar) {
        try {
            eieu eieuVarK = eiiy.k("fetchMessageSearchResults.SearchQuery#processResult");
            try {
                if ("internal.3p:Message_no_gsa".equals(dbjeVar.a())) {
                    Map mapD = byak.d(dbjeVar);
                    ejwl.m(mapD.containsKey("conversation_id"), "expecting document to contain conversation id");
                    Long lE = byak.e(dbjeVar);
                    long jLongValue = lE.longValue();
                    long j = Long.parseLong(byak.c(mapD, "conversation_id"));
                    Long l = this.a;
                    if ((l == null || l.equals(Long.valueOf(j))) && jLongValue != -1) {
                        this.b.add(lE);
                    }
                } else if ("internal.3p:Conversation_no_gsa".equals(dbjeVar.a())) {
                    Long lE2 = byak.e(dbjeVar);
                    long jLongValue2 = lE2.longValue();
                    Long l2 = this.a;
                    if (l2 == null || l2.equals(lE2)) {
                        this.c.put(new ConversationIdType(jLongValue2), -1L);
                    }
                } else {
                    if ("internal.3p:DigitalDocument_no_gsa".equals(dbjeVar.a())) {
                        Long lE3 = byak.e(dbjeVar);
                        if (lE3.longValue() != -1) {
                            this.d.add(lE3);
                        }
                    } else {
                        ejwl.m("internal.3p:LocalBusiness_no_gsa".equals(dbjeVar.a()), "expecting document to be either from location corpus");
                        Long lE4 = byak.e(dbjeVar);
                        if (lE4.longValue() != -1) {
                            this.e.add(lE4);
                        }
                    }
                    Map mapD2 = byak.d(dbjeVar);
                    ejwl.m(mapD2.containsKey("message_id"), "expecting document to contain message id");
                    this.f.add(Long.valueOf(Long.parseLong(byak.c(mapD2, "message_id"))));
                }
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (NullPointerException | NumberFormatException e) {
            eksl ekslVar = (eksl) ((eksl) byak.a.i()).g(e);
            ekslVar.X(bxze.a, dbjeVar.b());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl$1", "processResult", 292, "IcingSearchApiImpl.java")).q("cannot get the id for result.");
        }
    }

    @Override // defpackage.byaj
    public final void c(String str, kog kogVar) {
        Set set = this.b;
        set.removeAll(this.f);
        kogVar.c(new byal(str, new bxty((Collection) Collection.EL.stream(set).map(new Function() { // from class: byac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new MessageIdType(((Long) obj).longValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new byad())), this.c, this.d, this.e)));
    }

    @Override // defpackage.byaj
    public final void d(kog kogVar) {
        Set set = this.b;
        set.removeAll(this.f);
        kogVar.b(new bxty((java.util.Collection) Collection.EL.stream(set).map(new Function() { // from class: byae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new MessageIdType(((Long) obj).longValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new byad())), this.c, this.d, this.e));
    }
}
