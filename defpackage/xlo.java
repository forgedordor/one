package defpackage;

import com.google.research.xeno.effect.Control;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlo extends dlzf {
    public xlo() {
        super(null);
    }

    @Override // defpackage.dlzf
    public final void a(Map map) {
        Control.FloatSetting floatSetting;
        Control control = (Control) map.get("wet_ratio");
        if (control == null || (floatSetting = control.a) == null) {
            return;
        }
        float f = true != ((Boolean) this.b.c()).booleanValue() ? 0.0f : 1.0f;
        long j = floatSetting.b;
        Control.nativeGetFloatValue(j);
        Control.nativeSetFloatValue(j, f);
        Iterator it = floatSetting.a.iterator();
        while (it.hasNext()) {
            ((exjj) it.next()).a();
        }
    }
}
