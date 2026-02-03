package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dipp implements fdap {
    final /* synthetic */ dipk a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;

    public dipp(dipk dipkVar, long j, long j2) {
        this.a = dipkVar;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        return new ije(((Number) obj).floatValue() <= this.a.a ? this.b : this.c);
    }
}
