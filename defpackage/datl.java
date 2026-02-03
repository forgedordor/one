package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class datl extends abs {
    final /* synthetic */ datm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public datl(datm datmVar) {
        super(true);
        this.a = datmVar;
    }

    @Override // defpackage.abs
    public final void b() {
        this.a.a.moveTaskToBack(true);
    }
}
