package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtk {
    public final cqew a;

    public axtk(final crny crnyVar, final cqbm cqbmVar, final aypv aypvVar) {
        this.a = new cqew() { // from class: axti
            @Override // defpackage.cqew
            public final void x() {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final cqbm cqbmVar2 = cqbmVar;
                crnyVar.o(new crnx() { // from class: axtj
                    @Override // defpackage.crnx
                    public final boolean a(int i) {
                        cqbm cqbmVar3 = cqbmVar2;
                        cqgk cqgkVarG = ((cqey) cqbmVar3.a()).g(i);
                        cqgk cqgkVar = cqgk.AVAILABLE;
                        if (cqgkVarG != cqgkVar && ((cqey) cqbmVar3.a()).e(i) != cqgkVar && ((cqey) cqbmVar3.a()).f() != cqgkVar) {
                            return true;
                        }
                        atomicBoolean.set(true);
                        return false;
                    }
                });
                if (atomicBoolean.get()) {
                    aypvVar.e();
                }
            }
        };
    }
}
