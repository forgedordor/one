package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cglx extends cgpe {
    public final String a;
    public final CharSequence b;
    public final Uri c;
    public final String d;
    public final boolean e;
    public final MessageIdType f;
    private final boolean g;
    private final boolean h;

    public cglx(String str, CharSequence charSequence, Uri uri, String str2, boolean z, boolean z2, boolean z3, MessageIdType messageIdType) {
        this.a = str;
        this.b = charSequence;
        this.c = uri;
        this.d = str2;
        this.g = z;
        this.e = z2;
        this.h = z3;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.f = messageIdType;
    }

    @Override // defpackage.cgpe
    public final Uri a() {
        return this.c;
    }

    @Override // defpackage.cgpe
    public final MessageIdType b() {
        return this.f;
    }

    @Override // defpackage.cgpe
    public final CharSequence c() {
        return this.b;
    }

    @Override // defpackage.cgpe
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cgpe
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgpe) {
            cgpe cgpeVar = (cgpe) obj;
            String str = this.a;
            if (str != null ? str.equals(cgpeVar.e()) : cgpeVar.e() == null) {
                CharSequence charSequence = this.b;
                if (charSequence != null ? charSequence.equals(cgpeVar.c()) : cgpeVar.c() == null) {
                    Uri uri = this.c;
                    if (uri != null ? uri.equals(cgpeVar.a()) : cgpeVar.a() == null) {
                        String str2 = this.d;
                        if (str2 != null ? str2.equals(cgpeVar.d()) : cgpeVar.d() == null) {
                            if (this.g == cgpeVar.h() && this.e == cgpeVar.g() && this.h == cgpeVar.f() && this.f.equals(cgpeVar.b())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cgpe
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.cgpe
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.cgpe
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        CharSequence charSequence = this.b;
        int iHashCode2 = charSequence == null ? 0 : charSequence.hashCode();
        int i = iHashCode ^ 1000003;
        Uri uri = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str2 = this.d;
        return ((((((((iHashCode3 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        MessageIdType messageIdType = this.f;
        Uri uri = this.c;
        return "IncomingMessageLineInfo{senderName=" + this.a + ", text=" + String.valueOf(this.b) + ", attachmentUri=" + String.valueOf(uri) + ", attachmentType=" + this.d + ", isMmsPushNotification=" + this.g + ", isManualDownloadNeeded=" + this.e + ", isEitherRichCardOrCarousel=" + this.h + ", messageId=" + messageIdType.toString() + "}";
    }
}
