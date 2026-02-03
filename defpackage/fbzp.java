package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzp {
    public final fbqa a;
    public fbqi b;
    public fbqj c;
    final /* synthetic */ fbzu d;

    public fbzp(fbzu fbzuVar, fbqa fbqaVar) {
        this.d = fbzuVar;
        this.a = fbqaVar;
        fbqj fbqjVarA = fbzuVar.a.a(fbzuVar.b);
        this.c = fbqjVarA;
        if (fbqjVarA != null) {
            this.b = fbqjVarA.a(fbqaVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + fbzuVar.b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
