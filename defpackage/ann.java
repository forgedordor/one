package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ann implements bir {
    public final String a;
    public final auy b;
    public final aye c;
    public amb e;
    public final bou h;
    public final bly j;
    private final bkf k;
    public final Object d = new Object();
    public bou f = null;
    public bou g = null;
    public List i = null;

    public ann(String str, avp avpVar) {
        lcg.i(str);
        this.a = str;
        auy auyVarA = avpVar.a(str);
        this.b = auyVarA;
        this.c = new aye(this);
        bly blyVarA = awt.a(auyVarA);
        this.j = blyVarA;
        this.k = new apn(str, blyVarA);
        this.h = new bou(new ayo(5, null));
    }

    @Override // defpackage.azd
    public final int a() {
        Integer num = (Integer) this.b.c(CameraCharacteristics.LENS_FACING);
        lcg.b(num != null, "Unable to get the lens facing of the camera.");
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(a.e(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // defpackage.azd
    public final int b() {
        return c(0);
    }

    @Override // defpackage.azd
    public final int c(int i) {
        Integer num = (Integer) this.b.c(CameraCharacteristics.SENSOR_ORIENTATION);
        lcg.i(num);
        return bnq.a(bnq.b(i), num.intValue(), a() == 1);
    }

    final int d() {
        Integer num = (Integer) this.b.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        lcg.i(num);
        return num.intValue();
    }

    @Override // defpackage.bir
    public final Rect e() {
        Rect rect = (Rect) this.b.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        lcg.i(rect);
        return rect;
    }

    @Override // defpackage.bir
    public final bkf g() {
        return this.k;
    }

    @Override // defpackage.bir
    public final bly h() {
        return this.j;
    }

    @Override // defpackage.azd
    public final lvv i() {
        synchronized (this.d) {
            amb ambVar = this.e;
            if (ambVar == null) {
                if (this.f == null) {
                    this.f = new bou(0);
                }
                return this.f;
            }
            bou bouVar = this.f;
            if (bouVar != null) {
                return bouVar;
            }
            return ambVar.f.b;
        }
    }

    @Override // defpackage.azd
    public final lvv j() {
        synchronized (this.d) {
            amb ambVar = this.e;
            if (ambVar != null) {
                bou bouVar = this.g;
                if (bouVar != null) {
                    return bouVar;
                }
                return ambVar.e.d;
            }
            if (this.g == null) {
                atp atpVarA = atq.a(this.b);
                atr atrVar = new atr(atpVarA.a(), atpVarA.b());
                atrVar.d(1.0f);
                this.g = new bou(brd.e(atrVar));
            }
            return this.g;
        }
    }

    @Override // defpackage.bir
    public final Object k() {
        return this.b.b.a;
    }

    @Override // defpackage.bir
    public final String l() {
        return this.a;
    }

    @Override // defpackage.azd
    public final String m() {
        return d() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.bir
    public final List n(Range range) {
        Size[] highSpeedVideoSizesFor;
        try {
            highSpeedVideoSizesFor = this.b.b().b.a.getHighSpeedVideoSizesFor(range);
        } catch (IllegalArgumentException e) {
            Objects.toString(range);
            bbs.g("Camera2CameraInfo", "Can't get high speed resolutions for ".concat(range.toString()), e);
            highSpeedVideoSizesFor = null;
        }
        return highSpeedVideoSizesFor != null ? Arrays.asList(highSpeedVideoSizesFor) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.bir
    public final List o(int i) {
        Size[] sizeArrC = this.b.b().c(i);
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.bir
    public final Set p() {
        return awa.b(this.b).c();
    }

    @Override // defpackage.azd
    public final Set q() {
        Range[] rangeArr = (Range[]) this.b.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.EMPTY_SET;
    }

    @Override // defpackage.bir
    public final Set r(Size size) {
        Range[] rangeArrB;
        try {
            rangeArrB = this.b.b().b(size);
        } catch (IllegalArgumentException e) {
            Objects.toString(size);
            bbs.g("Camera2CameraInfo", "Can't get high speed frame rate ranges for ".concat(size.toString()), e);
            rangeArrB = null;
        }
        return rangeArrB != null ? new HashSet(Arrays.asList(rangeArrB)) : Collections.EMPTY_SET;
    }

    @Override // defpackage.bir
    public final Set s() {
        int[] outputFormats;
        try {
            outputFormats = this.b.b().b.a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            bbs.g("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            outputFormats = null;
        }
        int[] iArr = outputFormats != null ? (int[]) outputFormats.clone() : null;
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    @Override // defpackage.bir
    public final void t(Executor executor, bhr bhrVar) {
        synchronized (this.d) {
            amb ambVar = this.e;
            if (ambVar != null) {
                ambVar.p(executor, bhrVar);
                return;
            }
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(new Pair(bhrVar, executor));
        }
    }

    @Override // defpackage.bir
    public final void u(final bhr bhrVar) {
        synchronized (this.d) {
            final amb ambVar = this.e;
            if (ambVar != null) {
                ambVar.b.execute(new Runnable() { // from class: als
                    @Override // java.lang.Runnable
                    public final void run() {
                        alx alxVar = ambVar.l;
                        Set set = alxVar.a;
                        bhr bhrVar2 = bhrVar;
                        set.remove(bhrVar2);
                        alxVar.b.remove(bhrVar2);
                    }
                });
                return;
            }
            List list = this.i;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Pair) it.next()).first == bhrVar) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.bir
    public final boolean v() {
        return aua.a(this.b, 9);
    }

    @Override // defpackage.bir
    public final boolean w() {
        int[] iArr = (int[]) this.b.c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bir
    public final int x() {
        Integer num = (Integer) this.b.c(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        lcg.i(num);
        return num.intValue() != 1 ? 1 : 2;
    }

    @Override // defpackage.bir
    public final /* synthetic */ bir f() {
        return this;
    }
}
