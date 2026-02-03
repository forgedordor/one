package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghm extends egcd {
    private final eggp a;
    private final eggx b;

    public eghm(eggp eggpVar, eggx eggxVar) {
        this.a = eggpVar;
        this.b = eggxVar;
    }

    @Override // defpackage.egcd
    public final ListenableFuture a(final efwo efwoVar) {
        final eghl eghlVar = (eghl) this.b;
        return eooq.g(eghlVar.a.a(), eiid.d(new eooz() { // from class: eghj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final efwo efwoVar2 = efwoVar;
                eghw eghwVarB = eggp.b((eghr) obj, efwoVar2);
                int iA = egcv.a(eghwVarB.e);
                if (iA != 0 && iA == 2) {
                    return eork.i(null);
                }
                final eghl eghlVar2 = eghlVar;
                final egdc egdcVar = new egdc(efwoVar2, ((egdb) eghl.a(eghwVarB)).a);
                Set set = (Set) eghlVar2.c.b();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        final egjh egjhVar = ((egjc) it.next()).a;
                        eosc eoscVar = egjhVar.a;
                        final efwo efwoVar3 = egdcVar.a;
                        arrayList.add(eoscVar.submit(new Runnable() { // from class: egjg
                            @Override // java.lang.Runnable
                            public final void run() {
                                String strB = egip.b(efwoVar3);
                                ekqg ekqgVarListIterator = egjhVar.b.a().listIterator();
                                while (ekqgVarListIterator.hasNext()) {
                                    File file = new File((File) ekqgVarListIterator.next(), strB);
                                    if (file.exists() && !file.setWritable(true, true)) {
                                        throw new RuntimeException("Could not make data dir writable.");
                                    }
                                }
                            }
                        }));
                    } catch (Exception e) {
                        arrayList.add(eork.h(e));
                    }
                }
                eorg eorgVarC = eork.c(arrayList);
                eooy eooyVarC = eiid.c(new eooy() { // from class: eggy
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final efwo efwoVar4 = efwoVar2;
                        return eghlVar2.a.b(new ejvr() { // from class: eghb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eghq eghqVar = (eghq) ((eghr) obj2).toBuilder();
                                efwo efwoVar5 = efwoVar4;
                                int iA2 = efwoVar5.a();
                                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((eghr) eghqVar.instance).d);
                                Integer numValueOf = Integer.valueOf(iA2);
                                if (!mapUnmodifiableMap.containsKey(numValueOf)) {
                                    throw new IllegalArgumentException();
                                }
                                eghv eghvVar = (eghv) ((eghw) mapUnmodifiableMap.get(numValueOf)).toBuilder();
                                eghvVar.copyOnWrite();
                                eghw eghwVar = (eghw) eghvVar.instance;
                                eghwVar.e = 1;
                                eghwVar.b |= 4;
                                eghqVar.a(efwoVar5.a(), (eghw) eghvVar.build());
                                return (eghr) eghqVar.build();
                            }
                        }, eoqg.a);
                    }
                });
                eoqg eoqgVar = eoqg.a;
                return eooq.g(eorgVarC.b(eooyVarC, eoqgVar), eiid.d(new eooz() { // from class: eggz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final eghl eghlVar3 = eghlVar2;
                        Set set2 = (Set) eghlVar3.g.b();
                        final egbv egbvVar = egdcVar;
                        return eghl.c(egbvVar, set2).b(eiid.c(new eooy() { // from class: eghg
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return eghl.c(egbvVar, (Set) eghlVar3.d.b()).a(new Callable() { // from class: eghf
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                }, eoqg.a);
                            }
                        }), eoqg.a);
                    }
                }), eoqgVar);
            }
        }), eoqg.a);
    }

    @Override // defpackage.egcd
    public final ListenableFuture b(String str, String str2) {
        eggp eggpVar = this.a;
        final String str3 = "pseudonymous";
        return eika.j(eggpVar.a.a(), new ejvr(str3, str3) { // from class: eggl
            public final /* synthetic */ String a = "pseudonymous";
            public final /* synthetic */ String b = "pseudonymous";

            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Iterator it = DesugarCollections.unmodifiableMap(((eghr) obj).d).values().iterator();
                while (true) {
                    String str4 = this.a;
                    if (!it.hasNext()) {
                        throw new egdj("No account is found for ".concat(str4));
                    }
                    eghw eghwVar = (eghw) it.next();
                    egbs egbsVar = eghwVar.d;
                    if (egbsVar == null) {
                        egbsVar = egbs.a;
                    }
                    if (egbsVar.k.equals(str4)) {
                        egbs egbsVar2 = eghwVar.d;
                        if (egbsVar2 == null) {
                            egbsVar2 = egbs.a;
                        }
                        if (egbsVar2.c.equals(this.b)) {
                            return efwo.b(eghwVar.c);
                        }
                    }
                }
            }
        }, eggpVar.b);
    }

    @Override // defpackage.egcd
    public final ListenableFuture c(final efwo efwoVar) {
        return eika.j(this.a.a.a(), new ejvr() { // from class: eggm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return eggp.a(eggp.b((eghr) obj, efwoVar));
            }
        }, eoqg.a);
    }

    @Override // defpackage.egcd
    public final ListenableFuture d() {
        eggp eggpVar = this.a;
        return eika.j(eggpVar.a.a(), new ejvr() { // from class: eggo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekhv ekhvVar = new ekhv();
                Iterator it = DesugarCollections.unmodifiableMap(((eghr) obj).d).values().iterator();
                while (it.hasNext()) {
                    ekhvVar.c(efwo.b(((eghw) it.next()).c));
                }
                return ekhvVar.g();
            }
        }, eggpVar.b);
    }

    @Override // defpackage.egcd
    public final ListenableFuture e() {
        eggp eggpVar = this.a;
        return eika.j(eggpVar.a.a(), new ejvr() { // from class: eggn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it = DesugarCollections.unmodifiableMap(((eghr) obj).d).values().iterator();
                while (it.hasNext()) {
                    ekfwVar.h(eggp.a((eghw) it.next()));
                }
                return ekfwVar.g();
            }
        }, eggpVar.b);
    }

    @Override // defpackage.egcd
    public final ListenableFuture f() {
        eggp eggpVar = this.a;
        return eika.j(eggpVar.a.a(), new ejvr() { // from class: eggh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekhv ekhvVar = new ekhv();
                for (eghw eghwVar : DesugarCollections.unmodifiableMap(((eghr) obj).d).values()) {
                    int iA = egcv.a(eghwVar.e);
                    if (iA != 0 && iA == 2) {
                        ekhvVar.c(efwo.b(eghwVar.c));
                    }
                }
                return ekhvVar.g();
            }
        }, eggpVar.b);
    }

    @Override // defpackage.egcd
    public final ListenableFuture g() {
        eggp eggpVar = this.a;
        return eika.j(eggpVar.a.a(), new ejvr() { // from class: eggk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                for (eghw eghwVar : DesugarCollections.unmodifiableMap(((eghr) obj).d).values()) {
                    int iA = egcv.a(eghwVar.e);
                    if (iA != 0 && iA == 2) {
                        ekfwVar.h(eggp.a(eghwVar));
                    }
                }
                return ekfwVar.g();
            }
        }, eggpVar.b);
    }

    @Override // defpackage.egcd
    public final ListenableFuture h(final efwo efwoVar) {
        return eika.j(this.a.a.a(), new ejvr() { // from class: eggj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int iA = egcv.a(eggp.b((eghr) obj, efwoVar).e);
                boolean z = false;
                if (iA != 0 && iA == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, eoqg.a);
    }

    @Override // defpackage.egcd
    public final ListenableFuture i() {
        return eika.j(this.a.a.a(), new ejvr() { // from class: eggi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return DesugarCollections.unmodifiableMap(((eghr) obj).d).keySet();
            }
        }, eoqg.a);
    }

    @Override // defpackage.egcd
    public final egbe j(efwo efwoVar) {
        try {
            eggg egggVar = this.a.a;
            dqme dqmeVar = egggVar.c;
            final ecjh ecjhVar = egggVar.a;
            ecjhVar.getClass();
            return eggp.a(eggp.b((eghr) dqmeVar.b(new eooy() { // from class: eggd
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return ecjhVar.a();
                }
            }), efwoVar));
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    @Override // defpackage.egcd
    public final ListenableFuture k(final Collection collection) {
        eieu eieuVarK = eiiy.k("Sync Accounts");
        eggx eggxVar = this.b;
        try {
            eiju eijuVarH = eiju.g(((eghl) eggxVar).d(((eghl) eggxVar).a, new ejvr() { // from class: eghd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eghq eghqVar = (eghq) ((eghr) obj).toBuilder();
                    return new eghn(eghl.b(collection, eghqVar), (eghr) eghqVar.build());
                }
            })).i(new eghe((eghl) eggxVar), ((eghl) eggxVar).b).h(new ejvt(null), eoqg.a);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // defpackage.egcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture l(final java.util.Collection r8, final defpackage.ekhx r9) {
        /*
            r7 = this;
            boolean r0 = r9.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            defpackage.ejwl.a(r0)
            ekqg r0 = r9.listIterator()
            eggx r2 = r7.b
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            defpackage.ejwl.a(r3)
            goto Lf
        L27:
            java.util.Iterator r0 = r8.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r0.next()
            egbs r3 = (defpackage.egbs) r3
            int r4 = r3.b
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 0
            if (r4 == 0) goto L40
            r4 = r1
            goto L41
        L40:
            r4 = r5
        L41:
            defpackage.ejwl.a(r4)
            int r4 = r3.b
            r4 = r4 & r1
            if (r1 == r4) goto L4b
            r4 = r5
            goto L4c
        L4b:
            r4 = r1
        L4c:
            defpackage.ejwl.a(r4)
            int r4 = r3.b
            r4 = r4 & 16
            if (r4 == 0) goto L57
            r4 = r1
            goto L58
        L57:
            r4 = r5
        L58:
            defpackage.ejwl.a(r4)
            boolean r4 = r3.i
            if (r4 == 0) goto L69
            int r4 = r3.b
            r6 = r4 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L6a
            r4 = r4 & 1
            if (r4 == 0) goto L6a
        L69:
            r5 = r1
        L6a:
            defpackage.ejwl.a(r5)
            java.lang.String r4 = r3.k
            boolean r4 = r9.contains(r4)
            java.lang.String r3 = r3.k
            java.lang.String r5 = "Unexpected account type provided! Accepted account types: %s, provided account type: %s"
            defpackage.ejwl.i(r4, r5, r9, r3)
            goto L2b
        L7b:
            java.lang.String r0 = "Sync Accounts for Types"
            eieu r0 = defpackage.eiiy.k(r0)
            r1 = r2
            eghl r1 = (defpackage.eghl) r1     // Catch: java.lang.Throwable -> Lb9
            eggg r1 = r1.a     // Catch: java.lang.Throwable -> Lb9
            eghc r3 = new eghc     // Catch: java.lang.Throwable -> Lb9
            r3.<init>()     // Catch: java.lang.Throwable -> Lb9
            r8 = r2
            eghl r8 = (defpackage.eghl) r8     // Catch: java.lang.Throwable -> Lb9
            com.google.common.util.concurrent.ListenableFuture r8 = r8.d(r1, r3)     // Catch: java.lang.Throwable -> Lb9
            eiju r8 = defpackage.eiju.g(r8)     // Catch: java.lang.Throwable -> Lb9
            eghe r9 = new eghe     // Catch: java.lang.Throwable -> Lb9
            r1 = r2
            eghl r1 = (defpackage.eghl) r1     // Catch: java.lang.Throwable -> Lb9
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lb9
            eghl r2 = (defpackage.eghl) r2     // Catch: java.lang.Throwable -> Lb9
            eosc r1 = r2.b     // Catch: java.lang.Throwable -> Lb9
            eiju r8 = r8.i(r9, r1)     // Catch: java.lang.Throwable -> Lb9
            ejvt r9 = new ejvt     // Catch: java.lang.Throwable -> Lb9
            r1 = 0
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lb9
            eoqg r1 = defpackage.eoqg.a     // Catch: java.lang.Throwable -> Lb9
            eiju r8 = r8.h(r9, r1)     // Catch: java.lang.Throwable -> Lb9
            r0.b(r8)     // Catch: java.lang.Throwable -> Lb9
            r0.close()
            return r8
        Lb9:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lbe
            goto Lc2
        Lbe:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lc2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eghm.l(java.util.Collection, ekhx):com.google.common.util.concurrent.ListenableFuture");
    }
}
