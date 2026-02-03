package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class che implements cgt {
    private final cgt a;
    private final Range b;
    private final Range c;
    private final Set d;

    private che(cgt cgtVar) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = cgtVar;
        int iB = cgtVar.b();
        this.b = Range.create(Integer.valueOf(iB), Integer.valueOf(((int) Math.ceil(4096.0d / iB)) * iB));
        int iA = cgtVar.a();
        this.c = Range.create(Integer.valueOf(iA), Integer.valueOf(((int) Math.ceil(2160.0d / iA)) * iA));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a() ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static cgt j(cgt cgtVar, Size size) {
        if (!(cgtVar instanceof che)) {
            if (ccu.a(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                cgtVar = new che(cgtVar);
            } else if (size != null && !cgtVar.i(size.getWidth(), size.getHeight())) {
                bbs.f("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, cgtVar.f(), cgtVar.d()));
                cgtVar = new che(cgtVar);
            }
        }
        if (size != null && (cgtVar instanceof che)) {
            ((che) cgtVar).d.add(size);
        }
        return cgtVar;
    }

    @Override // defpackage.cgt
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.cgt
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.cgt
    public final Range c() {
        return this.a.c();
    }

    @Override // defpackage.cgt
    public final Range d() {
        return this.c;
    }

    @Override // defpackage.cgt
    public final Range e(int i) {
        Range range = this.b;
        boolean z = false;
        if (range.contains((Range) Integer.valueOf(i)) && i % this.a.b() == 0) {
            z = true;
        }
        lcg.b(z, "Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + this.a.b());
        return this.c;
    }

    @Override // defpackage.cgt
    public final Range f() {
        return this.b;
    }

    @Override // defpackage.cgt
    public final Range g(int i) {
        Range range = this.c;
        boolean z = false;
        if (range.contains((Range) Integer.valueOf(i)) && i % this.a.a() == 0) {
            z = true;
        }
        lcg.b(z, "Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + this.a.a());
        return this.b;
    }

    @Override // defpackage.cgt
    public final boolean h(int i, int i2) {
        cgt cgtVar = this.a;
        if (cgtVar.h(i, i2)) {
            return true;
        }
        for (Size size : this.d) {
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.b.contains((Range) Integer.valueOf(i)) && this.c.contains((Range) Integer.valueOf(i2)) && i % cgtVar.b() == 0 && i2 % cgtVar.a() == 0;
    }

    @Override // defpackage.cgt
    public final /* synthetic */ boolean i(int i, int i2) {
        return cgr.a(this, i, i2);
    }
}
