package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebqn implements dfpw {
    final /* synthetic */ List a;
    private ebqo b;

    public ebqn(List list) {
        this.a = list;
    }

    @Override // defpackage.dfpw
    public final void a() {
        this.b = new ebqo();
    }

    @Override // defpackage.dfpw
    public final void b(byte[] bArr) {
        ebqo ebqoVar = this.b;
        if (ebqoVar != null) {
            ebqoVar.a = bArr;
        }
    }

    @Override // defpackage.dfpw
    public final void c() {
        ebqo ebqoVar = this.b;
        if (ebqoVar != null) {
            this.a.add(ebqoVar);
        }
        this.b = null;
    }

    @Override // defpackage.dfpw
    public final void d(dfpx dfpxVar) {
        ebqo ebqoVar = this.b;
        if (ebqoVar == null) {
            throw new IllegalStateException("Part is null");
        }
        if (dfpxVar.a.equalsIgnoreCase(ffho.a)) {
            ebqoVar.b = dfpxVar.b;
            return;
        }
        if (dfpxVar.a.equalsIgnoreCase("Content-ID")) {
            ebqoVar.d = dfpxVar.b.substring(1, r4.length() - 1);
        } else if (dfpxVar.a.equalsIgnoreCase(ffho.c)) {
            ebqoVar.c = dfpxVar.b;
        }
    }
}
