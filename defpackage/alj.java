package defpackage;

import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alj implements bib {
    public final CaptureResult a;
    private final bmx b;

    public alj(bmx bmxVar, CaptureResult captureResult) {
        this.b = bmxVar;
        this.a = captureResult;
    }

    @Override // defpackage.bib
    public final long a() {
        Long l = (Long) this.a.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.bib
    public final CaptureResult b() {
        return this.a;
    }

    @Override // defpackage.bib
    public final bhw c() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return bhw.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return bhw.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return bhw.CONVERGED;
            }
            if (iIntValue == 3) {
                return bhw.LOCKED;
            }
            if (iIntValue == 4) {
                return bhw.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                Objects.toString(num);
                bbs.c("C2CameraCaptureResult", "Undefined ae state: ".concat(num.toString()));
                return bhw.UNKNOWN;
            }
        }
        return bhw.SEARCHING;
    }

    @Override // defpackage.bib
    public final bhx d() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return bhx.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                Objects.toString(num);
                bbs.c("C2CameraCaptureResult", "Undefined af state: ".concat(num.toString()));
                break;
        }
        return bhx.UNKNOWN;
    }

    @Override // defpackage.bib
    public final bhy e() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return bhy.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return bhy.INACTIVE;
        }
        if (iIntValue == 1) {
            return bhy.METERING;
        }
        if (iIntValue == 2) {
            return bhy.CONVERGED;
        }
        if (iIntValue == 3) {
            return bhy.LOCKED;
        }
        Objects.toString(num);
        bbs.c("C2CameraCaptureResult", "Undefined awb state: ".concat(num.toString()));
        return bhy.UNKNOWN;
    }

    @Override // defpackage.bib
    public final bmx f() {
        return this.b;
    }

    @Override // defpackage.bib
    public final void g(bog bogVar) throws NumberFormatException {
        bhz.a(this, bogVar);
        try {
            Integer num = (Integer) this.a.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bogVar.c(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            bbs.f("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        CaptureResult captureResult = this.a;
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            bogVar.b("ExposureTime", String.valueOf(r1.longValue() / TimeUnit.SECONDS.toNanos(1L)));
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bogVar.b("FNumber", String.valueOf(f.floatValue()));
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r2.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            bogVar.b("SensitivityType", "3");
            bogVar.b("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)));
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bogVar.b("FocalLength", new bom((long) (f2.floatValue() * 1000.0f), 1000L).toString());
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            bogVar.b("WhiteBalance", (num2.intValue() == 0 ? 2 : 1) + (-1) != 0 ? "1" : "0");
        }
    }

    @Override // defpackage.bib
    public final int h() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return 3;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return 4;
            }
            if (iIntValue != 5) {
                Objects.toString(num);
                bbs.c("C2CameraCaptureResult", "Undefined af mode: ".concat(num.toString()));
                return 1;
            }
        }
        return 2;
    }

    @Override // defpackage.bib
    public final int i() {
        Integer num = (Integer) this.a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue == 2) {
            return 3;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return 4;
        }
        Objects.toString(num);
        bbs.c("C2CameraCaptureResult", "Undefined flash state: ".concat(num.toString()));
        return 1;
    }
}
