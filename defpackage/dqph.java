package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqph extends dqpv {
    private final byte[] a;

    public dqph(byte[] bArr) {
        super("mls_key_packages._id");
        this.a = bArr;
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        b(dqxpVar, sb);
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        sb.append('(');
        sb.append(f(dqxpVar.a()));
        sb.append(' ');
        sb.append(g(1));
        sb.append(' ');
        sb.append(dqru.i(this.a));
        sb.append(')');
    }
}
