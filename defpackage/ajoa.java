package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajoa extends ajpm {
    private final Long a;
    private final String b;
    private final String c;
    private final String d;
    private final ekgb e;
    private final Uri f;

    public ajoa(Long l, String str, String str2, String str3, ekgb ekgbVar, Uri uri) {
        this.a = l;
        if (str == null) {
            throw new NullPointerException("Null lookupKey");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null header");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null displayName");
        }
        this.d = str3;
        if (ekgbVar == null) {
            throw new NullPointerException("Null destinations");
        }
        this.e = ekgbVar;
        this.f = uri;
    }

    @Override // defpackage.ajpm, defpackage.ajou
    public final Uri a() {
        return this.f;
    }

    @Override // defpackage.ajou
    public final ekgb b() {
        return this.e;
    }

    @Override // defpackage.ajou
    public final Long c() {
        return this.a;
    }

    @Override // defpackage.ajou
    public final String d() {
        return this.d;
    }

    @Override // defpackage.ajou
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpm) {
            ajpm ajpmVar = (ajpm) obj;
            if (this.a.equals(ajpmVar.c()) && this.b.equals(ajpmVar.f()) && this.c.equals(ajpmVar.e()) && this.d.equals(ajpmVar.d()) && ekjz.h(this.e, ajpmVar.b()) && ((uri = this.f) != null ? uri.equals(ajpmVar.a()) : ajpmVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajou
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Uri uri = this.f;
        return (iHashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        Uri uri = this.f;
        return "DefaultContactEntry{contactId=" + this.a + ", lookupKey=" + this.b + ", header=" + this.c + ", displayName=" + this.d + ", destinations=" + this.e.toString() + ", photo=" + String.valueOf(uri) + "}";
    }
}
