package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajeu implements ajfr {
    public final fcsu a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public ajeu(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajfr
    public final feeg a(feds fedsVar) {
        feef feefVar = (feef) feeg.a.createBuilder();
        evsl evslVar = fedt.b;
        fedq fedqVar = (fedq) fedt.a.createBuilder();
        fedqVar.copyOnWrite();
        fedt fedtVar = (fedt) fedqVar.instance;
        fedtVar.g = fedsVar.i;
        fedtVar.c |= 128;
        feefVar.e(evslVar, (fedt) fedqVar.build());
        return (feeg) feefVar.build();
    }

    @Override // defpackage.ajfr
    public final feeg b(final ajlt ajltVar, final boolean z, final boolean z2) {
        return (feeg) ConcurrentMap.EL.computeIfAbsent(this.b, bary.b(ajltVar.b().a()), new Function() { // from class: ajet
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fedq fedqVar = (fedq) fedt.a.createBuilder();
                fedqVar.copyOnWrite();
                fedt fedtVar = (fedt) fedqVar.instance;
                fedtVar.c |= 8;
                boolean z3 = z;
                fedtVar.d = z3;
                fedw fedwVar = (fedw) fedx.a.createBuilder();
                ajlt ajltVar2 = ajltVar;
                boolean z4 = ajltVar2.g() instanceof amwf;
                fedwVar.copyOnWrite();
                fedx fedxVar = (fedx) fedwVar.instance;
                fedxVar.b |= 1;
                fedxVar.c = z4;
                boolean z5 = ajltVar2.g() instanceof uij;
                fedwVar.copyOnWrite();
                fedx fedxVar2 = (fedx) fedwVar.instance;
                fedxVar2.b |= 16;
                fedxVar2.g = z5;
                boolean z6 = le.z(ajltVar2.g().b());
                fedwVar.copyOnWrite();
                fedx fedxVar3 = (fedx) fedwVar.instance;
                fedxVar3.b |= 4;
                fedxVar3.e = z6;
                boolean z7 = ajltVar2.g() instanceof amsy;
                fedwVar.copyOnWrite();
                fedx fedxVar4 = (fedx) fedwVar.instance;
                fedxVar4.b |= 8;
                fedxVar4.f = z7;
                boolean zM = le.m(ajltVar2.g().b());
                fedwVar.copyOnWrite();
                fedx fedxVar5 = (fedx) fedwVar.instance;
                fedxVar5.b |= 2;
                fedxVar5.d = zM;
                fedx fedxVar6 = (fedx) fedwVar.build();
                fedu feduVar = (fedu) fedy.a.createBuilder();
                int i = z2 ? 5 : ajltVar2.a() == ajls.b ? 3 : (z3 || (ajltVar2.g() instanceof amsv)) ? 4 : ajltVar2.g() instanceof amwf ? 2 : 1;
                ajeu ajeuVar = this.a;
                feduVar.copyOnWrite();
                fedy fedyVar = (fedy) feduVar.instance;
                fedyVar.c = i - 1;
                fedyVar.b |= 1;
                enmr enmrVarD = ((cozg) ajeuVar.a.b()).d();
                feduVar.copyOnWrite();
                fedy fedyVar2 = (fedy) feduVar.instance;
                fedyVar2.d = enmrVarD.e;
                fedyVar2.b |= 2;
                feduVar.copyOnWrite();
                fedy fedyVar3 = (fedy) feduVar.instance;
                fedxVar6.getClass();
                fedyVar3.f = fedxVar6;
                fedyVar3.b |= 8;
                feduVar.copyOnWrite();
                fedy fedyVar4 = (fedy) feduVar.instance;
                fedyVar4.b |= 4;
                fedyVar4.e = ajltVar2 instanceof ajmy;
                fedy fedyVar5 = (fedy) feduVar.build();
                fedqVar.copyOnWrite();
                fedt fedtVar2 = (fedt) fedqVar.instance;
                fedyVar5.getClass();
                fedtVar2.f = fedyVar5;
                fedtVar2.c |= 64;
                if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
                    ajmc ajmcVarD = ajltVar2.d();
                    if (ajmcVarD instanceof ajlr) {
                        boolean z8 = ((ajlr) ajmcVarD).a().g().z();
                        fedqVar.copyOnWrite();
                        fedt fedtVar3 = (fedt) fedqVar.instance;
                        fedtVar3.c |= 32;
                        fedtVar3.e = z8;
                    }
                }
                feef feefVar = (feef) feeg.a.createBuilder();
                feefVar.e(fedt.b, (fedt) fedqVar.build());
                return (feeg) feefVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
