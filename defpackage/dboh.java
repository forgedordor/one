package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dboh implements dcfa {
    public final Bundle a;

    static {
        new Bundle();
    }

    public dboh(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dboh)) {
            return false;
        }
        Bundle bundle = this.a;
        Bundle bundle2 = ((dboh) obj).a;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!dclc.a(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
