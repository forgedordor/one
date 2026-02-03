package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chms implements fdap {
    final /* synthetic */ String a;

    public chms(String str) {
        this.a = str;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        chma chmaVar = (chma) ((chmc) obj).toBuilder();
        chmaVar.copyOnWrite();
        chmc chmcVar = (chmc) chmaVar.instance;
        chmcVar.b |= 1;
        chmcVar.c = this.a;
        return (chmc) chmaVar.build();
    }
}
