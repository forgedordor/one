package defpackage;

import android.content.res.AssetManager;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.android.vcard.VCardConstants;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lru {
    private static final byte[] B;
    private static final byte[] C;
    private static final byte[] D;
    private static final byte[] E;
    private static final byte[] F;
    private static final byte[] G;
    private static final byte[] H;
    private static final byte[] I;
    private static final byte[] J;
    private static final byte[] K;
    private static final byte[] L;
    private static final byte[] M;
    private static final byte[] N;
    private static final byte[] O;
    private static final byte[] P;
    private static final byte[] Q;
    private static final lrr[] R;
    private static final lrr[] S;
    private static final lrr[] T;
    private static final lrr[] U;
    private static final lrr[] V;
    private static final lrr W;
    private static final lrr[] X;
    private static final lrr[] Y;
    private static final lrr[] Z;
    public static final boolean a = Log.isLoggable("ExifInterface", 3);
    private static final lrr[] aa;
    private static final lrr[] ab;
    private static final HashMap[] ac;
    private static final HashMap[] ad;
    private static final Set ae;
    private static final HashMap af;
    private static final Pattern ag;
    private static final Pattern ah;
    private static final Pattern ai;
    public static final int[] b;
    public static final int[] c;
    static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final SimpleDateFormat g;
    public static final SimpleDateFormat h;
    public static final String[] i;
    public static final int[] j;
    public static final byte[] k;
    static final lrr[][] l;
    public static final Charset m;
    public static final byte[] n;
    public static final byte[] o;
    public static final Pattern p;
    public boolean A;
    private AssetManager.AssetInputStream aj;
    private final HashMap[] ak;
    private final Set al;
    private ByteOrder am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    public String q;
    public FileDescriptor r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public byte[] w;
    public int x;
    public int y;
    public lrq z;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        b = new int[]{8, 8, 8};
        c = new int[]{8};
        d = new byte[]{-1, -40, -1};
        B = new byte[]{102, 116, 121, 112};
        C = new byte[]{109, 105, 102, 49};
        D = new byte[]{104, 101, 105, 99};
        E = new byte[]{97, 118, 105, 102};
        F = new byte[]{97, 118, 105, 115};
        G = new byte[]{79, 76, 89, 77, 80, 0};
        H = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        e = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        I = new byte[]{82, 73, 70, 70};
        J = new byte[]{87, 69, 66, 80};
        K = new byte[]{69, 88, 73, 70};
        L = new byte[]{-99, 1, 42};
        M = "VP8X".getBytes(Charset.defaultCharset());
        N = "VP8L".getBytes(Charset.defaultCharset());
        O = "VP8 ".getBytes(Charset.defaultCharset());
        P = "ANIM".getBytes(Charset.defaultCharset());
        Q = "ANMF".getBytes(Charset.defaultCharset());
        i = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        j = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        k = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        lrr[] lrrVarArr = {new lrr("NewSubfileType", 254, 4), new lrr("SubfileType", 255, 4), new lrr("ImageWidth", 256, 3, 4), new lrr("ImageLength", 257, 3, 4), new lrr("BitsPerSample", 258, 3), new lrr("Compression", 259, 3), new lrr("PhotometricInterpretation", 262, 3), new lrr("ImageDescription", 270, 2), new lrr("Make", 271, 2), new lrr("Model", 272, 2), new lrr("StripOffsets", 273, 3, 4), new lrr("Orientation", 274, 3), new lrr("SamplesPerPixel", 277, 3), new lrr("RowsPerStrip", 278, 3, 4), new lrr("StripByteCounts", 279, 3, 4), new lrr("XResolution", 282, 5), new lrr("YResolution", 283, 5), new lrr("PlanarConfiguration", 284, 3), new lrr("ResolutionUnit", 296, 3), new lrr("TransferFunction", 301, 3), new lrr("Software", 305, 2), new lrr("DateTime", 306, 2), new lrr("Artist", 315, 2), new lrr("WhitePoint", 318, 5), new lrr("PrimaryChromaticities", 319, 5), new lrr("SubIFDPointer", 330, 4), new lrr("JPEGInterchangeFormat", 513, 4), new lrr("JPEGInterchangeFormatLength", 514, 4), new lrr("YCbCrCoefficients", 529, 5), new lrr("YCbCrSubSampling", 530, 3), new lrr("YCbCrPositioning", 531, 3), new lrr("ReferenceBlackWhite", 532, 5), new lrr("Copyright", 33432, 2), new lrr("ExifIFDPointer", 34665, 4), new lrr("GPSInfoIFDPointer", 34853, 4), new lrr("SensorTopBorder", 4, 4), new lrr("SensorLeftBorder", 5, 4), new lrr("SensorBottomBorder", 6, 4), new lrr("SensorRightBorder", 7, 4), new lrr("ISO", 23, 3), new lrr("JpgFromRaw", 46, 7), new lrr("Xmp", 700, 1)};
        R = lrrVarArr;
        lrr[] lrrVarArr2 = {new lrr("ExposureTime", 33434, 5), new lrr("FNumber", 33437, 5), new lrr("ExposureProgram", 34850, 3), new lrr("SpectralSensitivity", 34852, 2), new lrr("PhotographicSensitivity", 34855, 3), new lrr("OECF", 34856, 7), new lrr("SensitivityType", 34864, 3), new lrr("StandardOutputSensitivity", 34865, 4), new lrr("RecommendedExposureIndex", 34866, 4), new lrr("ISOSpeed", 34867, 4), new lrr("ISOSpeedLatitudeyyy", 34868, 4), new lrr("ISOSpeedLatitudezzz", 34869, 4), new lrr("ExifVersion", 36864, 2), new lrr("DateTimeOriginal", 36867, 2), new lrr("DateTimeDigitized", 36868, 2), new lrr("OffsetTime", 36880, 2), new lrr("OffsetTimeOriginal", 36881, 2), new lrr("OffsetTimeDigitized", 36882, 2), new lrr("ComponentsConfiguration", 37121, 7), new lrr("CompressedBitsPerPixel", 37122, 5), new lrr("ShutterSpeedValue", 37377, 10), new lrr("ApertureValue", 37378, 5), new lrr("BrightnessValue", 37379, 10), new lrr("ExposureBiasValue", 37380, 10), new lrr("MaxApertureValue", 37381, 5), new lrr("SubjectDistance", 37382, 5), new lrr("MeteringMode", 37383, 3), new lrr("LightSource", 37384, 3), new lrr("Flash", 37385, 3), new lrr("FocalLength", 37386, 5), new lrr("SubjectArea", 37396, 3), new lrr("MakerNote", 37500, 7), new lrr("UserComment", 37510, 7), new lrr("SubSecTime", 37520, 2), new lrr("SubSecTimeOriginal", 37521, 2), new lrr("SubSecTimeDigitized", 37522, 2), new lrr("FlashpixVersion", 40960, 7), new lrr("ColorSpace", 40961, 3), new lrr("PixelXDimension", 40962, 3, 4), new lrr("PixelYDimension", 40963, 3, 4), new lrr("RelatedSoundFile", 40964, 2), new lrr("InteroperabilityIFDPointer", 40965, 4), new lrr("FlashEnergy", 41483, 5), new lrr("SpatialFrequencyResponse", 41484, 7), new lrr("FocalPlaneXResolution", 41486, 5), new lrr("FocalPlaneYResolution", 41487, 5), new lrr("FocalPlaneResolutionUnit", 41488, 3), new lrr("SubjectLocation", 41492, 3), new lrr("ExposureIndex", 41493, 5), new lrr("SensingMethod", 41495, 3), new lrr("FileSource", 41728, 7), new lrr("SceneType", 41729, 7), new lrr("CFAPattern", 41730, 7), new lrr("CustomRendered", 41985, 3), new lrr("ExposureMode", 41986, 3), new lrr("WhiteBalance", 41987, 3), new lrr("DigitalZoomRatio", 41988, 5), new lrr("FocalLengthIn35mmFilm", 41989, 3), new lrr("SceneCaptureType", 41990, 3), new lrr("GainControl", 41991, 3), new lrr("Contrast", 41992, 3), new lrr("Saturation", 41993, 3), new lrr("Sharpness", 41994, 3), new lrr("DeviceSettingDescription", 41995, 7), new lrr("SubjectDistanceRange", 41996, 3), new lrr("ImageUniqueID", 42016, 2), new lrr("CameraOwnerName", 42032, 2), new lrr("BodySerialNumber", 42033, 2), new lrr("LensSpecification", 42034, 5), new lrr("LensMake", 42035, 2), new lrr("LensModel", 42036, 2), new lrr("Gamma", 42240, 5), new lrr("DNGVersion", 50706, 1), new lrr("DefaultCropSize", 50720, 3, 4)};
        S = lrrVarArr2;
        lrr[] lrrVarArr3 = {new lrr("GPSVersionID", 0, 1), new lrr("GPSLatitudeRef", 1, 2), new lrr("GPSLatitude", 2, 5, 10), new lrr("GPSLongitudeRef", 3, 2), new lrr("GPSLongitude", 4, 5, 10), new lrr("GPSAltitudeRef", 5, 1), new lrr("GPSAltitude", 6, 5), new lrr("GPSTimeStamp", 7, 5), new lrr("GPSSatellites", 8, 2), new lrr("GPSStatus", 9, 2), new lrr("GPSMeasureMode", 10, 2), new lrr("GPSDOP", 11, 5), new lrr("GPSSpeedRef", 12, 2), new lrr("GPSSpeed", 13, 5), new lrr("GPSTrackRef", 14, 2), new lrr("GPSTrack", 15, 5), new lrr("GPSImgDirectionRef", 16, 2), new lrr("GPSImgDirection", 17, 5), new lrr("GPSMapDatum", 18, 2), new lrr("GPSDestLatitudeRef", 19, 2), new lrr("GPSDestLatitude", 20, 5), new lrr("GPSDestLongitudeRef", 21, 2), new lrr("GPSDestLongitude", 22, 5), new lrr("GPSDestBearingRef", 23, 2), new lrr("GPSDestBearing", 24, 5), new lrr("GPSDestDistanceRef", 25, 2), new lrr("GPSDestDistance", 26, 5), new lrr("GPSProcessingMethod", 27, 7), new lrr("GPSAreaInformation", 28, 7), new lrr("GPSDateStamp", 29, 2), new lrr("GPSDifferential", 30, 3), new lrr("GPSHPositioningError", 31, 5)};
        T = lrrVarArr3;
        lrr[] lrrVarArr4 = {new lrr("InteroperabilityIndex", 1, 2)};
        U = lrrVarArr4;
        lrr[] lrrVarArr5 = {new lrr("NewSubfileType", 254, 4), new lrr("SubfileType", 255, 4), new lrr("ThumbnailImageWidth", 256, 3, 4), new lrr("ThumbnailImageLength", 257, 3, 4), new lrr("BitsPerSample", 258, 3), new lrr("Compression", 259, 3), new lrr("PhotometricInterpretation", 262, 3), new lrr("ImageDescription", 270, 2), new lrr("Make", 271, 2), new lrr("Model", 272, 2), new lrr("StripOffsets", 273, 3, 4), new lrr("ThumbnailOrientation", 274, 3), new lrr("SamplesPerPixel", 277, 3), new lrr("RowsPerStrip", 278, 3, 4), new lrr("StripByteCounts", 279, 3, 4), new lrr("XResolution", 282, 5), new lrr("YResolution", 283, 5), new lrr("PlanarConfiguration", 284, 3), new lrr("ResolutionUnit", 296, 3), new lrr("TransferFunction", 301, 3), new lrr("Software", 305, 2), new lrr("DateTime", 306, 2), new lrr("Artist", 315, 2), new lrr("WhitePoint", 318, 5), new lrr("PrimaryChromaticities", 319, 5), new lrr("SubIFDPointer", 330, 4), new lrr("JPEGInterchangeFormat", 513, 4), new lrr("JPEGInterchangeFormatLength", 514, 4), new lrr("YCbCrCoefficients", 529, 5), new lrr("YCbCrSubSampling", 530, 3), new lrr("YCbCrPositioning", 531, 3), new lrr("ReferenceBlackWhite", 532, 5), new lrr("Copyright", 33432, 2), new lrr("ExifIFDPointer", 34665, 4), new lrr("GPSInfoIFDPointer", 34853, 4), new lrr("DNGVersion", 50706, 1), new lrr("DefaultCropSize", 50720, 3, 4)};
        V = lrrVarArr5;
        W = new lrr("StripOffsets", 273, 3);
        lrr[] lrrVarArr6 = {new lrr("ThumbnailImage", 256, 7), new lrr("CameraSettingsIFDPointer", 8224, 4), new lrr("ImageProcessingIFDPointer", 8256, 4)};
        X = lrrVarArr6;
        lrr[] lrrVarArr7 = {new lrr("PreviewImageStart", 257, 4), new lrr("PreviewImageLength", 258, 4)};
        Y = lrrVarArr7;
        lrr[] lrrVarArr8 = {new lrr("AspectFrame", 4371, 3)};
        Z = lrrVarArr8;
        lrr[] lrrVarArr9 = {new lrr("ColorSpace", 55, 3)};
        aa = lrrVarArr9;
        l = new lrr[][]{lrrVarArr, lrrVarArr2, lrrVarArr3, lrrVarArr4, lrrVarArr5, lrrVarArr, lrrVarArr6, lrrVarArr7, lrrVarArr8, lrrVarArr9};
        ab = new lrr[]{new lrr("SubIFDPointer", 330, 4), new lrr("ExifIFDPointer", 34665, 4), new lrr("GPSInfoIFDPointer", 34853, 4), new lrr("InteroperabilityIFDPointer", 40965, 4), new lrr("CameraSettingsIFDPointer", 8224, 1), new lrr("ImageProcessingIFDPointer", 8256, 1)};
        ac = new HashMap[10];
        ad = new HashMap[10];
        ae = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        af = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        m = charsetForName;
        n = "Exif\u0000\u0000".getBytes(charsetForName);
        o = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        g = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        h = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            lrr[][] lrrVarArr10 = l;
            int length = lrrVarArr10.length;
            if (i2 >= 10) {
                lrr[] lrrVarArr11 = ab;
                Integer numValueOf = Integer.valueOf(lrrVarArr11[0].a);
                HashMap map = af;
                map.put(numValueOf, 5);
                map.put(Integer.valueOf(lrrVarArr11[1].a), 1);
                map.put(Integer.valueOf(lrrVarArr11[2].a), 2);
                map.put(Integer.valueOf(lrrVarArr11[3].a), 3);
                map.put(Integer.valueOf(lrrVarArr11[4].a), 7);
                map.put(Integer.valueOf(lrrVarArr11[5].a), 8);
                p = Pattern.compile(".*[1-9].*");
                ag = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                ah = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                ai = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            ac[i2] = new HashMap();
            ad[i2] = new HashMap();
            for (lrr lrrVar : lrrVarArr10[i2]) {
                ac[i2].put(Integer.valueOf(lrrVar.a), lrrVar);
                ad[i2].put(lrrVar.b, lrrVar);
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lru(java.io.InputStream r4) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            lrr[][] r0 = defpackage.lru.l
            int r0 = r0.length
            r0 = 10
            java.util.HashMap[] r1 = new java.util.HashMap[r0]
            r3.ak = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            r3.al = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.am = r0
            if (r4 == 0) goto L48
            r0 = 0
            r3.q = r0
            boolean r1 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r1 == 0) goto L28
            r1 = r4
            android.content.res.AssetManager$AssetInputStream r1 = (android.content.res.AssetManager.AssetInputStream) r1
            r3.aj = r1
            r3.r = r0
            goto L44
        L28:
            boolean r1 = r4 instanceof java.io.FileInputStream
            if (r1 == 0) goto L40
            r1 = r4
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            java.io.FileDescriptor r2 = r1.getFD()
            boolean r2 = G(r2)
            if (r2 == 0) goto L40
            r3.aj = r0
            java.io.FileDescriptor r0 = r1.getFD()
            goto L42
        L40:
            r3.aj = r0
        L42:
            r3.r = r0
        L44:
            r3.u(r4)
            return
        L48:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "inputStream cannot be null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.<init>(java.io.InputStream):void");
    }

    private final void A(int i2, String str, String str2) {
        HashMap[] mapArr = this.ak;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, (lrq) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void B(lro lroVar) throws Throwable {
        lrq lrqVar;
        int iB;
        HashMap map = this.ak[4];
        lrq lrqVar2 = (lrq) map.get("Compression");
        if (lrqVar2 == null) {
            this.x = 6;
            s(lroVar, map);
            return;
        }
        int iB2 = lrqVar2.b(this.am);
        this.x = iB2;
        if (iB2 != 1) {
            if (iB2 == 6) {
                s(lroVar, map);
                return;
            } else if (iB2 != 7) {
                return;
            }
        }
        lrq lrqVar3 = (lrq) map.get("BitsPerSample");
        if (lrqVar3 != null) {
            int[] iArr = (int[]) lrqVar3.l(this.am);
            int[] iArr2 = b;
            if (Arrays.equals(iArr2, iArr) || (this.s == 3 && (lrqVar = (lrq) map.get("PhotometricInterpretation")) != null && ((iB = lrqVar.b(this.am)) != 1 ? !(iB != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, c)))) {
                t(lroVar, map);
                return;
            }
        }
        if (a) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private final void C(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.ak;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            if (a) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        lrq lrqVar = (lrq) mapArr[i2].get("ImageLength");
        lrq lrqVar2 = (lrq) mapArr[i2].get("ImageWidth");
        lrq lrqVar3 = (lrq) mapArr[i3].get("ImageLength");
        lrq lrqVar4 = (lrq) mapArr[i3].get("ImageWidth");
        if (lrqVar == null || lrqVar2 == null) {
            if (a) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (lrqVar3 == null || lrqVar4 == null) {
            if (a) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iB = lrqVar.b(this.am);
        int iB2 = lrqVar2.b(this.am);
        int iB3 = lrqVar3.b(this.am);
        int iB4 = lrqVar4.b(this.am);
        if (iB >= iB3 || iB2 >= iB4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private static void D(CRC32 crc32, int i2) {
        crc32.update(i2 >>> 24);
        crc32.update(i2 >>> 16);
        crc32.update(i2 >>> 8);
        crc32.update(i2);
    }

    private final void E(lrt lrtVar, int i2) throws Throwable {
        lrq lrqVarJ;
        lrq lrqVarJ2;
        HashMap[] mapArr = this.ak;
        lrq lrqVar = (lrq) mapArr[i2].get("DefaultCropSize");
        lrq lrqVar2 = (lrq) mapArr[i2].get("SensorTopBorder");
        lrq lrqVar3 = (lrq) mapArr[i2].get("SensorLeftBorder");
        lrq lrqVar4 = (lrq) mapArr[i2].get("SensorBottomBorder");
        lrq lrqVar5 = (lrq) mapArr[i2].get("SensorRightBorder");
        if (lrqVar != null) {
            if (lrqVar.a == 5) {
                lrs[] lrsVarArr = (lrs[]) lrqVar.l(this.am);
                if (lrsVarArr == null || lrsVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(lrsVarArr))));
                    return;
                } else {
                    lrqVarJ = lrq.h(lrsVarArr[0], this.am);
                    lrqVarJ2 = lrq.h(lrsVarArr[1], this.am);
                }
            } else {
                int[] iArr = (int[]) lrqVar.l(this.am);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    lrqVarJ = lrq.j(iArr[0], this.am);
                    lrqVarJ2 = lrq.j(iArr[1], this.am);
                }
            }
            mapArr[i2].put("ImageWidth", lrqVarJ);
            mapArr[i2].put("ImageLength", lrqVarJ2);
            return;
        }
        if (lrqVar2 != null && lrqVar3 != null && lrqVar4 != null && lrqVar5 != null) {
            int iB = lrqVar2.b(this.am);
            int iB2 = lrqVar4.b(this.am);
            int iB3 = lrqVar5.b(this.am);
            int iB4 = lrqVar3.b(this.am);
            if (iB2 <= iB || iB3 <= iB4) {
                return;
            }
            lrq lrqVarJ3 = lrq.j(iB2 - iB, this.am);
            lrq lrqVarJ4 = lrq.j(iB3 - iB4, this.am);
            mapArr[i2].put("ImageLength", lrqVarJ3);
            mapArr[i2].put("ImageWidth", lrqVarJ4);
            return;
        }
        lrq lrqVar6 = (lrq) mapArr[i2].get("ImageLength");
        lrq lrqVar7 = (lrq) mapArr[i2].get("ImageWidth");
        if (lrqVar6 == null || lrqVar7 == null) {
            lrq lrqVar8 = (lrq) mapArr[i2].get("JPEGInterchangeFormat");
            lrq lrqVar9 = (lrq) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (lrqVar8 == null || lrqVar9 == null) {
                return;
            }
            int iB5 = lrqVar8.b(this.am);
            int iB6 = lrqVar8.b(this.am);
            lrtVar.c(iB5);
            byte[] bArr = new byte[iB6];
            lrtVar.readFully(bArr);
            o(new lro(bArr), iB5, i2);
        }
    }

    private final void F() throws Throwable {
        C(0, 5);
        C(0, 4);
        C(5, 4);
        HashMap[] mapArr = this.ak;
        lrq lrqVar = (lrq) mapArr[1].get("PixelXDimension");
        lrq lrqVar2 = (lrq) mapArr[1].get("PixelYDimension");
        if (lrqVar != null && lrqVar2 != null) {
            mapArr[0].put("ImageWidth", lrqVar);
            mapArr[0].put("ImageLength", lrqVar2);
        }
        if (mapArr[4].isEmpty() && H(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!H(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private static boolean G(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!a) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private final boolean H(HashMap map) {
        lrq lrqVar = (lrq) map.get("ImageLength");
        lrq lrqVar2 = (lrq) map.get("ImageWidth");
        if (lrqVar == null || lrqVar2 == null) {
            return false;
        }
        return lrqVar.b(this.am) <= 512 && lrqVar2.b(this.am) <= 512;
    }

    private static final void I(lro lroVar, lrp lrpVar, byte[] bArr) throws IOException {
        int i2 = lroVar.readInt();
        lrpVar.write(bArr);
        lrpVar.b(i2);
        if (i2 % 2 == 1) {
            i2++;
        }
        lrv.c(lroVar, lrpVar, i2);
    }

    private static final int J(byte[] bArr) throws Throwable {
        lro lroVar;
        long j2;
        byte[] bArr2;
        long j3;
        lro lroVar2 = null;
        try {
            try {
                lroVar = new lro(bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            j2 = lroVar.readInt();
            bArr2 = new byte[4];
            lroVar.readFully(bArr2);
        } catch (Exception e3) {
            e = e3;
            lroVar2 = lroVar;
            if (a) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (lroVar2 != null) {
                lroVar2.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            lroVar2 = lroVar;
            if (lroVar2 != null) {
                lroVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, B)) {
            lroVar.close();
            return 0;
        }
        if (j2 == 1) {
            j2 = lroVar.readLong();
            j3 = 16;
            if (j2 < 16) {
                lroVar.close();
                return 0;
            }
        } else {
            j3 = 8;
        }
        if (j2 > 5000) {
            j2 = 5000;
        }
        long j4 = j2 - j3;
        if (j4 < 8) {
            lroVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (long j5 = 0; j5 < (j4 >> 2); j5++) {
            try {
                lroVar.readFully(bArr3);
                if (j5 != 1) {
                    if (Arrays.equals(bArr3, C)) {
                        z = true;
                    } else if (Arrays.equals(bArr3, D)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, E) || Arrays.equals(bArr3, F)) {
                        z3 = true;
                    }
                    if (!z) {
                        continue;
                    } else {
                        if (z2) {
                            lroVar.close();
                            return 12;
                        }
                        if (z3) {
                            lroVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused) {
                lroVar.close();
                return 0;
            }
        }
        lroVar.close();
        return 0;
    }

    private static final ByteOrder K(lro lroVar) throws IOException {
        short s = lroVar.readShort();
        if (s == 18761) {
            if (a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(s))));
        }
        if (a) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    private static final void L(lro lroVar, lrp lrpVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            lroVar.readFully(bArr3);
            I(lroVar, lrpVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static double a(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d3 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d4 = d2 + (d3 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals(VCardConstants.PROPERTY_N) && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d4;
            }
            return -d4;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static int k(int i2) {
        if (i2 != 4) {
            return (i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair l(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairL = l(strArrSplit[0]);
            if (((Integer) pairL.first).intValue() != 2) {
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    Pair pairL2 = l(strArrSplit[i2]);
                    int iIntValue = (((Integer) pairL2.first).equals(pairL.first) || ((Integer) pairL2.second).equals(pairL.first)) ? ((Integer) pairL.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairL.second).intValue() == -1 || !(((Integer) pairL2.first).equals(pairL.second) || ((Integer) pairL2.second).equals(pairL.second))) ? -1 : ((Integer) pairL.second).intValue();
                    if (iIntValue == -1) {
                        if (iIntValue2 == -1) {
                            return new Pair(2, -1);
                        }
                        iIntValue = -1;
                    }
                    if (iIntValue == -1) {
                        pairL = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairL = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
            }
            return pairL;
        }
        if (str.contains("/")) {
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 >= 0 && j3 >= 0) {
                        if (j2 <= 2147483647L && j3 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            try {
                long j4 = Long.parseLong(str);
                Long lValueOf = Long.valueOf(j4);
                lValueOf.getClass();
                if (j4 >= 0) {
                    lValueOf.getClass();
                    if (j4 <= 65535) {
                        return new Pair(3, 4);
                    }
                }
                lValueOf.getClass();
                return j4 < 0 ? new Pair(9, -1) : new Pair(4, -1);
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        } catch (NumberFormatException unused3) {
            Double.parseDouble(str);
            return new Pair(12, -1);
        }
    }

    private final lrq m(String str) {
        lrq lrqVar;
        lrq lrqVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (a) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        if ("Xmp".equals(str) && k(this.s) == 2 && (lrqVar2 = this.z) != null) {
            return lrqVar2;
        }
        while (true) {
            int length = l.length;
            if (i2 >= 10) {
                if (!"Xmp".equals(str) || (lrqVar = this.z) == null) {
                    return null;
                }
                return lrqVar;
            }
            lrq lrqVar3 = (lrq) this.ak[i2].get(str);
            if (lrqVar3 != null) {
                return lrqVar3;
            }
            i2++;
        }
    }

    private final void n() {
        String strE = e("DateTimeOriginal");
        if (strE != null && e("DateTime") == null) {
            this.ak[0].put("DateTime", lrq.e(strE));
        }
        if (e("ImageWidth") == null) {
            this.ak[0].put("ImageWidth", lrq.f(0L, this.am));
        }
        if (e("ImageLength") == null) {
            this.ak[0].put("ImageLength", lrq.f(0L, this.am));
        }
        if (e("Orientation") == null) {
            this.ak[0].put("Orientation", lrq.f(0L, this.am));
        }
        if (e("LightSource") == null) {
            this.ak[1].put("LightSource", lrq.f(0L, this.am));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
    
        r23.c = r22.am;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0096. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147 A[LOOP:0: B:10:0x0032->B:55:0x0147, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(defpackage.lro r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.o(lro, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r17.A = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p(defpackage.lro r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.p(lro):void");
    }

    private final void q(lrt lrtVar) throws Throwable {
        v(lrtVar);
        y(lrtVar, 0);
        E(lrtVar, 0);
        E(lrtVar, 5);
        E(lrtVar, 4);
        F();
        if (this.s == 8) {
            HashMap[] mapArr = this.ak;
            lrq lrqVar = (lrq) mapArr[1].get("MakerNote");
            if (lrqVar != null) {
                lrt lrtVar2 = new lrt(lrqVar.d);
                lrtVar2.c = this.am;
                lrtVar2.b(6);
                y(lrtVar2, 9);
                lrq lrqVar2 = (lrq) mapArr[9].get("ColorSpace");
                if (lrqVar2 != null) {
                    mapArr[1].put("ColorSpace", lrqVar2);
                }
            }
        }
    }

    private final void r(lro lroVar) throws Throwable {
        if (a) {
            Objects.toString(lroVar);
            Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(lroVar.toString()));
        }
        lroVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = I.length;
        lroVar.b(4);
        int i2 = lroVar.readInt() + 8;
        int length2 = J.length;
        lroVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                lroVar.readFully(bArr);
                int i4 = lroVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(K, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    lroVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = n;
                    if (lrv.d(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.y = i5;
                    x(bArrCopyOfRange, 0);
                    B(new lro(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                lroVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void s(lro lroVar, HashMap map) throws Throwable {
        lrq lrqVar = (lrq) map.get("JPEGInterchangeFormat");
        lrq lrqVar2 = (lrq) map.get("JPEGInterchangeFormatLength");
        if (lrqVar == null || lrqVar2 == null) {
            return;
        }
        int iB = lrqVar.b(this.am);
        int iB2 = lrqVar2.b(this.am);
        if (this.s == 7) {
            iB += this.ap;
        }
        if (iB > 0 && iB2 > 0) {
            this.t = true;
            if (this.q == null && this.aj == null && this.r == null) {
                byte[] bArr = new byte[iB2];
                lroVar.b(iB);
                lroVar.readFully(bArr);
                this.w = bArr;
            }
            this.an = iB;
            this.ao = iB2;
        }
        if (a) {
            Log.d("ExifInterface", a.s(iB2, iB, "Setting thumbnail attributes with offset: ", ", length: "));
        }
    }

    private final void t(lro lroVar, HashMap map) throws IOException {
        int length;
        int length2;
        int i2;
        lrq lrqVar = (lrq) map.get("StripOffsets");
        lrq lrqVar2 = (lrq) map.get("StripByteCounts");
        if (lrqVar == null || lrqVar2 == null) {
            return;
        }
        long[] jArrE = lrv.e(lrqVar.l(this.am));
        long[] jArrE2 = lrv.e(lrqVar2.l(this.am));
        if (jArrE == null || (length = jArrE.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrE2 == null || (length2 = jArrE2.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrE2) {
            j2 += j3;
        }
        int i3 = (int) j2;
        byte[] bArr = new byte[i3];
        this.v = true;
        this.u = true;
        this.t = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int length3 = jArrE.length;
            if (i4 >= length3) {
                int i7 = i3;
                this.w = bArr;
                if (this.v) {
                    this.an = (int) jArrE[0];
                    this.ao = i7;
                    return;
                }
                return;
            }
            int i8 = (int) jArrE[i4];
            int i9 = (int) jArrE2[i4];
            if (i4 < length3 - 1) {
                i2 = i3;
                if (i8 + i9 != jArrE[i4 + 1]) {
                    this.v = false;
                }
            } else {
                i2 = i3;
            }
            int i10 = i8 - i5;
            if (i10 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                lroVar.b(i10);
                int i11 = i5 + i10;
                byte[] bArr2 = new byte[i9];
                try {
                    lroVar.readFully(bArr2);
                    i4++;
                    i5 = i11 + i9;
                    System.arraycopy(bArr2, 0, bArr, i6, i9);
                    i6 += i9;
                    i3 = i2;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", a.e(i9, "Failed to read ", " bytes."));
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", a.e(i10, "Failed to skip ", " bytes."));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e6 A[Catch: all -> 0x03d6, RuntimeException -> 0x03d8, TryCatch #1 {RuntimeException -> 0x03d8, blocks: (B:141:0x028b, B:143:0x02b1, B:150:0x02e6, B:152:0x02f9, B:154:0x030c, B:163:0x0323, B:166:0x0336, B:168:0x0340, B:170:0x0354, B:171:0x0361, B:172:0x0368, B:173:0x0369, B:174:0x0370, B:175:0x0371, B:178:0x0381, B:179:0x03a0, B:181:0x03a4, B:145:0x02c5, B:147:0x02cb), top: B:238:0x028b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f9 A[Catch: all -> 0x03d6, RuntimeException -> 0x03d8, TryCatch #1 {RuntimeException -> 0x03d8, blocks: (B:141:0x028b, B:143:0x02b1, B:150:0x02e6, B:152:0x02f9, B:154:0x030c, B:163:0x0323, B:166:0x0336, B:168:0x0340, B:170:0x0354, B:171:0x0361, B:172:0x0368, B:173:0x0369, B:174:0x0370, B:175:0x0371, B:178:0x0381, B:179:0x03a0, B:181:0x03a4, B:145:0x02c5, B:147:0x02cb), top: B:238:0x028b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030c A[Catch: all -> 0x03d6, RuntimeException -> 0x03d8, TryCatch #1 {RuntimeException -> 0x03d8, blocks: (B:141:0x028b, B:143:0x02b1, B:150:0x02e6, B:152:0x02f9, B:154:0x030c, B:163:0x0323, B:166:0x0336, B:168:0x0340, B:170:0x0354, B:171:0x0361, B:172:0x0368, B:173:0x0369, B:174:0x0370, B:175:0x0371, B:178:0x0381, B:179:0x03a0, B:181:0x03a4, B:145:0x02c5, B:147:0x02cb), top: B:238:0x028b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0340 A[Catch: all -> 0x03d6, RuntimeException -> 0x03d8, TryCatch #1 {RuntimeException -> 0x03d8, blocks: (B:141:0x028b, B:143:0x02b1, B:150:0x02e6, B:152:0x02f9, B:154:0x030c, B:163:0x0323, B:166:0x0336, B:168:0x0340, B:170:0x0354, B:171:0x0361, B:172:0x0368, B:173:0x0369, B:174:0x0370, B:175:0x0371, B:178:0x0381, B:179:0x03a0, B:181:0x03a4, B:145:0x02c5, B:147:0x02cb), top: B:238:0x028b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0369 A[Catch: all -> 0x03d6, RuntimeException -> 0x03d8, TryCatch #1 {RuntimeException -> 0x03d8, blocks: (B:141:0x028b, B:143:0x02b1, B:150:0x02e6, B:152:0x02f9, B:154:0x030c, B:163:0x0323, B:166:0x0336, B:168:0x0340, B:170:0x0354, B:171:0x0361, B:172:0x0368, B:173:0x0369, B:174:0x0370, B:175:0x0371, B:178:0x0381, B:179:0x03a0, B:181:0x03a4, B:145:0x02c5, B:147:0x02cb), top: B:238:0x028b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a4 A[Catch: all -> 0x03d6, RuntimeException -> 0x03d8, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x03d8, blocks: (B:141:0x028b, B:143:0x02b1, B:150:0x02e6, B:152:0x02f9, B:154:0x030c, B:163:0x0323, B:166:0x0336, B:168:0x0340, B:170:0x0354, B:171:0x0361, B:172:0x0368, B:173:0x0369, B:174:0x0370, B:175:0x0371, B:178:0x0381, B:179:0x03a0, B:181:0x03a4, B:145:0x02c5, B:147:0x02cb), top: B:238:0x028b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ed A[Catch: all -> 0x04c2, UnsupportedOperationException -> 0x04c4, IOException -> 0x04c6, TryCatch #0 {UnsupportedOperationException -> 0x04c4, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011f, B:86:0x0130, B:90:0x0142, B:92:0x0153, B:94:0x017e, B:98:0x018f, B:101:0x01aa, B:102:0x01b8, B:104:0x01c4, B:106:0x01ce, B:109:0x01d2, B:111:0x01d9, B:113:0x01df, B:115:0x01e7, B:116:0x01eb, B:117:0x0203, B:95:0x0184, B:97:0x018a, B:183:0x03cb, B:120:0x021a, B:121:0x021f, B:123:0x0223, B:124:0x0233, B:126:0x0244, B:127:0x0251, B:130:0x0267, B:131:0x026e, B:135:0x0279, B:138:0x027e, B:139:0x0285, B:140:0x0286, B:182:0x03c8, B:190:0x03e1, B:191:0x03e4, B:192:0x03e5, B:193:0x03ec, B:194:0x03ed, B:196:0x03f6, B:198:0x03fe, B:201:0x0407, B:202:0x040c, B:204:0x0410, B:205:0x0420, B:207:0x0470, B:210:0x047c, B:212:0x048a, B:214:0x04ae, B:215:0x04ba, B:75:0x010c, B:77:0x0114), top: B:237:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03f6 A[Catch: all -> 0x04c2, UnsupportedOperationException -> 0x04c4, IOException -> 0x04c6, TryCatch #0 {UnsupportedOperationException -> 0x04c4, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011f, B:86:0x0130, B:90:0x0142, B:92:0x0153, B:94:0x017e, B:98:0x018f, B:101:0x01aa, B:102:0x01b8, B:104:0x01c4, B:106:0x01ce, B:109:0x01d2, B:111:0x01d9, B:113:0x01df, B:115:0x01e7, B:116:0x01eb, B:117:0x0203, B:95:0x0184, B:97:0x018a, B:183:0x03cb, B:120:0x021a, B:121:0x021f, B:123:0x0223, B:124:0x0233, B:126:0x0244, B:127:0x0251, B:130:0x0267, B:131:0x026e, B:135:0x0279, B:138:0x027e, B:139:0x0285, B:140:0x0286, B:182:0x03c8, B:190:0x03e1, B:191:0x03e4, B:192:0x03e5, B:193:0x03ec, B:194:0x03ed, B:196:0x03f6, B:198:0x03fe, B:201:0x0407, B:202:0x040c, B:204:0x0410, B:205:0x0420, B:207:0x0470, B:210:0x047c, B:212:0x048a, B:214:0x04ae, B:215:0x04ba, B:75:0x010c, B:77:0x0114), top: B:237:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04cb A[Catch: all -> 0x04c2, TRY_LEAVE, TryCatch #2 {all -> 0x04c2, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011f, B:86:0x0130, B:90:0x0142, B:92:0x0153, B:94:0x017e, B:98:0x018f, B:101:0x01aa, B:102:0x01b8, B:104:0x01c4, B:106:0x01ce, B:109:0x01d2, B:111:0x01d9, B:113:0x01df, B:115:0x01e7, B:116:0x01eb, B:117:0x0203, B:95:0x0184, B:97:0x018a, B:183:0x03cb, B:120:0x021a, B:121:0x021f, B:123:0x0223, B:124:0x0233, B:126:0x0244, B:127:0x0251, B:130:0x0267, B:131:0x026e, B:135:0x0279, B:138:0x027e, B:139:0x0285, B:140:0x0286, B:182:0x03c8, B:190:0x03e1, B:191:0x03e4, B:192:0x03e5, B:193:0x03ec, B:194:0x03ed, B:196:0x03f6, B:198:0x03fe, B:201:0x0407, B:202:0x040c, B:204:0x0410, B:205:0x0420, B:207:0x0470, B:210:0x047c, B:212:0x048a, B:214:0x04ae, B:215:0x04ba, B:75:0x010c, B:77:0x0114, B:222:0x04c7, B:224:0x04cb), top: B:237:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8 A[Catch: all -> 0x04c2, UnsupportedOperationException -> 0x04c4, IOException -> 0x04c6, TryCatch #0 {UnsupportedOperationException -> 0x04c4, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011f, B:86:0x0130, B:90:0x0142, B:92:0x0153, B:94:0x017e, B:98:0x018f, B:101:0x01aa, B:102:0x01b8, B:104:0x01c4, B:106:0x01ce, B:109:0x01d2, B:111:0x01d9, B:113:0x01df, B:115:0x01e7, B:116:0x01eb, B:117:0x0203, B:95:0x0184, B:97:0x018a, B:183:0x03cb, B:120:0x021a, B:121:0x021f, B:123:0x0223, B:124:0x0233, B:126:0x0244, B:127:0x0251, B:130:0x0267, B:131:0x026e, B:135:0x0279, B:138:0x027e, B:139:0x0285, B:140:0x0286, B:182:0x03c8, B:190:0x03e1, B:191:0x03e4, B:192:0x03e5, B:193:0x03ec, B:194:0x03ed, B:196:0x03f6, B:198:0x03fe, B:201:0x0407, B:202:0x040c, B:204:0x0410, B:205:0x0420, B:207:0x0470, B:210:0x047c, B:212:0x048a, B:214:0x04ae, B:215:0x04ba, B:75:0x010c, B:77:0x0114), top: B:237:0x0009 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [lru] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(java.io.InputStream r21) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.u(java.io.InputStream):void");
    }

    private final void v(lro lroVar) throws IOException {
        ByteOrder byteOrderK = K(lroVar);
        this.am = byteOrderK;
        lroVar.c = byteOrderK;
        int unsignedShort = lroVar.readUnsignedShort();
        int i2 = this.s;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int i3 = lroVar.readInt();
        if (i3 < 8) {
            throw new IOException(a.g(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            lroVar.b(i4);
        }
    }

    private final void w() {
        for (int i2 = 0; i2 < 10; i2++) {
            StringBuilder sb = new StringBuilder("The size of tag group[");
            sb.append(i2);
            sb.append("]: ");
            HashMap[] mapArr = this.ak;
            sb.append(mapArr[i2].size());
            Log.d("ExifInterface", sb.toString());
            for (Map.Entry entry : mapArr[i2].entrySet()) {
                lrq lrqVar = (lrq) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + lrqVar.toString() + ", tagValue: '" + lrqVar.m(this.am) + "'");
            }
        }
    }

    private final void x(byte[] bArr, int i2) throws IOException {
        lrt lrtVar = new lrt(bArr);
        v(lrtVar);
        y(lrtVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(defpackage.lrt r33, int r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.y(lrt, int):void");
    }

    private final void z(String str) {
        int i2 = 0;
        while (true) {
            int length = l.length;
            if (i2 >= 10) {
                return;
            }
            this.ak[i2].remove(str);
            i2++;
        }
    }

    public final double b(String str, double d2) {
        lrq lrqVarM = m(str);
        if (lrqVarM != null) {
            try {
                return lrqVarM.a(this.am);
            } catch (NumberFormatException unused) {
            }
        }
        return d2;
    }

    public final int c(String str, int i2) {
        lrq lrqVarM = m(str);
        if (lrqVarM != null) {
            try {
                return lrqVarM.b(this.am);
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.lrp r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.d(lrp):int");
    }

    public final String e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        lrq lrqVarM = m(str);
        if (lrqVarM == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!ae.contains(str)) {
                return lrqVarM.m(this.am);
            }
            try {
                return Double.toString(lrqVarM.a(this.am));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i2 = lrqVarM.a;
        if (i2 != 5 && i2 != 10) {
            Log.w("ExifInterface", a.g(i2, "GPS Timestamp format is not rational. format="));
            return null;
        }
        lrs[] lrsVarArr = (lrs[]) lrqVarM.l(this.am);
        if (lrsVarArr == null || lrsVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(lrsVarArr))));
            return null;
        }
        lrs lrsVar = lrsVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (lrsVar.a / lrsVar.b));
        lrs lrsVar2 = lrsVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (lrsVar2.a / lrsVar2.b));
        lrs lrsVar3 = lrsVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (lrsVar3.a / lrsVar3.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec A[Catch: all -> 0x01ff, Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, all -> 0x01ff, blocks: (B:7:0x003e, B:9:0x004b, B:11:0x005b, B:12:0x005d, B:70:0x01d1, B:72:0x01ec, B:73:0x01f5, B:15:0x006c, B:17:0x007b, B:19:0x0083, B:21:0x0087, B:23:0x00a0, B:24:0x00a5, B:25:0x00a7, B:28:0x00b3, B:29:0x00b7, B:30:0x00bc, B:31:0x00c8, B:33:0x00d0, B:37:0x00df, B:39:0x00e7, B:41:0x00eb, B:43:0x00fc, B:45:0x010e, B:60:0x0161, B:62:0x016d, B:63:0x0174, B:65:0x01ae, B:69:0x01ca, B:66:0x01ba, B:68:0x01c2, B:46:0x011f, B:47:0x0126, B:48:0x0127, B:50:0x0133, B:52:0x0139, B:56:0x0150, B:57:0x0153, B:58:0x015a), top: B:92:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.io.InputStream r21, java.io.OutputStream r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.f(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        if (r7 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019c, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.g(java.lang.String, java.lang.String):void");
    }

    public final void h(lrp lrpVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.y = lrpVar.a.size() + d(new lrp(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        lrpVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        lrpVar.b((int) crc32.getValue());
    }

    public final void i(lrp lrpVar) throws IOException {
        lrpVar.b(this.z.d.length + 22);
        CRC32 crc32 = new CRC32();
        lrpVar.b(1767135348);
        D(crc32, 1767135348);
        byte[] bArr = f;
        lrpVar.write(bArr);
        crc32.update(bArr);
        lrpVar.write(this.z.d);
        crc32.update(this.z.d);
        lrpVar.b((int) crc32.getValue());
        this.A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] j() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.t
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.w
            if (r1 != 0) goto L97
            android.content.res.AssetManager$AssetInputStream r1 = r8.aj     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            if (r1 == 0) goto L2d
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L29
            if (r3 == 0) goto L1b
            r1.reset()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L29
        L19:
            r3 = r2
            goto L4d
        L1b:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L29
            defpackage.lrv.b(r1)
            return r2
        L24:
            r0 = move-exception
            r3 = r2
        L26:
            r2 = r1
            goto L8e
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L80
        L2d:
            java.lang.String r1 = r8.q     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            if (r1 == 0) goto L38
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r1 = r3
            goto L19
        L38:
            java.io.FileDescriptor r1 = r8.r     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r7 = r3
            r3 = r1
            r1 = r7
        L4d:
            lro r4 = new lro     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r5 = r8.an     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r6 = r8.y     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r5 = r5 + r6
            r4.b(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r5 = r8.ao     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r8.w = r5     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            defpackage.lrv.b(r1)
            if (r3 == 0) goto L6b
            defpackage.lrv.a(r3)
        L6b:
            return r5
        L6c:
            r0 = move-exception
            goto L26
        L6e:
            r4 = move-exception
            goto L80
        L70:
            r0 = move-exception
            r3 = r1
            goto L8e
        L73:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L80
        L78:
            r0 = move-exception
            r3 = r2
            goto L8e
        L7b:
            r1 = move-exception
            r3 = r1
            r1 = r2
            r4 = r3
            r3 = r1
        L80:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L6c
            defpackage.lrv.b(r1)
            if (r3 == 0) goto L8d
            defpackage.lrv.a(r3)
        L8d:
            return r2
        L8e:
            defpackage.lrv.b(r2)
            if (r3 == 0) goto L96
            defpackage.lrv.a(r3)
        L96:
            throw r0
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.j():byte[]");
    }

    public lru(String str) throws Throwable {
        FileInputStream fileInputStream;
        int length = l.length;
        this.ak = new HashMap[10];
        this.al = new HashSet(10);
        this.am = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.aj = null;
            this.q = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (G(fileInputStream.getFD())) {
                    this.r = fileInputStream.getFD();
                } else {
                    this.r = null;
                }
                u(fileInputStream);
                lrv.b(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                lrv.b(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }
}
