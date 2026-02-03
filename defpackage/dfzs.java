package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfzs {
    public abstract Network a();

    public abstract NetworkCapabilities b();

    public abstract ekgb c();

    public abstract ekgb d();

    public abstract String e();

    public final boolean f() {
        return b().hasTransport(1);
    }
}
