package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chmn implements fdap {
    final /* synthetic */ String a;

    public chmn(String str) {
        this.a = str;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        chma chmaVar = (chma) ((chmc) obj).toBuilder();
        String str = this.a;
        str.getClass();
        chmaVar.copyOnWrite();
        ((chmc) chmaVar.instance).a().remove(str);
        return (chmc) chmaVar.build();
    }
}
