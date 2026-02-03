package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmoz {
    public final int a;
    public final azg b;
    public final int c;
    public final Duration d;
    public final Duration e;
    public final boolean f;
    public final List g;
    public final fdap h;
    public final fdae i;
    public final fdau j;
    public final fdae k;
    public final fdau l;
    public final List m;
    public final fdae n;
    public final dmso o;
    public final dmqz p;
    public final boolean q;
    public final boolean r;
    public final dmoy s;
    public final int t;
    private final fdap u;

    public dmoz(int i, azg azgVar, int i2, Duration duration, Duration duration2, boolean z, List list, fdap fdapVar, fdae fdaeVar, fdau fdauVar, fdae fdaeVar2, fdau fdauVar2, List list2, fdae fdaeVar3, fdap fdapVar2, dmso dmsoVar, int i3, dmqz dmqzVar, dmoy dmoyVar) {
        azgVar.getClass();
        duration.getClass();
        duration2.getClass();
        list.getClass();
        fdapVar.getClass();
        fdaeVar.getClass();
        fdauVar.getClass();
        fdaeVar2.getClass();
        fdauVar2.getClass();
        list2.getClass();
        fdaeVar3.getClass();
        fdapVar2.getClass();
        dmsoVar.getClass();
        if (i3 == 0) {
            throw null;
        }
        this.a = i;
        this.b = azgVar;
        this.c = i2;
        this.d = duration;
        this.e = duration2;
        this.f = z;
        this.g = list;
        this.h = fdapVar;
        this.i = fdaeVar;
        this.j = fdauVar;
        this.k = fdaeVar2;
        this.l = fdauVar2;
        this.m = list2;
        this.n = fdaeVar3;
        this.u = fdapVar2;
        this.o = dmsoVar;
        this.t = i3;
        this.p = dmqzVar;
        this.q = false;
        this.r = true;
        this.s = dmoyVar;
    }

    public static /* synthetic */ dmoz a(dmoz dmozVar, int i, azg azgVar, int i2, Duration duration, boolean z, List list, List list2, dmso dmsoVar, int i3) {
        int i4 = (i3 & 1) != 0 ? dmozVar.a : i;
        azg azgVar2 = (i3 & 2) != 0 ? dmozVar.b : azgVar;
        int i5 = (i3 & 4) != 0 ? dmozVar.c : i2;
        Duration duration2 = (i3 & 8) != 0 ? dmozVar.d : duration;
        Duration duration3 = (i3 & 16) != 0 ? dmozVar.e : null;
        boolean z2 = (i3 & 32) != 0 ? dmozVar.f : z;
        List list3 = (i3 & 64) != 0 ? dmozVar.g : list;
        fdap fdapVar = (i3 & 128) != 0 ? dmozVar.h : null;
        fdae fdaeVar = (i3 & 256) != 0 ? dmozVar.i : null;
        fdau fdauVar = (i3 & 512) != 0 ? dmozVar.j : null;
        fdae fdaeVar2 = (i3 & 1024) != 0 ? dmozVar.k : null;
        fdau fdauVar2 = (i3 & 2048) != 0 ? dmozVar.l : null;
        List list4 = (i3 & 4096) != 0 ? dmozVar.m : list2;
        fdae fdaeVar3 = (i3 & 8192) != 0 ? dmozVar.n : null;
        fdap fdapVar2 = (i3 & 16384) != 0 ? dmozVar.u : null;
        dmso dmsoVar2 = (i3 & 32768) != 0 ? dmozVar.o : dmsoVar;
        int i6 = dmozVar.t;
        dmqz dmqzVar = dmozVar.p;
        boolean z3 = dmozVar.q;
        boolean z4 = dmozVar.r;
        dmoy dmoyVar = dmozVar.s;
        azgVar2.getClass();
        duration2.getClass();
        duration3.getClass();
        list3.getClass();
        fdapVar.getClass();
        fdaeVar.getClass();
        fdauVar.getClass();
        fdaeVar2.getClass();
        fdauVar2.getClass();
        list4.getClass();
        fdaeVar3.getClass();
        fdapVar2.getClass();
        dmsoVar2.getClass();
        return new dmoz(i4, azgVar2, i5, duration2, duration3, z2, list3, fdapVar, fdaeVar, fdauVar, fdaeVar2, fdauVar2, list4, fdaeVar3, fdapVar2, dmsoVar2, i6, dmqzVar, dmoyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmoz)) {
            return false;
        }
        dmoz dmozVar = (dmoz) obj;
        if (this.a != dmozVar.a || !fdbq.f(this.b, dmozVar.b) || this.c != dmozVar.c || !fdbq.f(this.d, dmozVar.d) || !fdbq.f(this.e, dmozVar.e) || this.f != dmozVar.f || !fdbq.f(this.g, dmozVar.g) || !fdbq.f(this.h, dmozVar.h) || !fdbq.f(this.i, dmozVar.i) || !fdbq.f(this.j, dmozVar.j) || !fdbq.f(this.k, dmozVar.k) || !fdbq.f(this.l, dmozVar.l) || !fdbq.f(this.m, dmozVar.m) || !fdbq.f(this.n, dmozVar.n) || !fdbq.f(this.u, dmozVar.u) || this.o != dmozVar.o || this.t != dmozVar.t || !fdbq.f(this.p, dmozVar.p)) {
            return false;
        }
        boolean z = dmozVar.q;
        boolean z2 = dmozVar.r;
        return fdbq.f(this.s, dmozVar.s);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + dmoq.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.u.hashCode()) * 31) + this.o.hashCode();
        dmqz dmqzVar = this.p;
        return (((((((((iHashCode * 31) + this.t) * 31) + (dmqzVar == null ? 0 : dmqzVar.hashCode())) * 31) + dmoq.a(false)) * 31) + dmoq.a(true)) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraUiData(captureMode=");
        sb.append(this.a);
        sb.append(", selectedCamera=");
        sb.append(this.b);
        sb.append(", flashMode=");
        sb.append(this.c);
        sb.append(", recordingTimer=");
        sb.append(this.d);
        sb.append(", maxRecordingDuration=");
        sb.append(this.e);
        sb.append(", isRecording=");
        sb.append(this.f);
        sb.append(", zoomButtons=");
        sb.append(this.g);
        sb.append(", switchCamera=");
        sb.append(this.h);
        sb.append(", toggleFlash=");
        sb.append(this.i);
        sb.append(", selectMode=");
        sb.append(this.j);
        sb.append(", onCapture=");
        sb.append(this.k);
        sb.append(", bind=");
        sb.append(this.l);
        sb.append(", effects=");
        sb.append(this.m);
        sb.append(", onClose=");
        sb.append(this.n);
        sb.append(", selectZoom=");
        sb.append(this.u);
        sb.append(", orientation=");
        sb.append(this.o);
        sb.append(", galleryPickerConfiguration=");
        int i = this.t;
        sb.append((Object) (i != 1 ? i != 2 ? "WITHOUT_PERMISSION" : "WITH_PERMISSION" : "NONE"));
        sb.append(", shutterLongPressHandler=");
        sb.append(this.p);
        sb.append(", enableScreenFlash=false, useTopAppBarComponent=true, flags=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dmoz(Duration duration, fdap fdapVar, fdae fdaeVar, fdau fdauVar, fdae fdaeVar2, fdau fdauVar2, fdae fdaeVar3, fdap fdapVar2, int i, dmqz dmqzVar, dmoy dmoyVar, int i2) {
        this(i2 & 1, (i2 & 2) != 0 ? azg.b : null, (i2 & 4) != 0 ? 2 : 0, (i2 & 8) != 0 ? Duration.ZERO : null, (i2 & 16) != 0 ? Duration.ofSeconds(30L) : duration, false, (i2 & 64) != 0 ? fcvo.a : null, (i2 & 128) != 0 ? new fdap() { // from class: dmor
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((lvj) obj).getClass();
                return fctx.a;
            }
        } : fdapVar, (i2 & 256) != 0 ? new fdae() { // from class: dmos
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar, (i2 & 512) != 0 ? new fdau() { // from class: dmot
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                ((Integer) obj2).intValue();
                ((Boolean) obj3).booleanValue();
                ((lvj) obj).getClass();
                return fctx.a;
            }
        } : fdauVar, (i2 & 1024) != 0 ? new fdae() { // from class: dmou
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2, (i2 & 2048) != 0 ? new dmox(null) : fdauVar2, (i2 & 4096) != 0 ? fcvo.a : null, (i2 & 8192) != 0 ? new fdae() { // from class: dmov
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar3, (i2 & 16384) != 0 ? new fdap() { // from class: dmow
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return fctx.a;
            }
        } : fdapVar2, (32768 & i2) != 0 ? dmso.a : null, (65536 & i2) != 0 ? 1 : i, (i2 & 131072) != 0 ? null : dmqzVar, dmoyVar);
    }
}
