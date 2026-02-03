package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbmn extends dqpi implements cqto {
    private final cqtq a;
    private final cohg b;
    private final dqwl c;

    public bbmn(cqtp cqtpVar, dqwl dqwlVar, Consumer consumer, String str) {
        super(consumer);
        this.c = dqwlVar;
        this.a = cqtpVar.a(this);
        this.b = new cohf(str);
    }

    public final cquc f(cqtk cqtkVar, String str, String str2, String str3) {
        return this.a.a(cqtkVar, str, str2, str3);
    }

    @Override // defpackage.cqto
    public final void fJ() {
        this.c.M(this);
    }

    @Override // defpackage.cqto
    public final void fK() {
        this.c.Q(this);
    }

    @Override // defpackage.dqpi
    public final void ga(dqwl dqwlVar) {
        eieu eieuVarA = this.b.a();
        try {
            this.a.b(null, eieuVarA);
            eieuVarA.close();
        } catch (Throwable th) {
            try {
                eieuVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
