package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekle implements ekkk {
    public static final ekle a = new ekle();

    public static final eklg g(eklh eklhVar, Object obj, int i, eklg eklgVar) {
        ReferenceQueue referenceQueue = eklhVar.g;
        return eklgVar == null ? new eklg(referenceQueue, obj, i) : new eklf(referenceQueue, obj, i, eklgVar);
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj a(ekkn ekknVar, ekkj ekkjVar, ekkj ekkjVar2) {
        eklh eklhVar = (eklh) ekknVar;
        eklg eklgVar = (eklg) ekkjVar;
        eklg eklgVar2 = (eklg) ekkjVar2;
        Object obj = eklgVar.get();
        if (obj == null || ekkn.m(eklgVar)) {
            return null;
        }
        eklg eklgVarG = g(eklhVar, obj, eklgVar.a, eklgVar2);
        eklgVarG.b = eklgVar.b.b(eklhVar.h, eklgVarG);
        return eklgVarG;
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj b(ekkn ekknVar, Object obj, int i, ekkj ekkjVar) {
        return g((eklh) ekknVar, obj, i, (eklg) ekkjVar);
    }

    @Override // defpackage.ekkk
    public final /* synthetic */ ekkn c(eklm eklmVar, int i) {
        return new eklh(eklmVar, i);
    }

    @Override // defpackage.ekkk
    public final ekkp d() {
        return ekkp.WEAK;
    }

    @Override // defpackage.ekkk
    public final ekkp e() {
        return ekkp.WEAK;
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ void f(ekkn ekknVar, ekkj ekkjVar, Object obj) {
        eklg eklgVar = (eklg) ekkjVar;
        eklj ekljVar = eklgVar.b;
        eklgVar.b = new eklk(((eklh) ekknVar).h, obj, eklgVar);
        ekljVar.clear();
    }
}
