package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhc implements einb {
    public final GalleryContent a;
    public final int b;

    public adhc(GalleryContent galleryContent, int i) {
        this.a = galleryContent;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adhc)) {
            return false;
        }
        adhc adhcVar = (adhc) obj;
        return fdbq.f(this.a, adhcVar.a) && this.b == adhcVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PhotoSharingLinkSendTypeEvent(content=" + this.a + ", position=" + this.b + ")";
    }
}
