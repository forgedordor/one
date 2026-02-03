package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydx {
    private final dydh a;
    private final fr b;
    private final eg c;
    private final dyek d;

    public dydx(fr frVar, dydh dydhVar, eg egVar, dyek dyekVar) {
        this.b = frVar;
        this.a = dydhVar;
        this.c = egVar;
        this.d = dyekVar;
    }

    public final dydw a() {
        dyek dyekVar = this.d;
        dydh dydhVar = this.a;
        if (dyekVar != null) {
            fbgh.a.get().d(((dydm) dydhVar).a);
        }
        return new dydw(this.b, dydhVar, this.c);
    }
}
