package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwx extends dqpv {
    private final String a;
    private final String b;

    public dqwx(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        sb.append(String.format(Locale.US, "%s >= ? AND %s <= ?", f(dqxpVar.a()), f(dqxpVar.a())));
        list.add(this.a);
        list.add(this.b);
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        dqwj dqwjVarA = dqxpVar.a();
        sb.append(String.format(Locale.US, "%s >= %s AND %s <= %s", f(dqwjVarA), this.a, f(dqwjVarA), this.b));
    }
}
