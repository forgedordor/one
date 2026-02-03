package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djjn {
    public final dipg a;
    public final boolean b;
    public final djis c;
    public final fdap d;
    public final fdae e;
    public final fdap f;
    public final fdap g;
    public final djjm h;

    public djjn(dipg dipgVar, boolean z, djis djisVar, fdap fdapVar, fdae fdaeVar, fdap fdapVar2, fdap fdapVar3, djjm djjmVar) {
        dipgVar.getClass();
        this.a = dipgVar;
        this.b = z;
        this.c = djisVar;
        this.d = fdapVar;
        this.e = fdaeVar;
        this.f = fdapVar2;
        this.g = fdapVar3;
        this.h = djjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djjn)) {
            return false;
        }
        djjn djjnVar = (djjn) obj;
        return fdbq.f(this.a, djjnVar.a) && this.b == djjnVar.b && fdbq.f(this.c, djjnVar.c) && fdbq.f(this.d, djjnVar.d) && fdbq.f(this.e, djjnVar.e) && fdbq.f(this.f, djjnVar.f) && fdbq.f(this.g, djjnVar.g) && fdbq.f(this.h, djjnVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djis djisVar = this.c;
        int iHashCode2 = (((((((((iHashCode + (true != this.b ? 1237 : 1231)) * 31) + (djisVar == null ? 0 : djisVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        fdap fdapVar = this.g;
        int iHashCode3 = (iHashCode2 + (fdapVar == null ? 0 : fdapVar.hashCode())) * 31;
        djjm djjmVar = this.h;
        return iHashCode3 + (djjmVar != null ? djjmVar.hashCode() : 0);
    }

    public final String toString() {
        return "VoiceInputUiData(timerUiData=" + this.a + ", isEnabled=" + this.b + ", swipeUpToLockUiData=" + this.c + ", onLongPress=" + this.d + ", onPressReleased=" + this.e + ", onSwipeToCancelRecording=" + this.f + ", onSwipeUp=" + this.g + ", errorUiData=" + this.h + ")";
    }
}
