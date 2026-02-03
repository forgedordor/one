package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csjl implements fdap {
    final /* synthetic */ boolean a;

    public csjl(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        csjn csjnVar = (csjn) ((csjo) obj).toBuilder();
        csjnVar.copyOnWrite();
        ((csjo) csjnVar.instance).b = this.a;
        return (csjo) csjnVar.build();
    }
}
