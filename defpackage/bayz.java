package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayz extends baza {
    public final String a;
    public final Uri b;

    public bayz(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    @Override // defpackage.baza
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.baza
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baza) {
            baza bazaVar = (baza) obj;
            String str = this.a;
            if (str != null ? str.equals(bazaVar.b()) : bazaVar.b() == null) {
                Uri uri = this.b;
                if (uri != null ? uri.equals(bazaVar.a()) : bazaVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "MessagePartContent{type=" + this.a + ", uri=" + String.valueOf(this.b) + "}";
    }
}
