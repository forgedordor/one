package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import defpackage.dbgu;
import defpackage.erzj;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escc;
import defpackage.escf;
import defpackage.escr;
import defpackage.esfi;
import defpackage.esft;
import defpackage.esgt;
import defpackage.eshc;
import defpackage.eslh;
import defpackage.esli;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(escc esccVar) {
        return new FirebaseMessaging((erzj) esccVar.e(erzj.class), (esgt) esccVar.e(esgt.class), esccVar.b(esli.class), esccVar.b(esft.class), (eshc) esccVar.e(eshc.class), (dbgu) esccVar.e(dbgu.class), (esfi) esccVar.e(esfi.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<esca<?>> getComponents() {
        esbz esbzVarB = esca.b(FirebaseMessaging.class);
        esbzVarB.a = LIBRARY_NAME;
        esbzVarB.b(new escr(erzj.class, 1, 0));
        esbzVarB.b(new escr(esgt.class, 0, 0));
        esbzVarB.b(new escr(esli.class, 0, 1));
        esbzVarB.b(new escr(esft.class, 0, 1));
        esbzVarB.b(new escr(dbgu.class, 0, 0));
        esbzVarB.b(new escr(eshc.class, 1, 0));
        esbzVarB.b(new escr(esfi.class, 1, 0));
        esbzVarB.c = new escf() { // from class: esjh
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(esccVar);
            }
        };
        esbzVarB.c();
        return Arrays.asList(esbzVarB.a(), eslh.a(LIBRARY_NAME, "23.3.2_1p"));
    }
}
