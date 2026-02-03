package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlk {
    public final boolean a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Duration f;

    public wlk(boolean z, long j, boolean z2, boolean z3, int i, Duration duration) {
        this.a = z;
        this.b = j;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlk)) {
            return false;
        }
        wlk wlkVar = (wlk) obj;
        return this.a == wlkVar.a && this.b == wlkVar.b && this.c == wlkVar.c && this.d == wlkVar.d && this.e == wlkVar.e && fdbq.f(this.f, wlkVar.f);
    }

    public final int hashCode() {
        long j = this.b;
        int iA = wlj.a(this.a);
        Duration duration = this.f;
        return (((((((((iA * 31) + ((int) (j ^ (j >>> 32)))) * 31) + wlj.a(this.c)) * 31) + wlj.a(this.d)) * 31) + this.e) * 31) + duration.hashCode();
    }

    public final String toString() {
        return "AttachmentConstraints(allowMultipleVideos=" + this.a + ", maxMessageSizeBytes=" + this.b + ", mediaAttachmentsSupported=" + this.c + ", locationSharingSupported=" + this.d + ", attachmentCountLimit=" + this.e + ", maxVideoDuration=" + this.f + ")";
    }
}
