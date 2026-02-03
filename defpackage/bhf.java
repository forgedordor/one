package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhf extends bkh {
    public final List a;
    private final int b;
    private final int c;
    private final List d;

    public bhf(int i, int i2, List list, List list2) {
        this.b = i;
        this.c = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.d = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.a = list2;
    }

    @Override // defpackage.bkj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bkj
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bkj
    public final List c() {
        return this.d;
    }

    @Override // defpackage.bkj
    public final List d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkh) {
            bkh bkhVar = (bkh) obj;
            if (this.b == bkhVar.a() && this.c == bkhVar.b() && this.d.equals(bkhVar.c()) && this.a.equals(bkhVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.b + ", recommendedFileFormat=" + this.c + ", audioProfiles=" + this.d + ", videoProfiles=" + this.a + "}";
    }
}
