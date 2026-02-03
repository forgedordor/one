package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezh {
    public final dfad a;

    public dezh(dfad dfadVar) {
        this.a = dfadVar;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof dezh) && this.a.equals(((dezh) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "SipDialogId: ".concat(this.a.toString());
    }
}
