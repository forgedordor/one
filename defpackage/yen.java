package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yen {
    public final fdpl a;
    public final fdvc b;
    public final fdpl c;
    public final yhz d;
    public final fdvc e;
    public final fdvc f;
    public final fdvc g;
    public final ains h;
    public final fdvc i;
    public final fdpl j;
    public final fdat k;
    public final fdat l;
    public final fdvc m;
    public final fdap n;
    public final fdap o;
    public final fdap p;
    public final fdap q;
    public final fdae r;
    public final fdpl s;
    public final yem t;
    public final fdae u;
    public final yil v;
    public final ygn w;

    public yen(fdpl fdplVar, fdvc fdvcVar, fdpl fdplVar2, yhz yhzVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, yil yilVar, ygn ygnVar, ains ainsVar, fdvc fdvcVar5, fdpl fdplVar3, fdat fdatVar, fdat fdatVar2, fdvc fdvcVar6, fdap fdapVar, fdap fdapVar2, fdap fdapVar3, fdap fdapVar4, fdae fdaeVar, fdpl fdplVar4, yem yemVar, fdae fdaeVar2) {
        fdplVar.getClass();
        fdvcVar4.getClass();
        fdvcVar5.getClass();
        fdplVar3.getClass();
        this.a = fdplVar;
        this.b = fdvcVar;
        this.c = fdplVar2;
        this.d = yhzVar;
        this.e = fdvcVar2;
        this.f = fdvcVar3;
        this.g = fdvcVar4;
        this.v = yilVar;
        this.w = ygnVar;
        this.h = ainsVar;
        this.i = fdvcVar5;
        this.j = fdplVar3;
        this.k = fdatVar;
        this.l = fdatVar2;
        this.m = fdvcVar6;
        this.n = fdapVar;
        this.o = fdapVar2;
        this.p = fdapVar3;
        this.q = fdapVar4;
        this.r = fdaeVar;
        this.s = fdplVar4;
        this.t = yemVar;
        this.u = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yen)) {
            return false;
        }
        yen yenVar = (yen) obj;
        return fdbq.f(this.a, yenVar.a) && fdbq.f(this.b, yenVar.b) && fdbq.f(this.c, yenVar.c) && fdbq.f(this.d, yenVar.d) && fdbq.f(this.e, yenVar.e) && fdbq.f(this.f, yenVar.f) && fdbq.f(this.g, yenVar.g) && fdbq.f(this.v, yenVar.v) && fdbq.f(this.w, yenVar.w) && fdbq.f(this.h, yenVar.h) && fdbq.f(this.i, yenVar.i) && fdbq.f(this.j, yenVar.j) && fdbq.f(this.k, yenVar.k) && fdbq.f(this.l, yenVar.l) && fdbq.f(this.m, yenVar.m) && fdbq.f(this.n, yenVar.n) && fdbq.f(this.o, yenVar.o) && fdbq.f(this.p, yenVar.p) && fdbq.f(this.q, yenVar.q) && fdbq.f(this.r, yenVar.r) && fdbq.f(this.s, yenVar.s) && fdbq.f(this.t, yenVar.t) && fdbq.f(this.u, yenVar.u);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode();
    }

    public final String toString() {
        return "PagedMessageListUiData(messagesFlow=" + this.a + ", initialMessageId=" + this.b + ", jumpIndexFlow=" + this.c + ", messageListFooterUiData=" + this.d + ", headerUiData=" + this.e + ", scheduledMessagesListUiData=" + this.f + ", scrollToBottomUiDataFlow=" + this.g + ", messageListInsetsProvider=" + this.v + ", messageListContentOffsetTracker=" + this.w + ", counterEventLogger=" + this.h + ", isTalkbackEnabled=" + this.i + ", shouldShowTimestampHintFlow=" + this.j + ", generateMessageListKey=" + this.k + ", invalidateMessageListKey=" + this.l + ", parentalApprovalStatusFlow=" + this.m + ", onBottomReached=" + this.n + ", onScroll=" + this.o + ", onMessageListInteractive=" + this.p + ", onMostRecentMessageDisplayedOrChanged=" + this.q + ", onPagingError=" + this.r + ", enableSwipeToShowTimestamps=" + this.s + ", flags=" + this.t + ", onClick=" + this.u + ")";
    }
}
