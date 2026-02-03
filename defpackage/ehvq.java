package defpackage;

import j$.util.Optional;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvq {
    public final ehvf a;
    private final fdjx b;

    public ehvq(ehvf ehvfVar, fdjx fdjxVar) {
        ehvfVar.getClass();
        fdjxVar.getClass();
        this.a = ehvfVar;
        this.b = fdjxVar;
    }

    public final lkb a(final ehvo ehvoVar) {
        evrr evrrVarA = evrr.a();
        evrrVarA.getClass();
        ehvk ehvkVar = (ehvk) ehvoVar;
        lmj lmjVar = new lmj(ehvkVar.c, evrrVarA);
        Optional optional = ehvkVar.e;
        optional.getClass();
        lne lneVar = (lne) fdct.b(optional);
        ekgb ekgbVar = ehvkVar.b;
        ekgbVar.getClass();
        return lkc.a(lmjVar, lneVar, ekgbVar, this.b, new fdae() { // from class: ehvp
            @Override // defpackage.fdae
            public final Object invoke() {
                ehvk ehvkVar2 = (ehvk) ehvoVar;
                return new File(this.a.a.b(ehvkVar2.d), ehvkVar2.a.concat(".pb"));
            }
        });
    }
}
