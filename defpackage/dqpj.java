package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpj extends dqpv {
    public final String a;
    public final int b;

    public dqpj(String str, int i, Object obj) {
        super(str);
        this.b = i;
        this.a = obj == null ? null : obj.toString();
    }

    private final boolean h(StringBuilder sb, dqwj dqwjVar) {
        int i = this.b - 1;
        if (i == 0) {
            sb.append('(');
            sb.append(f(dqwjVar));
            sb.append(" IS NULL)");
            return true;
        }
        if (i != 1) {
            return false;
        }
        sb.append('(');
        sb.append(f(dqwjVar));
        sb.append(" IS NOT NULL)");
        return true;
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        String str = this.a;
        if (str == null && h(sb, dqxpVar.a())) {
            return;
        }
        sb.append('(');
        sb.append(f(dqxpVar.a()));
        sb.append(' ');
        sb.append(g(this.b));
        sb.append(" ?)");
        list.add(str);
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        String str = this.a;
        dqwj dqwjVarA = dqxpVar.a();
        if (str == null && h(sb, dqwjVarA)) {
            return;
        }
        sb.append('(');
        sb.append(f(dqwjVarA));
        sb.append(' ');
        sb.append(g(this.b));
        sb.append(' ');
        sb.append(DatabaseUtils.sqlEscapeString(str));
        sb.append(')');
    }

    @Override // defpackage.dqyq
    protected final boolean c(dqwg dqwgVar, dqyq dqyqVar) {
        String str;
        if (!(dqyqVar instanceof dqpj) || (str = this.a) == null) {
            return false;
        }
        dqpj dqpjVar = (dqpj) dqyqVar;
        if (!dqwgVar.a(this.d).equals(dqpjVar.d)) {
            return false;
        }
        boolean zEquals = TextUtils.equals(str, dqpjVar.a);
        int i = this.b - 1;
        if (i == 0) {
            int i2 = dqpjVar.b;
            if (i2 == 1) {
                if (!zEquals) {
                    return true;
                }
                zEquals = true;
            }
            return i2 == 2 && zEquals;
        }
        if (i != 1) {
            return false;
        }
        int i3 = dqpjVar.b;
        if (i3 == 1) {
            if (zEquals) {
                return true;
            }
            zEquals = false;
        }
        return i3 == 2 && !zEquals;
    }

    @Override // defpackage.dqyq
    protected final boolean d(String str, ContentValues contentValues) {
        String str2 = this.e;
        String asString = contentValues.getAsString(this.f);
        if (!TextUtils.equals(str, str2)) {
            return false;
        }
        int i = this.b - 1;
        if (i == 0) {
            return asString == null || !TextUtils.equals(asString, this.a);
        }
        if (i != 1) {
            return false;
        }
        if (asString == null) {
            return true;
        }
        return TextUtils.equals(asString, this.a);
    }
}
