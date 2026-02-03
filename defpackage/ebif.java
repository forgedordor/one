package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebif {
    public static final /* synthetic */ int a = 0;
    private static final ekgp b;
    private static final ekfk c;
    private static final ekgp d;
    private static final ekgp e;
    private static final ekfk f;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(fgyk.class, 35);
        ekgiVar.i(fgzq.class, 33);
        ekgiVar.i(fgwi.class, 1);
        ekgiVar.i(fgwe.class, 28);
        b = ekgiVar.c();
        ekfi ekfiVar = new ekfi();
        ekfiVar.d(fgyk.class, ewmm.DNS_QUERY_TYPE_NAPTR);
        ekfiVar.d(fgzq.class, ewmm.DNS_QUERY_TYPE_SRV);
        ekfiVar.d(fgwi.class, ewmm.DNS_QUERY_TYPE_A);
        ekfiVar.d(fgwe.class, ewmm.DNS_QUERY_TYPE_AAAA);
        c = ekfiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i(0, ewmk.DNS_QUERY_RESULT_SUCCESS);
        ekgiVar2.i(3, ewmk.DNS_QUERY_RESULT_FAILURE);
        ekgiVar2.i(4, ewmk.DNS_QUERY_RESULT_FAILURE);
        ekgiVar2.i(2, ewmk.DNS_QUERY_RESULT_FAILURE);
        ekgiVar2.i(1, ewmk.DNS_QUERY_RESULT_FAILURE);
        d = ekgiVar2.c();
        ekgi ekgiVar3 = new ekgi();
        ekgiVar3.i(3, ewmi.DNS_FAILURE_TYPE_HOST_NOT_FOUND);
        ekgiVar3.i(4, ewmi.DNS_FAILURE_TYPE_QUERY_TYPE_NOT_FOUND);
        ekgiVar3.i(2, ewmi.DNS_FAILURE_TYPE_TRANSIENT);
        ekgiVar3.i(1, ewmi.DNS_FAILURE_TYPE_GENERIC);
        e = ekgiVar3.c();
        ekfi ekfiVar2 = new ekfi();
        ekfiVar2.d(ClassCastException.class, ewmf.DNS_CLIENT_EXCEPTION_TYPE_CLASS_CAST);
        ekfiVar2.d(fhae.class, ewmf.DNS_CLIENT_EXCEPTION_TYPE_TEXT_PARSE);
        ekfiVar2.d(ExceptionInInitializerError.class, ewmf.DNS_CLIENT_EXCEPTION_TYPE_EXCEPTION_IN_INITIALIZATION_ERROR);
        ekfiVar2.d(NoClassDefFoundError.class, ewmf.DNS_CLIENT_EXCEPTION_TYPE_NO_CLASS_DEF_FOUND_ERROR);
        ekfiVar2.d(RuntimeException.class, ewmf.DNS_CLIENT_EXCEPTION_TYPE_RUNTIME);
        f = ekfiVar2.c();
    }

    static int a(Class cls) {
        Integer num = (Integer) b.get(cls);
        cls.getName();
        num.getClass();
        return num.intValue();
    }

    static ebhy b(String str, Class cls, String[] strArr) {
        long jE = e();
        String str2 = strArr.length == 0 ? null : strArr[0];
        str.getClass();
        return new ebgu(str, (ewmm) c.getOrDefault(cls, ewmm.DNS_QUERY_TYPE_UNKNOWN), str2, jE, false);
    }

    public static ebhz c(ebhy ebhyVar, Throwable th) {
        long jE = e();
        ewmf ewmfVar = (ewmf) f.getOrDefault(th.getClass(), ewmf.DNS_CLIENT_EXCEPTION_TYPE_UNKNOWN);
        ekgb ekgbVar = ebhz.g;
        return new ebgv(ebhyVar, ewmk.DNS_QUERY_RESULT_FAILURE, ebhz.g, Optional.of(ewmi.DNS_FAILURE_TYPE_CLIENT_EXCEPTION), Optional.of(ewmfVar), jE);
    }

    static ebhz d(ebip ebipVar, ebhy ebhyVar, List list) {
        List list2 = (list == null || list.isEmpty()) ? null : (List) Collection.EL.stream(list).map(new Function() { // from class: ebie
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fgzh fgzhVar = (fgzh) obj;
                boolean z = fgzhVar instanceof fgyk;
                int i = ebif.a;
                if (z) {
                    return ((fgyk) fgzhVar).c.b(true);
                }
                if (fgzhVar instanceof fgzq) {
                    return ((fgzq) fgzhVar).d.b(true);
                }
                if (fgzhVar instanceof fgwi) {
                    return ((fgwi) fgzhVar).e().getHostAddress();
                }
                if (fgzhVar instanceof fgwe) {
                    return ((fgwe) fgzhVar).e().getHostAddress();
                }
                throw new IllegalStateException("unexpected record type in response");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        long jE = e();
        ewmk ewmkVar = (ewmk) d.getOrDefault(Integer.valueOf(ebipVar.a()), ewmk.DNS_QUERY_RESULT_UNKNOWN);
        ewmi ewmiVar = ebipVar.a() != 0 ? (ewmi) e.getOrDefault(Integer.valueOf(ebipVar.a()), ewmi.DNS_FAILURE_TYPE_UNKNOWN) : null;
        ekgb ekgbVar = ebhz.g;
        if (ewmk.DNS_QUERY_RESULT_SUCCESS.equals(ewmkVar)) {
            ejwl.b(ewmiVar == null, "expected null failure type on success");
        } else if (ewmk.DNS_QUERY_RESULT_FAILURE.equals(ewmkVar)) {
            ejwl.b(ewmiVar != null, "expected failure type");
        }
        if (list2 == null) {
            list2 = ebhz.g;
        }
        return new ebgv(ebhyVar, ewmkVar, list2, Optional.ofNullable(ewmiVar), Optional.empty(), jE);
    }

    private static long e() {
        return System.nanoTime() / 1000000;
    }
}
