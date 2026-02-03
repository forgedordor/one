package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzbl implements eora {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ dzbn c;
    private final String d;

    public dzbl(dzbn dzbnVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = dzbnVar;
        this.d = dyyt.a(dzbnVar.d);
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iMin = Math.min(((ekgb) obj).size(), 10);
        dzbn dzbnVar = this.c;
        dyws dywsVar = dzbnVar.b;
        String str = dzbnVar.c;
        String str2 = this.d;
        boolean z = this.a;
        dywsVar.e(str2, "OK", iMin, str, z);
        dywsVar.h(Instant.now().toEpochMilli() - this.b, str2, "OK", iMin, str, z);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        String str = this.d;
        String strA = dyqf.a(th);
        dzbn dzbnVar = this.c;
        String str2 = dzbnVar.c;
        dyws dywsVar = dzbnVar.b;
        boolean z = this.a;
        dywsVar.e(str, strA, -1, str2, z);
        dywsVar.h(Instant.now().toEpochMilli() - this.b, str, strA, -1, str2, z);
    }
}
