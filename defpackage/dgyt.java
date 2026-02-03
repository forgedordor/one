package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgyt implements dgwo {
    final /* synthetic */ dgyu a;
    private final long b;

    public dgyt(dgyu dgyuVar, long j) {
        this.a = dgyuVar;
        this.b = j;
    }

    private final void a() {
        this.a.g.a(this.b).ifPresent(new Consumer() { // from class: dgys
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhgp) obj).c = Optional.empty();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.dgwo
    public final void d(dgwm dgwmVar, String str, byte[] bArr) {
        try {
            dhgr dhgrVar = this.a.g;
            long j = this.b;
            synchronized (dhgrVar.b) {
                Optional optionalA = dhgrVar.a(j);
                if (optionalA.isEmpty()) {
                    dhja.q("Received NOTIFY for session ID %d, but cannot find group session data! Ignoring!", Long.valueOf(j));
                } else {
                    dhgp dhgpVar = (dhgp) optionalA.get();
                    dhja.c("Subscription notify for session: %s", dhgpVar);
                    if (dezj.d(str, bArr)) {
                        int size = (dhgpVar.b.isEmpty() || ((dezn) dhgpVar.b.get()).d == null) ? 0 : ((dezn) dhgpVar.b.get()).d.size();
                        dhgpVar.a(dezj.c(dhgpVar.b, str, bArr, dhgrVar.c));
                        if (((dezn) dhgpVar.b.get()).d != null) {
                            dhja.o("Before update, there are %d users in the conference. After update, there are %d users in conference", Integer.valueOf(size), Integer.valueOf(((dezn) dhgpVar.b.get()).d.size()));
                        } else {
                            dhja.g("After update, there is no valid conference info", new Object[0]);
                        }
                    } else {
                        dhja.g("Invalid NOTIFY, ignoring!", new Object[0]);
                    }
                }
            }
            this.a.g.d();
        } catch (Exception e) {
            dhja.i(e, "Error while processing incoming NOTIFY. Resubscribing to the conference: %s", e.getMessage());
            this.a.p(this.b);
        }
    }

    @Override // defpackage.dgwo
    public final void q(int i, String str) {
        dhja.g("Subscription failed: %d - %s", Integer.valueOf(i), str);
        a();
    }

    @Override // defpackage.dgwo
    public final void r(dhft dhftVar) {
        dhja.i(dhftVar, "Subscription failed: %s", dhftVar.getMessage());
        a();
    }

    @Override // defpackage.dgwo
    public final void u() {
        dhja.g("Subscription terminated!", new Object[0]);
        a();
    }

    @Override // defpackage.dgwo
    public final void v(dhft dhftVar) {
        dhja.i(dhftVar, "Subscription terminated: %s", dhftVar.getMessage());
        a();
    }

    @Override // defpackage.dgwo
    public final void t() {
    }
}
