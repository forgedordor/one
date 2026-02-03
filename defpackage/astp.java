package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class astp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations");
    public final dqsn b;

    public astp(dqsn dqsnVar) {
        this.b = dqsnVar;
    }

    public static astw a(Map.Entry entry) {
        String[] strArr = asux.a;
        astz astzVar = new astz();
        astzVar.c(((aubq) entry.getKey()).d);
        astzVar.d(((asts) entry.getValue()).a());
        astzVar.b(((asts) entry.getValue()).b());
        return astzVar.a();
    }

    public static ekgp b(Iterable iterable) {
        final ekgp ekgpVar = (ekgp) ekpo.a(iterable).collect(ekcv.a(new Function() { // from class: astk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aubq) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: astl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aubq) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        String[] strArr = asux.a;
        asus asusVar = new asus(asux.a);
        asusVar.A("getRcsCapabilities");
        asusVar.c(new Function() { // from class: astm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                asuw asuwVar = (asuw) obj;
                asuwVar.ap(new dqpm("rcs_remote_capabilities_cache.msisdn", 3, asuw.as(ekgpVar.keySet()), false));
                return asuwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return (ekgp) Collection.EL.stream(asusVar.b().A(new dqqd() { // from class: astn
            @Override // defpackage.dqqd
            public final Object a(Object obj) {
                astw astwVar = (astw) obj;
                int i = asts.b;
                aste asteVar = new aste();
                asteVar.c(astwVar.d());
                asteVar.b(astwVar.e());
                asts astsVarA = asteVar.a();
                astwVar.aA(0, "msisdn");
                aubq aubqVar = (aubq) ekgpVar.get(astwVar.a);
                aubqVar.getClass();
                return new AbstractMap.SimpleImmutableEntry(aubqVar, astsVarA);
            }
        })).collect(ekgp.v());
    }
}
