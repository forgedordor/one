package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgxu {
    public final ains a;

    public cgxu(ains ainsVar) {
        ainsVar.getClass();
        this.a = ainsVar;
    }

    public static final String b(cgxy cgxyVar) {
        switch (cgxyVar.ordinal()) {
            case 0:
                throw new IllegalArgumentException();
            case 1:
                return "Bugle.Pipeline.Sms.Receive.Event";
            case 2:
                return "Bugle.Pipeline.Rcs.Send.Event";
            case 3:
                return "Bugle.Pipeline.Rcs.Send.Report.Event";
            case 4:
                return "Bugle.Pipeline.Rcs.Receive.Event";
            case 5:
                return "Bugle.Pipeline.Rcs.GroupCreate.Event";
            case 6:
                return "Bugle.Pipeline.Rcs.Group.Invite.Generate.Event";
            case 7:
                return "Bugle.Pipeline.Rcs.Group.JoinViaLink.Event";
            default:
                throw new fctg();
        }
    }

    public final void a(cgxy cgxyVar) {
        cgxyVar.getClass();
        this.a.e(b(cgxyVar), 1);
    }

    public final void c(cgxy cgxyVar, int i) {
        String str = "Bugle.Pipeline.Generic.Error";
        if (cgxyVar != null) {
            switch (cgxyVar.ordinal()) {
                case 0:
                    break;
                case 1:
                    str = "Bugle.Pipeline.Sms.Receive.Error";
                    break;
                case 2:
                    str = "Bugle.Pipeline.Rcs.Send.Error";
                    break;
                case 3:
                    str = "Bugle.Pipeline.Rcs.Send.Report.Error";
                    break;
                case 4:
                    str = "Bugle.Pipeline.Rcs.Receive.Error";
                    break;
                case 5:
                    str = "Bugle.Pipeline.Rcs.GroupCreate.Error";
                    break;
                case 6:
                    str = "Bugle.Pipeline.Rcs.Group.Invite.Generate.Error";
                    break;
                case 7:
                    str = "Bugle.Pipeline.Rcs.Group.JoinViaLink.Error";
                    break;
                default:
                    throw new fctg();
            }
        }
        this.a.e(str, i);
    }
}
