package defpackage;

import android.text.TextUtils;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cldm implements cldq {
    private static final cqce a = cqce.g("Bugle", "RcsFlagPattern");
    protected final cqac c = new cqac(new Supplier() { // from class: cldi
        @Override // java.util.function.Supplier
        public final Object get() {
            return this.a.d();
        }
    });

    protected abstract String b();

    public final ekgb d() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        String[] strArrSplit = strB.split("\n");
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (String str : strArrSplit) {
            if (!str.equals("")) {
                try {
                    ekfwVar.h(Pattern.compile(str));
                } catch (PatternSyntaxException e) {
                    cqbd cqbdVarB = a.b();
                    cqbdVarB.I("compilePatterns: Skipping bad expression:");
                    cqbdVarB.I(str);
                    cqbdVarB.s(e);
                }
            }
        }
        return ekfwVar.g();
    }

    public final void e() {
        cqac cqacVar = this.c;
        synchronized (cqacVar.a) {
            cqacVar.b = null;
            cqacVar.c = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cldq
    public final boolean f(CharSequence charSequence) {
        ekgb ekgbVar = (ekgb) this.c.get();
        int size = ekgbVar.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = ((Pattern) ekgbVar.get(i)).matcher(charSequence).matches();
            i++;
            if (zMatches) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cldq
    public /* synthetic */ eiju ge(CharSequence charSequence, int i) {
        return eijx.e(false);
    }
}
