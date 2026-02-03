package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqtn extends dqyq {
    private final dqxe a;

    public dqtn(dqxe dqxeVar) {
        this.a = dqxeVar;
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        sb.append("(");
        sb.append(this.a.aj(dqxpVar, list));
        sb.append(")");
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        sb.append(this.a.ai(dqxpVar));
    }

    @Override // defpackage.dqyq
    public final void e(dqpu dqpuVar) {
        this.a.ak(dqpuVar);
    }
}
