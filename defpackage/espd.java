package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espd extends espb {
    public final Account a;
    public final String b;

    public espd(Account account, String str) {
        this.a = account;
        this.b = str;
    }

    @Override // defpackage.espb
    public final Account a() {
        return this.a;
    }

    @Override // defpackage.espb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof espb) {
            espb espbVar = (espb) obj;
            if (this.a.equals(espbVar.a()) && this.b.equals(espbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + "}";
    }
}
