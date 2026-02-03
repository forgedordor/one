package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytw {
    public static final boolean a(ajlt ajltVar) {
        ajlq ajlqVarA;
        Set setD = fcwm.d(ajlq.SENT, ajlq.DELIVERED, ajlq.SEEN);
        ajmc ajmcVarD = ajltVar.d();
        ajmq ajmqVar = ajmcVarD instanceof ajmq ? (ajmq) ajmcVarD : null;
        if (ajmqVar == null || (ajlqVarA = ajmqVar.a()) == null) {
            return true;
        }
        return setD.contains(ajlqVarA);
    }

    public static final boolean b(amvr amvrVar) {
        if (((Boolean) ((cczi) crtr.V.get()).e()).booleanValue()) {
            if ((amvrVar instanceof amvy) && !fcwm.d(amvx.DISPLAY, amvx.DISPLAY_BUT_UNPROCESSESED).contains(((amvy) amvrVar).h())) {
                return true;
            }
        } else if ((amvrVar instanceof amvy) && ((amvy) amvrVar).h() != amvx.DISPLAY) {
            return true;
        }
        return false;
    }

    public static final boolean c(amvr amvrVar) {
        return (!(amvrVar instanceof amvy) || fdbq.f(((amvy) amvrVar).e(), Uri.EMPTY) || le.j(amvrVar.b())) ? false : true;
    }
}
