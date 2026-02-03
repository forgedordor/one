package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzt implements cpzp {
    private final cplz a;

    public cpzt(cplz cplzVar) {
        this.a = cplzVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [cmfo, java.lang.Object] */
    @Override // defpackage.cpzp
    public final void a() {
        cplz cplzVar = this.a;
        if (!cplzVar.c.a.i()) {
            throw new IllegalStateException("Cannot set bnr opt in state when restore starts. Is this called in a transaction?");
        }
        cplzVar.b.i();
        aurx aurxVar = cplzVar.a;
        aurxVar.Q(auml.ENABLING);
        aurxVar.X(true);
        aurxVar.ah(UUID.randomUUID().toString());
        ecem.b();
        aurxVar.e.get().m(new ejvr() { // from class: auqr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= Integer.MIN_VALUE;
                aumqVar.D = true;
                return builder.build();
            }
        });
        aurxVar.L();
        aurxVar.an();
        if (((Boolean) ((cczi) cpyl.o.get()).e()).booleanValue()) {
            aurxVar.ag(true);
        }
    }
}
