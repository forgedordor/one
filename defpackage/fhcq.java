package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcq extends ffff {
    final /* synthetic */ fhcr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcq(fhcr fhcrVar, ffgb ffgbVar) {
        super(ffgbVar);
        this.a = fhcrVar;
    }

    @Override // defpackage.ffff, defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        try {
            return this.b.b(ffezVar, 8192L);
        } catch (IOException e) {
            this.a.a = e;
            throw e;
        }
    }
}
