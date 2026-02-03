package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giw implements ijh {
    final /* synthetic */ gix a;

    public giw(gix gixVar) {
        this.a = gixVar;
    }

    @Override // defpackage.ijh
    public final long a() {
        gix gixVar = this.a;
        long jA = gixVar.c.a();
        if (jA != 16) {
            return jA;
        }
        gqy gqyVar = (gqy) jbe.a(gixVar, grb.a);
        if (gqyVar != null) {
            long j = gqyVar.a;
            if (j != 16) {
                return j;
            }
        }
        return ((ije) jbe.a(gixVar, gea.a)).i;
    }
}
