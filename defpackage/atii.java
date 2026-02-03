package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atii extends atim {
    public final Uri a;
    public final ContentType b;
    public final String c;
    public final ContentType d;
    public final covb e;
    public final evqs f;
    public final ContentType g;
    public final evqs h;
    public final ContentType i;
    public final Uri j;
    public final cbqz k;
    public final atis l;

    public atii() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095);
    }

    public static /* synthetic */ atii b(atii atiiVar, evqs evqsVar, ContentType contentType, evqs evqsVar2, ContentType contentType2, cbqz cbqzVar, int i) {
        Uri uri = (i & 1) != 0 ? atiiVar.a : null;
        ContentType contentType3 = (i & 2) != 0 ? atiiVar.b : null;
        String str = (i & 4) != 0 ? atiiVar.c : null;
        ContentType contentType4 = (i & 8) != 0 ? atiiVar.d : null;
        covb covbVar = (i & 16) != 0 ? atiiVar.e : null;
        evqs evqsVar3 = (i & 32) != 0 ? atiiVar.f : evqsVar;
        ContentType contentType5 = (i & 64) != 0 ? atiiVar.g : contentType;
        evqs evqsVar4 = (i & 128) != 0 ? atiiVar.h : evqsVar2;
        ContentType contentType6 = (i & 256) != 0 ? atiiVar.i : contentType2;
        Uri uri2 = (i & 512) != 0 ? atiiVar.j : null;
        cbqz cbqzVar2 = (i & 1024) != 0 ? atiiVar.k : cbqzVar;
        atis atisVar = atiiVar.l;
        cbqzVar2.getClass();
        return new atii(uri, contentType3, str, contentType4, covbVar, evqsVar3, contentType5, evqsVar4, contentType6, uri2, cbqzVar2, atisVar);
    }

    public final boolean a(boolean z) {
        if (z) {
            return (fdbq.f(this.k, cbqz.a) || this.c == null) ? false : true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atii)) {
            return false;
        }
        atii atiiVar = (atii) obj;
        return fdbq.f(this.a, atiiVar.a) && fdbq.f(this.b, atiiVar.b) && fdbq.f(this.c, atiiVar.c) && fdbq.f(this.d, atiiVar.d) && fdbq.f(this.e, atiiVar.e) && fdbq.f(this.f, atiiVar.f) && fdbq.f(this.g, atiiVar.g) && fdbq.f(this.h, atiiVar.h) && fdbq.f(this.i, atiiVar.i) && fdbq.f(this.j, atiiVar.j) && fdbq.f(this.k, atiiVar.k) && fdbq.f(this.l, atiiVar.l);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        ContentType contentType = this.b;
        int iHashCode2 = contentType == null ? 0 : contentType.hashCode();
        int i = iHashCode * 31;
        String str = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        ContentType contentType2 = this.d;
        int iHashCode4 = (iHashCode3 + (contentType2 == null ? 0 : contentType2.hashCode())) * 31;
        covb covbVar = this.e;
        int iHashCode5 = (iHashCode4 + (covbVar == null ? 0 : covbVar.hashCode())) * 31;
        evqs evqsVar = this.f;
        int iHashCode6 = (iHashCode5 + (evqsVar == null ? 0 : evqsVar.hashCode())) * 31;
        ContentType contentType3 = this.g;
        int iHashCode7 = (iHashCode6 + (contentType3 == null ? 0 : contentType3.hashCode())) * 31;
        evqs evqsVar2 = this.h;
        int iHashCode8 = (iHashCode7 + (evqsVar2 == null ? 0 : evqsVar2.hashCode())) * 31;
        ContentType contentType4 = this.i;
        int iHashCode9 = (iHashCode8 + (contentType4 == null ? 0 : contentType4.hashCode())) * 31;
        Uri uri2 = this.j;
        int iHashCode10 = (((iHashCode9 + (uri2 == null ? 0 : uri2.hashCode())) * 31) + this.k.hashCode()) * 31;
        atis atisVar = this.l;
        return iHashCode10 + (atisVar != null ? atisVar.hashCode() : 0);
    }

    public final String toString() {
        return "StepInfo(fileUri=" + this.a + ", contentType=" + this.b + ", fileName=" + this.c + ", unencryptedContentType=" + this.d + ", uploadResult=" + this.e + ", thumbnailBytes=" + this.f + ", thumbnailContentType=" + this.g + ", unencryptedThumbnailBytes=" + this.h + ", unencryptedThumbnailContentType=" + this.i + ", unencryptedFileUri=" + this.j + ", encryptionProtocol=" + this.k + ", uploadResumeTransferHandle=" + this.l + ")";
    }

    public atii(Uri uri, ContentType contentType, String str, ContentType contentType2, covb covbVar, evqs evqsVar, ContentType contentType3, evqs evqsVar2, ContentType contentType4, Uri uri2, cbqz cbqzVar, atis atisVar) {
        cbqzVar.getClass();
        this.a = uri;
        this.b = contentType;
        this.c = str;
        this.d = contentType2;
        this.e = covbVar;
        this.f = evqsVar;
        this.g = contentType3;
        this.h = evqsVar2;
        this.i = contentType4;
        this.j = uri2;
        this.k = cbqzVar;
        this.l = atisVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ atii(Uri uri, ContentType contentType, String str, ContentType contentType2, covb covbVar, evqs evqsVar, ContentType contentType3, evqs evqsVar2, ContentType contentType4, Uri uri2, cbqz cbqzVar, atis atisVar, int i) {
        cbqz cbqzVar2 = (i & 1024) != 0 ? cbqz.a : cbqzVar;
        int i2 = i & 256;
        int i3 = i & 128;
        int i4 = i & 64;
        int i5 = i & 32;
        int i6 = i & 16;
        int i7 = i & 8;
        int i8 = i & 4;
        int i9 = i & 2;
        int i10 = i & 1;
        Uri uri3 = (i & 512) != 0 ? null : uri2;
        ContentType contentType5 = i2 != 0 ? null : contentType4;
        evqs evqsVar3 = i3 != 0 ? null : evqsVar2;
        ContentType contentType6 = i4 != 0 ? null : contentType3;
        evqs evqsVar4 = i5 != 0 ? null : evqsVar;
        covb covbVar2 = i6 != 0 ? null : covbVar;
        ContentType contentType7 = i7 != 0 ? null : contentType2;
        String str2 = i8 != 0 ? null : str;
        ContentType contentType8 = contentType6;
        evqs evqsVar5 = evqsVar4;
        covb covbVar3 = covbVar2;
        ContentType contentType9 = contentType7;
        String str3 = str2;
        ContentType contentType10 = i9 != 0 ? null : contentType;
        this(1 == i10 ? null : uri, contentType10, str3, contentType9, covbVar3, evqsVar5, contentType8, evqsVar3, contentType5, uri3, cbqzVar2, (i & 2048) != 0 ? null : atisVar);
    }
}
