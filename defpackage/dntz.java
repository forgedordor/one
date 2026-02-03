package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntz extends dnso {
    final /* synthetic */ dnua e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dntz(dnua dnuaVar, fdat fdatVar, fdap fdapVar) {
        super(dnuaVar);
        this.e = dnuaVar;
        this.f = fdatVar;
        this.g = fdapVar;
    }

    @Override // defpackage.vo
    public final int a() {
        dnmj dnmjVarB = this.e.b();
        if (dnmjVarB != null) {
            return ((Number) this.g.invoke(dnmjVarB)).intValue();
        }
        return 0;
    }

    @Override // defpackage.dnso
    public final dnkf l(int i) {
        dnmj dnmjVarB = this.e.b();
        if (dnmjVarB != null) {
            return (dnkf) this.f.a(Integer.valueOf(i), dnmjVarB);
        }
        throw new IllegalStateException("emojiSet is null. Cannot retrieve emoji");
    }
}
