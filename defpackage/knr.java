package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knr extends fdbr implements fdap {
    public static final knr a = new knr();

    public knr() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        knx knxVar = (knx) obj;
        if (knxVar.isAttachedToWindow()) {
            knxVar.m();
        }
        return fctx.a;
    }
}
