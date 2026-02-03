package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyu implements ckyc {
    private final ckyd a;

    public ckyu(ckyd ckydVar) {
        this.a = ckydVar;
        if (ckydVar == ckyd.SMS_TRANSPORT || ckydVar == ckyd.MMS_TRANSPORT) {
            return;
        }
        Objects.toString(ckydVar);
        throw new IllegalStateException("Could not create a sender for ".concat(ckydVar.toString()));
    }
}
