package defpackage;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfk implements bth {
    private final brw a;

    public bfk(bly blyVar) {
        this.a = new brw(blyVar);
    }

    @Override // defpackage.bth
    public final /* synthetic */ Object a(Object obj) {
        bsg bsgVar;
        byte[] bArr;
        byte[] bArrCopyOfRange;
        try {
            bti btiVar = ((beg) obj).a;
            int i = ((bsg) btiVar).c;
            int i2 = 2;
            int i3 = 0;
            if (i == 35) {
                bbm bbmVar = (bbm) ((bsg) btiVar).a;
                Rect rect = ((bsg) btiVar).e;
                try {
                    int i4 = ((beg) obj).b;
                    int i5 = ((bsg) btiVar).f;
                    if (bbmVar.a() != 35) {
                        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + bbmVar.a());
                    }
                    bbl bblVar = bbmVar.f()[0];
                    bbl bblVar2 = bbmVar.f()[1];
                    bbl bblVar3 = bbmVar.f()[2];
                    ByteBuffer byteBufferC = bblVar.c();
                    ByteBuffer byteBufferC2 = bblVar2.c();
                    ByteBuffer byteBufferC3 = bblVar3.c();
                    byteBufferC.rewind();
                    byteBufferC2.rewind();
                    byteBufferC3.rewind();
                    int iRemaining = byteBufferC.remaining();
                    byte[] bArr2 = new byte[iRemaining + ((bbmVar.c() * bbmVar.b()) / 2)];
                    int iC = 0;
                    for (int i6 = 0; i6 < bbmVar.b(); i6++) {
                        byteBufferC.get(bArr2, iC, bbmVar.c());
                        iC += bbmVar.c();
                        byteBufferC.position(Math.min(iRemaining, (byteBufferC.position() - bbmVar.c()) + bblVar.b()));
                    }
                    int iB = bbmVar.b() / 2;
                    int iC2 = bbmVar.c() / 2;
                    int iB2 = bblVar3.b();
                    int iB3 = bblVar2.b();
                    int iA = bblVar3.a();
                    int iA2 = bblVar2.a();
                    byte[] bArr3 = new byte[iB2];
                    int i7 = iC;
                    byte[] bArr4 = new byte[iB3];
                    int i8 = 0;
                    while (i8 < iB) {
                        int i9 = iB;
                        int i10 = iB2;
                        byteBufferC3.get(bArr3, 0, Math.min(iB2, byteBufferC3.remaining()));
                        byteBufferC2.get(bArr4, 0, Math.min(iB3, byteBufferC2.remaining()));
                        int i11 = i7;
                        int i12 = 0;
                        int i13 = 0;
                        for (int i14 = 0; i14 < iC2; i14++) {
                            int i15 = i11 + 1;
                            bArr2[i11] = bArr3[i12];
                            i11 += 2;
                            bArr2[i15] = bArr4[i13];
                            i12 += iA;
                            i13 += iA2;
                        }
                        i8++;
                        iB = i9;
                        iB2 = i10;
                        i7 = i11;
                    }
                    YuvImage yuvImage = new YuvImage(bArr2, 17, bbmVar.c(), bbmVar.b(), null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String str = boh.d;
                    bog bogVar = new bog(ByteOrder.BIG_ENDIAN);
                    bogVar.b("Orientation", "1");
                    bogVar.b("XResolution", "72/1");
                    bogVar.b("YResolution", "72/1");
                    bogVar.b("ResolutionUnit", "2");
                    bogVar.b("YCbCrPositioning", "1");
                    bogVar.b("Make", Build.MANUFACTURER);
                    bogVar.b("Model", Build.MODEL);
                    if (bbmVar.e() != null) {
                        bbmVar.e().f(bogVar);
                    }
                    bogVar.c(i5);
                    bogVar.b("ImageWidth", String.valueOf(bbmVar.c()));
                    bogVar.b("ImageLength", String.valueOf(bbmVar.b()));
                    ArrayList list = Collections.list(new bof(bogVar));
                    if (!((Map) list.get(1)).isEmpty()) {
                        bogVar.a("ExposureProgram", "0", list);
                        bogVar.a("ExifVersion", "0230", list);
                        bogVar.a("ComponentsConfiguration", boh.d, list);
                        bogVar.a("MeteringMode", "0", list);
                        bogVar.a("LightSource", "0", list);
                        bogVar.a("FlashpixVersion", "0100", list);
                        bogVar.a("FocalPlaneResolutionUnit", "2", list);
                        bogVar.a("FileSource", "3", list);
                        bogVar.a("SceneType", "1", list);
                        bogVar.a("CustomRendered", "0", list);
                        bogVar.a("SceneCaptureType", "0", list);
                        bogVar.a("Contrast", "0", list);
                        bogVar.a("Saturation", "0", list);
                        bogVar.a("Sharpness", "0", list);
                    }
                    if (!((Map) list.get(2)).isEmpty()) {
                        bogVar.a("GPSVersionID", "2300", list);
                        bogVar.a("GPSSpeedRef", "K", list);
                        bogVar.a("GPSTrackRef", "T", list);
                        bogVar.a("GPSImgDirectionRef", "T", list);
                        bogVar.a("GPSDestBearingRef", "T", list);
                        bogVar.a("GPSDestDistanceRef", "K", list);
                    }
                    if (!yuvImage.compressToJpeg(rect, i4, new boi(byteArrayOutputStream, new boh(bogVar.c, list)))) {
                        throw new bsb();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        bsgVar = new bsg(byteArray, bob.c(new ByteArrayInputStream(byteArray)), 256, new Size(rect.width(), rect.height()), new Rect(0, 0, rect.width(), rect.height()), ((bsg) btiVar).f, boy.e(((bsg) btiVar).g, rect), ((bsg) btiVar).h);
                    } catch (IOException e) {
                        throw new bbg("Failed to extract Exif from YUV-generated JPEG", e);
                    }
                } catch (bsb e2) {
                    throw new bbg("Failed to encode the image to JPEG.", e2);
                }
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException(a.g(i, "Unexpected format: "));
                }
                brw brwVar = this.a;
                bbm bbmVar2 = (bbm) ((bsg) btiVar).a;
                if (brwVar.a == null) {
                    ByteBuffer byteBufferC4 = bbmVar2.f()[0].c();
                    bArrCopyOfRange = new byte[byteBufferC4.capacity()];
                    byteBufferC4.rewind();
                    byteBufferC4.get(bArrCopyOfRange);
                } else {
                    ByteBuffer byteBufferC5 = bbmVar2.f()[0].c();
                    int iCapacity = byteBufferC5.capacity();
                    byte[] bArr5 = new byte[iCapacity];
                    byteBufferC5.rewind();
                    byteBufferC5.get(bArr5);
                    for (int i16 = 2; i16 + 4 <= iCapacity && bArr5[i16] == -1; i16 += (((bArr5[i16 + 2] & 255) << 8) | (bArr5[i16 + 3] & 255)) + 2) {
                        if (bArr5[i16 + 1] == -38) {
                            break;
                        }
                    }
                    while (true) {
                        int i17 = i2 + 1;
                        if (i17 > iCapacity) {
                            i3 = -1;
                            break;
                        }
                        if (bArr5[i2] == -1 && bArr5[i17] == -40) {
                            i3 = i2;
                            break;
                        }
                        i2 = i17;
                    }
                    if (i3 == -1) {
                        bArr = bArr5;
                        bob bobVar = ((bsg) btiVar).b;
                        bobVar.getClass();
                        bsgVar = new bsg(bArr, bobVar, i, ((bsg) btiVar).d, ((bsg) btiVar).e, ((bsg) btiVar).f, ((bsg) btiVar).g, ((bsg) btiVar).h);
                    }
                    bArrCopyOfRange = Arrays.copyOfRange(bArr5, i3, byteBufferC5.limit());
                }
                bArr = bArrCopyOfRange;
                bob bobVar2 = ((bsg) btiVar).b;
                bobVar2.getClass();
                bsgVar = new bsg(bArr, bobVar2, i, ((bsg) btiVar).d, ((bsg) btiVar).e, ((bsg) btiVar).f, ((bsg) btiVar).g, ((bsg) btiVar).h);
            }
            return bsgVar;
        } finally {
            ((bbm) ((bsg) ((beg) obj).a).a).close();
        }
    }
}
