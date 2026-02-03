package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfs {
    public final fdae a;
    public final MessageId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ctfs(fdae fdaeVar, MessageId messageId, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = fdaeVar;
        this.b = messageId;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctfs)) {
            return false;
        }
        ctfs ctfsVar = (ctfs) obj;
        return fdbq.f(this.a, ctfsVar.a) && fdbq.f(this.b, ctfsVar.b) && fdbq.f(this.c, ctfsVar.c) && this.d == ctfsVar.d && this.e == ctfsVar.e && this.f == ctfsVar.f && this.g == ctfsVar.g && this.h == ctfsVar.h && this.i == ctfsVar.i;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.i;
        boolean z2 = this.h;
        boolean z3 = this.g;
        boolean z4 = this.f;
        return (((((((((((iHashCode * 31) + ctfr.a(this.d)) * 31) + ctfr.a(this.e)) * 31) + ctfr.a(z4)) * 31) + ctfr.a(z3)) * 31) + ctfr.a(z2)) * 31) + ctfr.a(z);
    }

    public final String toString() {
        return "SafeUrlLinkUiAdapterArgs(defaultOnClickBehavior=" + this.a + ", messageId=" + this.b + ", url=" + this.c + ", isIncoming=" + this.d + ", isContact=" + this.e + ", isRbm=" + this.f + ", isDetectedSpam=" + this.g + ", isUserMarkedNotSpam=" + this.h + ", isSpamFolder=" + this.i + ")";
    }
}
