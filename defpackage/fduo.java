package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fduo extends fdvq {
    public long a = -1;
    public fcxy b;

    @Override // defpackage.fdvq
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        fdum fdumVar = (fdum) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = fdumVar.b;
        if (j < fdumVar.c) {
            fdumVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.fdvq
    public final /* bridge */ /* synthetic */ fcxy[] b(Object obj) {
        boolean z = fdkb.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((fdum) obj).l(j);
    }
}
