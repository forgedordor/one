package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysx implements ykp {
    public final amwf a;
    public final boolean b;
    public final String c;
    public final fdae d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final dkzl h;
    public final dkpc i;
    private final boolean j;

    public ysx(amwf amwfVar, boolean z, String str, boolean z2, fdae fdaeVar, boolean z3, boolean z4, boolean z5, dkzl dkzlVar, dkpc dkpcVar) {
        this.a = amwfVar;
        this.b = z;
        this.c = str;
        this.j = z2;
        this.d = fdaeVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = dkzlVar;
        this.i = dkpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysx)) {
            return false;
        }
        ysx ysxVar = (ysx) obj;
        return fdbq.f(this.a, ysxVar.a) && this.b == ysxVar.b && fdbq.f(this.c, ysxVar.c) && this.j == ysxVar.j && fdbq.f(this.d, ysxVar.d) && this.e == ysxVar.e && this.f == ysxVar.f && this.g == ysxVar.g && fdbq.f(this.h, ysxVar.h) && fdbq.f(this.i, ysxVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + ysv.a(this.b)) * 31) + this.c.hashCode()) * 31) + ysv.a(this.j)) * 31) + this.d.hashCode();
        dkzl dkzlVar = this.h;
        int iHashCode2 = dkzlVar == null ? 0 : dkzlVar.hashCode();
        int iA = ((((((((iHashCode * 31) + ysv.a(this.e)) * 31) + ysv.a(this.f)) * 31) + ysv.a(this.g)) * 31) + iHashCode2) * 31;
        dkpc dkpcVar = this.i;
        return iA + (dkpcVar != null ? dkpcVar.hashCode() : 0);
    }

    public final String toString() {
        return "EmojiBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.j + ", onAnimatedEmojiShown=" + this.d + ", isRichType=" + this.e + ", isOutgoing=" + this.f + ", isReply=" + this.g + ", messageReplySnippetUiData=" + this.h + ", statusUiData=" + this.i + ")";
    }
}
