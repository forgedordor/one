package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echa implements ecer {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public echa(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws InterruptedException, IOException {
        ecgb ecgbVar;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        ejwi ejwiVarB;
        ?? ecgaVar;
        FileLock fileLockTryLock;
        Uri uriBuild = eceqVar.e.buildUpon().path(String.valueOf(eceqVar.f.getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore semaphoreC = eceqVar.b.c().c(uriBuild.toString());
            if (true != semaphoreC.tryAcquire()) {
                semaphoreC = null;
            }
            ecgc ecgcVar = new ecgc(semaphoreC);
            try {
                if (ecgcVar.a != null) {
                    ecgbVar = new ecgb(ecgcVar.a());
                    ecgcVar.close();
                } else {
                    ecgcVar.close();
                    ecgbVar = null;
                }
            } finally {
            }
        } else {
            Semaphore semaphoreC2 = eceqVar.b.c().c(uriBuild.toString());
            try {
                semaphoreC2.acquire();
                ecgc ecgcVar2 = new ecgc(semaphoreC2);
                try {
                    ecgbVar = new ecgb(ecgcVar2.a());
                    ecgcVar2.close();
                } finally {
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        ecgf ecgfVar = new ecgf(ecgbVar);
        try {
            if (ecgfVar.a != null) {
                boolean z = this.b;
                ecgf ecgfVar2 = new ecgf((z && this.c) ? eceqVar.b.e(uriBuild) : (!z || this.c) ? eceqVar.b.g(uriBuild) : (Closeable) eceqVar.a.c(uriBuild, new eche()));
                try {
                    Closeable closeable2 = ecgfVar2.a;
                    if (closeable2 instanceof ecfp) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((ecfp) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof RandomAccessFile)) {
                            throw new IOException("Lock stream not convertible to FileChannel");
                        }
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    }
                    FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        eceqVar.b.c();
                        try {
                            fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                        } catch (IOException unused) {
                        }
                        ecgaVar = fileLockTryLock == null ? 0 : new ecga(fileLockTryLock);
                    } else {
                        eceqVar.b.c();
                        ejwi ejwiVarB2 = ecgd.b(fileChannel, z);
                        if (ejwiVarB2.g()) {
                            ecgaVar = ejwiVarB2.c();
                        } else {
                            ecgd.a.longValue();
                            ecgd.b.longValue();
                            ejwl.a(true);
                            ejwl.a(true);
                            ecgl ecglVar = new ecgl();
                            do {
                                SystemClock.sleep(ecglVar.next().longValue());
                                ejwiVarB = ecgd.b(fileChannel, z);
                            } while (!ejwiVarB.g());
                            ecgaVar = ejwiVarB.c();
                        }
                    }
                    ecgf ecgfVar3 = new ecgf(ecgaVar);
                    try {
                        if (ecgfVar3.a == null) {
                            ecgfVar3.close();
                            ecgfVar2.close();
                        } else {
                            final Closeable closeableA = ecgfVar.a();
                            final Closeable closeableA2 = ecgfVar2.a();
                            final Closeable closeableA3 = ecgfVar3.a();
                            Closeable closeable3 = new Closeable() { // from class: ecgz
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws IOException {
                                    Closeable closeable4 = closeableA;
                                    Closeable closeable5 = closeableA2;
                                    Closeable closeable6 = closeableA3;
                                    if (closeable6 != null) {
                                        try {
                                            try {
                                                closeable6.close();
                                            } catch (Throwable th) {
                                                if (closeable5 != null) {
                                                    try {
                                                        closeable5.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            if (closeable4 != null) {
                                                try {
                                                    closeable4.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (closeable5 != null) {
                                        closeable5.close();
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                }
                            };
                            ecgfVar3.close();
                            ecgfVar2.close();
                            closeable = closeable3;
                        }
                    } finally {
                    }
                } finally {
                }
            }
            ecgfVar.close();
            return closeable;
        } finally {
        }
    }
}
