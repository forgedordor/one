package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rod implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final ImageHeaderParser.ImageType g(rob robVar) {
        try {
            int iA = robVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iD = (iA << 8) | robVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iD2 = (iD << 8) | robVar.d();
            if (iD2 == -1991225785) {
                robVar.c(21L);
                try {
                    return robVar.d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (roa unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                robVar.c(4L);
                if (((robVar.a() << 16) | robVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (robVar.a() << 16) | robVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    robVar.c(4L);
                    short sD = robVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                robVar.c(4L);
                return (robVar.d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((robVar.a() << 16) | robVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (robVar.a() << 16) | robVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            robVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (robVar.a() << 16) | robVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    z |= !(iA4 != 1635150182);
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (roa unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static final boolean h(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int i(rob robVar, int i) {
        short sD;
        int iA;
        long j;
        long jC;
        do {
            short sD2 = robVar.d();
            if (sD2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.g(sD2, "Unknown segmentId="));
                }
                return -1;
            }
            sD = robVar.d();
            if (sD == 218) {
                return -1;
            }
            if (sD == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.e(i, "Found MARKER_EOI in ", " segment"));
                }
                return -1;
            }
            iA = robVar.a() - 2;
            if (sD == i) {
                return iA;
            }
            j = iA;
            jC = robVar.c(j);
        } while (jC == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sD) + ", wanted to skip: " + iA + ", but actually skipped: " + jC);
        }
        return -1;
    }

    private static final int j(rob robVar, rig rigVar) {
        ByteOrder byteOrder;
        short sB;
        try {
            int iA = robVar.a();
            if ((iA & 65496) != 65496 && iA != 19789 && iA != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.g(iA, "Parser doesn't handle magic number: "));
                }
                return -1;
            }
            int i = i(robVar, 225);
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) rigVar.a(i, byte[].class);
            try {
                int iB = robVar.b(bArr, i);
                if (iB != i) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.s(iB, i, "Unable to read exif segment data, length: ", ", actually read: "));
                    }
                } else if (h(bArr, i, a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                    short sB2 = rnz.b(6, byteBuffer);
                    if (sB2 != 18761) {
                        if (sB2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", a.g(sB2, "Unknown endianness = "));
                        }
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = ByteOrder.LITTLE_ENDIAN;
                    }
                    byteBuffer.order(byteOrder);
                    int iA2 = rnz.a(10, byteBuffer);
                    short sB3 = rnz.b(iA2 + 6, byteBuffer);
                    for (int i2 = 0; i2 < sB3; i2++) {
                        int i3 = iA2 + 8 + (i2 * 12);
                        if (rnz.b(i3, byteBuffer) == 274) {
                            short sB4 = rnz.b(i3 + 2, byteBuffer);
                            if (sB4 > 0 && sB4 <= 12) {
                                int iA3 = rnz.a(i3 + 4, byteBuffer);
                                if (iA3 >= 0) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got tagIndex=" + i2 + " tagType=274 formatCode=" + ((int) sB4) + " componentCount=" + iA3);
                                    }
                                    int i4 = iA3 + c[sB4];
                                    if (i4 <= 4) {
                                        int i5 = i3 + 8;
                                        if (i5 >= 0 && i5 <= byteBuffer.remaining()) {
                                            if (i4 >= 0 && i4 + i5 <= byteBuffer.remaining()) {
                                                sB = rnz.b(i5, byteBuffer);
                                                break;
                                            }
                                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                Log.d("DfltImageHeaderParser", a.g(274, "Illegal number of bytes for TI tag data tagType="));
                                            }
                                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", a.s(274, i5, "Illegal tagValueOffset=", " tagType="));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", a.g(sB4, "Got byte count > 4, not orientation, continuing, formatCode="));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", a.g(sB4, "Got invalid format code = "));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                }
                sB = -1;
                return sB;
            } finally {
                rigVar.c(bArr);
            }
        } catch (roa unused) {
            return -1;
        }
    }

    private static final int k(rob robVar) {
        return i(robVar, 226);
    }

    private static final boolean l(rob robVar, rig rigVar) {
        if (g(robVar) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int iK = k(robVar);
        while (iK > 0) {
            byte[] bArr = (byte[]) rigVar.a(iK, byte[].class);
            try {
                int iB = robVar.b(bArr, iK);
                if (iB != iK) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.s(iB, iK, "Unable to read APP2 segment data, length: ", ", actually read: "));
                    }
                } else if (h(bArr, iK, b)) {
                    rigVar.c(bArr);
                    return true;
                }
                rigVar.c(bArr);
                iK = k(robVar);
            } catch (Throwable th) {
                rigVar.c(bArr);
                throw th;
            }
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 2)) {
            return false;
        }
        Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, rig rigVar) {
        rvi.f(inputStream);
        roc rocVar = new roc(inputStream);
        rvi.f(rigVar);
        return j(rocVar, rigVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(ByteBuffer byteBuffer, rig rigVar) {
        rvi.f(byteBuffer);
        rny rnyVar = new rny(byteBuffer);
        rvi.f(rigVar);
        return j(rnyVar, rigVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        rvi.f(inputStream);
        return g(new roc(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(ByteBuffer byteBuffer) {
        rvi.f(byteBuffer);
        return g(new rny(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(InputStream inputStream, rig rigVar) {
        rvi.f(inputStream);
        roc rocVar = new roc(inputStream);
        rvi.f(rigVar);
        return l(rocVar, rigVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean f(ByteBuffer byteBuffer, rig rigVar) {
        rvi.f(byteBuffer);
        rny rnyVar = new rny(byteBuffer);
        rvi.f(rigVar);
        return l(rnyVar, rigVar);
    }
}
