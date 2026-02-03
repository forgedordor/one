package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxly {
    public final Account a;
    public final String b;

    public dxly(Account account, String str) {
        str.getClass();
        this.a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxly)) {
            return false;
        }
        dxly dxlyVar = (dxly) obj;
        return fdbq.f(this.a, dxlyVar.a) && fdbq.f(this.b, dxlyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope(account=" + this.a + ", scope=" + this.b + ")";
    }
}
