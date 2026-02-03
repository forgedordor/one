package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.erzk;
import defpackage.erzl;
import defpackage.erzm;
import defpackage.erzn;
import defpackage.erzx;
import defpackage.erzy;
import defpackage.erzz;
import defpackage.esaa;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escr;
import defpackage.esde;
import defpackage.fcva;
import defpackage.fdjq;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<esca<?>> getComponents() {
        esbz esbzVarA = esca.a(new esde(erzx.class, fdjq.class));
        esbzVarA.b(new escr(new esde(erzx.class, Executor.class), 1, 0));
        esbzVarA.c = erzk.a;
        esbz esbzVarA2 = esca.a(new esde(erzz.class, fdjq.class));
        esbzVarA2.b(new escr(new esde(erzz.class, Executor.class), 1, 0));
        esbzVarA2.c = erzl.a;
        esbz esbzVarA3 = esca.a(new esde(erzy.class, fdjq.class));
        esbzVarA3.b(new escr(new esde(erzy.class, Executor.class), 1, 0));
        esbzVarA3.c = erzm.a;
        esbz esbzVarA4 = esca.a(new esde(esaa.class, fdjq.class));
        esbzVarA4.b(new escr(new esde(esaa.class, Executor.class), 1, 0));
        esbzVarA4.c = erzn.a;
        return fcva.g(esbzVarA.a(), esbzVarA2.a(), esbzVarA3.a(), esbzVarA4.a());
    }
}
