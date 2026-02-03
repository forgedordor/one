package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxf implements dtpd {
    public final Uri a;
    public final ejxr b;
    public final Executor c;
    public final ejwi d;
    public final duxw e;
    private final Context f;
    private final ecev g;
    private final duvl h;
    private final dvap i = new dvap();
    private final dvaj j;

    public duxf(duxe duxeVar) {
        Context context = duxeVar.a;
        this.f = context;
        this.a = duto.g(duxeVar.a);
        this.b = duxeVar.c;
        this.j = duxeVar.i;
        this.g = duxeVar.d;
        Executor executor = duxeVar.e;
        this.c = executor;
        this.d = duxeVar.g;
        this.h = new duvl(duxeVar.j, duxeVar.h);
        ecjl ecjlVar = duxeVar.f;
        Uri uriBuild = duto.g(context).buildUpon().appendPath("manifest_metadata.pb").build();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uriBuild);
        ecjiVarH.e(duxm.a);
        this.e = new duxw(ecjlVar.a(ecjiVarH.a()), executor);
    }

    public static ejwi b(duxj duxjVar) {
        return (duxjVar.b & 2) != 0 ? ejwi.j(duxjVar.d) : ejud.a;
    }

    public static duxj f(String str, int i, ejwi ejwiVar) {
        duxg duxgVar = (duxg) duxj.a.createBuilder();
        duxgVar.copyOnWrite();
        duxj duxjVar = (duxj) duxgVar.instance;
        str.getClass();
        duxjVar.b |= 1;
        duxjVar.c = str;
        duxgVar.copyOnWrite();
        duxj duxjVar2 = (duxj) duxgVar.instance;
        duxjVar2.e = i - 1;
        duxjVar2.b |= 4;
        if (ejwiVar.g()) {
            String str2 = (String) ejwiVar.c();
            duxgVar.copyOnWrite();
            duxj duxjVar3 = (duxj) duxgVar.instance;
            duxjVar3.b |= 2;
            duxjVar3.d = str2;
        }
        return (duxj) duxgVar.build();
    }

    @Override // defpackage.dtpd
    public final ListenableFuture a(final dtsl dtslVar) {
        return this.i.b(eiid.c(new eooy() { // from class: duws
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                durt.b("%s: Add groups from ManifestFileFlag to MDD.", "ManifestFileGroupPopulator");
                final duxf duxfVar = this.a;
                final dtom dtomVarA = ujw.a();
                if (dtomVarA == null || dtomVarA.equals(dtom.a)) {
                    durt.n("%s: The ManifestFileFlag is empty.", "ManifestFileGroupPopulator");
                    duxfVar.g(3, dtom.a);
                    return eorv.a;
                }
                if ((dtomVarA.b & 1) == 0 || dtomVarA.c.isEmpty() || (dtomVarA.b & 2) == 0 || !dtomVarA.d.startsWith("https")) {
                    duxfVar.g(402, dtomVarA);
                    durt.g("%s: Invalid manifest config from manifest flag.", "ManifestFileGroupPopulator");
                    return eork.h(new IllegalArgumentException("Invalid manifest flag."));
                }
                final dtsl dtslVar2 = dtslVar;
                final String str = dtomVarA.d;
                final Uri uriBuild = duxfVar.a.buildUpon().appendPath(dtomVarA.c).build();
                final AtomicReference atomicReference = new AtomicReference(duxf.f(str, 2, ejud.a));
                final String str2 = dtomVarA.c;
                duxw duxwVar = duxfVar.e;
                dvaq dvaqVarE = dvaq.e(dtox.b(eika.j(duxwVar.a.a(), new ejvr() { // from class: duxv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ejwi.i((duxj) DesugarCollections.unmodifiableMap(((duxm) obj).b).get(str2));
                    }
                }, duxwVar.b), dtow.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to read bookkeeping."));
                ejvr ejvrVar = new ejvr() { // from class: duwy
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ejwi ejwiVar = (ejwi) obj;
                        if (!ejwiVar.g()) {
                            return null;
                        }
                        atomicReference.set((duxj) ejwiVar.c());
                        return null;
                    }
                };
                Executor executor = duxfVar.c;
                final dvaq dvaqVarG = dvaqVarE.f(ejvrVar, executor).g(new eooz() { // from class: duwz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        durt.b("%s: Prepare for downloading manifest file.", "ManifestFileGroupPopulator");
                        final AtomicReference atomicReference2 = atomicReference;
                        final duxj duxjVar = (duxj) atomicReference2.get();
                        final duxf duxfVar2 = duxfVar;
                        dtzo dtzoVar = (dtzo) duxfVar2.b.get();
                        dtyy dtyyVar = new dtyy();
                        final String str3 = str;
                        dtyyVar.b(str3);
                        dtyyVar.a = duxf.b(duxjVar);
                        ListenableFuture listenableFutureA = dtzoVar.a(dtyyVar.a());
                        final Uri uri = uriBuild;
                        return eika.k(listenableFutureA, new eooz() { // from class: duwv
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) throws dtox {
                                AtomicReference atomicReference3 = atomicReference2;
                                dtzi dtziVar = (dtzi) obj2;
                                int iA = duxi.a(((duxj) atomicReference3.get()).e);
                                if (iA == 0) {
                                    iA = 1;
                                }
                                duxj duxjVar2 = duxjVar;
                                String str4 = str3;
                                if (!str4.equals(duxjVar2.c) || dtziVar.b()) {
                                    Uri uri2 = uri;
                                    duxf duxfVar3 = duxfVar2;
                                    durt.d("%s: Manifest file on server updated, will re-download; urlToDownload = %s; manifestFileUri = %s", "ManifestFileGroupPopulator", str4, uri2);
                                    duxfVar3.d(uri2);
                                    iA = 2;
                                }
                                atomicReference3.set(duxf.f(str4, iA, dtziVar.a()));
                                return eorv.a;
                            }
                        }, duxfVar2.c);
                    }
                }, executor);
                final dvaq dvaqVarG2 = dvaq.e(dvaq.e(dvaqVarG).f(new ejvr() { // from class: duxa
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ejud.a;
                    }
                }, executor).c(Throwable.class, new ejvr() { // from class: duxb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ejwi.j((Throwable) obj);
                    }
                }, executor)).g(new eooz() { // from class: duwo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        if (((ejwi) obj).g()) {
                            return eorv.a;
                        }
                        final Uri uri = uriBuild;
                        final dtsl dtslVar3 = dtslVar2;
                        final AtomicReference atomicReference2 = atomicReference;
                        final duxf duxfVar2 = duxfVar;
                        int i = ((duxj) atomicReference2.get()).e;
                        int iA = duxi.a(i);
                        if (iA != 0 && iA == 4) {
                            durt.b("%s: Manifest file was committed.", "ManifestFileGroupPopulator");
                            if (!duxfVar2.d.g()) {
                                return eorv.a;
                            }
                            durt.b("%s: Overrider is present, commit again.", "ManifestFileGroupPopulator");
                            return duxfVar2.c(dtslVar3, uri, atomicReference2);
                        }
                        int iA2 = duxi.a(i);
                        if (iA2 != 0 && iA2 == 3) {
                            durt.b("%s: Manifest file was downloaded.", "ManifestFileGroupPopulator");
                            return duxfVar2.c(dtslVar3, uri, atomicReference2);
                        }
                        final String str3 = str;
                        durt.d("%s: Start downloading the manifest file from %s to %s.", "ManifestFileGroupPopulator", str3, uri.toString());
                        ejxr ejxrVar = duxfVar2.b;
                        dtzl dtzlVar = dtzl.c;
                        dtzo dtzoVar = (dtzo) ejxrVar.get();
                        dtzm dtzmVarH = dtzn.h();
                        dtzmVarH.i(str3);
                        dtzmVarH.g(uri);
                        dtzmVarH.e(dtzlVar);
                        dvaq dvaqVarE2 = dvaq.e(dtzoVar.b(dtzmVarH.j()));
                        eooz eoozVar = new eooz() { // from class: duwn
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                durt.b("%s: Finalize for downloading manifest file.", "ManifestFileGroupPopulator");
                                final AtomicReference atomicReference3 = atomicReference2;
                                duxj duxjVar = (duxj) atomicReference3.get();
                                duxf duxfVar3 = duxfVar2;
                                dtzo dtzoVar2 = (dtzo) duxfVar3.b.get();
                                dtyy dtyyVar = new dtyy();
                                final String str4 = str3;
                                dtyyVar.b(str4);
                                dtyyVar.a = duxf.b(duxjVar);
                                ListenableFuture listenableFutureA = dtzoVar2.a(dtyyVar.a());
                                final Uri uri2 = uri;
                                return eika.k(listenableFutureA, new eooz() { // from class: duwu
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        dtzi dtziVar = (dtzi) obj3;
                                        boolean zB = dtziVar.b();
                                        String str5 = str4;
                                        if (!zB) {
                                            atomicReference3.set(duxf.f(str5, 3, dtziVar.a()));
                                            return eorv.a;
                                        }
                                        durt.i("%s: Manifest file on server changed during download, download failed; urlToDownload = %s; manifestFileUri = %s", "ManifestFileGroupPopulator", str5, uri2);
                                        dtov dtovVarA = dtox.a();
                                        dtovVarA.a = dtow.MANIFEST_FILE_GROUP_POPULATOR_CONTENT_CHANGED_DURING_DOWNLOAD_ERROR;
                                        dtovVarA.b = "Manifest file on server changed during download.";
                                        return eork.h(dtovVarA.a());
                                    }
                                }, duxfVar3.c);
                            }
                        };
                        Executor executor2 = duxfVar2.c;
                        return dvaqVarE2.g(eoozVar, executor2).g(new eooz() { // from class: duwt
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return duxfVar2.c(dtslVar3, uri, atomicReference2);
                            }
                        }, executor2);
                    }
                }, executor);
                final ListenableFuture listenableFutureK = eika.k(eika.f(dvaqVarG2, Throwable.class, new eooz() { // from class: duwp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) throws dtox {
                        AtomicReference atomicReference2 = atomicReference;
                        duxg duxgVar = (duxg) ((duxj) atomicReference2.get()).toBuilder();
                        duxgVar.copyOnWrite();
                        duxj duxjVar = (duxj) duxgVar.instance;
                        duxjVar.e = 1;
                        duxjVar.b |= 4;
                        atomicReference2.set((duxj) duxgVar.build());
                        duxfVar.d(uriBuild);
                        return eorv.a;
                    }
                }, executor), new eooz() { // from class: duwq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        AtomicReference atomicReference2 = atomicReference;
                        final String str3 = dtomVarA.c;
                        final duxj duxjVar = (duxj) atomicReference2.get();
                        ejvr ejvrVar2 = new ejvr() { // from class: duxu
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                HashMap map = new HashMap(DesugarCollections.unmodifiableMap(((duxm) obj2).b));
                                map.put(str3, duxjVar);
                                duxk duxkVar = (duxk) duxm.a.createBuilder();
                                duxkVar.copyOnWrite();
                                duxm duxmVar = (duxm) duxkVar.instance;
                                evub evubVar = duxmVar.b;
                                if (!evubVar.b) {
                                    duxmVar.b = evubVar.a();
                                }
                                duxmVar.b.putAll(map);
                                return (duxm) duxkVar.build();
                            }
                        };
                        duxw duxwVar2 = duxfVar.e;
                        return dtox.b(duxwVar2.a.b(ejvrVar2, duxwVar2.b), dtow.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to write bookkeeping.");
                    }
                }, executor);
                return eika.k(listenableFutureK, new eooz() { // from class: duwr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) throws dtmi {
                        ekgb ekgbVarT = ekgb.t(dvaqVarG, dvaqVarG2, listenableFutureK);
                        duxf duxfVar2 = duxfVar;
                        dtom dtomVar = dtomVarA;
                        dtmi.e(ekgbVarT, ejwi.j(new duxc(duxfVar2, dtomVar)), "Failed to refresh file groups", new Object[0]);
                        duxfVar2.g(3, dtomVar);
                        return eorv.a;
                    }
                }, executor);
            }
        }), this.c);
    }

    public final ListenableFuture c(final dtsl dtslVar, final Uri uri, final AtomicReference atomicReference) {
        durt.c("%s: Parse the manifest file at %s.", "ManifestFileGroupPopulator", uri);
        final dvaj dvajVar = this.j;
        dvaq dvaqVarE = dvaq.e(dtox.b(eika.h(new Callable() { // from class: dvai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                durt.c("%s: Start parsing manifest file at %s", "ManifestConfigFileParser", uri2);
                return (dtok) dvajVar.a.c(uri2, new echg(dtok.a.getParserForType()));
            }
        }, dvajVar.b), dtow.MANIFEST_FILE_GROUP_POPULATOR_PARSE_MANIFEST_FILE_ERROR, "Failed to parse the manifest file."));
        eooz eoozVar = new eooz() { // from class: duww
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ListenableFuture listenableFutureI;
                dtok dtokVar = (dtok) obj;
                int i = ekgb.d;
                final duwl duwlVar = new duwl(dtslVar, this.a.d, ekoe.a);
                ejwi ejwiVar = duwlVar.b;
                if (ejwiVar.g()) {
                    listenableFutureI = ((duwm) ejwiVar.c()).a(duwl.a(dtokVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<E> it = duwl.a(dtokVar).c.iterator();
                    while (it.hasNext()) {
                        dtns dtnsVar = ((dtoh) it.next()).d;
                        if (dtnsVar == null) {
                            dtnsVar = dtns.a;
                        }
                        arrayList.add(dtnsVar);
                    }
                    listenableFutureI = eork.i(arrayList);
                }
                dvaq dvaqVarE2 = dvaq.e(listenableFutureI);
                eooz eoozVar2 = new eooz() { // from class: duwh
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final ArrayList arrayList2 = new ArrayList();
                        ejud ejudVar = ejud.a;
                        for (dtns dtnsVar2 : (List) obj2) {
                            if (dtnsVar2 != null && !dtnsVar2.c.isEmpty()) {
                                duwl duwlVar2 = duwlVar;
                                dtmj dtmjVar = new dtmj();
                                dtmjVar.c(dtnsVar2);
                                dtmjVar.a = ejudVar;
                                dtmh dtmhVarA = dtmjVar.a();
                                dtsl dtslVar2 = duwlVar2.a;
                                ListenableFuture listenableFutureA = dtslVar2.a(dtmhVarA);
                                duwl.b(listenableFutureA, dtnsVar2.c, ejudVar, ejudVar);
                                arrayList2.add(listenableFutureA);
                                ekqh it2 = ((ekgb) duwlVar2.c).iterator();
                                while (it2.hasNext()) {
                                    Account account = (Account) it2.next();
                                    dtmjVar.b(ejwi.j(account));
                                    ListenableFuture listenableFutureA2 = dtslVar2.a(dtmjVar.a());
                                    duwl.b(listenableFutureA2, dtnsVar2.c, ejwi.j(account), ejudVar);
                                    arrayList2.add(listenableFutureA2);
                                }
                            }
                        }
                        return dvat.a(arrayList2).a(new Callable() { // from class: duwj
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws dtmi {
                                dtmi.d(arrayList2, "Failed to add file groups", new Object[0]);
                                return null;
                            }
                        }, eoqg.a);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return dvaqVarE2.g(eoozVar2, eoqgVar).d(dtmi.class, new eooz() { // from class: duwi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eorv.a;
                    }
                }, eoqgVar);
            }
        };
        Executor executor = this.c;
        return dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: duwx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                duxg duxgVar = (duxg) ((duxj) atomicReference2.get()).toBuilder();
                duxgVar.copyOnWrite();
                duxj duxjVar = (duxj) duxgVar.instance;
                duxjVar.e = 3;
                duxjVar.b |= 4;
                atomicReference2.set((duxj) duxgVar.build());
                return eorv.a;
            }
        }, executor);
    }

    public final void d(Uri uri) throws dtox {
        try {
            ecev ecevVar = this.g;
            if (!ecevVar.h(uri)) {
                durt.c("%s: Manifest file doesn't exist: %s", "ManifestFileGroupPopulator", uri);
            } else {
                durt.c("%s: Removing manifest file at: %s", "ManifestFileGroupPopulator", uri);
                ecevVar.f(uri);
            }
        } catch (IOException e) {
            dtov dtovVarA = dtox.a();
            dtovVarA.c = e;
            dtovVarA.a = dtow.MANIFEST_FILE_GROUP_POPULATOR_DELETE_MANIFEST_FILE_ERROR;
            dtovVarA.b = "Failed to delete manifest file.";
            throw dtovVarA.a();
        }
    }

    public final void e(dtox dtoxVar, dtom dtomVar) {
        this.h.a(eokq.b(dtoxVar.a.aF), dtomVar.c, this.f.getPackageName(), dtomVar.d);
    }

    public final void g(int i, dtom dtomVar) {
        this.h.a(i, dtomVar.c, this.f.getPackageName(), dtomVar.d);
    }
}
