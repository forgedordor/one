package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final bvdk e;
    public final Uri f;
    public final MessageIdType g;

    public chhz(boolean z, boolean z2, boolean z3, boolean z4, bvdk bvdkVar, Uri uri, MessageIdType messageIdType) {
        bvdkVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = bvdkVar;
        this.f = uri;
        this.g = messageIdType;
    }

    public static /* synthetic */ chhz a(chhz chhzVar, Uri uri, MessageIdType messageIdType, int i) {
        boolean z = (i & 1) != 0 ? chhzVar.a : false;
        boolean z2 = (i & 2) != 0 ? chhzVar.b : false;
        boolean z3 = (i & 4) != 0 ? chhzVar.c : false;
        boolean z4 = (i & 8) != 0 ? chhzVar.d : false;
        bvdk bvdkVar = (i & 16) != 0 ? chhzVar.e : null;
        if ((i & 32) != 0) {
            uri = chhzVar.f;
        }
        Uri uri2 = uri;
        if ((i & 64) != 0) {
            messageIdType = chhzVar.g;
        }
        bvdkVar.getClass();
        return new chhz(z, z2, z3, z4, bvdkVar, uri2, messageIdType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chhz)) {
            return false;
        }
        chhz chhzVar = (chhz) obj;
        return this.a == chhzVar.a && this.b == chhzVar.b && this.c == chhzVar.c && this.d == chhzVar.d && this.e == chhzVar.e && fdbq.f(this.f, chhzVar.f) && fdbq.f(this.g, chhzVar.g);
    }

    public final int hashCode() {
        int iA = chhy.a(this.a);
        bvdk bvdkVar = this.e;
        int iA2 = (((((((iA * 31) + chhy.a(this.b)) * 31) + chhy.a(this.c)) * 31) + chhy.a(this.d)) * 31) + bvdkVar.hashCode();
        Uri uri = this.f;
        int iHashCode = ((iA2 * 31) + (uri == null ? 0 : uri.hashCode())) * 31;
        MessageIdType messageIdType = this.g;
        return iHashCode + (messageIdType != null ? messageIdType.hashCode() : 0);
    }

    public final String toString() {
        return "MessageState(notified=" + this.a + ", isAllowedByParents=" + this.b + ", isHiddenOtp=" + this.c + ", isSecondaryUser=" + this.d + ", archiveStatus=" + this.e + ", telephonyUri=" + this.f + ", messageId=" + this.g + ")";
    }
}
