package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uhv extends GalleryContent {
    public final String a;
    public final Uri b;
    public final elha c;
    public final Size d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final Uri h;
    public final Optional i;
    public final bvdr j;
    public final Uri k;
    public final String l;
    public final amvx m;

    public uhv(String str, Uri uri, elha elhaVar, Size size, long j, boolean z, boolean z2, Uri uri2, Optional optional, bvdr bvdrVar, Uri uri3, String str2, amvx amvxVar) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.a = str;
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
        if (elhaVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.c = elhaVar;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.d = size;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = uri2;
        if (optional == null) {
            throw new NullPointerException("Null duration");
        }
        this.i = optional;
        if (bvdrVar == null) {
            throw new NullPointerException("Null mediaSendType");
        }
        this.j = bvdrVar;
        this.k = uri3;
        this.l = str2;
        if (amvxVar == null) {
            throw new NullPointerException("Null displayState");
        }
        this.m = amvxVar;
    }

    @Override // defpackage.amvy
    public final long a() {
        return this.e;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.amsv
    public final Uri c() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.amvy
    public final Uri d() {
        return this.h;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GalleryContent) {
            GalleryContent galleryContent = (GalleryContent) obj;
            if (this.a.equals(galleryContent.b()) && this.b.equals(galleryContent.e()) && this.c.equals(galleryContent.j()) && this.d.equals(galleryContent.f()) && this.e == galleryContent.a() && this.f == galleryContent.m() && this.g == galleryContent.n() && ((uri = this.h) != null ? uri.equals(galleryContent.d()) : galleryContent.d() == null) && this.i.equals(galleryContent.k()) && this.j.equals(galleryContent.i()) && ((uri2 = this.k) != null ? uri2.equals(galleryContent.c()) : galleryContent.c() == null) && ((str = this.l) != null ? str.equals(galleryContent.l()) : galleryContent.l() == null) && this.m.equals(galleryContent.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amwm
    public final Size f() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent
    public final uii g() {
        return new uhu(this);
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.amvy
    public final amvx h() {
        return this.m;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Uri uri = this.h;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        long j = this.e;
        int iHashCode3 = ((((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ iHashCode2) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        Uri uri2 = this.k;
        int iHashCode4 = (iHashCode3 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        String str = this.l;
        return ((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.m.hashCode();
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent
    public final bvdr i() {
        return this.j;
    }

    @Override // defpackage.uig
    public final elha j() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.amvy
    public final Optional k() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.amwm
    public final String l() {
        return this.l;
    }

    @Override // defpackage.amvy
    public final boolean m() {
        return this.f;
    }

    @Override // defpackage.amvy
    public final boolean n() {
        return this.g;
    }

    public final String toString() {
        amvx amvxVar = this.m;
        Uri uri = this.k;
        bvdr bvdrVar = this.j;
        Optional optional = this.i;
        Uri uri2 = this.h;
        Size size = this.d;
        elha elhaVar = this.c;
        return "GalleryContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + elhaVar.toString() + ", size=" + size.toString() + ", mediaModifiedTimestamp=" + this.e + ", isResizable=" + this.f + ", saveToExternalStorage=" + this.g + ", previewUri=" + String.valueOf(uri2) + ", duration=" + optional.toString() + ", mediaSendType=" + bvdrVar.toString() + ", originalUri=" + String.valueOf(uri) + ", caption=" + this.l + ", displayState=" + amvxVar.toString() + "}";
    }
}
