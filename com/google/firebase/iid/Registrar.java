package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.Registrar;
import defpackage.erzj;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escc;
import defpackage.escf;
import defpackage.escr;
import defpackage.esft;
import defpackage.esfx;
import defpackage.esgh;
import defpackage.esgl;
import defpackage.esgt;
import defpackage.eshc;
import defpackage.eslh;
import defpackage.esli;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(escc esccVar) {
        erzj erzjVar = (erzj) esccVar.e(erzj.class);
        return new FirebaseInstanceId(erzjVar, new esgh(erzjVar.a()), esfx.a(), esfx.a(), esccVar.b(esli.class), esccVar.b(esft.class), (eshc) esccVar.e(eshc.class));
    }

    public static /* synthetic */ esgt lambda$getComponents$1(escc esccVar) {
        return new esgl((FirebaseInstanceId) esccVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<esca<?>> getComponents() {
        esbz esbzVarB = esca.b(FirebaseInstanceId.class);
        esbzVarB.b(new escr(erzj.class, 1, 0));
        esbzVarB.b(new escr(esli.class, 0, 1));
        esbzVarB.b(new escr(esft.class, 0, 1));
        esbzVarB.b(new escr(eshc.class, 1, 0));
        esbzVarB.c = new escf() { // from class: esgi
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return Registrar.lambda$getComponents$0(esccVar);
            }
        };
        esbzVarB.c();
        esca escaVarA = esbzVarB.a();
        esbz esbzVarB2 = esca.b(esgt.class);
        esbzVarB2.b(new escr(FirebaseInstanceId.class, 1, 0));
        esbzVarB2.c = new escf() { // from class: esgj
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return Registrar.lambda$getComponents$1(esccVar);
            }
        };
        return Arrays.asList(escaVarA, esbzVarB2.a(), eslh.a("fire-iid", "21.1.1"));
    }
}
