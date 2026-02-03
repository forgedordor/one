package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atz implements ats {
    public final auy a;
    public final Executor b;
    final bse c;
    public boolean d = false;
    public boolean e = false;
    public boolean f;
    public boolean g;
    bco h;
    public bjz i;
    aty j;

    public atz(auy auyVar, Executor executor) {
        this.f = false;
        this.g = false;
        this.a = auyVar;
        this.b = executor;
        this.f = aua.a(auyVar, 4);
        this.g = awv.a(ZslDisablerQuirk.class) != null;
        this.c = new bse(new atv());
    }

    public static final Map d(auy auyVar) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) auyVar.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            bbs.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = ".concat(String.valueOf(e.getMessage())));
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new bnv(true));
                map.put(Integer.valueOf(i), inputSizes[0]);
            }
        }
        return map;
    }

    @Override // defpackage.ats
    public final bbm a() {
        try {
            return (bbm) this.c.a();
        } catch (NoSuchElementException unused) {
            bbs.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    public final void b() {
        bco bcoVar = this.h;
        if (bcoVar != null) {
            bcoVar.h();
            this.h = null;
        }
        aty atyVar = this.j;
        if (atyVar != null) {
            atyVar.a();
            this.j = null;
        }
        c();
        bjz bjzVar = this.i;
        if (bjzVar != null) {
            bjzVar.d();
            this.i = null;
        }
    }

    public final void c() {
        while (true) {
            bse bseVar = this.c;
            if (bseVar.c()) {
                return;
            } else {
                ((bbm) bseVar.a()).close();
            }
        }
    }
}
