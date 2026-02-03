package defpackage;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwn extends fbwp {
    private final fbrk a;
    private final fbrg b;
    private final fcmm c;

    public fbwn(fbvm fbvmVar, int i, fbrk fbrkVar, fbrg fbrgVar, fcmm fcmmVar) {
        super(fbvmVar, i, fcmmVar);
        this.a = fbrkVar;
        this.b = fbrgVar;
        this.c = fcmmVar;
    }

    @Override // defpackage.fbwp
    protected final int a(Parcel parcel) {
        fbrk fbrkVar = this.a;
        parcel.writeString(fbrkVar.b);
        fbwf.b(parcel, this.b);
        this.c.a();
        return fbrkVar.a.b() ? 16 : 0;
    }

    @Override // defpackage.fbwp
    protected final int b(Parcel parcel) {
        return 0;
    }

    final void c(fbol fbolVar) {
        fbrg fbrgVar = this.b;
        fbrb fbrbVar = fcdy.b;
        fbrgVar.f(fbrbVar);
        fbrgVar.h(fbrbVar, Long.valueOf(Math.max(0L, fbolVar.b(TimeUnit.NANOSECONDS))));
    }
}
