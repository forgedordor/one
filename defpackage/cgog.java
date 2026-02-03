package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgog {
    public final cgpw a;
    public final List b;
    private final Map c = new HashMap();
    private final Executor d;
    private final eosc e;

    public cgog(cgpw cgpwVar, Executor executor, eosc eoscVar, List list) {
        this.a = cgpwVar;
        this.d = executor;
        this.e = eoscVar;
        this.b = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            if (bundle.containsKey("extra_im_notification_conversation_id")) {
                this.c.put(barn.b(bundle.getString("extra_im_notification_conversation_id")), bundle);
            }
        }
    }

    public final eiju a() {
        final ArrayList arrayList = new ArrayList();
        for (final Bundle bundle : this.b) {
            if (bundle.containsKey("extra_im_notification_conversation_id") && bundle.containsKey("extra_im_notification_message_ids") && bundle.containsKey("extra_im_notification_earliest_timestamp")) {
                arrayList.add(eijx.g(new Callable() { // from class: cgoe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekgb ekgbVar;
                        Bundle bundle2 = bundle;
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("extra_im_notification_message_ids");
                        stringArrayList.getClass();
                        Stream map = Collection.EL.stream(stringArrayList).map(new cgoc());
                        int i = ekgb.d;
                        Collector collector = ekcv.a;
                        ekgb ekgbVar2 = (ekgb) map.collect(collector);
                        String string = bundle2.getString("extra_im_notification_conversation_id");
                        string.getClass();
                        long j = bundle2.getLong("extra_im_notification_earliest_timestamp");
                        ConversationIdType conversationIdTypeB = barn.b(string);
                        final cgpw cgpwVar = this.a.a;
                        if (cgpwVar.f.a()) {
                            ekgbVar = (ekgb) ((baes) cgpwVar.d.b()).e((MessageIdType[]) ekgbVar2.toArray(new MessageIdType[0])).E().map(new Function() { // from class: cgpm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((baeb) cgpwVar.e.b()).b((bdxm) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(collector);
                        } else {
                            bgvg bgvgVarE = ((bael) cgpwVar.c.b()).e(conversationIdTypeB, -1, 0);
                            String[] strArr = bgvl.a;
                            bgvk bgvkVar = new bgvk();
                            ekfw ekfwVar = new ekfw();
                            Iterator<E> it = ekgbVar2.iterator();
                            while (it.hasNext()) {
                                ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
                            }
                            bgvkVar.ap(new dqpm("messages._id", 3, bgvk.as(ekfwVar.g()), true));
                            bgvgVarE.k(new bgvh(bgvkVar));
                            ekgbVar = (ekgb) Collection.EL.stream(bgvgVarE.b().z()).map(new Function() { // from class: cgpn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((baeb) cgpwVar.e.b()).d((bfsb) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(collector);
                        }
                        baea baeaVar = (baea) Collection.EL.stream(ekgbVar.a()).findFirst().orElse(null);
                        if (baeaVar == null) {
                            return null;
                        }
                        cgos cgosVar = (cgos) cgov.a.createBuilder();
                        long jMin = Math.min(baeaVar.af() ? baeaVar.i() : baeaVar.h(), j);
                        cgosVar.copyOnWrite();
                        cgov cgovVar = (cgov) cgosVar.instance;
                        cgovVar.b |= 1;
                        cgovVar.c = jMin;
                        return new AbstractMap.SimpleEntry(string, (cgov) cgosVar.build());
                    }
                }, this.e));
            }
        }
        return eijx.l(arrayList).a(new Callable() { // from class: cgof
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) eork.q((eiju) it.next());
                    if (entry != null) {
                        cgpbVar.a((String) entry.getKey(), (cgov) entry.getValue());
                    }
                }
                return (cgpd) cgpbVar.build();
            }
        }, this.d);
    }
}
