package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekla implements ekkk {
    public static final ekla a = new ekla();

    public static final eklc g(ekld ekldVar, Object obj, int i, eklc eklcVar) {
        ReferenceQueue referenceQueue = ekldVar.g;
        return eklcVar == null ? new eklc(referenceQueue, obj, i) : new eklb(referenceQueue, obj, i, eklcVar);
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj a(ekkn ekknVar, ekkj ekkjVar, ekkj ekkjVar2) {
        ekld ekldVar = (ekld) ekknVar;
        eklc eklcVar = (eklc) ekkjVar;
        eklc eklcVar2 = (eklc) ekkjVar2;
        Object obj = eklcVar.get();
        if (obj == null) {
            return null;
        }
        eklc eklcVarG = g(ekldVar, obj, eklcVar.a, eklcVar2);
        eklcVarG.b = eklcVar.b;
        return eklcVarG;
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj b(ekkn ekknVar, Object obj, int i, ekkj ekkjVar) {
        return g((ekld) ekknVar, obj, i, (eklc) ekkjVar);
    }

    @Override // defpackage.ekkk
    public final /* synthetic */ ekkn c(eklm eklmVar, int i) {
        return new ekld(eklmVar, i);
    }

    @Override // defpackage.ekkk
    public final ekkp d() {
        return ekkp.WEAK;
    }

    @Override // defpackage.ekkk
    public final ekkp e() {
        return ekkp.STRONG;
    }

    @Override // defpackage.ekkk
    public final /* synthetic */ void f(ekkn ekknVar, ekkj ekkjVar, Object obj) {
        ((eklc) ekkjVar).b = obj;
    }
}
