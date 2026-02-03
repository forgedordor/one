package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dauy extends dauz {
    public final egbe a;
    public final Account b;
    public final boolean c;

    public dauy(egbe egbeVar, Account account, boolean z) {
        egbeVar.getClass();
        this.a = egbeVar;
        this.b = account;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dauy)) {
            return false;
        }
        dauy dauyVar = (dauy) obj;
        return fdbq.f(this.a, dauyVar.a) && fdbq.f(this.b, dauyVar.b) && this.c == dauyVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Account account = this.b;
        return ((iHashCode + (account == null ? 0 : account.hashCode())) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SelectedAccount(account=" + this.a + ", androidAccount=" + this.b + ", canShareAccountData=" + this.c + ")";
    }
}
