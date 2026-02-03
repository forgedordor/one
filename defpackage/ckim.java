package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckim extends ckit {
    public ewrp a;
    public String b;
    public String c;
    public ewla d;
    public ewlc e;
    public int f;

    @Override // defpackage.ckit
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null provisioningSessionId");
        }
        this.c = str;
    }

    @Override // defpackage.ckit
    public final void b(ewrp ewrpVar) {
        if (ewrpVar == null) {
            throw new NullPointerException("Null requestState");
        }
        this.a = ewrpVar;
    }
}
