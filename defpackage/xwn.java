package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwn {
    public final fdpl a;
    public final fdpl b;
    public final fdpl c;
    public final fdpl d;
    public final fdpl e;
    public final fdvc f;

    public xwn(fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, fdpl fdplVar4, fdpl fdplVar5, fdvc fdvcVar) {
        this.a = fdplVar;
        this.b = fdplVar2;
        this.c = fdplVar3;
        this.d = fdplVar4;
        this.e = fdplVar5;
        this.f = fdvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwn)) {
            return false;
        }
        xwn xwnVar = (xwn) obj;
        return fdbq.f(this.a, xwnVar.a) && fdbq.f(this.b, xwnVar.b) && fdbq.f(this.c, xwnVar.c) && fdbq.f(this.d, xwnVar.d) && fdbq.f(this.e, xwnVar.e) && fdbq.f(this.f, xwnVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MediaViewerUiData(toolbarUiDataFlow=" + this.a + ", replyOverlayUiDataFlow=" + this.b + ", badgeUiDataFlow=" + this.c + ", reactionBarUiDataFlow=" + this.d + ", replyButtonUiDataFlow=" + this.e + ", disabledComposeRowUiDataFlow=" + this.f + ")";
    }
}
