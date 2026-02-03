package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwo extends fbwp {
    public fbrg a;
    public Status b;
    public fbrg c;

    public fbwo(fbvm fbvmVar, int i, fcmm fcmmVar) {
        super(fbvmVar, i, fcmmVar);
    }

    @Override // defpackage.fbwp
    protected final int a(Parcel parcel) {
        fbwf.b(parcel, this.a);
        return 0;
    }

    @Override // defpackage.fbwp
    protected final int b(Parcel parcel) {
        int iA = fbxg.a(parcel, this.b);
        fbwf.b(parcel, this.c);
        this.d.v(this.e);
        return iA;
    }
}
