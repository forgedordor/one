package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxd {
    public final fdjx a;
    public final ajlt b;
    public final xwn c;
    public final yby d;
    public final fctc e;
    public final vtx f;
    public final vts g;
    public final xxc h;

    public xxd(fdjx fdjxVar, ajlt ajltVar, xwn xwnVar, yby ybyVar, fctc fctcVar, vtx vtxVar, vts vtsVar, xxc xxcVar) {
        ajltVar.getClass();
        ybyVar.getClass();
        this.a = fdjxVar;
        this.b = ajltVar;
        this.c = xwnVar;
        this.d = ybyVar;
        this.e = fctcVar;
        this.f = vtxVar;
        this.g = vtsVar;
        this.h = xxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxd)) {
            return false;
        }
        xxd xxdVar = (xxd) obj;
        return fdbq.f(this.a, xxdVar.a) && fdbq.f(this.b, xxdVar.b) && fdbq.f(this.c, xxdVar.c) && fdbq.f(this.d, xxdVar.d) && fdbq.f(this.e, xxdVar.e) && fdbq.f(this.f, xxdVar.f) && fdbq.f(this.g, xxdVar.g) && fdbq.f(this.h, xxdVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "MessageFooterUiData(coroutineScope=" + this.a + ", message=" + this.b + ", mediaViewerUiData=" + this.c + ", composeRowUiData=" + this.d + ", sendButtonClickHandler=" + this.e + ", emojiUsageLogger=" + this.f + ", emojiUsageCacheAccessor=" + this.g + ", flags=" + this.h + ")";
    }
}
