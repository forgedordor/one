package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajtl extends ajzd {
    public final String a;
    public final String b;
    private final String c;
    private final Uri d;

    public ajtl(String str, String str2, Uri uri, String str3) {
        this.a = str;
        this.c = str2;
        this.d = uri;
        this.b = str3;
    }

    @Override // defpackage.ajzd
    public final Uri a() {
        return this.d;
    }

    @Override // defpackage.ajzd
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ajzd
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ajzd
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzd) {
            ajzd ajzdVar = (ajzd) obj;
            String str = this.a;
            if (str != null ? str.equals(ajzdVar.d()) : ajzdVar.d() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(ajzdVar.c()) : ajzdVar.c() == null) {
                    Uri uri = this.d;
                    if (uri != null ? uri.equals(ajzdVar.a()) : ajzdVar.a() == null) {
                        String str3 = this.b;
                        if (str3 != null ? str3.equals(ajzdVar.b()) : ajzdVar.b() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        Uri uri = this.d;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str3 = this.b;
        return iHashCode3 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DraftSnippet{text=" + this.a + ", subject=" + this.c + ", previewUri=" + String.valueOf(this.d) + ", previewContentType=" + this.b + "}";
    }
}
