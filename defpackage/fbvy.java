package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvy extends fbwb {
    private final fbvl a;

    public fbvy(fbvl fbvlVar, fbmw fbmwVar, int i) {
        super(fbvlVar, fbmwVar, i);
        this.a = fbvlVar;
    }

    @Override // defpackage.fbwb
    protected final void a(Status status) {
        ((fcmb) this.g).a(status);
    }

    @Override // defpackage.fbwb
    protected final void b() {
        ((fcmb) this.g).b();
    }

    @Override // defpackage.fbwb
    public final void c(int i, Parcel parcel) {
        fbvl fbvlVar = this.a;
        int i2 = this.d;
        List list = fbvlVar.a;
        fbmw fbmwVar = this.c;
        String string = parcel.readString();
        fbrg fbrgVarA = fbwf.a(parcel, fbmwVar);
        fbwo fbwoVar = new fbwo(fbvlVar, i2, fcmm.m(list));
        Status statusB = fbvlVar.b((i & 16) != 0 ? new fbxf(this, fbwoVar, fbmwVar) : new fbwh(this, fbwoVar, fbmwVar), string, fbrgVarA);
        if (!statusB.f()) {
            h(statusB);
            return;
        }
        ((fcmb) this.g).getClass();
        if (this.b.w()) {
            ((fcmb) this.g).e();
        }
    }

    final void f() {
        if (p()) {
            return;
        }
        m(fbvz.CLOSED);
        this.f.n();
        ((fcmb) this.g).a(Status.b);
    }

    @Override // defpackage.fbwb
    public final void d(int i, Parcel parcel) {
    }
}
