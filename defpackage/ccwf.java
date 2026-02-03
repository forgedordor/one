package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwf implements ccvz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;

    public ccwf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.ccvz
    public final Optional a(final String str) {
        Optional optionalOr;
        str.getClass();
        fcsu fcsuVar = this.b;
        if (!((alpc) fcsuVar.b()).d()) {
            return Optional.empty();
        }
        if (((alpc) fcsuVar.b()).f()) {
            Stream stream = Collection.EL.stream(((alpc) fcsuVar.b()).a().b);
            final fdap fdapVar = new fdap() { // from class: ccwc
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((famt) obj).c.contains(str));
                }
            };
            if (!stream.anyMatch(new Predicate() { // from class: ccwd
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
                public final boolean test(Object obj) {
                    return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                }
            })) {
                return Optional.empty();
            }
            crof crofVarJ = ((crny) this.d.b()).j();
            int i = crofVarJ.E()[0];
            if (i > 0) {
                optionalOr = Optional.of(String.valueOf(i));
            } else {
                int i2 = crofVarJ.D()[0];
                optionalOr = i2 > 0 ? Optional.of(String.valueOf(i2)) : Optional.empty();
            }
        } else {
            optionalOr = ((alpc) fcsuVar.b()).e() ? ((crmx) this.c.b()).j().or(new Supplier() { // from class: ccwe
                @Override // java.util.function.Supplier
                public final Object get() {
                    return ((crmx) this.a.c.b()).h();
                }
            }) : ((crmx) this.c.b()).j();
        }
        optionalOr.getClass();
        final fdap fdapVar2 = new fdap() { // from class: ccwa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str2;
                String str3 = (String) obj;
                evtg evtgVar = ((alpc) this.a.b.b()).a().b;
                evtgVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = evtgVar.iterator();
                while (true) {
                    str2 = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    famt famtVar = (famt) next;
                    evtg evtgVar2 = famtVar.b;
                    evtgVar2.getClass();
                    if (!evtgVar2.isEmpty()) {
                        Iterator<E> it2 = evtgVar2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String str4 = (String) it2.next();
                                str3.getClass();
                                str4.getClass();
                                if (fdgn.t(str3, str4)) {
                                    if (famtVar.c.contains(str2)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    ekrd ekrdVar = (ekrd) ccwf.a.e();
                    ekrdVar.X(cqnc.I, str2);
                    ekrdVar.X(cqnc.R, str3);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig$lambda$5", 77, "ErcsConfigRetrieverImpl.kt")).q("No ERCSConfig matched.");
                    return Optional.empty();
                }
                if (arrayList.size() > 1) {
                    ekrd ekrdVar2 = (ekrd) ccwf.a.j();
                    ekrdVar2.X(cqnc.I, str2);
                    ekrdVar2.X(cqnc.R, str3);
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig$lambda$5", 85, "ErcsConfigRetrieverImpl.kt")).q("Multiple ERCSConfigs matched.");
                    return Optional.empty();
                }
                ekrd ekrdVar3 = (ekrd) ccwf.a.h();
                ekrdVar3.X(cqnc.I, str2);
                ekrdVar3.X(cqnc.R, str3);
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig$lambda$5", 93, "ErcsConfigRetrieverImpl.kt")).q("Single ERCSConfig matched.");
                return Optional.of(fcva.X(arrayList));
            }
        };
        Optional optionalFlatMap = optionalOr.flatMap(new Function() { // from class: ccwb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar2.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        optionalFlatMap.getClass();
        return optionalFlatMap;
    }

    @Override // defpackage.ccvz
    public final boolean b(String str) {
        str.getClass();
        evtg evtgVar = ((alpc) this.b.b()).a().b;
        evtgVar.getClass();
        if (evtgVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = evtgVar.iterator();
        while (it.hasNext()) {
            if (((famt) it.next()).c.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
