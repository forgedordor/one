package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklg {
    public final ains a;
    public final fcsu b;
    private final zbx c;

    public cklg(ains ainsVar, fcsu fcsuVar, zbx zbxVar) {
        this.a = ainsVar;
        this.b = fcsuVar;
        this.c = zbxVar;
    }

    public static int a(ckml ckmlVar) {
        switch (ckmlVar.ordinal()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            default:
                throw new IllegalArgumentException("Invalid reaction type when logging: " + ckmlVar.a());
        }
    }

    public final void b(ckmb ckmbVar, ckmc ckmcVar, boolean z) {
        if (c(ckmbVar, ckmcVar, z)) {
            ((ains) this.b.b()).c("Bugle.MessageReactions.AnimationEffects.Received");
        }
    }

    public final boolean c(ckmb ckmbVar, ckmc ckmcVar, boolean z) {
        if (!z) {
            return false;
        }
        zbx zbxVar = this.c;
        ckmbVar.getClass();
        ckmcVar.getClass();
        return ckmcVar == ckmc.ADD_REACTION && zbxVar.a.containsKey(ckmbVar.d);
    }
}
