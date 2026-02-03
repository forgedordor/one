package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpm extends dqpv {
    public final boolean a;
    public final Iterable b;
    public final int c;

    public dqpm(String str, int i, Iterable iterable, boolean z) {
        super(str);
        this.c = i;
        this.b = iterable;
        this.a = z;
    }

    private final boolean h(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean i(Iterable iterable) {
        return !ekpg.c(ekpg.e(this.b), ekpg.e(iterable)).isEmpty();
    }

    @Override // defpackage.dqyq
    public final void a(dqxp dqxpVar, StringBuilder sb, List list) {
        b(dqxpVar, sb);
    }

    @Override // defpackage.dqyq
    public final void b(dqxp dqxpVar, StringBuilder sb) {
        sb.append(String.format(Locale.US, "(%s %s (%s))", f(dqxpVar.a()), g(this.c), new ejwc(",").b(ekis.f(this.b, new ejvr() { // from class: dqpl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                return str == null ? "NULL" : this.a.a ? str : DatabaseUtils.sqlEscapeString(str);
            }
        }))));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // defpackage.dqyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean c(defpackage.dqwg r4, defpackage.dqyq r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof defpackage.dqpv
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            dqpv r0 = (defpackage.dqpv) r0
            java.lang.String r2 = r3.d
            java.lang.String r4 = r4.a(r2)
            java.lang.String r0 = r0.d
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9b
            boolean r4 = r5 instanceof defpackage.dqpj
            r0 = 2
            r2 = 1
            if (r4 == 0) goto L47
            dqpj r5 = (defpackage.dqpj) r5
            int r4 = r5.b
            int r4 = r4 + (-1)
            if (r4 == 0) goto L38
            if (r4 == r2) goto L28
            goto L72
        L28:
            java.lang.String r4 = r5.a
            boolean r4 = r3.h(r4)
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L38:
            java.lang.String r4 = r5.a
            boolean r4 = r3.h(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L47:
            boolean r4 = r5 instanceof defpackage.dqpm
            if (r4 == 0) goto L72
            dqpm r5 = (defpackage.dqpm) r5
            int r4 = r5.c
            int r4 = r4 + (-1)
            if (r4 == r0) goto L63
            java.lang.Iterable r4 = r5.b
            boolean r4 = r3.i(r4)
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L63:
            java.lang.Iterable r4 = r5.b
            boolean r4 = r3.i(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L72:
            j$.util.Optional r4 = j$.util.Optional.empty()
        L76:
            boolean r5 = r4.isPresent()
            if (r5 == 0) goto L9b
            int r5 = r3.c
            int r5 = r5 + (-1)
            if (r5 == r0) goto L8d
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L8d:
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L9a
            return r1
        L9a:
            return r2
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpm.c(dqwg, dqyq):boolean");
    }

    @Override // defpackage.dqyq
    protected final boolean d(String str, ContentValues contentValues) {
        String str2 = this.e;
        String asString = contentValues.getAsString(this.f);
        if (TextUtils.equals(str, str2) && asString != null) {
            return this.c + (-1) != 2 ? h(asString) : !h(asString);
        }
        return false;
    }
}
