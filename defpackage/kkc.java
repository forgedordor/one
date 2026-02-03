package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkc extends fdbr implements fdap {
    final /* synthetic */ jcr a;
    final /* synthetic */ ics b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkc(jcr jcrVar, ics icsVar) {
        super(1);
        this.a = jcrVar;
        this.b = icsVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.i(((ics) obj).a(this.b));
        return fctx.a;
    }
}
