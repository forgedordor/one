package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boh {
    static final boj[] a;
    static final boj[][] b;
    static final HashSet c;
    public static final String d;
    private static final boj[] f;
    private static final boj[] g;
    private static final boj[] h;
    private static final boj[] i;
    public final ByteOrder e;
    private final List j;

    static {
        boj[] bojVarArr = {new boj("ImageWidth", 256, 3, 4), new boj("ImageLength", 257, 3, 4), new boj("Make", 271, 2), new boj("Model", 272, 2), new boj("Orientation", 274, 3), new boj("XResolution", 282, 5), new boj("YResolution", 283, 5), new boj("ResolutionUnit", 296, 3), new boj("Software", 305, 2), new boj("DateTime", 306, 2), new boj("YCbCrPositioning", 531, 3), new boj("SubIFDPointer", 330, 4), new boj("ExifIFDPointer", 34665, 4), new boj("GPSInfoIFDPointer", 34853, 4)};
        f = bojVarArr;
        boj[] bojVarArr2 = {new boj("ExposureTime", 33434, 5), new boj("FNumber", 33437, 5), new boj("ExposureProgram", 34850, 3), new boj("PhotographicSensitivity", 34855, 3), new boj("SensitivityType", 34864, 3), new boj("ExifVersion", 36864, 2), new boj("DateTimeOriginal", 36867, 2), new boj("DateTimeDigitized", 36868, 2), new boj("ComponentsConfiguration", 37121, 7), new boj("ShutterSpeedValue", 37377, 10), new boj("ApertureValue", 37378, 5), new boj("BrightnessValue", 37379, 10), new boj("ExposureBiasValue", 37380, 10), new boj("MaxApertureValue", 37381, 5), new boj("MeteringMode", 37383, 3), new boj("LightSource", 37384, 3), new boj("Flash", 37385, 3), new boj("FocalLength", 37386, 5), new boj("SubSecTime", 37520, 2), new boj("SubSecTimeOriginal", 37521, 2), new boj("SubSecTimeDigitized", 37522, 2), new boj("FlashpixVersion", 40960, 7), new boj("ColorSpace", 40961, 3), new boj("PixelXDimension", 40962, 3, 4), new boj("PixelYDimension", 40963, 3, 4), new boj("InteroperabilityIFDPointer", 40965, 4), new boj("FocalPlaneResolutionUnit", 41488, 3), new boj("SensingMethod", 41495, 3), new boj("FileSource", 41728, 7), new boj("SceneType", 41729, 7), new boj("CustomRendered", 41985, 3), new boj("ExposureMode", 41986, 3), new boj("WhiteBalance", 41987, 3), new boj("SceneCaptureType", 41990, 3), new boj("Contrast", 41992, 3), new boj("Saturation", 41993, 3), new boj("Sharpness", 41994, 3)};
        g = bojVarArr2;
        boj[] bojVarArr3 = {new boj("GPSVersionID", 0, 1), new boj("GPSLatitudeRef", 1, 2), new boj("GPSLatitude", 2, 5, 10), new boj("GPSLongitudeRef", 3, 2), new boj("GPSLongitude", 4, 5, 10), new boj("GPSAltitudeRef", 5, 1), new boj("GPSAltitude", 6, 5), new boj("GPSTimeStamp", 7, 5), new boj("GPSSpeedRef", 12, 2), new boj("GPSTrackRef", 14, 2), new boj("GPSImgDirectionRef", 16, 2), new boj("GPSDestBearingRef", 23, 2), new boj("GPSDestDistanceRef", 25, 2)};
        h = bojVarArr3;
        a = new boj[]{new boj("SubIFDPointer", 330, 4), new boj("ExifIFDPointer", 34665, 4), new boj("GPSInfoIFDPointer", 34853, 4), new boj("InteroperabilityIFDPointer", 40965, 4)};
        boj[] bojVarArr4 = {new boj("InteroperabilityIndex", 1, 2)};
        i = bojVarArr4;
        b = new boj[][]{bojVarArr, bojVarArr2, bojVarArr3, bojVarArr4};
        c = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        d = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public boh(ByteOrder byteOrder, List list) {
        lcg.d(list.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.e = byteOrder;
        this.j = list;
    }

    final Map a(int i2) {
        lcg.f(i2, 0, 4, a.e(i2, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.j.get(i2);
    }
}
