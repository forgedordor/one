package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwp {
    public static final vwo a(Bundle bundle) {
        if (bundle.containsKey("COMPOSE_ROW_MODE")) {
            return vwo.values()[bundle.getInt("COMPOSE_ROW_MODE")];
        }
        return null;
    }

    public static final void b(Bundle bundle, vwo vwoVar) {
        if (vwoVar == null) {
            bundle.remove("COMPOSE_ROW_MODE");
        } else {
            bundle.putInt("COMPOSE_ROW_MODE", vwoVar.ordinal());
        }
    }
}
