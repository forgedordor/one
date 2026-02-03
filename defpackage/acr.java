package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acr {
    public static final add a(adx adxVar, fdap fdapVar, hml hmlVar) {
        final adx adxVar2;
        hsc.a(adxVar, hmlVar);
        final hsf hsfVarA = hsc.a(fdapVar, hmlVar);
        Object[] objArr = new Object[0];
        Object objF = hmlVar.f();
        Object obj = hmk.a;
        if (objF == obj) {
            objF = new fdae() { // from class: acn
                @Override // defpackage.fdae
                public final Object invoke() {
                    return UUID.randomUUID().toString();
                }
            };
            hmlVar.y(objF);
        }
        final String str = (String) hxy.e(objArr, null, (fdae) objF, hmlVar, 3072, 6);
        hpt hptVar = ada.a;
        adr adrVar = (adr) hmlVar.e(ada.a);
        if (adrVar == null) {
            hmlVar.v(1213380307);
            Object baseContext = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof adr) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            adrVar = (adr) baseContext;
        } else {
            hmlVar.v(1213379439);
        }
        hmlVar.o();
        if (adrVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final adq adqVarD = adrVar.d();
        Object objF2 = hmlVar.f();
        if (objF2 == obj) {
            objF2 = new acm();
            hmlVar.y(objF2);
        }
        final acm acmVar = (acm) objF2;
        Object objF3 = hmlVar.f();
        if (objF3 == obj) {
            objF3 = new add(acmVar);
            hmlVar.y(objF3);
        }
        add addVar = (add) objF3;
        boolean zF = hmlVar.F(acmVar) | hmlVar.F(adqVarD) | hmlVar.D(str) | hmlVar.F(adxVar) | hmlVar.D(hsfVarA);
        Object objF4 = hmlVar.f();
        if (zF || objF4 == obj) {
            adxVar2 = adxVar;
            objF4 = new fdap() { // from class: aco
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    final hsf hsfVar = hsfVarA;
                    adj adjVarB = adqVarD.b(str, adxVar2, new adi() { // from class: acp
                        @Override // defpackage.adi
                        public final void a(Object obj3) {
                            ((fdap) hsfVar.a()).invoke(obj3);
                        }
                    });
                    acm acmVar2 = acmVar;
                    acmVar2.a = adjVarB;
                    return new acq(acmVar2);
                }
            };
            hmlVar.y(objF4);
        } else {
            adxVar2 = adxVar;
        }
        fdap fdapVar2 = (fdap) objF4;
        boolean zD = hmlVar.D(adqVarD) | hmlVar.D(str) | hmlVar.D(adxVar2);
        Object objF5 = hmlVar.f();
        if (zD || objF5 == obj) {
            objF5 = new hnw(fdapVar2);
            hmlVar.y(objF5);
        }
        return addVar;
    }
}
