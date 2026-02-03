package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jex {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(icr icrVar, fdae fdaeVar) {
        jez jezVar = icrVar.x;
        if (jezVar == null) {
            jezVar = new jez((jew) icrVar);
            icrVar.x = jezVar;
        }
        ((AndroidComposeView) jbg.f(icrVar)).A.d(jezVar, jez.a, fdaeVar);
    }
}
