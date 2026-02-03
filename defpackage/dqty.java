package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqty extends dqpv {
    static final Comparator a = Comparator.CC.naturalOrder();
    static final java.util.Comparator b = Comparator.CC.naturalOrder();
    static final java.util.Comparator c = Comparator.CC.naturalOrder();
    static final java.util.Comparator g = Comparator.CC.naturalOrder();
    static final java.util.Comparator h = Comparator.CC.naturalOrder();
    static final java.util.Comparator i = Comparator.CC.naturalOrder();
    private final Number j;
    private final int k;

    public dqty(String str, int i2, Number number) {
        super(str);
        this.k = i2;
        this.j = number;
    }

    private static final int h(int i2) {
        if (i2 < 0) {
            return 3;
        }
        return i2 == 0 ? 1 : 2;
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        if (dqxpVar.d) {
            sb.append('(');
            sb.append(f(dqxpVar.a()));
            sb.append(' ');
            sb.append(g(this.k));
            sb.append("?)");
            list.add(this.j.toString());
            return;
        }
        sb.append('(');
        sb.append(f(dqxpVar.a()));
        sb.append(' ');
        sb.append(g(this.k));
        sb.append(" ");
        sb.append(this.j);
        sb.append(")");
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        sb.append('(');
        sb.append(f(dqxpVar.a()));
        sb.append(' ');
        sb.append(g(this.k));
        sb.append(' ');
        sb.append(this.j);
        sb.append(')');
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ff  */
    @Override // defpackage.dqyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean c(defpackage.dqwg r8, defpackage.dqyq r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqty.c(dqwg, dqyq):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // defpackage.dqyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean d(java.lang.String r8, android.content.ContentValues r9) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqty.d(java.lang.String, android.content.ContentValues):boolean");
    }
}
