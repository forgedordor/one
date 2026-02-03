package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avs extends avr {
    public avs(Context context) {
        super(context);
    }

    @Override // defpackage.avu, defpackage.avo
    public final Set b() throws aub {
        try {
            return this.a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }
}
