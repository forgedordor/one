package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytn implements amvr {
    public final List a;

    public ytn(List list) {
        this.a = list;
    }

    @Override // defpackage.amvr
    public final String b() {
        return "message-list-gallery";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytn) && fdbq.f(this.a, ((ytn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageListGalleryContent(gallery=" + this.a + ")";
    }
}
