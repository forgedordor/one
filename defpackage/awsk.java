package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsk implements awms {
    public final byeq a;
    private final fcyh b;

    public awsk(fcyh fcyhVar, byeq byeqVar) {
        fcyhVar.getClass();
        byeqVar.getClass();
        this.b = fcyhVar;
        this.a = byeqVar;
    }

    public static final awqi c(awmv awmvVar) {
        String[] strArr = awse.a;
        awqj awqjVar = new awqj();
        awqjVar.c(awpy.a);
        awmt awmtVar = (awmt) awmvVar;
        awqjVar.h(awmtVar.c);
        awqjVar.d(awmtVar.d);
        awml awmlVar = awmtVar.b;
        awqjVar.e(awmlVar != null ? (String) awmlVar.b : null);
        awqjVar.i(awmtVar.e);
        awqjVar.f(awmtVar.g);
        awqjVar.g(awmtVar.h);
        evqs evqsVar = awmtVar.f;
        awqjVar.l(evqsVar != null ? evqsVar.I() : null);
        awqjVar.k(awmtVar.i);
        awqjVar.j(awmtVar.j);
        return awqjVar;
    }

    @Override // defpackage.awms
    public final Object a(List list, fcxy fcxyVar) {
        return list.isEmpty() ? fcvp.a : fdin.a(eicg.a(this.b), new awsi(null, list, this), fcxyVar);
    }

    @Override // defpackage.awms
    public final Object b(final Map map, fcxy fcxyVar) {
        final ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            awqi awqiVarC = c(((awmr) entry.getValue()).a);
            awqiVarC.m(awjg.a((awpx) entry.getKey()));
            arrayList.add(awqiVarC.a());
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : map.entrySet()) {
            awjl awjlVarA = awjg.a((awpx) entry2.getKey());
            Set<awnk> set = ((awmr) entry2.getValue()).b;
            ArrayList arrayList3 = new ArrayList(fcva.p(set, 10));
            for (awnk awnkVar : set) {
                String[] strArr = awoq.a;
                awnu awnuVar = new awnu();
                awnuVar.c(awjlVarA);
                awnuVar.b(awnkVar.a);
                arrayList3.add(awnuVar.a());
            }
            fcva.y(arrayList2, arrayList3);
        }
        eiju eijuVarB = this.a.b("GroupsTableOperations#insertGroup", new Runnable() { // from class: awsf
            @Override // java.lang.Runnable
            public final void run() {
                awqe[] awqeVarArr = (awqe[]) arrayList.toArray(new awqe[0]);
                dqru.B(awse.b(), 5, false, new BiConsumer() { // from class: awqa
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String[] strArr2 = awse.a;
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                }, (awqe[]) Arrays.copyOf(awqeVarArr, awqeVarArr.length));
                String[] strArr2 = awoq.a;
                awoi awoiVar = new awoi();
                awoiVar.f("GroupsTableOperations#insertGroup");
                final Map map2 = map;
                awoiVar.b = new awoo((awop) new Function() { // from class: awsh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        awop awopVar = (awop) obj;
                        Set setKeySet = map2.keySet();
                        ArrayList arrayList4 = new ArrayList(fcva.p(setKeySet, 10));
                        Iterator it = setKeySet.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(awjg.a((awpx) it.next()));
                        }
                        ekfw ekfwVar = new ekfw();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            ekfwVar.h(String.valueOf(awjm.b((awjl) it2.next())));
                        }
                        awopVar.ap(new dqpm("group_members.group_token", 3, awop.as(ekfwVar.g()), false));
                        return awopVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new awop()));
                awoiVar.d();
                awnr[] awnrVarArr = (awnr[]) arrayList2.toArray(new awnr[0]);
                awoq.b(5, (awnr[]) Arrays.copyOf(awnrVarArr, awnrVarArr.length));
            }
        });
        eijuVarB.getClass();
        Object objC = fdxs.c(eijuVarB, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}
