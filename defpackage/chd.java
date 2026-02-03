package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chd implements bkf {
    private static final Map c;
    private final bkf d;
    private final bir e;
    private final bly f;

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(1, bxo.g);
        map.put(8, bxo.e);
        map.put(6, bxo.d);
        map.put(5, bxo.c);
        map.put(4, bxo.b);
        map.put(0, bxo.f);
    }

    public chd(bkf bkfVar, bir birVar, bly blyVar) {
        this.d = bkfVar;
        this.e = birVar;
        this.f = blyVar;
    }

    @Override // defpackage.bkf
    public final bkj a(int i) {
        if (b(i)) {
            return this.d.a(i);
        }
        return null;
    }

    @Override // defpackage.bkf
    public final boolean b(int i) {
        if (!this.d.b(i)) {
            return false;
        }
        bxo bxoVar = (bxo) c.get(Integer.valueOf(i));
        if (bxoVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.a(this.e, bxoVar) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).i())) {
                return false;
            }
        }
        return true;
    }
}
