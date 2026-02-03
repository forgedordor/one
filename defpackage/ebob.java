package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebob extends ebmd {
    public String c;
    public String d;

    public ebob() {
    }

    public abstract String a();

    @Override // defpackage.ebmd
    public String c() {
        return this.c + ": " + a() + VCardBuilder.VCARD_END_OF_LINE;
    }

    public abstract ebmk d();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebob)) {
            return false;
        }
        ebob ebobVar = (ebob) obj;
        if (ejwh.a(this.c, ebobVar.c)) {
            return ejwh.a(this.d, ebobVar.d);
        }
        return false;
    }

    public final int h(int i) {
        try {
            return Integer.parseInt(a());
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public int hashCode() {
        String str = this.c;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        return str2 != null ? (iHashCode * 37) + str2.hashCode() : iHashCode;
    }

    public final String toString() {
        return c();
    }

    public ebob(String str) {
        this.c = str;
    }

    @Override // defpackage.ebmd
    public Object clone() {
        return this;
    }
}
