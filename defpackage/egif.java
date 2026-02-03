package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egif {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/external/ExternalAccountIntents");
    public final Context b;
    public final egcd c;
    private final eosc d;
    private final eoqr e = new eoqr();

    public egif(Context context, egcd egcdVar, eosc eoscVar) {
        this.b = context;
        this.c = egcdVar;
        this.d = eoscVar;
    }

    public final ListenableFuture a() {
        return this.e.a(new Callable() { // from class: egic
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.io.IOException {
                /*
                    r10 = this;
                    egif r0 = r10.a
                    android.content.Context r0 = r0.b
                    java.io.File r1 = new java.io.File
                    java.io.File r0 = r0.getFilesDir()
                    java.lang.String r2 = "install.bin"
                    r1.<init>(r0, r2)
                    boolean r0 = r1.exists()
                    r2 = 0
                    if (r0 == 0) goto L57
                    java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch: java.io.IOException -> L35
                    java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.IOException -> L35
                    r4.<init>(r1)     // Catch: java.io.IOException -> L35
                    r0.<init>(r4)     // Catch: java.io.IOException -> L35
                    long r4 = r0.readLong()     // Catch: java.lang.Throwable -> L2b
                    r0.close()     // Catch: java.io.IOException -> L29
                    goto L58
                L29:
                    r0 = move-exception
                    goto L37
                L2b:
                    r4 = move-exception
                    r0.close()     // Catch: java.lang.Throwable -> L30
                    goto L34
                L30:
                    r0 = move-exception
                    r4.addSuppressed(r0)     // Catch: java.io.IOException -> L35
                L34:
                    throw r4     // Catch: java.io.IOException -> L35
                L35:
                    r0 = move-exception
                    r4 = r2
                L37:
                    ekrg r6 = defpackage.egif.a
                    ekrw r6 = r6.i()
                    ekrd r6 = (defpackage.ekrd) r6
                    ekrw r0 = r6.g(r0)
                    ekrd r0 = (defpackage.ekrd) r0
                    r6 = 187(0xbb, float:2.62E-43)
                    java.lang.String r7 = "ExternalAccountIntents.java"
                    java.lang.String r8 = "com/google/apps/tiktok/account/external/ExternalAccountIntents"
                    java.lang.String r9 = "getInstance"
                    ekrw r0 = r0.h(r8, r9, r6, r7)
                    ekrd r0 = (defpackage.ekrd) r0
                    r0.o()
                    goto L58
                L57:
                    r4 = r2
                L58:
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 != 0) goto L9a
                    r4 = r2
                L5d:
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 != 0) goto L6b
                    java.util.Random r0 = new java.util.Random
                    r0.<init>()
                    long r4 = r0.nextLong()
                    goto L5d
                L6b:
                    java.io.FileOutputStream r0 = new java.io.FileOutputStream
                    r0.<init>(r1)
                    java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L90
                    r1.<init>(r0)     // Catch: java.lang.Throwable -> L90
                    r1.writeLong(r4)     // Catch: java.lang.Throwable -> L86
                    java.io.FileDescriptor r2 = r0.getFD()     // Catch: java.lang.Throwable -> L86
                    r2.sync()     // Catch: java.lang.Throwable -> L86
                    r1.close()     // Catch: java.lang.Throwable -> L90
                    r0.close()
                    goto L9a
                L86:
                    r2 = move-exception
                    r1.close()     // Catch: java.lang.Throwable -> L8b
                    goto L8f
                L8b:
                    r1 = move-exception
                    r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L90
                L8f:
                    throw r2     // Catch: java.lang.Throwable -> L90
                L90:
                    r1 = move-exception
                    r0.close()     // Catch: java.lang.Throwable -> L95
                    goto L99
                L95:
                    r0 = move-exception
                    r1.addSuppressed(r0)
                L99:
                    throw r1
                L9a:
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.egic.call():java.lang.Object");
            }
        }, this.d);
    }
}
