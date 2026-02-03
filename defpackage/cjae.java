package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjae {
    public static final cqce a = cqce.g("BugleRcs", "MessagingServiceMetrics");
    public final ains b;
    public final cogw c;

    public cjae(ains ainsVar, cogw cogwVar) {
        this.b = ainsVar;
        this.c = cogwVar;
    }

    public static int a(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i < 2) {
            return 1;
        }
        if (i < 3) {
            return 2;
        }
        if (i < 6) {
            return 3;
        }
        return i < 10 ? 4 : 5;
    }

    public final void b(int i) {
        this.b.e("Bugle.MessagingService.GetMessages.BatchSize.Count", a(i));
    }

    final void c(int i) {
        this.b.e("Bugle.MessagingService.SendMessageRequest.Binder.Count", i);
    }
}
