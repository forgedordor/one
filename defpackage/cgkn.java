package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cgkn {
    public static cgkn c(Optional optional, Optional optional2) {
        return new cggu(optional, (Bundle) optional2.orElse(new Bundle()));
    }

    public abstract Bundle a();

    public abstract Optional b();
}
