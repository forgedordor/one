package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfre implements cfrh {
    public final cfrg a = cfrg.PHONE_NUMBER;
    public final String b;

    public cfre(String str) {
        this.b = str;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("normalizedPhoneNumber is empty");
        }
    }

    @Override // defpackage.cfrh
    public final cfrg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cfre) {
            return Objects.equals(this.b, ((cfre) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }
}
