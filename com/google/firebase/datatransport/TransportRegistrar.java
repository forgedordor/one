package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import defpackage.dbgu;
import defpackage.dbgy;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escc;
import defpackage.escf;
import defpackage.escr;
import defpackage.esde;
import defpackage.esei;
import defpackage.esej;
import defpackage.eslh;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ dbgu lambda$getComponents$0(escc esccVar) {
        dbgy.b((Context) esccVar.e(Context.class));
        return dbgy.a().c();
    }

    public static /* synthetic */ dbgu lambda$getComponents$1(escc esccVar) {
        dbgy.b((Context) esccVar.e(Context.class));
        return dbgy.a().c();
    }

    public static /* synthetic */ dbgu lambda$getComponents$2(escc esccVar) {
        dbgy.b((Context) esccVar.e(Context.class));
        return dbgy.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<esca<?>> getComponents() {
        esbz esbzVarB = esca.b(dbgu.class);
        esbzVarB.a = LIBRARY_NAME;
        esbzVarB.b(new escr(Context.class, 1, 0));
        esbzVarB.c = new escf() { // from class: esek
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return TransportRegistrar.lambda$getComponents$0(esccVar);
            }
        };
        esbz esbzVarA = esca.a(new esde(esei.class, dbgu.class));
        esbzVarA.b(new escr(Context.class, 1, 0));
        esbzVarA.c = new escf() { // from class: esel
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return TransportRegistrar.lambda$getComponents$1(esccVar);
            }
        };
        esbz esbzVarA2 = esca.a(new esde(esej.class, dbgu.class));
        esbzVarA2.b(new escr(Context.class, 1, 0));
        esbzVarA2.c = new escf() { // from class: esem
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return TransportRegistrar.lambda$getComponents$2(esccVar);
            }
        };
        return Arrays.asList(esbzVarB.a(), esbzVarA.a(), esbzVarA2.a(), eslh.a(LIBRARY_NAME, "19.0.0_1p"));
    }
}
