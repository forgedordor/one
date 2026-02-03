package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvx extends fbwb {
    public final boolean a;
    private Status h;
    private fbrg i;

    public fbvx(fbvm fbvmVar, fbmw fbmwVar, int i, boolean z) {
        super(fbvmVar, fbmwVar, i);
        this.a = z;
    }

    @Override // defpackage.fbwb
    protected final void a(Status status) {
        ((fcap) this.g).a(status, fcao.PROCESSED, new fbrg());
    }

    @Override // defpackage.fbwb
    protected final void b() {
        this.f.e();
        this.f.n();
        m(fbvz.CLOSED);
        ((fcap) this.g).a(this.h, fcao.PROCESSED, this.i);
        o();
    }

    @Override // defpackage.fbwb
    public final void c(int i, Parcel parcel) {
        fbrg fbrgVarA = fbwf.a(parcel, this.c);
        this.f.d();
        ((fcap) this.g).c(fbrgVarA);
    }

    @Override // defpackage.fbwb
    public final void d(int i, Parcel parcel) {
        this.h = fbxg.b(i, parcel);
        this.i = fbwf.a(parcel, this.c);
    }

    @Override // defpackage.fbwb
    public final boolean e() {
        return this.a;
    }
}
