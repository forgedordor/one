package defpackage;

import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofj {
    public final List a;
    public final List b;
    public final doeb c;
    public final fdae d;
    public final fdae e;
    public final fdae f;
    public final fdae g;
    public final fdae h;
    public final fdae i;
    public final fdae j;
    public final boolean k;
    public final fdvc l;
    public final Future m;
    public final int n;
    public final List o;
    public final int p;

    public dofj() {
        this(null);
    }

    public static /* synthetic */ dofj a(dofj dofjVar, List list, int i, List list2, doeb doebVar, fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3, fdae fdaeVar4, fdae fdaeVar5, fdae fdaeVar6, fdae fdaeVar7, boolean z, fdvc fdvcVar, Future future, int i2, List list3, int i3) {
        List list4 = (i3 & 1) != 0 ? dofjVar.a : list;
        int i4 = (i3 & 2) != 0 ? dofjVar.p : i;
        List list5 = (i3 & 4) != 0 ? dofjVar.b : list2;
        doeb doebVar2 = (i3 & 8) != 0 ? dofjVar.c : doebVar;
        fdae fdaeVar8 = (i3 & 16) != 0 ? dofjVar.d : fdaeVar;
        fdae fdaeVar9 = (i3 & 32) != 0 ? dofjVar.e : fdaeVar2;
        fdae fdaeVar10 = (i3 & 64) != 0 ? dofjVar.f : fdaeVar3;
        fdae fdaeVar11 = (i3 & 128) != 0 ? dofjVar.g : fdaeVar4;
        fdae fdaeVar12 = (i3 & 256) != 0 ? dofjVar.h : fdaeVar5;
        fdae fdaeVar13 = (i3 & 512) != 0 ? dofjVar.i : fdaeVar6;
        fdae fdaeVar14 = (i3 & 1024) != 0 ? dofjVar.j : fdaeVar7;
        boolean z2 = (i3 & 2048) != 0 ? dofjVar.k : z;
        fdvc fdvcVar2 = (i3 & 4096) != 0 ? dofjVar.l : fdvcVar;
        Future future2 = (i3 & 8192) != 0 ? dofjVar.m : future;
        List list6 = list4;
        int i5 = (i3 & 16384) != 0 ? dofjVar.n : i2;
        List list7 = (i3 & 32768) != 0 ? dofjVar.o : list3;
        list6.getClass();
        if (i4 == 0) {
            throw null;
        }
        list5.getClass();
        fdaeVar8.getClass();
        fdaeVar9.getClass();
        fdaeVar10.getClass();
        fdaeVar11.getClass();
        fdaeVar12.getClass();
        fdaeVar13.getClass();
        fdaeVar14.getClass();
        fdvcVar2.getClass();
        list7.getClass();
        return new dofj(list6, i4, list5, doebVar2, fdaeVar8, fdaeVar9, fdaeVar10, fdaeVar11, fdaeVar12, fdaeVar13, fdaeVar14, z2, fdvcVar2, future2, i5, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofj)) {
            return false;
        }
        dofj dofjVar = (dofj) obj;
        return fdbq.f(this.a, dofjVar.a) && this.p == dofjVar.p && fdbq.f(this.b, dofjVar.b) && fdbq.f(this.c, dofjVar.c) && fdbq.f(this.d, dofjVar.d) && fdbq.f(this.e, dofjVar.e) && fdbq.f(this.f, dofjVar.f) && fdbq.f(this.g, dofjVar.g) && fdbq.f(this.h, dofjVar.h) && fdbq.f(this.i, dofjVar.i) && fdbq.f(this.j, dofjVar.j) && this.k == dofjVar.k && fdbq.f(this.l, dofjVar.l) && fdbq.f(this.m, dofjVar.m) && this.n == dofjVar.n && fdbq.f(this.o, dofjVar.o);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.p) * 31) + this.b.hashCode();
        doeb doebVar = this.c;
        int iHashCode2 = ((((((((((((((((((((iHashCode * 31) + (doebVar == null ? 0 : doebVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + (true != this.k ? 1237 : 1231)) * 31) + this.l.hashCode()) * 31;
        Future future = this.m;
        return ((((iHashCode2 + (future != null ? future.hashCode() : 0)) * 31) + this.n) * 31) + this.o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MagicComposeUiState(smarterReplies=");
        sb.append(this.a);
        sb.append(", magicComposeMode=");
        sb.append((Object) (this.p != 1 ? "MAGIC_REWRITE" : "SUGGESTED_TEXT"));
        sb.append(", rewriteToneUiData=");
        sb.append(this.b);
        sb.append(", errorUiData=");
        sb.append(this.c);
        sb.append(", onRetry=");
        sb.append(this.d);
        sb.append(", onDismiss=");
        sb.append(this.e);
        sb.append(", onScreenClose=");
        sb.append(this.f);
        sb.append(", onScreenStop=");
        sb.append(this.g);
        sb.append(", thumbsUpButtonOnClickListener=");
        sb.append(this.h);
        sb.append(", thumbsDownButtonOnClickListener=");
        sb.append(this.i);
        sb.append(", infoButtonOnClickListener=");
        sb.append(this.j);
        sb.append(", feedbackAndInfoButtonsEnabled=");
        sb.append(this.k);
        sb.append(", onboardedState=");
        sb.append(this.l);
        sb.append(", suggestionsFuture=");
        sb.append(this.m);
        sb.append(", initialSelectedTabIndex=");
        sb.append(this.n);
        sb.append(", styles=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }

    public dofj(List list, int i, List list2, doeb doebVar, fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3, fdae fdaeVar4, fdae fdaeVar5, fdae fdaeVar6, fdae fdaeVar7, boolean z, fdvc fdvcVar, Future future, int i2, List list3) {
        this.a = list;
        this.p = i;
        this.b = list2;
        this.c = doebVar;
        this.d = fdaeVar;
        this.e = fdaeVar2;
        this.f = fdaeVar3;
        this.g = fdaeVar4;
        this.h = fdaeVar5;
        this.i = fdaeVar6;
        this.j = fdaeVar7;
        this.k = z;
        this.l = fdvcVar;
        this.m = future;
        this.n = i2;
        this.o = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dofj(byte[] bArr) {
        fcvo fcvoVar = fcvo.a;
        this(fcvoVar, 1, fcvoVar, null, new fdae() { // from class: dofc
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dofd
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dofe
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: doff
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dofg
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dofh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dofi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, false, fdvf.a(doec.a), null, -1, fcvoVar);
    }
}
