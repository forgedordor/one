package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdb extends ekde {
    final /* synthetic */ ekdi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekdb(ekdi ekdiVar) {
        super(ekdiVar);
        this.a = ekdiVar;
    }

    @Override // defpackage.ekde
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new ekdg(this.a, i);
    }
}
