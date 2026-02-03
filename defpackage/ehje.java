package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehje implements eyif {
    public static ehlj a(final eaaa eaaaVar, final ehis ehisVar, final ebbw ebbwVar, ejwi ejwiVar) {
        eaaaVar.getClass();
        return new ehlj() { // from class: ehja
            @Override // defpackage.ehlj
            public final ListenableFuture a() throws IOException {
                final ehis ehisVar2 = ehisVar;
                if (!ehjc.a(ebbwVar)) {
                    return eorv.a;
                }
                final ehjb ehjbVar = new ehjb(eaaaVar);
                eieu eieuVarJ = eiiy.j("Registering packages with phenotype", eiey.a);
                try {
                    ekhx ekhxVarKeySet = ((ekgp) ehisVar2.f).keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : ekhxVarKeySet) {
                        Boolean bool = true;
                        bool.getClass();
                        arrayList.add(obj);
                    }
                    ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        final String strA = ehisVar2.m.a((String) it.next());
                        final ehiw ehiwVar = ehisVar2.l;
                        ListenableFuture listenableFutureSubmit = ehiwVar.c.submit(eiid.l(new Callable() { // from class: ehit
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ServiceInfo serviceInfo;
                                ekgp ekgpVarB;
                                ehiw ehiwVar2 = ehiwVar;
                                final eafw eafwVar = new eafw(ehiwVar2.b);
                                Map map = eafwVar.b;
                                final String packageName = ehiwVar2.a.getPackageName();
                                eafv eafvVar = (eafv) map.get(packageName);
                                if (eafvVar == null) {
                                    eafvVar = new eafv(eafwVar, packageName, new eafr(new ejxr() { // from class: eafq
                                        @Override // defpackage.ejxr
                                        public final Object get() {
                                            eafw eafwVar2 = eafwVar;
                                            String str = packageName;
                                            try {
                                                return Integer.valueOf(eafwVar2.a.getPackageInfo(str, 0).versionCode);
                                            } catch (PackageManager.NameNotFoundException unused) {
                                                Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(str)));
                                                return null;
                                            }
                                        }
                                    }));
                                    map.put(packageName, eafvVar);
                                }
                                int i = ekgb.d;
                                ekfw ekfwVar = new ekfw();
                                Intent intent = new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService");
                                String str = eafvVar.a;
                                loop0: while (true) {
                                    serviceInfo = null;
                                    for (ResolveInfo resolveInfo : eafvVar.e.a.queryIntentServices(intent.setPackage(str), 787072)) {
                                        if (serviceInfo == null) {
                                            if (resolveInfo.serviceInfo == null || resolveInfo.serviceInfo.metaData == null || !"com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                                                break;
                                            }
                                            serviceInfo = resolveInfo.serviceInfo;
                                        }
                                    }
                                }
                                if (serviceInfo == null) {
                                    Log.i("PhenotypeResourceReader", "unable to find any Phenotype resource metadata for ".concat(String.valueOf(str)));
                                    ekgpVarB = ekoj.a;
                                } else {
                                    csq csqVar = new csq();
                                    csq csqVar2 = new csq();
                                    Bundle bundle = serviceInfo.metaData;
                                    for (String str2 : bundle.keySet()) {
                                        boolean zStartsWith = str2.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                                        boolean zStartsWith2 = str2.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                                        if (zStartsWith || zStartsWith2) {
                                            int i2 = bundle.getInt(str2, 0);
                                            if (i2 != 0) {
                                                String str3 = (String) ekis.h(ejxk.b(':').g(str2), 1);
                                                if (zStartsWith) {
                                                    csqVar.put(str3, Integer.valueOf(i2));
                                                } else {
                                                    csqVar2.put(str3, Integer.valueOf(i2));
                                                }
                                            }
                                        }
                                    }
                                    ekgi ekgiVarH = ekgp.h(csqVar.d);
                                    for (Map.Entry entry : csqVar.entrySet()) {
                                        String str4 = (String) entry.getKey();
                                        ekgiVarH.i(str4, new eafu(eafvVar, str4, ((Integer) entry.getValue()).intValue(), ((Integer) csqVar2.getOrDefault(str4, 0)).intValue()));
                                    }
                                    ekgpVarB = ekgiVarH.b();
                                }
                                ekqg ekqgVarListIterator = ekgpVarB.values().listIterator();
                                while (ekqgVarListIterator.hasNext()) {
                                    eryi eryiVar = (eryi) ((eafu) ekqgVarListIterator.next()).b.get();
                                    if (eryiVar != null) {
                                        ekfwVar.h(eryiVar);
                                    }
                                }
                                String str5 = strA;
                                ekgb ekgbVarG = ekfwVar.g();
                                final fdap fdapVar = new fdap() { // from class: ehiu
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj2) {
                                        eryi eryiVar2 = (eryi) obj2;
                                        eryiVar2.getClass();
                                        return eryiVar2.g;
                                    }
                                };
                                return (eryi) ekmi.d(ekgbVarG, new ejvr() { // from class: ehiv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        return fdapVar.invoke(obj2);
                                    }
                                }).get(str5);
                            }
                        }));
                        listenableFutureSubmit.getClass();
                        final fdap fdapVar = new fdap() { // from class: ehii
                            /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
                            @Override // defpackage.fdap
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r10) {
                                /*
                                    r9 = this;
                                    ehis r4 = r1
                                    r5 = r10
                                    eryi r5 = (defpackage.eryi) r5
                                    eygg r10 = r4.g
                                    java.lang.Object r10 = r10.b()
                                    java.util.Map r10 = (java.util.Map) r10
                                    java.lang.String r2 = r2
                                    java.lang.Object r10 = r10.get(r2)
                                    eooy r10 = (defpackage.eooy) r10
                                    eygg r0 = r4.h
                                    java.lang.Object r0 = r0.b()
                                    java.util.Map r0 = (java.util.Map) r0
                                    boolean r0 = r0.containsKey(r2)
                                    eygg r1 = r4.i
                                    java.lang.Object r1 = r1.b()
                                    java.util.Map r1 = (java.util.Map) r1
                                    boolean r1 = r1.containsKey(r2)
                                    r6 = 0
                                    r7 = 1
                                    if (r10 != 0) goto L38
                                    if (r0 != 0) goto L38
                                    if (r1 == 0) goto L36
                                    goto L38
                                L36:
                                    r0 = r6
                                    goto L39
                                L38:
                                    r0 = r7
                                L39:
                                    r1 = 0
                                    if (r5 == 0) goto L6b
                                    if (r0 != 0) goto L6b
                                    fcsu r0 = r4.a     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    java.lang.Object r0 = r0.b()     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    eaaa r0 = (defpackage.eaaa) r0     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    boolean r0 = r0.i()     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    if (r0 == 0) goto L6b
                                    goto L55
                                L4d:
                                    r0 = move-exception
                                    java.lang.String r3 = "MendelPackageState"
                                    java.lang.String r8 = "Failed to check if declarative registration is supported"
                                    android.util.Log.e(r3, r8, r0)
                                L55:
                                    evtg r0 = r5.i
                                    r0.getClass()
                                    java.util.Set r3 = r4.e
                                    ekhx r0 = defpackage.ekfv.f(r0)
                                    boolean r0 = r0.containsAll(r3)
                                    if (r0 == 0) goto L6b
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.eork.i(r1)
                                    goto Lcf
                                L6b:
                                    r8 = 2
                                    if (r5 == 0) goto L7d
                                    int r0 = r5.c
                                    if (r0 != r8) goto L7b
                                    java.lang.Object r0 = r5.d
                                    java.lang.Integer r0 = (java.lang.Integer) r0
                                    int r0 = r0.intValue()
                                    goto L7f
                                L7b:
                                    r3 = r6
                                    goto L80
                                L7d:
                                    int r0 = r4.d
                                L7f:
                                    r3 = r0
                                L80:
                                    if (r10 == 0) goto L89
                                    java.util.concurrent.Executor r0 = r4.b
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.eika.i(r10, r0)
                                    goto L97
                                L89:
                                    if (r5 == 0) goto L93
                                    evqs r10 = r5.j
                                    if (r10 == 0) goto L93
                                    byte[] r1 = r10.I()
                                L93:
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.eork.i(r1)
                                L97:
                                    fdav r1 = r3
                                    ehiq r0 = new ehiq
                                    r0.<init>(r1, r2, r3, r4, r5)
                                    ehih r1 = new ehih
                                    r1.<init>()
                                    java.util.concurrent.Executor r0 = r4.b
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.eika.k(r10, r1, r0)
                                    com.google.common.util.concurrent.ListenableFuture[] r0 = new com.google.common.util.concurrent.ListenableFuture[r7]
                                    r0[r6] = r10
                                    eijz r0 = defpackage.eika.b(r0)
                                    ehil r1 = new ehil
                                    r1.<init>()
                                    eoqg r2 = defpackage.eoqg.a
                                    com.google.common.util.concurrent.ListenableFuture r0 = r0.b(r1, r2)
                                    com.google.common.util.concurrent.ListenableFuture[] r1 = new com.google.common.util.concurrent.ListenableFuture[r8]
                                    r1[r6] = r10
                                    r1[r7] = r0
                                    eijz r0 = defpackage.eika.d(r1)
                                    ehim r1 = new ehim
                                    r1.<init>()
                                    com.google.common.util.concurrent.ListenableFuture r10 = r0.a(r1, r2)
                                Lcf:
                                    return r10
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ehii.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        ListenableFuture listenableFutureK = eika.k(listenableFutureSubmit, new eooz() { // from class: ehij
                            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return fdapVar.invoke(obj2);
                            }
                        }, ehisVar2.b);
                        final fdap fdapVar2 = new fdap() { // from class: ehik
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                return ((eheg) ehisVar2.c.b()).c(strA);
                            }
                        };
                        ListenableFuture listenableFutureK2 = eika.k(listenableFutureK, new eooz() { // from class: ehir
                            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.eooz
                            public final /* synthetic */ ListenableFuture a(Object obj2) {
                                return fdapVar2.invoke(obj2);
                            }
                        }, eoqg.a);
                        egoc.c(listenableFutureK2, "Failed to register for %s", strA);
                        arrayList2.add(listenableFutureK2);
                    }
                    ListenableFuture listenableFutureB = eika.a(arrayList2).b(new eooy() { // from class: ehip
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            ListenableFuture listenableFutureB2 = ehisVar2.k.f.b();
                            final fdap fdapVar3 = new fdap() { // from class: ehin
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    dcgc dcgcVar = (dcgc) obj2;
                                    dcgcVar.getClass();
                                    return Integer.valueOf(Log.w("RegisterInternal", "GMS Core version too old", dcgcVar));
                                }
                            };
                            ListenableFuture listenableFutureE = eika.e(listenableFutureB2, dcgc.class, new ejvr() { // from class: ehio
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return fdapVar3.invoke(obj2);
                                }
                            }, eoqg.a);
                            egoc.c(listenableFutureE, "Failed to update StorageInfos after registration", new Object[0]);
                            return listenableFutureE;
                        }
                    }, eoqg.a);
                    eieuVarJ.b(listenableFutureB);
                    fczl.a(eieuVarJ, null);
                    return listenableFutureB;
                } finally {
                }
            }
        };
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
