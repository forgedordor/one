package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfrd implements cfrh {
    public final String a;
    private final cfrg b = cfrg.GAIA;

    public cfrd(String str) {
        this.a = str;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("appName is empty");
        }
    }

    @Override // defpackage.cfrh
    public final cfrg a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cfrd) {
            return Objects.equals(this.a, ((cfrd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
