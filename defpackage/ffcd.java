package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcd implements fdae {
    final /* synthetic */ ffcl a;
    private final ffcp b;

    public ffcd(ffcl ffclVar, ffcp ffcpVar) {
        this.a = ffclVar;
        this.b = ffcpVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() throws IOException {
        ffcp ffcpVar;
        try {
            ffcpVar = this.b;
        } catch (IOException e) {
            this.a.k(2, 2, e);
            fezr.r(this.b);
        } catch (Throwable th) {
            this.a.k(3, 3, null);
            fezr.r(this.b);
            throw th;
        }
        if (!ffcpVar.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (ffcpVar.a(false, this)) {
        }
        this.a.k(1, 9, null);
        fezr.r(ffcpVar);
        return fctx.a;
    }
}
