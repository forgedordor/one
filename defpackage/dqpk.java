package defpackage;

import android.content.ContentValues;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpk extends dqpv {
    public final dqxe a;
    private final int b;

    public dqpk(String str, int i, dqxe dqxeVar) {
        super(str);
        this.b = i;
        this.a = dqxeVar;
        if (dqxeVar instanceof dqwl) {
            dqwl dqwlVar = (dqwl) dqxeVar;
            dqxp.b();
            ekgb ekgbVarZ = dqwlVar.Z();
            int size = ekgbVarZ != null ? ekgbVarZ.size() : 0;
            ekgb ekgbVar = ((dqoy) dqwlVar.e).f;
            if (size + (ekgbVar != null ? ((ekoe) ekgbVar).c : 0) != 1) {
                throw new IllegalArgumentException("projection must have exactly one column");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h(dqxp dqxpVar, StringBuilder sb, List list) {
        String strSubstring;
        dqxe dqxeVar = this.a;
        if (dqxeVar instanceof dqwl) {
            dqwl dqwlVar = (dqwl) dqxeVar;
            int length = dqwlVar.X(dqxp.b()).length;
            dqxp.b();
            ekgb ekgbVarZ = dqwlVar.Z();
            ekgb ekgbVar = ((dqoy) dqwlVar.e).f;
            if (length > ekgbVarZ.size() + ((ekoe) ekgbVar).c) {
                if (ekgbVarZ.size() == 1) {
                    String str = (String) ekgbVarZ.get(0);
                    strSubstring = str.substring(str.indexOf(".") + 1);
                } else {
                    dqxe dqxeVar2 = (dqxe) ekgbVar.get(0);
                    if (!(dqxeVar2 instanceof dqof)) {
                        throw new IllegalStateException("subquery with expression must use AsExpression");
                    }
                    strSubstring = ((dqof) dqxeVar2).a;
                }
                sb.append(String.format(Locale.US, "(%s %s %s)", f(dqxpVar.a()), g(this.b), String.format(Locale.US, "(SELECT %s FROM %s)", strSubstring, list == null ? dqxeVar.ai(dqxpVar) : dqxeVar.aj(dqxpVar, list))));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        dqxe dqxeVar = this.a;
        if (dqxeVar == null) {
            sb.append(String.format(Locale.US, "(%s %s)", f(dqxpVar.a()), g(this.b)));
        } else {
            if (h(dqxpVar, sb, list)) {
                return;
            }
            sb.append(String.format(Locale.US, "(%s %s %s)", f(dqxpVar.a()), g(this.b), dqxeVar.aj(dqxpVar, list)));
        }
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        dqxe dqxeVar = this.a;
        if (dqxeVar == null) {
            sb.append(String.format(Locale.US, "(%s %s)", f(dqxpVar.a()), g(this.b)));
        } else {
            if (h(dqxpVar, sb, null)) {
                return;
            }
            sb.append(String.format(Locale.US, "(%s %s %s)", f(dqxpVar.a()), g(this.b), dqxeVar.ai(dqxpVar)));
        }
    }

    @Override // defpackage.dqyq
    protected final boolean d(String str, ContentValues contentValues) {
        dqxe dqxeVar = this.a;
        if (!(dqxeVar instanceof dqwl)) {
            return false;
        }
        dqwl dqwlVar = (dqwl) dqxeVar;
        if (this.b - 1 != 2) {
            return false;
        }
        return dqua.a().f(str, contentValues, dqwlVar);
    }

    @Override // defpackage.dqpv, defpackage.dqyq
    public final void e(dqpu dqpuVar) {
        super.e(dqpuVar);
        this.a.ak(dqpuVar);
    }
}
