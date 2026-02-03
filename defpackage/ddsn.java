package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsn extends ddsr {
    private final Account a;
    private final eony b;

    public ddsn(Account account, eony eonyVar) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.a = account;
        if (eonyVar == null) {
            throw new NullPointerException("Null timeSource");
        }
        this.b = eonyVar;
    }

    @Override // defpackage.ddsr, defpackage.dcex
    public final Account a() {
        return this.a;
    }

    @Override // defpackage.ddsr
    public final eony b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddsr) {
            ddsr ddsrVar = (ddsr) obj;
            if (this.a.equals(ddsrVar.a()) && this.b.equals(ddsrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.a.toString() + ", timeSource=TimeSource.system()}";
    }
}
