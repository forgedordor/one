package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chml implements fdap {
    public static final chml a = new chml();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        chma chmaVar = (chma) ((chmc) obj).toBuilder();
        String str = chmt.a;
        chmaVar.copyOnWrite();
        chmc chmcVar = (chmc) chmaVar.instance;
        str.getClass();
        chmcVar.b |= 1;
        chmcVar.c = str;
        return (chmc) chmaVar.build();
    }
}
