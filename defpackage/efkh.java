package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efkh {
    public dflp a = new dflp() { // from class: efkg
        @Override // defpackage.dflp
        public final boolean a() {
            return false;
        }
    };

    public abstract efkk a();

    public abstract MessageReceipt b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract void e(efki efkiVar);

    public abstract void f(efkj efkjVar);

    public abstract void g(evqs evqsVar);

    public abstract void h(Optional optional);

    public abstract void i(String str);

    public abstract void j(String str);

    public abstract void k(Instant instant);

    public abstract void l(efkk efkkVar);

    public final MessageReceipt m() {
        if (d().isPresent()) {
            efkk efkkVarA = a();
            if (!efkkVarA.g.contains(d().get())) {
                l(efkk.UNKNOWN);
                j(a().f);
            }
        } else {
            j(a().f);
        }
        if (c().isPresent() && ((evqs) c().get()).H()) {
            h(Optional.empty());
        }
        MessageReceipt messageReceiptB = b();
        if (this.a.a()) {
            AutoValue_MessageReceipt autoValue_MessageReceipt = (AutoValue_MessageReceipt) messageReceiptB;
            if (autoValue_MessageReceipt.a.equals(efkk.DELIVERY) && autoValue_MessageReceipt.c.equals("failed") && autoValue_MessageReceipt.d.isEmpty()) {
                Optional optional = autoValue_MessageReceipt.e;
                Optional optional2 = autoValue_MessageReceipt.f;
                boolean zIsPresent = optional.isPresent();
                boolean zIsPresent2 = optional2.isPresent();
                if (zIsPresent && zIsPresent2) {
                    throw new IllegalArgumentException("Either mls-server-failure-reason or mls-client-failure-reason should be set, but not both");
                }
            } else {
                if (autoValue_MessageReceipt.e.isPresent()) {
                    throw new IllegalArgumentException("Only set mls-server-failure-reason for a failed MLS delivery receipt");
                }
                if (autoValue_MessageReceipt.f.isPresent()) {
                    throw new IllegalArgumentException("Only set mls-client-failure-reason for a failed MLS delivery receipt");
                }
            }
        }
        return messageReceiptB;
    }
}
