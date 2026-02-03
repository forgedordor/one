package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejok implements ejop {
    @Override // defpackage.ejop
    public final ArrayList a(ezcy ezcyVar, Locale locale) {
        locale.getClass();
        ArrayList arrayList = new ArrayList();
        if ((ezcyVar.c & 2) != 0) {
            ezdx ezdxVar = ezcyVar.f;
            if (ezdxVar == null) {
                ezdxVar = ezdx.a;
            }
            if (ezdxVar.b.size() > 0 && ejoj.a(ezcyVar).f.size() > 0) {
                for (ezds ezdsVar : ejoj.a(ezcyVar).f) {
                    eyzy eyzyVarB = eyzy.b(ezdsVar.e);
                    if (eyzyVarB == null) {
                        eyzyVarB = eyzy.UNRECOGNIZED;
                    }
                    if (eyzyVarB == eyzy.OTP && ezdsVar.c == 2) {
                        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                        ezghVar.getClass();
                        ezei ezeiVar = ezdsVar.c == 2 ? (ezei) ezdsVar.d : ezei.a;
                        ezeiVar.getClass();
                        ezghVar.copyOnWrite();
                        ezgi ezgiVar = (ezgi) ezghVar.instance;
                        ezgiVar.d = ezeiVar;
                        ezgiVar.c = 18;
                        arrayList.add(ezau.a(ezghVar));
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
