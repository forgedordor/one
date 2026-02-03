package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aitd implements cqad {
    private final aite a;

    public aitd(aite aiteVar) {
        aiteVar.getClass();
        this.a = aiteVar;
    }

    @Override // defpackage.cqad
    public final void c() {
        aite aiteVar = this.a;
        ((eksl) aiteVar.a.e()).q("Generating new sequence ID");
        String string = UUID.randomUUID().toString();
        string.getClass();
        aiteVar.b = string;
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void f() {
    }
}
