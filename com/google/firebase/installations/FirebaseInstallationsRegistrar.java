package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import defpackage.erzj;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escc;
import defpackage.escf;
import defpackage.escr;
import defpackage.esfp;
import defpackage.esfq;
import defpackage.esfr;
import defpackage.eshb;
import defpackage.eshc;
import defpackage.eslh;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ eshc lambda$getComponents$0(escc esccVar) {
        return new eshb((erzj) esccVar.e(erzj.class), esccVar.b(esfr.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<esca<?>> getComponents() {
        esbz esbzVarB = esca.b(eshc.class);
        esbzVarB.b(new escr(erzj.class, 1, 0));
        esbzVarB.b(new escr(esfr.class, 0, 1));
        esbzVarB.c = new escf() { // from class: eshe
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(esccVar);
            }
        };
        return Arrays.asList(esbzVarB.a(), esca.d(new esfq(), esfp.class), eslh.a("fire-installations", "17.0.2_1p"));
    }
}
