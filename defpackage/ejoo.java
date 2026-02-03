package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejoo implements ejop {
    /* JADX WARN: Multi-variable type inference failed */
    private static ezdv c(ezcy ezcyVar) {
        ezdx ezdxVar = ezcyVar.f;
        if (ezdxVar == null) {
            ezdxVar = ezdx.a;
        }
        ezdx ezdxVar2 = ezcyVar.f;
        if (ezdxVar2 == null) {
            ezdxVar2 = ezdx.a;
        }
        return (ezdv) ezdxVar.b.get(ezdxVar2.b.size() - 1);
    }

    @Override // defpackage.ejop
    public final ArrayList a(ezcy ezcyVar, Locale locale) {
        ArrayList arrayList = new ArrayList();
        if ((ezcyVar.c & 2) != 0) {
            ezdx ezdxVar = ezcyVar.f;
            if (ezdxVar == null) {
                ezdxVar = ezdx.a;
            }
            if (ezdxVar.b.size() > 0 && c(ezcyVar).f.size() > 0) {
                for (ezds ezdsVar : c(ezcyVar).f) {
                    eyzy eyzyVarB = eyzy.b(ezdsVar.e);
                    if (eyzyVarB == null) {
                        eyzyVarB = eyzy.UNRECOGNIZED;
                    }
                    if (eyzyVarB == eyzy.OTP && ezdsVar.c == 2) {
                        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                        ezbl ezblVar = ezbl.a;
                        ezghVar.copyOnWrite();
                        ezgi ezgiVar = (ezgi) ezghVar.instance;
                        ezblVar.getClass();
                        ezgiVar.d = ezblVar;
                        ezgiVar.c = 22;
                        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                        ezgfVar.copyOnWrite();
                        ((ezgg) ezgfVar.instance).f = 1.0f;
                        ezdh ezdhVar = (ezdh) ezdi.a.createBuilder();
                        ezdhVar.copyOnWrite();
                        ((ezdi) ezdhVar.instance).b = "Otp";
                        ezgfVar.copyOnWrite();
                        ezgg ezggVar = (ezgg) ezgfVar.instance;
                        ezdi ezdiVar = (ezdi) ezdhVar.build();
                        ezdiVar.getClass();
                        ezggVar.i = ezdiVar;
                        ezggVar.c |= 1;
                        ezal ezalVar = ezal.REGEXP;
                        ezgfVar.copyOnWrite();
                        ((ezgg) ezgfVar.instance).g = ezalVar.a();
                        ezan ezanVar = ezan.BUSINESS_MESSAGE;
                        ezgfVar.copyOnWrite();
                        ((ezgg) ezgfVar.instance).l = ezanVar.a();
                        ezghVar.copyOnWrite();
                        ezgi ezgiVar2 = (ezgi) ezghVar.instance;
                        ezgg ezggVar2 = (ezgg) ezgfVar.build();
                        ezggVar2.getClass();
                        ezgiVar2.e = ezggVar2;
                        ezgiVar2.b |= 1;
                        arrayList.add((ezgi) ezghVar.build());
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ejop
    public final /* synthetic */ void b() {
    }
}
