package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbm {
    public static final mbm a = new mbm();
    public final Uri b = null;
    public final String c = null;
    public final Bundle d = null;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
    }

    private mbm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbm)) {
            return false;
        }
        mbm mbmVar = (mbm) obj;
        Uri uri = mbmVar.b;
        if (Objects.equals(null, null)) {
            String str = mbmVar.c;
            if (Objects.equals(null, null)) {
                Bundle bundle = mbmVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
