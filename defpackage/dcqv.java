package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqv {
    public static final dcqr a = new dcqr();
    private static SoftReference b;
    private final Context c;
    private final dcqn d;
    private final dcqq e;
    private final boolean f;
    private final dcrf g;

    public dcqv(Context context, dcqn dcqnVar, dcqq dcqqVar, dcrf dcrfVar, boolean z) {
        this.c = context;
        this.d = dcqnVar;
        this.e = dcqqVar;
        this.g = dcrfVar;
        this.f = z;
    }

    public static synchronized dcqv c(Context context, dcrf dcrfVar, boolean z) {
        dcqv dcqvVar;
        SoftReference softReference = b;
        if (softReference != null && (dcqvVar = (dcqv) softReference.get()) != null) {
            return dcqvVar;
        }
        dcqn dcqnVar = new dcqn(context);
        if (dcqp.a == null) {
            dcqp.a = new dcqp();
        }
        dcqv dcqvVar2 = new dcqv(context, dcqnVar, new dcqs(), dcrfVar, z);
        b = new SoftReference(dcqvVar2);
        return dcqvVar2;
    }

    private final boolean d(File file) throws Throwable {
        Pair pairB;
        boolean z = false;
        try {
            dcqq dcqqVar = this.e;
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "r");
                    try {
                        if (randomAccessFile.length() < 22) {
                            pairB = null;
                        } else {
                            pairB = qxz.b(randomAccessFile, 0);
                            if (pairB == null) {
                                pairB = qxz.b(randomAccessFile, 65535);
                            }
                        }
                        if (pairB == null) {
                            throw new qxv("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                        }
                        ByteBuffer byteBuffer = (ByteBuffer) pairB.first;
                        long jLongValue = ((Long) pairB.second).longValue();
                        long j = (-20) + jLongValue;
                        if (j >= 0) {
                            randomAccessFile.seek(j);
                            if (randomAccessFile.readInt() == 1347094023) {
                                throw new qxv("ZIP64 APK not supported");
                            }
                        }
                        qxz.c(byteBuffer);
                        long jA = qxz.a(byteBuffer, byteBuffer.position() + 16);
                        if (jA >= jLongValue) {
                            throw new qxv(a.F(jLongValue, jA, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: "));
                        }
                        qxz.c(byteBuffer);
                        if (qxz.a(byteBuffer, byteBuffer.position() + 12) + jA != jLongValue) {
                            throw new qxv("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                        if (jA < 32) {
                            throw new qxv(a.u(jA, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(jA - byteBufferAllocate.capacity());
                        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                            throw new qxv("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = byteBufferAllocate.getLong(0);
                        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                            throw new qxv(a.u(j2, "APK Signing Block size out of range: "));
                        }
                        int i = (int) (8 + j2);
                        long j3 = jA - i;
                        if (j3 < 0) {
                            throw new qxv(a.u(j3, "APK Signing Block offset out of range: "));
                        }
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                        byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                        long j4 = byteBufferAllocate2.getLong(0);
                        if (j4 != j2) {
                            throw new qxv(a.F(j2, j4, "APK Signing Block sizes in header and footer do not match: ", " vs "));
                        }
                        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                        long jLongValue2 = ((Long) pairCreate.second).longValue();
                        if (byteBuffer2.order() != ByteOrder.LITTLE_ENDIAN) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int iCapacity = byteBuffer2.capacity() - 24;
                        if (iCapacity < 8) {
                            throw new IllegalArgumentException(a.s(8, iCapacity, "end < start: ", " < "));
                        }
                        int iCapacity2 = byteBuffer2.capacity();
                        if (iCapacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException(a.s(iCapacity2, iCapacity, "end > capacity: ", " > "));
                        }
                        int iLimit = byteBuffer2.limit();
                        int iPosition = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iCapacity);
                            byteBuffer2.position(8);
                            ByteBuffer byteBufferSlice = byteBuffer2.slice();
                            byteBufferSlice.order(byteBuffer2.order());
                            try {
                                byteBuffer2.position(0);
                                byteBuffer2.limit(iLimit);
                                byteBuffer2.position(iPosition);
                                int i2 = 0;
                                while (byteBufferSlice.hasRemaining()) {
                                    i2++;
                                    boolean z2 = z;
                                    if (byteBufferSlice.remaining() < 8) {
                                        throw new qxv(a.g(i2, "Insufficient data to read size of APK Signing Block entry #"));
                                    }
                                    long j5 = byteBufferSlice.getLong();
                                    if (j5 < 4 || j5 > 2147483647L) {
                                        throw new qxv("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                    }
                                    int i3 = (int) j5;
                                    int iPosition2 = byteBufferSlice.position() + i3;
                                    if (i3 > byteBufferSlice.remaining()) {
                                        throw new qxv("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                                    }
                                    if (byteBufferSlice.getInt() == 1896449818) {
                                        X509Certificate[][] x509CertificateArrB = qxy.b(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), new qxu(qxy.a(byteBufferSlice, i3 - 4), jLongValue2, jA, jLongValue, byteBuffer));
                                        randomAccessFile.close();
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException unused) {
                                        }
                                        if (x509CertificateArrB.length != 1) {
                                            throw new GeneralSecurityException("APK has more than one signature.");
                                        }
                                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrB[z2 ? 1 : 0][z2 ? 1 : 0].getEncoded());
                                        if (!Arrays.equals(((dcqs) dcqqVar).d, bArrDigest)) {
                                            if ("user".equals(Build.TYPE)) {
                                                return z2;
                                            }
                                            if (!Arrays.equals(((dcqs) dcqqVar).c, bArrDigest)) {
                                                return z2;
                                            }
                                        }
                                        return true;
                                    }
                                    long j6 = jLongValue2;
                                    long j7 = jLongValue;
                                    byteBufferSlice.position(iPosition2);
                                    jLongValue = j7;
                                    jLongValue2 = j6;
                                    z = z2 ? 1 : 0;
                                }
                                throw new qxv("No APK Signature Scheme v2 block in APK Signing Block");
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused2) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e) {
                    e = e;
                    throw new GeneralSecurityException("Failed to verify signatures", e);
                }
            } catch (RuntimeException e2) {
                e = e2;
                throw new GeneralSecurityException("Failed to verify signatures", e);
            } catch (qxv e3) {
                throw new GeneralSecurityException("Package is not signed", e3);
            }
        } catch (GeneralSecurityException e4) {
            Log.e("DG", "APK at " + file.getAbsolutePath() + " failed signature verification", e4);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r8.createNewFile() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195 A[Catch: ClassNotFoundException -> 0x023c, dcqm -> 0x0245, all -> 0x024e, TRY_ENTER, TryCatch #1 {dcqm -> 0x0245, blocks: (B:90:0x017d, B:94:0x0195, B:96:0x019d, B:98:0x01a3, B:99:0x01ab, B:101:0x01b6, B:102:0x01be, B:103:0x01d7, B:108:0x0200, B:109:0x021e, B:110:0x021f, B:111:0x0229, B:112:0x022a, B:113:0x023b), top: B:127:0x017d, outer: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.dcqw a(defpackage.dcqu r17, android.os.Parcelable r18, java.io.FileInputStream r19) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcqv.a(dcqu, android.os.Parcelable, java.io.FileInputStream):dcqw");
    }

    public final synchronized boolean b(dcqu dcquVar) {
        try {
            if (a.a(dcquVar) == null) {
                if (this.d.c(dcquVar) == null) {
                    return false;
                }
            }
            return true;
        } catch (dcqm unused) {
            return false;
        }
    }
}
