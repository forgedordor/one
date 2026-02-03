package defpackage;

import android.content.ContentValues;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dquv extends dqyq {
    private final dqyj[] a;

    public dquv(dqyp... dqypVarArr) {
        int length = dqypVarArr.length;
        this.a = new dqyj[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            this.a[i2] = dqypVarArr[i].a();
            i++;
            i2++;
        }
    }

    @Override // defpackage.dqyq
    public final void a(final dqxp dqxpVar, StringBuilder sb, final List list) {
        sb.append("(");
        sb.append((String) DesugarArrays.stream(this.a).map(new Function() { // from class: dqut
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dqyj) obj).b(dqxpVar, list);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(" OR ")));
        sb.append(")");
    }

    @Override // defpackage.dqyq
    public final void b(final dqxp dqxpVar, StringBuilder sb) {
        sb.append("(");
        sb.append((String) DesugarArrays.stream(this.a).map(new Function() { // from class: dquu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dqyj) obj).a(dqxpVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(" OR ")));
        sb.append(")");
    }

    @Override // defpackage.dqyq
    protected final boolean c(dqwg dqwgVar, dqyq dqyqVar) {
        int i = 0;
        while (true) {
            dqyj[] dqyjVarArr = this.a;
            if (i >= dqyjVarArr.length) {
                return true;
            }
            if (!dqyjVarArr[i].d(dqwgVar, dqyqVar)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.dqyq
    protected final boolean d(String str, ContentValues contentValues) {
        int i = 0;
        while (true) {
            dqyj[] dqyjVarArr = this.a;
            if (i >= dqyjVarArr.length) {
                return true;
            }
            if (!dqyjVarArr[i].e(str, contentValues)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.dqyq
    public final void e(dqpu dqpuVar) {
        int i = 0;
        while (true) {
            dqyj[] dqyjVarArr = this.a;
            if (i >= dqyjVarArr.length) {
                return;
            }
            dqyjVarArr[i].c(dqpuVar);
            i++;
        }
    }
}
