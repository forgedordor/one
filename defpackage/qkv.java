package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkv extends fdbr implements fdae {
    final /* synthetic */ String a;
    final /* synthetic */ qee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkv(String str, qee qeeVar) {
        super(0);
        this.a = str;
        this.b = qeeVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.a;
        qee qeeVar = this.b;
        qky.c(str, qeeVar);
        qky.d(qeeVar);
        return fctx.a;
    }
}
