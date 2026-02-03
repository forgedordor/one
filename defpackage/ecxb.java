package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecxb implements ecxa {
    public final ecxi a;

    public ecxb(final ecxi ecxiVar) {
        this.a = ecxiVar;
        if (ecxiVar.e) {
            return;
        }
        final ListenableFuture listenableFutureSubmit = ecxiVar.c.submit(new Callable() { // from class: ecxe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
            /* JADX WARN: Type inference failed for: r0v0, types: [ecxi] */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.io.InputStream] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    r10 = this;
                    ecxi r0 = r1
                    java.lang.String r1 = "MonogramData.java"
                    r2 = 0
                    android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L28
                    android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L28
                    r3 = 2132017214(0x7f14003e, float:1.96727E38)
                    java.io.InputStream r0 = r0.openRawResource(r3)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L28
                    exbu r3 = defpackage.exbu.a     // Catch: java.io.IOException -> L22 java.lang.Throwable -> Lc2
                    evuo r3 = r3.getParserForType()     // Catch: java.io.IOException -> L22 java.lang.Throwable -> Lc2
                    java.lang.Object r3 = r3.g(r0)     // Catch: java.io.IOException -> L22 java.lang.Throwable -> Lc2
                    exbu r3 = (defpackage.exbu) r3     // Catch: java.io.IOException -> L22 java.lang.Throwable -> Lc2
                L1e:
                    defpackage.eled.a(r0)
                    goto L4d
                L22:
                    r3 = move-exception
                    goto L2b
                L24:
                    r0 = move-exception
                    r1 = r0
                    goto Lc4
                L28:
                    r0 = move-exception
                    r3 = r0
                    r0 = r2
                L2b:
                    ekrg r4 = defpackage.ecxi.a     // Catch: java.lang.Throwable -> Lc2
                    ekrw r4 = r4.i()     // Catch: java.lang.Throwable -> Lc2
                    ekrd r4 = (defpackage.ekrd) r4     // Catch: java.lang.Throwable -> Lc2
                    ekrw r3 = r4.g(r3)     // Catch: java.lang.Throwable -> Lc2
                    ekrd r3 = (defpackage.ekrd) r3     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r4 = "com/google/android/libraries/toolkit/monogram/impl/MonogramData"
                    java.lang.String r5 = "createPrefixToMonogramMap"
                    r6 = 98
                    ekrw r1 = r3.h(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> Lc2
                    ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r3 = "Error reading config, using defaults."
                    r1.q(r3)     // Catch: java.lang.Throwable -> Lc2
                    exbu r3 = defpackage.exbu.a     // Catch: java.lang.Throwable -> Lc2
                    goto L1e
                L4d:
                    evub r0 = r3.b
                    java.util.Map r0 = j$.util.DesugarCollections.unmodifiableMap(r0)
                    ecxh r1 = new ecxh
                    int r3 = r0.size()
                    r1.<init>(r3)
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L64:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto Lc1
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r5 = r3.getValue()
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L84
                    r3 = r4
                    goto L8a
                L84:
                    java.lang.Object r3 = r3.getValue()
                    java.lang.String r3 = (java.lang.String) r3
                L8a:
                    char[] r4 = r4.toCharArray()
                    int r5 = r4.length
                    r6 = 0
                    r7 = r2
                L91:
                    if (r6 >= r5) goto Lbe
                    char r8 = r4[r6]
                    if (r7 != 0) goto L99
                    r7 = r1
                    goto La6
                L99:
                    ecxh r9 = r7.a
                    if (r9 != 0) goto La4
                    ecxh r9 = new ecxh
                    r9.<init>()
                    r7.a = r9
                La4:
                    ecxh r7 = r7.a
                La6:
                    java.lang.Character r8 = java.lang.Character.valueOf(r8)
                    java.lang.Object r9 = r7.get(r8)
                    ecxg r9 = (defpackage.ecxg) r9
                    if (r9 != 0) goto Lba
                    ecxg r9 = new ecxg
                    r9.<init>()
                    r7.put(r8, r9)
                Lba:
                    r7 = r9
                    int r6 = r6 + 1
                    goto L91
                Lbe:
                    r7.b = r3
                    goto L64
                Lc1:
                    return r1
                Lc2:
                    r1 = move-exception
                    r2 = r0
                Lc4:
                    defpackage.eled.a(r2)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ecxe.call():java.lang.Object");
            }
        });
        listenableFutureSubmit.b(new Runnable() { // from class: ecxf
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ecxiVar.d.set((ecxh) eork.q(listenableFutureSubmit));
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, eoqg.a);
        ecxiVar.e = true;
    }
}
