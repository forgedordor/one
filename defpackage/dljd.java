package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljd {
    public final boolean a;
    public final fdae b;
    public final fdae c;
    public final fdae d;
    public final fdae e;
    public final fdae f;
    public final fdae g;
    public final fdae h;
    public final fdae i;
    public final fdae j;
    public final fdae k;
    public final fdae l;
    public final fdae m;
    public final fdae n;
    public final fdae o;

    public dljd() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljd)) {
            return false;
        }
        dljd dljdVar = (dljd) obj;
        boolean z = dljdVar.a;
        return fdbq.f(this.b, dljdVar.b) && fdbq.f(this.c, dljdVar.c) && fdbq.f(this.d, dljdVar.d) && fdbq.f(this.e, dljdVar.e) && fdbq.f(this.f, dljdVar.f) && fdbq.f(this.g, dljdVar.g) && fdbq.f(this.h, dljdVar.h) && fdbq.f(this.i, dljdVar.i) && fdbq.f(this.j, dljdVar.j) && fdbq.f(this.k, dljdVar.k) && fdbq.f(this.l, dljdVar.l) && fdbq.f(this.m, dljdVar.m) && fdbq.f(this.n, dljdVar.n) && fdbq.f(this.o, dljdVar.o);
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.b.hashCode() + 38347) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final String toString() {
        return "AbcFlags(defaultFlagValue=false, enableAnnotationsTraversalFix=" + this.b + ", enableConversationCoolRanchPhase3=" + this.c + ", enableIsTalkbackRunningFix=" + this.d + ", enableReactionsTraversalFix=" + this.e + ", enableReplyReadReceiptFix=" + this.f + ", enableStatusUxUpdates=" + this.g + ", enableTextWithContentOptimizations=" + this.h + ", enableTwcRoundingFix=" + this.i + ", increaseMinComposeRowHeight=" + this.j + ", removeDialogHorizontalPadding=" + this.k + ", useAnnotatedTextInTwc=" + this.l + ", useExpressiveMaterial=" + this.m + ", useMonogramV2=" + this.n + ", useRevisedExtendedFab=" + this.o + ")";
    }

    public dljd(fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3, fdae fdaeVar4, fdae fdaeVar5, fdae fdaeVar6, fdae fdaeVar7, fdae fdaeVar8, fdae fdaeVar9, fdae fdaeVar10, fdae fdaeVar11, fdae fdaeVar12, fdae fdaeVar13, fdae fdaeVar14) {
        fdaeVar.getClass();
        fdaeVar2.getClass();
        fdaeVar3.getClass();
        fdaeVar4.getClass();
        fdaeVar5.getClass();
        fdaeVar6.getClass();
        fdaeVar7.getClass();
        fdaeVar8.getClass();
        fdaeVar9.getClass();
        fdaeVar10.getClass();
        fdaeVar11.getClass();
        fdaeVar12.getClass();
        fdaeVar13.getClass();
        fdaeVar14.getClass();
        this.a = false;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        this.d = fdaeVar3;
        this.e = fdaeVar4;
        this.f = fdaeVar5;
        this.g = fdaeVar6;
        this.h = fdaeVar7;
        this.i = fdaeVar8;
        this.j = fdaeVar9;
        this.k = fdaeVar10;
        this.l = fdaeVar11;
        this.m = fdaeVar12;
        this.n = fdaeVar13;
        this.o = fdaeVar14;
    }

    public /* synthetic */ dljd(fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3, fdae fdaeVar4, fdae fdaeVar5, fdae fdaeVar6, fdae fdaeVar7, fdae fdaeVar8, fdae fdaeVar9, fdae fdaeVar10, fdae fdaeVar11, fdae fdaeVar12, int i) {
        this((i & 2) != 0 ? new fdae() { // from class: dliu
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar, (i & 4) != 0 ? new fdae() { // from class: dliz
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar2, (i & 8) != 0 ? new fdae() { // from class: dlja
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar3, (i & 16) != 0 ? new fdae() { // from class: dljb
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : null, (i & 32) != 0 ? new fdae() { // from class: dljc
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar4, (i & 64) != 0 ? new fdae() { // from class: dlip
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar5, (i & 128) != 0 ? new fdae() { // from class: dliq
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar6, (i & 256) != 0 ? new fdae() { // from class: dlir
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar7, (i & 512) != 0 ? new fdae() { // from class: dlis
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar8, (i & 1024) != 0 ? new fdae() { // from class: dlit
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar9, (i & 2048) != 0 ? new fdae() { // from class: dliv
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar10, (i & 4096) != 0 ? new fdae() { // from class: dliw
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar11, (i & 8192) != 0 ? new fdae() { // from class: dlix
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : null, (i & 16384) != 0 ? new fdae() { // from class: dliy
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar12);
    }
}
