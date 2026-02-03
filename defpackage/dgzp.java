package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgzp implements dfpw {
    final /* synthetic */ ArrayList a;
    private dgyx b;
    private String c;

    public dgzp(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.dfpw
    public final void a() {
        this.b = new dgyx(dgyw.UNKNOWN);
    }

    @Override // defpackage.dfpw
    public final void b(byte[] bArr) {
        dgyx dgyxVar = this.b;
        dgyxVar.getClass();
        String str = this.c;
        str.getClass();
        dgyxVar.d(str, bArr);
    }

    @Override // defpackage.dfpw
    public final void c() {
        dgyx dgyxVar = this.b;
        dgyxVar.getClass();
        this.a.add(dgyxVar);
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.dfpw
    public final void d(dfpx dfpxVar) {
        if (ejuf.e(dfpxVar.a, ffho.a)) {
            this.c = dfpxVar.b;
        }
    }
}
