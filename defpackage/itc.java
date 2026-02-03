package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itc implements fdap {
    public iss a;

    public final void a(boolean z) {
        iss issVar = this.a;
        if (issVar != null) {
            issVar.b = z;
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return fctx.a;
    }
}
