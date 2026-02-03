package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfbn implements dfap {
    final Object a;
    final String b;

    public dfbn(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.dfap
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.dfap
    public final String b() {
        return this.b;
    }

    public final String toString() {
        return String.format(Locale.US, "%s=%s", this.b, this.a);
    }
}
