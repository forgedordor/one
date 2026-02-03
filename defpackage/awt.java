package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awt {
    /* JADX WARN: Multi-variable type inference failed */
    public static bly a(auy auyVar) {
        boolean z;
        boolean z2;
        Integer num;
        try {
            blt bltVar = (blt) blv.b.c.b().get();
            ArrayList arrayList = new ArrayList();
            Integer num2 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(auyVar));
            }
            Integer num3 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num3 != null) {
                num3.intValue();
            }
            if (bltVar.a(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            if (bltVar.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.a.contains(Build.DEVICE.toLowerCase(Locale.US)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            if (bltVar.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num4 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(CamcorderProfileResolutionQuirk.class, num4 != null && num4.intValue() == 2)) {
                arrayList.add(new CamcorderProfileResolutionQuirk(auyVar));
            }
            if (bltVar.a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(Build.HARDWARE) || "universal7420".equalsIgnoreCase(Build.HARDWARE)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num5 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(LegacyCameraOutputConfigNullPointerQuirk.class, num5 != null && num5.intValue() == 2)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (bltVar.a(LegacyCameraSurfaceCleanupQuirk.class, Build.VERSION.SDK_INT < 29 && (num = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) != null && num.intValue() == 2)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            if (bltVar.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            if (bltVar.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            if (bltVar.a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL)) || ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) || (("samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) || (("samsung".equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL)) || (("samsung".equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL)) || ("xiaomi".equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL))))))) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator it = FlashTooSlowQuirk.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                    if (((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        z = true;
                    }
                }
            }
            z = false;
            if (bltVar.a(FlashTooSlowQuirk.class, z)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (bltVar.a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            Integer num6 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num6 != null && num6.intValue() == 2)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num7 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(PreviewOrientationIncorrectQuirk.class, num7 != null && num7.intValue() == 2)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num8 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(CaptureSessionStuckQuirk.class, num8 != null && num8.intValue() == 2)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            if (bltVar.a(ImageCaptureFlashNotFireQuirk.class, (ImageCaptureFlashNotFireQuirk.b.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)))) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            if (bltVar.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            if (bltVar.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num9 = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (bltVar.a(IncorrectCaptureStateQuirk.class, num9 != null && num9.intValue() == 2)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                    if (((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (bltVar.a(TorchFlashRequiredFor3aUpdateQuirk.class, z2)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(auyVar));
            }
            if (bltVar.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (bltVar.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(Build.MANUFACTURER))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            if (bltVar.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.a() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.c() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.d() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g())) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            if (bltVar.a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(Build.MODEL) && ((Integer) auyVar.c(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new TemporalNoiseQuirk());
            }
            if (bltVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) || (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) || Build.HARDWARE.toLowerCase(Locale.US).startsWith("ums") || (("itel".equalsIgnoreCase(Build.BRAND) && Build.HARDWARE.toLowerCase(Locale.US).startsWith("sp")) || ("HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL))))) {
                arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
            }
            if (bltVar.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && auyVar.a.equals("1"))) {
                arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
            }
            if (bltVar.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.a())) {
                arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
            }
            bly blyVar = new bly(arrayList);
            bbs.a("CameraQuirks", "camera2 CameraQuirks = ".concat(bly.b(blyVar)));
            return blyVar;
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
        }
    }
}
