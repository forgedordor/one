package defpackage;

import android.graphics.Bitmap;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzbj implements eora {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ dzbk c;
    final /* synthetic */ int d;
    private final String e;
    private final String f;

    public dzbj(dzbk dzbkVar, int i, boolean z, long j) {
        this.d = i;
        this.a = z;
        this.b = j;
        this.c = dzbkVar;
        this.e = dyyt.a(dzbkVar.c);
        this.f = i != 32 ? i != 48 ? i != 64 ? i != 120 ? i != 240 ? "null" : "X_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        boolean z = this.a;
        dzbk dzbkVar = this.c;
        String str2 = this.f;
        String str3 = this.e;
        dyws dywsVar = dzbkVar.a;
        String str4 = dzbkVar.b;
        dywsVar.c(str3, str2, str, str4, z);
        dywsVar.g(Instant.now().toEpochMilli() - this.b, str3, str2, str, str4, z);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        String str = this.f;
        String strA = dyqf.a(th);
        dzbk dzbkVar = this.c;
        dyws dywsVar = dzbkVar.a;
        String str2 = dzbkVar.b;
        String str3 = this.e;
        boolean z = this.a;
        dywsVar.c(str3, str, strA, str2, z);
        dywsVar.g(Instant.now().toEpochMilli() - this.b, str3, str, strA, str2, z);
    }
}
