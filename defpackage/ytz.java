package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytz implements ykp {
    public final ajlt a;
    public final boolean b;
    public final Uri c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final amwm g;
    public final boolean h;
    public final String i;

    public ytz(ajlt ajltVar, boolean z, Uri uri, boolean z2, boolean z3, boolean z4, amwm amwmVar, boolean z5, String str) {
        this.a = ajltVar;
        this.b = z;
        this.c = uri;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = amwmVar;
        this.h = z5;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytz)) {
            return false;
        }
        ytz ytzVar = (ytz) obj;
        return fdbq.f(this.a, ytzVar.a) && this.b == ytzVar.b && fdbq.f(this.c, ytzVar.c) && this.d == ytzVar.d && this.e == ytzVar.e && this.f == ytzVar.f && fdbq.f(this.g, ytzVar.g) && this.h == ytzVar.h && fdbq.f(this.i, ytzVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.c;
        return ((((((((((((((iHashCode + yty.a(this.b)) * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + yty.a(this.d)) * 31) + yty.a(this.e)) * 31) + yty.a(this.f)) * 31) + this.g.hashCode()) * 31) + yty.a(this.h)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "ImageBubbleArgs(message=" + this.a + ", isOutgoing=" + this.b + ", previewUri=" + this.c + ", isGroupConversation=" + this.d + ", isSpatulaSettingsEnabled=" + this.e + ", enableSwipeToShowTimestamps=" + this.f + ", content=" + this.g + ", isHighlighted=" + this.h + ", contentDescription=" + this.i + ")";
    }
}
