package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohz implements doif {
    private final String a;

    public dohz(String str) {
        str.getClass();
        this.a = str;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLowerCase(str.charAt(i))) {
                throw new IllegalArgumentException("'" + this.a + "' can only contain lowercase characters");
            }
        }
        if (fdgn.H(this.a)) {
            throw new IllegalArgumentException("Media Type cannot be empty");
        }
    }

    @Override // defpackage.doif
    public final int a() {
        return R.string.arbitrary_format_type;
    }

    @Override // defpackage.doif
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dohz) && fdbq.f(this.a, ((dohz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Arbitrary(value=" + this.a + ")";
    }
}
