package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.net.URI;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cnaj {
    private final fcsu a;
    private final fcsu b;

    public cnaj(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final eiju a(eqds eqdsVar, aubq aubqVar) {
        audj audjVar = (audj) audk.b.createBuilder();
        audjVar.a(cnct.a(eqdsVar.c));
        eqdr eqdrVar = eqdsVar.a;
        String str = eqdrVar.a.c;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        str.getClass();
        audkVar.c |= 1;
        audkVar.d = str;
        aubq aubqVarA = ((asqx) this.a.b()).a(((URI) eqdrVar.b.get()).toString(), true);
        audjVar.copyOnWrite();
        audk audkVar2 = (audk) audjVar.instance;
        aubqVarA.getClass();
        audkVar2.f = aubqVarA;
        audkVar2.c |= 8;
        aues auesVar = (aues) auet.a.createBuilder();
        eqed eqedVar = eqdsVar.b;
        String str2 = eqedVar.a;
        auesVar.copyOnWrite();
        auet auetVar = (auet) auesVar.instance;
        auetVar.b |= 1;
        auetVar.c = str2;
        audjVar.copyOnWrite();
        audk audkVar3 = (audk) audjVar.instance;
        auet auetVar2 = (auet) auesVar.build();
        auetVar2.getClass();
        audkVar3.i = auetVar2;
        audkVar3.c |= 16;
        Stream map = Collection.EL.stream(eqdsVar.d).map(new Function() { // from class: cnag
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eqea) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final ejvj ejvjVarFH = new cnbb().fH();
        Stream map2 = map.map(new Function() { // from class: cnah
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aubq) ejvjVarFH.fM((ezol) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: cnai
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aubq aubqVar2 = (aubq) obj;
                aueh auehVar = (aueh) auek.a.createBuilder();
                auehVar.copyOnWrite();
                auek auekVar = (auek) auehVar.instance;
                aubqVar2.getClass();
                auekVar.c = aubqVar2;
                auekVar.b |= 1;
                auej auejVar = auej.JOINED;
                auehVar.copyOnWrite();
                auek auekVar2 = (auek) auehVar.instance;
                auekVar2.d = auejVar.e;
                auekVar2.b |= 2;
                return (auek) auehVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        audjVar.b((Iterable) map2.collect(ekcv.a));
        audjVar.copyOnWrite();
        audk audkVar4 = (audk) audjVar.instance;
        aubqVar.getClass();
        audkVar4.m = aubqVar;
        audkVar4.c |= 256;
        audn audnVar = (audn) audo.a.createBuilder();
        eqdp eqdpVar = eqedVar.d;
        audnVar.copyOnWrite();
        audo audoVar = (audo) audnVar.instance;
        audoVar.b |= 1;
        audoVar.c = eqdpVar.b;
        audjVar.copyOnWrite();
        audk audkVar5 = (audk) audjVar.instance;
        audo audoVar2 = (audo) audnVar.build();
        audoVar2.getClass();
        audkVar5.j = audoVar2;
        audkVar5.c |= 32;
        aueb auebVarA = cnaq.a(eqedVar.c);
        audjVar.copyOnWrite();
        audk audkVar6 = (audk) audjVar.instance;
        audkVar6.n = auebVarA;
        audkVar6.c |= 512;
        return ((asrc) this.b.b()).d((audk) audjVar.build());
    }
}
