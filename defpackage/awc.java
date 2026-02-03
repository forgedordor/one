package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awc implements avz {
    static final awa a = new awa(new awc());
    private static final Set b = Collections.singleton(azv.b);

    @Override // defpackage.avz
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // defpackage.avz
    public final Set b(azv azvVar) {
        boolean zEquals = azv.b.equals(azvVar);
        Objects.toString(azvVar);
        lcg.b(zEquals, "DynamicRange is not supported: ".concat(String.valueOf(azvVar)));
        return b;
    }

    @Override // defpackage.avz
    public final Set c() {
        return b;
    }
}
