package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbo {
    public static final void a(ijb ijbVar, long j, kel kelVar, jyi jyiVar, ikb ikbVar) {
        int iA = kelVar.a(jyo.d(j));
        int iA2 = kelVar.a(jyo.c(j));
        if (iA != iA2) {
            ijbVar.f(jyiVar.o(iA, iA2), ikbVar);
        }
    }

    public static final void b(List list, kdp kdpVar, fdap fdapVar, kfl kflVar) {
        kew kewVarA = kdpVar.a(list);
        if (kflVar != null) {
            kflVar.b(null, kewVarA);
        }
        fdapVar.invoke(kewVarA);
    }

    public static final kfl c(key keyVar, kew kewVar, final kdp kdpVar, kdy kdyVar, final fdap fdapVar, fdap fdapVar2) {
        final fdci fdciVar = new fdci();
        fdap fdapVar3 = new fdap() { // from class: fbl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fbo.b((List) obj, kdpVar, fdapVar, (kfl) fdciVar.a);
                return fctx.a;
            }
        };
        kep kepVar = keyVar.a;
        kepVar.d(kewVar, kdyVar, fdapVar3, fdapVar2);
        kfl kflVar = new kfl(keyVar, kepVar);
        keyVar.b.set(kflVar);
        fdciVar.a = kflVar;
        return (kfl) fdciVar.a;
    }
}
