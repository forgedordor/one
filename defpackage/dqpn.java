package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpn extends dqpv {
    private final int a;

    public dqpn(String str, int i) {
        super(str);
        this.a = i;
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
        sb.append(g(this.a));
        sb.append(')');
    }

    @Override // defpackage.dqyq
    protected final boolean d(String str, ContentValues contentValues) {
        return this.a + (-1) != 4 ? contentValues.get(this.f) == null : contentValues.get(this.f) != null;
    }
}
