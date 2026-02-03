package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmn extends fdbr implements fdae {
    final /* synthetic */ boolean a;
    final /* synthetic */ pix b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmn(boolean z, pix pixVar, String str) {
        super(0);
        this.a = z;
        this.b = pixVar;
        this.c = str;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.a) {
            pix pixVar = this.b;
            String str = this.c;
            pji pjiVar = pixVar.a;
            synchronized (pjiVar.b) {
            }
        }
        return fctx.a;
    }
}
