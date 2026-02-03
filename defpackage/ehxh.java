package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxh {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final Context c;
    public final eosc d;
    public final diep e;
    private final ebbw h;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = -1;

    public ehxh(Context context, eosc eoscVar, ebbw ebbwVar, diep diepVar) {
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        this.h = ebbwVar;
        this.e = diepVar;
        this.c = context;
        this.d = eoscVar;
    }

    private final File g() {
        return new File(this.c.getFilesDir().getPath(), "103795117");
    }

    public final eiay a() {
        FileInputStream fileInputStream;
        File fileG = g();
        this.b.readLock().lock();
        try {
            if (!fileG.exists() && this.h.a()) {
                egoc.d("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateDatabase", 603, eika.g(new Runnable() { // from class: ehwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = this.a.c;
                        File file = new File(context.getFilesDir(), "103795117_".concat(String.valueOf(ebbu.a(context).replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
                        if (file.exists() && file.delete()) {
                            ((ekrd) ((ekrd) ehxh.a.j()).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryCleanUpPerProcessDatabase", 247, "SyncManagerDataStore.java")).q("Failed to delete per-process database file even though it exists");
                        }
                    }
                }, this.d), "Process database cleanup future failed", new Object[0]);
            }
            eiay eiayVar = null;
            FileInputStream fileInputStream2 = null;
            if (fileG.exists()) {
                try {
                    fileInputStream = new FileInputStream(fileG);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    eiayVar = (eiay) eiay.parseDelimitedFrom(eiay.a, fileInputStream);
                    eceh.a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    eceh.a(fileInputStream2);
                    throw th;
                }
            }
            return eiayVar == null ? eiay.a : eiayVar;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final ListenableFuture b() {
        return eooq.f(c(), eiid.a(new ejvr() { // from class: ehxa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                csq csqVar = new csq();
                eiay eiayVar = eiay.a;
                ehxh ehxhVar = this.a;
                try {
                    for (eiaw eiawVar : ehxhVar.a().d) {
                        long jLongValue = eiawVar.e;
                        eibc eibcVar = eiawVar.c;
                        if (eibcVar == null) {
                            eibcVar = eibc.a;
                        }
                        ehyr ehyrVar = new ehyr(eibcVar);
                        if (jLongValue <= 0) {
                            jLongValue = l.longValue();
                        }
                        csqVar.put(ehyrVar, Long.valueOf(jLongValue));
                    }
                    return csqVar;
                } catch (IOException e) {
                    ehxhVar.f(e);
                    return csqVar;
                }
            }
        }), this.d);
    }

    final ListenableFuture c() {
        return this.f.get() ? eork.i(Long.valueOf(this.g)) : this.d.submit(eiid.l(new Callable() { // from class: ehxg
            /* JADX WARN: Finally extract failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long epochMilli;
                eiax eiaxVar;
                Long lValueOf;
                ehxh ehxhVar = this.a;
                ehxhVar.b.writeLock().lock();
                try {
                    if (ehxhVar.f.get()) {
                        lValueOf = Long.valueOf(ehxhVar.g);
                    } else {
                        try {
                            eiay eiayVarA = ehxhVar.a();
                            epochMilli = eiayVarA.c;
                            eiaxVar = (eiax) eiayVarA.toBuilder();
                        } catch (IOException e) {
                            ehxhVar.f(e);
                            epochMilli = ehxhVar.e.f().toEpochMilli();
                            eiaxVar = (eiax) eiay.a.createBuilder();
                        }
                        if (epochMilli > 0) {
                            ehxhVar.g = epochMilli;
                            ehxhVar.f.set(true);
                            lValueOf = Long.valueOf(ehxhVar.g);
                        } else {
                            long epochMilli2 = ehxhVar.e.f().toEpochMilli();
                            ehxhVar.g = epochMilli2;
                            eiaxVar.copyOnWrite();
                            eiay eiayVar = (eiay) eiaxVar.instance;
                            eiayVar.b |= 1;
                            eiayVar.c = epochMilli2;
                            try {
                                try {
                                    ehxhVar.e((eiay) eiaxVar.build());
                                    ehxhVar.f.set(true);
                                } catch (IOException e2) {
                                    ((ekrd) ((ekrd) ((ekrd) ehxh.a.j()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", 148, "SyncManagerDataStore.java")).q("Could not write sync epoch. Using current time but future runs may be delayed.");
                                    ehxhVar.f.set(false);
                                }
                                lValueOf = Long.valueOf(ehxhVar.g);
                            } catch (Throwable th) {
                                ehxhVar.f.set(true);
                                throw th;
                            }
                        }
                    }
                    return lValueOf;
                } finally {
                    ehxhVar.b.writeLock().unlock();
                }
            }
        }));
    }

    final ListenableFuture d(final ehyr ehyrVar, final long j, final boolean z) {
        return this.d.submit(new Callable() { // from class: ehxe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ehyr ehyrVar2;
                ehxh ehxhVar = this.a;
                ehxhVar.b.writeLock().lock();
                long j2 = j;
                try {
                    eiay eiayVarA = eiay.a;
                    try {
                        eiayVarA = ehxhVar.a();
                    } catch (IOException e) {
                        if (!ehxhVar.f(e)) {
                            ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 363, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    eiax eiaxVar = (eiax) eiay.a.createBuilder();
                    eiaxVar.mergeFrom((eiax) eiayVarA);
                    eiaxVar.copyOnWrite();
                    ((eiay) eiaxVar.instance).d = eiay.emptyProtobufList();
                    Iterator<E> it = eiayVarA.d.iterator();
                    eiaw eiawVar = null;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ehyrVar2 = ehyrVar;
                        if (!zHasNext) {
                            break;
                        }
                        eiaw eiawVar2 = (eiaw) it.next();
                        eibc eibcVar = eiawVar2.c;
                        if (eibcVar == null) {
                            eibcVar = eibc.a;
                        }
                        if (ehyrVar2.equals(new ehyr(eibcVar))) {
                            eiawVar = eiawVar2;
                        } else {
                            eiaxVar.a(eiawVar2);
                        }
                    }
                    if (eiawVar != null) {
                        if (eiayVarA.c < 0) {
                            long epochMilli = ehxhVar.g;
                            if (epochMilli < 0) {
                                epochMilli = ehxhVar.e.f().toEpochMilli();
                                ehxhVar.g = epochMilli;
                            }
                            eiaxVar.copyOnWrite();
                            eiay eiayVar = (eiay) eiaxVar.instance;
                            eiayVar.b |= 1;
                            eiayVar.c = epochMilli;
                        }
                        eiav eiavVar = (eiav) eiaw.a.createBuilder();
                        eibc eibcVar2 = ehyrVar2.a;
                        eiavVar.copyOnWrite();
                        eiaw eiawVar3 = (eiaw) eiavVar.instance;
                        eibcVar2.getClass();
                        eiawVar3.c = eibcVar2;
                        eiawVar3.b |= 1;
                        eiavVar.copyOnWrite();
                        eiaw eiawVar4 = (eiaw) eiavVar.instance;
                        eiawVar4.b |= 4;
                        eiawVar4.e = j2;
                        if (z) {
                            eiavVar.copyOnWrite();
                            eiaw eiawVar5 = (eiaw) eiavVar.instance;
                            eiawVar5.b |= 2;
                            eiawVar5.d = j2;
                            eiavVar.copyOnWrite();
                            eiaw eiawVar6 = (eiaw) eiavVar.instance;
                            eiawVar6.b |= 8;
                            eiawVar6.f = 0;
                        } else {
                            long j3 = eiawVar.d;
                            eiavVar.copyOnWrite();
                            eiaw eiawVar7 = (eiaw) eiavVar.instance;
                            eiawVar7.b |= 2;
                            eiawVar7.d = j3;
                            int i = eiawVar.f + 1;
                            eiavVar.copyOnWrite();
                            eiaw eiawVar8 = (eiaw) eiavVar.instance;
                            eiawVar8.b |= 8;
                            eiawVar8.f = i;
                        }
                        eiaxVar.a((eiaw) eiavVar.build());
                        try {
                            ehxhVar.e((eiay) eiaxVar.build());
                        } catch (IOException e2) {
                            ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 423, "SyncManagerDataStore.java")).q("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                    }
                    return null;
                } finally {
                    ehxhVar.b.writeLock().unlock();
                }
            }
        });
    }

    public final void e(eiay eiayVar) throws Throwable {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(g());
            try {
                eiayVar.writeDelimitedTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean f(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) a.j()).g(th)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 624, "SyncManagerDataStore.java")).q("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.f.set(false);
            long epochMilli = this.g;
            if (epochMilli <= 0) {
                epochMilli = this.e.f().toEpochMilli();
            }
            eiax eiaxVar = (eiax) eiay.a.createBuilder();
            eiaxVar.copyOnWrite();
            eiay eiayVar = (eiay) eiaxVar.instance;
            eiayVar.b |= 1;
            eiayVar.c = epochMilli;
            try {
                try {
                    e((eiay) eiaxVar.build());
                    this.f.set(true);
                    z = true;
                } catch (IOException e) {
                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", 644, "SyncManagerDataStore.java")).q("Could not write to datastore to clear store.");
                    this.f.set(false);
                }
                return z;
            } catch (Throwable th2) {
                this.f.set(true);
                throw th2;
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
