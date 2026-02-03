package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dump implements duoc {
    public final Context a;
    public final dtvq b;
    private final ecjh c;
    private final Executor d;
    private final dtpi e;

    public dump(Context context, dtvq dtvqVar, ecjh ecjhVar, Executor executor, dtpi dtpiVar) {
        this.a = context;
        this.b = dtvqVar;
        this.c = ecjhVar;
        this.d = executor;
        this.e = dtpiVar;
    }

    @Override // defpackage.duoc
    public final ListenableFuture a() {
        return this.c.b(new ejvr() { // from class: dumk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsi dtsiVar = (dtsi) ((dtsk) obj).toBuilder();
                dtsiVar.clear();
                return (dtsk) dtsiVar.build();
            }
        }, this.d);
    }

    public final ListenableFuture b(final duiu duiuVar, final int i) {
        ListenableFuture listenableFutureC;
        if (i > duiuVar.d) {
            return eork.i(true);
        }
        duiu duiuVarA = duiu.a(i);
        int iOrdinal = duiuVarA.ordinal();
        if (iOrdinal == 1) {
            ecjh ecjhVar = this.c;
            ejvr ejvrVar = new ejvr() { // from class: dumn
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dtsk dtskVar = (dtsk) obj;
                    durt.b("%s: Starting migration to add download transform", "ProtoDataStoreSharedFilesMetadata");
                    dtsi dtsiVar = (dtsi) dtskVar.toBuilder();
                    dump dumpVar = this.a;
                    for (String str : DesugarCollections.unmodifiableMap(dtskVar.b).keySet()) {
                        try {
                            dtsd dtsdVarA = duui.a(str, dumpVar.a, dumpVar.b);
                            str.getClass();
                            evub evubVar = dtskVar.b;
                            dtsh dtshVar = evubVar.containsKey(str) ? (dtsh) evubVar.get(str) : null;
                            dtsiVar.b(str);
                            if (dtshVar == null) {
                                durt.g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            } else {
                                dtsiVar.a(duui.e(dtsdVarA), dtshVar);
                            }
                        } catch (duuh unused) {
                            durt.h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                            dumpVar.b.a();
                            dtsiVar.b(str);
                        }
                    }
                    return (dtsk) dtsiVar.build();
                }
            };
            Executor executor = this.d;
            listenableFutureC = dvaq.e(ecjhVar.b(ejvrVar, executor)).f(new ejvr() { // from class: dumo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return true;
                }
            }, executor).c(IOException.class, new ejvr() { // from class: dulw
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    durt.f("Failed to commit migration metadata to disk");
                    new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                    this.a.b.a();
                    return false;
                }
            }, executor);
        } else if (iOrdinal != 2) {
            listenableFutureC = eork.h(new UnsupportedOperationException("Upgrade to version " + duiuVarA.name() + "not supported!"));
        } else {
            ecjh ecjhVar2 = this.c;
            ejvr ejvrVar2 = new ejvr() { // from class: dumh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dtsk dtskVar = (dtsk) obj;
                    durt.b("%s: Starting migration to dedup on checksum onlu", "ProtoDataStoreSharedFilesMetadata");
                    dtsi dtsiVar = (dtsi) dtskVar.toBuilder();
                    dump dumpVar = this.a;
                    for (String str : DesugarCollections.unmodifiableMap(dtskVar.b).keySet()) {
                        try {
                            dtsd dtsdVarA = duui.a(str, dumpVar.a, dumpVar.b);
                            str.getClass();
                            evub evubVar = dtskVar.b;
                            dtsh dtshVar = evubVar.containsKey(str) ? (dtsh) evubVar.get(str) : null;
                            dtsiVar.b(str);
                            if (dtshVar == null) {
                                durt.g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            } else {
                                dtsiVar.a(duui.d(dtsdVarA), dtshVar);
                            }
                        } catch (duuh unused) {
                            durt.h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                            dumpVar.b.a();
                            dtsiVar.b(str);
                        }
                    }
                    return (dtsk) dtsiVar.build();
                }
            };
            Executor executor2 = this.d;
            listenableFutureC = dvaq.e(ecjhVar2.b(ejvrVar2, executor2)).f(new ejvr() { // from class: dumi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return true;
                }
            }, executor2).c(IOException.class, new ejvr() { // from class: dumj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    durt.f("Failed to commit migration metadata to disk");
                    new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                    this.a.b.a();
                    return false;
                }
            }, executor2);
        }
        return eika.k(listenableFutureC, new eooz() { // from class: duly
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eork.i(false);
                }
                duiu duiuVar2 = duiuVar;
                int i2 = i;
                dump dumpVar = this.a;
                duiv.d(dumpVar.a, duiu.a(i2));
                return dumpVar.b(duiuVar2, i2 + 1);
            }
        }, this.d);
    }

    @Override // defpackage.duoc
    public final ListenableFuture c() {
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        ejvr ejvrVar = new ejvr() { // from class: duml
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsk dtskVar = (dtsk) obj;
                ArrayList arrayList = new ArrayList();
                dtsi dtsiVar = (dtsi) dtskVar.toBuilder();
                dump dumpVar = this.a;
                for (String str : DesugarCollections.unmodifiableMap(dtskVar.b).keySet()) {
                    try {
                        arrayList.add(duui.a(str, dumpVar.a, dumpVar.b));
                    } catch (duuh e) {
                        dtsiVar.b(str);
                        durt.j(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                        dtvq dtvqVar = dumpVar.b;
                        ejxk.d("|").i(str).size();
                        dtvqVar.a();
                    }
                }
                atomicReference.set(arrayList);
                return (dtsk) dtsiVar.build();
            }
        };
        ecjh ecjhVar = this.c;
        Executor executor = this.d;
        return eika.j(ecjhVar.b(ejvrVar, executor), new ejvr() { // from class: dumm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (List) atomicReference.get();
            }
        }, executor);
    }

    @Override // defpackage.duoc
    public final ListenableFuture d() {
        Context context = this.a;
        if (!duiv.c(context)) {
            durt.b("%s Device isn't migrated to new file key, clear and set migration.", "ProtoDataStoreSharedFilesMetadata");
            duiv.e(context);
            duiv.d(context, duiu.a(this.e.h()));
            return eork.i(false);
        }
        final duiu duiuVarA = duiu.a(this.e.h());
        dtvq dtvqVar = this.b;
        duiu duiuVarA2 = duiv.a(context, dtvqVar);
        int i = duiuVarA.d;
        int i2 = duiuVarA2.d;
        if (i == i2) {
            return eork.i(true);
        }
        if (i >= i2) {
            dvaq dvaqVarE = dvaq.e(b(duiuVarA, i2 + 1));
            eooz eoozVar = new eooz() { // from class: dulv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    this.a.i(duiuVarA);
                    return eork.h((Exception) obj);
                }
            };
            Executor executor = this.d;
            return dvaqVarE.d(Exception.class, eoozVar, executor).g(new eooz() { // from class: dumg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    this.a.i(duiuVarA);
                    return eork.i((Boolean) obj);
                }
            }, executor);
        }
        durt.i("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", duiuVarA2, duiuVarA);
        new Exception("Downgraded file key from " + String.valueOf(duiuVarA2) + " to " + String.valueOf(duiuVarA) + ".");
        dtvqVar.a();
        duiv.d(context, duiuVarA);
        return eork.i(false);
    }

    @Override // defpackage.duoc
    public final ListenableFuture e(final dtsd dtsdVar) {
        return eika.j(f(new ekph(dtsdVar)), new ejvr() { // from class: dulx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (dtsh) ((ekgp) obj).get(dtsdVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.duoc
    public final ListenableFuture f(final ekhx ekhxVar) {
        return eika.j(this.c.a(), new ejvr() { // from class: dulz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsk dtskVar = (dtsk) obj;
                ekgi ekgiVar = new ekgi();
                ekqg ekqgVarListIterator = ekhxVar.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    dump dumpVar = this.a;
                    dtsd dtsdVar = (dtsd) ekqgVarListIterator.next();
                    dtsh dtshVar = (dtsh) DesugarCollections.unmodifiableMap(dtskVar.b).get(duui.b(dtsdVar, dumpVar.a, dumpVar.b));
                    if (dtshVar != null) {
                        ekgiVar.i(dtsdVar, dtshVar);
                    }
                }
                return ekgiVar.b();
            }
        }, eoqg.a);
    }

    @Override // defpackage.duoc
    public final ListenableFuture g(dtsd dtsdVar) {
        final String strB = duui.b(dtsdVar, this.a, this.b);
        ejvr ejvrVar = new ejvr() { // from class: dumd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsi dtsiVar = (dtsi) ((dtsk) obj).toBuilder();
                dtsiVar.b(strB);
                return (dtsk) dtsiVar.build();
            }
        };
        Executor executor = this.d;
        return dvaq.e(this.c.b(ejvrVar, executor)).f(new ejvr() { // from class: dume
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).c(IOException.class, new ejvr() { // from class: dumf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.duoc
    public final ListenableFuture h(dtsd dtsdVar, final dtsh dtshVar) {
        final String strB = duui.b(dtsdVar, this.a, this.b);
        ejvr ejvrVar = new ejvr() { // from class: duma
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsi dtsiVar = (dtsi) ((dtsk) obj).toBuilder();
                dtsiVar.a(strB, dtshVar);
                return (dtsk) dtsiVar.build();
            }
        };
        Executor executor = this.d;
        return dvaq.e(this.c.b(ejvrVar, executor)).f(new ejvr() { // from class: dumb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).c(IOException.class, new ejvr() { // from class: dumc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    public final void i(duiu duiuVar) {
        Context context = this.a;
        dtvq dtvqVar = this.b;
        if (duiv.a(context, dtvqVar).d == duiuVar.d || duiv.d(context, duiuVar)) {
            return;
        }
        durt.f(a.I(duiuVar, "Failed to commit migration version to disk. Fail to set target version to ", "."));
        new Exception(a.I(duiuVar, "Fail to set target version ", "."));
        dtvqVar.a();
    }
}
