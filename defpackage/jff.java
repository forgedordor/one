package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jff {
    public static /* synthetic */ jfe a(jfh jfhVar, fdat fdatVar, fdae fdaeVar, ini iniVar, boolean z, int i) {
        Object obj = null;
        if ((i & 4) != 0) {
            iniVar = null;
        }
        if (iniVar != null) {
            return new jnc(iniVar, null, (AndroidComposeView) jfhVar, fdatVar, fdaeVar);
        }
        if (((i & 8) == 0) && z) {
            AndroidComposeView androidComposeView = (AndroidComposeView) jfhVar;
            if (androidComposeView.isHardwareAccelerated() && androidComposeView.G) {
                try {
                    return new joe((AndroidComposeView) jfhVar, fdatVar, fdaeVar);
                } catch (Throwable unused) {
                    androidComposeView.G = false;
                }
            }
            if (androidComposeView.C == null) {
                if (!joy.c) {
                    jox.a(new View(androidComposeView.getContext()));
                }
                androidComposeView.C = joy.d ? new jmq(androidComposeView.getContext()) : new joz(androidComposeView.getContext());
                androidComposeView.addView(androidComposeView.C);
            }
            jmq jmqVar = androidComposeView.C;
            jmqVar.getClass();
            return new joy(androidComposeView, jmqVar, fdatVar, fdaeVar);
        }
        AndroidComposeView androidComposeView2 = (AndroidComposeView) jfhVar;
        jpa jpaVar = androidComposeView2.P;
        jpaVar.a();
        while (true) {
            hum humVar = jpaVar.a;
            int i2 = humVar.b;
            if (i2 == 0) {
                break;
            }
            Object obj2 = ((Reference) humVar.c(i2 - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        jfe jfeVar = (jfe) obj;
        if (jfeVar != null) {
            jfeVar.h(fdatVar, fdaeVar);
            return jfeVar;
        }
        iie iieVar = androidComposeView2.ab;
        return new jnc(iieVar.a(), iieVar, androidComposeView2, fdatVar, fdaeVar);
    }
}
