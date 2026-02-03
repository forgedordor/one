package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnr {
    public static final jtn a = new jtn("MagnifierPositionInRoot");

    public static /* synthetic */ boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static /* synthetic */ ics b(ics icsVar, fdap fdapVar, fdap fdapVar2, dot dotVar) {
        return a() ? new MagnifierElement(fdapVar, fdapVar2, dotVar) : icsVar;
    }
}
