package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebxz {
    public final ebyd a;
    public final Object b = new Object();
    public final String c;
    public final Locale d;
    public final String e;
    public final etyr f;
    public ListenableFuture g;

    public ebxz(ebyd ebydVar, String str, Locale locale, etyr etyrVar) {
        this.a = ebydVar;
        this.c = str;
        this.d = locale;
        this.f = etyrVar;
        this.e = ebye.b(str, locale, etyrVar);
    }

    public final ListenableFuture a() {
        String str = this.e;
        Log.d("MetadataFetcher", "load() started for cache key ".concat(String.valueOf(str)));
        synchronized (this.b) {
            if (this.g != null) {
                Log.d("MetadataFetcher", a.v(str, "load() returned cached future for cache key "));
                return this.g;
            }
            eosc eoscVar = ((ebvc) this.a).b;
            ListenableFuture listenableFutureF = eooq.f(eooh.g(eoscVar.submit(new Callable() { // from class: ebxv
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    ebxz ebxzVar = this.a;
                    File fileB = ebxzVar.b();
                    if (!fileB.exists()) {
                        ebyd ebydVar = ebxzVar.a;
                        etzc etzcVarR = ((ebvc) ebydVar).r(ebxzVar.c, ebxzVar.d, ebxzVar.f);
                        etzcVarR.copyOnWrite();
                        etzd etzdVar = (etzd) etzcVarR.instance;
                        etzd etzdVar2 = etzd.a;
                        etzdVar.h = evsn.emptyProtobufList();
                        etzcVarR.copyOnWrite();
                        ((etzd) etzcVarR.instance).e = evsn.emptyProtobufList();
                        File file = new File(ebydVar.s(), ebye.a(Long.toString(Arrays.hashCode(((etzd) etzcVarR.build()).toByteArray()))));
                        if (file.exists() && !fileB.exists()) {
                            try {
                                if (file.renameTo(fileB)) {
                                    Log.d("MetadataFetcher", "Successfully renamed the old cache file.");
                                    file = fileB;
                                } else {
                                    Log.w("MetadataFetcher", "Failed to renamed the old cache file.");
                                }
                            } catch (Exception e) {
                                Log.w("MetadataFetcher", "Failed to renamed the old cache file.", e);
                            }
                        }
                        if (file.exists()) {
                            fileB = file;
                        }
                    }
                    try {
                        etyg etygVar = (etyg) etyh.a.createBuilder();
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(fileB), 32768);
                        try {
                            etygVar.mergeFrom((InputStream) gZIPInputStream);
                            gZIPInputStream.close();
                            return (etyh) etygVar.build();
                        } catch (Throwable th) {
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e2) {
                        Log.d("MetadataFetcher", "Cached file " + fileB.getName() + " doesn't exist.");
                        throw e2;
                    } catch (IOException e3) {
                        Log.w("MetadataFetcher", "Unexpected error reading cached file ".concat(String.valueOf(fileB.getName())), e3);
                        throw e3;
                    }
                }
            }), Throwable.class, new eooz() { // from class: ebxw
                /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // defpackage.eooz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r21) throws org.json.JSONException {
                    /*
                        Method dump skipped, instructions count: 421
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ebxw.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, eoscVar), new ejvr() { // from class: ebxx
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    etyh etyhVar = (etyh) obj;
                    LinkedHashMap linkedHashMapJ = ekmi.j(etyhVar.b.size());
                    Iterator<E> it = etyhVar.b.iterator();
                    while (it.hasNext()) {
                        etyu etyuVar = ((etyw) it.next()).b;
                        if (etyuVar == null) {
                            etyuVar = etyu.a;
                        }
                        int iA = etyt.a(etyuVar.c);
                        if (iA == 0 || iA != 4) {
                            linkedHashMapJ.put(etyuVar.b, etyuVar);
                        }
                    }
                    return linkedHashMapJ;
                }
            }, eoscVar);
            this.g = listenableFutureF;
            eork.r(listenableFutureF, new ebxy(this), eoscVar);
            return listenableFutureF;
        }
    }

    public final File b() {
        ebyd ebydVar = this.a;
        return new File(ebydVar.s(), ebye.a(this.e));
    }

    public final void c() {
        synchronized (this.b) {
            ListenableFuture listenableFuture = this.g;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.g = null;
                Log.d("MetadataFetcher", "Cancel metadata fetch future of " + this.e);
            }
        }
    }
}
